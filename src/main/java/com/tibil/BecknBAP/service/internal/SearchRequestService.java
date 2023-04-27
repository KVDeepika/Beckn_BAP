package com.tibil.BecknBAP.service.internal;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tibil.BecknBAP.dao.ServiceRequestFlowRepository;
import com.tibil.BecknBAP.dao.ServiceRequestRepository;
import com.tibil.BecknBAP.dto.beckn.Descriptor;
import com.tibil.BecknBAP.dto.beckn.InlineResponse200;
import com.tibil.BecknBAP.dto.beckn.Intent;
import com.tibil.BecknBAP.dto.beckn.Item;
import com.tibil.BecknBAP.dto.beckn.SearchBody;
import com.tibil.BecknBAP.dto.beckn.SearchMessage;
import com.tibil.BecknBAP.dto.beckn.Tags;
import com.tibil.BecknBAP.dto.internal.Search;
import com.tibil.BecknBAP.model.ServiceRequest;
import com.tibil.BecknBAP.model.ServiceRequestFlow;
import com.tibil.BecknBAP.service.ProcessInternalRequestService;
import com.tibil.BecknBAP.service.ServiceUtils;

@Component
public class SearchRequestService implements ProcessInternalRequestService {

	private ServiceRequestRepository serviceRequestRepository;
	private ServiceRequestFlowRepository serviceRequestFlowRepository;
	private ObjectMapper objectMapper;

	@Autowired
	public SearchRequestService(ServiceRequestRepository serviceRequestRepository,
			ServiceRequestFlowRepository serviceRequestFlowRepository, ObjectMapper objectMapper) {
		super();
		this.serviceRequestRepository = serviceRequestRepository;
		this.serviceRequestFlowRepository = serviceRequestFlowRepository;
		this.objectMapper = objectMapper;
		this.objectMapper.setSerializationInclusion(Include.NON_NULL);
	}

	@Override
	public String processInternalRequest(Object requestBody) {

		Search inputBody = (Search) requestBody;
		ServiceUtils utils = new ServiceUtils(objectMapper);

		Item item = new Item().descriptor(new Descriptor().name(inputBody.getDesignation()));
		HashMap<String, Object> tags = new HashMap<String, Object>();
		tags.put("code", "skills");

		ArrayList<HashMap<String, String>> techList = new ArrayList<HashMap<String, String>>();
		for (String technology : inputBody.getTechnologies()) {

			HashMap<String, String> map = new HashMap<String, String>();
			map.put("code", technology);
			techList.add(map);
		}

		tags.put("list", techList);
		Tags tag = new Tags();
		tag.putAll(tags);
		item.setTags(tag);
		SearchBody searchBody = new SearchBody();
		searchBody.setContext(utils.getContext());
		searchBody.setMessage(new SearchMessage().intent(new Intent().item(item)));
		System.out.println(searchBody);

		ResponseEntity<InlineResponse200> response = restTemplate.postForEntity("http://localhost:8090/v1/api/search",
				searchBody, InlineResponse200.class);	
		

		ServiceRequestFlow flow = new ServiceRequestFlow();
		flow.setTransactionId(searchBody.getContext().getTransactionId());
		flow.setBapId(searchBody.getContext().getBapId());
		flow.setMessageId(searchBody.getContext().getMessageId());
		flow.setCreatedAt(OffsetDateTime.now());
		
		flow.setAction(searchBody.getContext().getAction().toString());
		System.out.println(response.getStatusCode());

		try {
			ServiceRequest serviceRequest = new ServiceRequest(searchBody.getContext().getTransactionId(),
					searchBody.getContext().getMessageId(), searchBody.getContext().getDomain(),
					searchBody.getContext().getCity(),
					objectMapper.writer().writeValueAsString(searchBody),
					searchBody.getContext().getBapId());
			serviceRequest.setCreatedAt(OffsetDateTime.now());
			serviceRequestRepository.save(serviceRequest);
			
			flow.setData(objectMapper.writeValueAsString(searchBody));
			flow.setAck(objectMapper.writeValueAsString(response.getBody()));

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		serviceRequestFlowRepository.save(flow);
		return searchBody.getContext().getTransactionId();

	}

}

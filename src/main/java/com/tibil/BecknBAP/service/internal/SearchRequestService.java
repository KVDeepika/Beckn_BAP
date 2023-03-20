package com.tibil.BecknBAP.service.internal;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

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
import com.tibil.BecknBAP.service.ProcessInternalRequestService;
import com.tibil.BecknBAP.service.ServiceUtils;

@Component
public class SearchRequestService implements ProcessInternalRequestService {
	
	@Autowired
	private ServiceRequestRepository serviceRequestRepository;

	@Override
	public ResponseEntity<InlineResponse200> processInternalRequest(Object requestBody) {
		
		Search inputBody = (Search)requestBody;
		ServiceUtils utils = new ServiceUtils();
		
		Item item = new Item().descriptor(new Descriptor().name(inputBody.getDesignation()));
		HashMap<String, Object> tags = new HashMap<String, Object>();
		tags.put("code", "skills");
		
		ArrayList<HashMap<String, String>> techList = new ArrayList<HashMap<String, String>>();
		for (String technology : inputBody.getTechnologies()){
			
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
		
		ServiceRequest serviceRequest = new ServiceRequest(
				searchBody.getContext().getTransactionId(),
				searchBody.getContext().getMessageId(),
				searchBody.getContext().getDomain(),
				searchBody.getContext().getCity(), 
				searchBody.toString(),
				searchBody.getContext().getBapId()
				);
		serviceRequestRepository.save(serviceRequest);
		
//		ResponseEntity<InlineResponse200> response = restTemplate.postForEntity("http://localhost:5000", searchBody, InlineResponse200.class);
//		System.out.println(response.getStatusCode());
		return null;
		
	}

}

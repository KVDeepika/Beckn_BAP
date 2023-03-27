package com.tibil.BecknBAP.service.internal;

import java.io.IOException;
import java.time.OffsetDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tibil.BecknBAP.dao.ServiceRequestFlowRepository;
import com.tibil.BecknBAP.dto.beckn.InlineResponse2001;
import com.tibil.BecknBAP.dto.beckn.OnSearchBody;
import com.tibil.BecknBAP.model.ServiceRequestFlow;
import com.tibil.BecknBAP.service.ProcessExternalRequestService;

@Component
public class OnSearchRequestService implements ProcessExternalRequestService {
	
	private static final Logger log = LoggerFactory.getLogger(OnSearchRequestService.class);
	private ServiceRequestFlowRepository serviceRequestFlowRepository;
	private ObjectMapper objectMapper;
	
	@Autowired
	public OnSearchRequestService(ServiceRequestFlowRepository serviceRequestFlowRepository,
			ObjectMapper objectMapper) {
		super();
		this.serviceRequestFlowRepository = serviceRequestFlowRepository;
		this.objectMapper = objectMapper;
	}


	@Override
	public ResponseEntity<InlineResponse2001> processExternalRequest(Object requestBody) {
		
		OnSearchBody onSearch = (OnSearchBody)requestBody;
		
		ServiceRequestFlow flow = new ServiceRequestFlow();
		flow.setTransactionId(onSearch.getContext().getTransactionId());
		flow.setBapId(onSearch.getContext().getBapId());
		flow.setMessageId(onSearch.getContext().getMessageId());
		flow.setCreatedAt(OffsetDateTime.now());
		flow.setAction(onSearch.getContext().getAction().toString());
		try {
			flow.setData(objectMapper.writeValueAsString(onSearch));
		} catch (JsonProcessingException e) {
			log.error("error while converting object to Json String. " , e.getMessage());
		}
		
		serviceRequestFlowRepository.save(flow);
		try {
			return new ResponseEntity<InlineResponse2001>(objectMapper.readValue("{\n  \"message\" : {\n    \"ack\" : {\n      \"status\" : \"ACK\"\n    }\n  }\n}", InlineResponse2001.class), HttpStatus.OK);
		} catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<InlineResponse2001>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
	}

}

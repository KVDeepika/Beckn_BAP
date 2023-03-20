package com.tibil.BecknBAP.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.tibil.BecknBAP.dto.beckn.InlineResponse200;

public interface ProcessInternalRequestService {
	
	public static final RestTemplate restTemplate = new RestTemplate();
	
	public ResponseEntity<InlineResponse200> processInternalRequest(Object requestBody);

}

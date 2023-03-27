package com.tibil.BecknBAP.service;

import org.springframework.http.ResponseEntity;

import com.tibil.BecknBAP.dto.beckn.InlineResponse2001;

public interface ProcessExternalRequestService {
	
	
	public ResponseEntity<InlineResponse2001> processExternalRequest(Object requestBody);

}

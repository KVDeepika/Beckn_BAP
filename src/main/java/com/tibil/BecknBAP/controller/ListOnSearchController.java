package com.tibil.BecknBAP.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tibil.BecknBAP.dao.ServiceRequestFlowRepository;
import com.tibil.BecknBAP.dto.beckn.OnSearchBody;
import com.tibil.BecknBAP.model.ServiceRequestFlow;

@RestController
public class ListOnSearchController {
	
	@Autowired
	private ServiceRequestFlowRepository serviceRequestFlowRepository;
	@Autowired
	private ObjectMapper objectMapper;

	@GetMapping(path = "/get_on_search/{id}")
	public List<OnSearchBody> getOnsearchResponse(@RequestParam(name = "id") String transactionId){
		
		List<ServiceRequestFlow> flows = serviceRequestFlowRepository.findByTransactionIdAndAction(transactionId, "on_search");
		List<OnSearchBody> data = flows.stream().map(x -> {
			try {
				return objectMapper.readValue(x.getData(), OnSearchBody.class);
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}).collect(Collectors.toList());
		
		data.stream().forEach(x -> System.out.println(x));
		
		return data;
		
	}
}

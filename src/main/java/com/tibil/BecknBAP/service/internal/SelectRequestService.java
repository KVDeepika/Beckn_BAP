
package com.tibil.BecknBAP.service.internal;

import java.time.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tibil.BecknBAP.dao.ServiceRequestFlowRepository;
import com.tibil.BecknBAP.dao.ServiceRequestRepository;
import com.tibil.BecknBAP.model.ServiceRequestFlow;

import com.tibil.BecknBAP.dto.beckn.InlineResponse200;
import com.tibil.BecknBAP.dto.beckn.Item;
import com.tibil.BecknBAP.dto.beckn.Order;
import com.tibil.BecknBAP.dto.beckn.Provider;
import com.tibil.BecknBAP.dto.beckn.SelectMessage;
import com.tibil.BecknBAP.dto.beckn.ItemId;
import com.tibil.BecknBAP.dto.beckn.Context.ActionEnum;
import com.tibil.BecknBAP.dto.beckn.SelectBody;
import com.tibil.BecknBAP.dto.internal.SelectedItem;
import com.tibil.BecknBAP.model.ServiceRequest;
import com.tibil.BecknBAP.service.ProcessInternalRequestService;
import com.tibil.BecknBAP.service.ServiceUtils;

import jakarta.validation.Valid;

import com.tibil.BecknBAP.dto.beckn.Fulfillment;
import com.tibil.BecknBAP.dto.beckn.OnSearchBody;
import com.tibil.BecknBAP.dto.beckn.OnSearchMessage;


@Component
public class SelectRequestService implements ProcessInternalRequestService {

	private ServiceRequestRepository serviceRequestRepository;
	private ServiceRequestFlowRepository serviceRequestFlowRepository;
	private ObjectMapper objectMapper;

	


	@Autowired
	public SelectRequestService(ServiceRequestRepository serviceRequestRepository,
			ServiceRequestFlowRepository serviceRequestFlowRepository, ObjectMapper objectMapper) {
		super();
		this.serviceRequestRepository = serviceRequestRepository;
		this.serviceRequestFlowRepository = serviceRequestFlowRepository;
		this.objectMapper = objectMapper;
		this.objectMapper.setSerializationInclusion(Include.NON_NULL);
	}
	

	

	@Override
	public String processInternalRequest(Object requestBody) {
		
		SelectedItem inputBody = (SelectedItem) requestBody;
		ServiceUtils utils = new ServiceUtils(objectMapper);
		
		List<ServiceRequestFlow> context = serviceRequestFlowRepository.findByTransactionIdAndAction(inputBody.getTransactionId(), "on_search");
		System.out.println("Transcation ID");
		System.out.println(inputBody.getTransactionId());
		
		
		OnSearchBody data =  utils.deserialiseData(context.get(0).getData(),OnSearchBody.class );
		System.out.println(data);
		
	    SelectBody selectBody = new SelectBody();
		selectBody.setContext(data.getContext().action(ActionEnum.SELECT));
		selectBody.setContext(data.getContext().bppId(inputBody.getBppId()));
		selectBody.setContext(data.getContext().messageId(UUID.randomUUID().toString()));
		selectBody.setContext(data.getContext().timestamp(OffsetDateTime.now()));
		
		
		String providerId_onsearch =data.getMessage().getCatalog().getProviders().get(0).getId();
		System.out.println(providerId_onsearch);
		Provider provider= new Provider().id(inputBody.getProviderId());
		String providerId_select = provider.getId().toString();
		List<ItemId> ItemId_onsearch =data.getMessage().getCatalog().getProviders().get(0).getItems().get(0).getId();
		ItemId_onsearch.toString();
		List<ItemId> ItemId_select = inputBody.getItemId();
		ItemId_select.toString();

	    
	    Item item = new Item();
	   if(providerId_onsearch.equals(providerId_select)) {
		   
		   if(ItemId_onsearch.equals(ItemId_select))

	    	item.id(inputBody.getItemId());
	    	}
	   else
	   System.out.println("provide valid provider_Id");
	   		
	 
	   Fulfillment fulfillment = new Fulfillment();
	   selectBody.setMessage(new SelectMessage().order(new Order().item(item).provider(provider).fulfillment(fulfillment)));
	   System.out.println(selectBody);

		
	//ResponseEntity<InlineResponse200> transactionId = restTemplate.postForEntity("http://localhost:8090/v1/api/select",
	//	selectBody, InlineResponse200.class);	
	

	ServiceRequestFlow flow = new ServiceRequestFlow();
	flow.setTransactionId(selectBody.getContext().getTransactionId());
	flow.setBapId(selectBody.getContext().getBapId());
	flow.setMessageId(selectBody.getContext().getMessageId());
	flow.setCreatedAt(OffsetDateTime.now());
	flow.setAction(selectBody.getContext().getAction().toString());
	//System.out.println(transactionId.getStatusCode());

	try {
		ServiceRequest serviceRequest = new ServiceRequest(selectBody.getContext().getTransactionId(),
				selectBody.getContext().getMessageId(), selectBody.getContext().getDomain(),
				selectBody.getContext().getCity(),
				objectMapper.writer().writeValueAsString(selectBody),
				selectBody.getContext().getBapId());
		serviceRequest.setCreatedAt(OffsetDateTime.now());
		serviceRequestRepository.save(serviceRequest);
	
	flow.setData(objectMapper.writeValueAsString(selectBody));
//		flow.setAck(objectMapper.writeValueAsString(transactionId.getBody()));

	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	serviceRequestFlowRepository.save(flow);
	return selectBody.getContext().getTransactionId();

}
	
	
}

	

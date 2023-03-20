package com.tibil.BecknBAP.service;

import java.time.OffsetDateTime;
import java.util.UUID;

import com.tibil.BecknBAP.dto.beckn.Context;
import com.tibil.BecknBAP.dto.beckn.Context.ActionEnum;

public class ServiceUtils {
	
	public Context getContext() {
		
		Context context = new Context();
		context.setAction(ActionEnum.SEARCH);
		context.setBapId("");
		context.setBapUri("http://localhost:8080");
		context.setCity("BLR");
		context.setCountry("IND");
		context.setDomain("Human Resource");
		context.setTransactionId(UUID.randomUUID().toString());
		context.setMessageId(UUID.randomUUID().toString());
		context.setTimestamp(OffsetDateTime.now());
		
		return context;
		
	}

}
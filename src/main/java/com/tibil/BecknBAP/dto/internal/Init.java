package com.tibil.BecknBAP.dto.internal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Init {

	@JsonProperty("transaction_id")
	private String transactionId;
	@JsonProperty("bpp_id")
	private String bppId;

	public Init(String bppId, String transactionId) {
		super();
		this.bppId = bppId; 
		this.transactionId = transactionId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getBppId() {
		return bppId;
	}

	public void setBppId(String bppId) {
		this.bppId = bppId;
	}
	
}

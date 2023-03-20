package com.tibil.BecknBAP.dto.internal;

public class Status {
	private String orderId;
	private String bppId;
	public Status(String orderId, String bppId) {
		super();
		this.orderId = orderId;
		this.bppId = bppId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getBppId() {
		return bppId;
	}
	public void setBppId(String bppId) {
		this.bppId = bppId;
	}
	

}

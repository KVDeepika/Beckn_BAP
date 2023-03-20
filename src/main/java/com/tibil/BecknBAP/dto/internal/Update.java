package com.tibil.BecknBAP.dto.internal;

public class Update {
	private String orderId;
	private String bppId;
	private String itemId;
	public Update(String orderId, String bppId, String itemId) {
		super();
		this.orderId = orderId;
		this.bppId = bppId;
		this.itemId = itemId;
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
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	
}

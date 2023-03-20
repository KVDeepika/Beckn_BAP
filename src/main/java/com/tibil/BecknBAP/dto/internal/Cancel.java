package com.tibil.BecknBAP.dto.internal;

public class Cancel {
	private String orderId;
	private String bppId;
	private String cancellationReason;
	public Cancel(String orderId, String bppId, String cancellationReason) {
		super();
		this.orderId = orderId;
		this.bppId = bppId;
		this.cancellationReason = cancellationReason;
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
	public String getCancellationReason() {
		return cancellationReason;
	}
	public void setCancellationReason(String cancellationReason) {
		this.cancellationReason = cancellationReason;
	}
	
}

package com.tibil.BecknBAP.dto.internal;

public class SelectedItem {
	
	private String bppId;
	private String providerId;
	private String itemId;
	
	public SelectedItem(String bppId, String providerId, String itemId) {
		super();
		this.bppId = bppId;
		this.providerId = providerId;
		this.itemId = itemId;
	}

	public String getBppId() {
		return bppId;
	}

	public void setBppId(String bppId) {
		this.bppId = bppId;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	

}

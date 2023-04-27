package com.tibil.BecknBAP.dto.internal;
import java.util.List;

import com.tibil.BecknBAP.dto.beckn.ItemId;


public class SelectedItem {
	
	private String bppId;
	private String providerId;
	private List<ItemId> itemId;
	private String transactionId;
	
	public SelectedItem(String bppId, String providerId, List<ItemId> itemId,String transactionId) {
		super();
		this.bppId = bppId;
		this.providerId = providerId;
		this.itemId = itemId;
		this.transactionId = transactionId;
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

	public List<ItemId> getItemId() {
		return itemId;
	}

	public void setItemId(List<ItemId> itemId) {
		this.itemId = itemId;
	}

	
	public String getTransactionId() {
		
		return transactionId;
	}
	
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	

	@Override
	public String toString() {
		return "SelectedItem [bppId=" + bppId + ", providerId=" + providerId + ", itemId=" + itemId + ", transactionId="
				+ transactionId + "]";
	}
	

}

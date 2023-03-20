package com.tibil.BecknBAP.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class ServiceRequest extends BaseModel{
	
	@Id
	private String transactionId;
	private String messageId;
	private String domain;
	private String city;
	
	@Column(columnDefinition = "TEXT")
	private String data;
	
	private String bapId;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "serviceRequest")
	private List<ServiceRequestFlow> serviceRequestFlow;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "serviceRequest")
	private List<ServiceOrder> serviceOrder;
	
	public ServiceRequest() {
		super();
	}
	public ServiceRequest(String transactionId, String messageId, String domain, String city, String data, String bapId) {
		super();
		this.transactionId = transactionId;
		this.messageId = messageId;
		this.domain = domain;
		this.city = city;
		this.data = data;
		this.bapId = bapId;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getBapId() {
		return bapId;
	}
	public void setBapId(String bapId) {
		this.bapId = bapId;
	}
	public List<ServiceRequestFlow> getServiceRequestFlow() {
		return serviceRequestFlow;
	}
	public void setServiceRequestFlow(List<ServiceRequestFlow> serviceRequest) {
		this.serviceRequestFlow = serviceRequest;
	}
	public List<ServiceOrder> getServiceOrder() {
		return serviceOrder;
	}
	public void setServiceOrder(List<ServiceOrder> serviceOrder) {
		this.serviceOrder = serviceOrder;
	}
}

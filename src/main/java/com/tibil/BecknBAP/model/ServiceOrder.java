package com.tibil.BecknBAP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ServiceOrder extends BaseModel {

	@Id
	@GeneratedValue
	private long id;
	private String bapId;
	private String bppId;
	private String bapOrderId;
	private String orderState;
	private String orderStateLog;
	private double price;
	private String currency;
	private String paymentId;
	private boolean isSelected;
	private boolean ischeckedOut;
	private boolean isConfirmed;
	private boolean isTracked;
	private boolean isCanceled;
	private boolean isUpdated;
	private String canceledBy;
	private String cancellationReason;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private ServiceRequest serviceRequest;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBapId() {
		return bapId;
	}
	public void setBapId(String bapId) {
		this.bapId = bapId;
	}
	public String getBppId() {
		return bppId;
	}
	public void setBppId(String bppId) {
		this.bppId = bppId;
	}
	public String getBapOrderId() {
		return bapOrderId;
	}
	public void setBapOrderId(String bapOrderId) {
		this.bapOrderId = bapOrderId;
	}
	public String getOrderState() {
		return orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	public String getOrderStateLog() {
		return orderStateLog;
	}
	public void setOrderStateLog(String orderStateLog) {
		this.orderStateLog = orderStateLog;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public boolean isSelected() {
		return isSelected;
	}
	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	public boolean isIscheckedOut() {
		return ischeckedOut;
	}
	public void setIscheckedOut(boolean ischeckedOut) {
		this.ischeckedOut = ischeckedOut;
	}
	public boolean isConfirmed() {
		return isConfirmed;
	}
	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}
	public boolean isTracked() {
		return isTracked;
	}
	public void setTracked(boolean isTracked) {
		this.isTracked = isTracked;
	}
	public boolean isCanceled() {
		return isCanceled;
	}
	public void setCanceled(boolean isCanceled) {
		this.isCanceled = isCanceled;
	}
	public boolean isUpdated() {
		return isUpdated;
	}
	public void setUpdated(boolean isUpdated) {
		this.isUpdated = isUpdated;
	}
	public String getCanceledBy() {
		return canceledBy;
	}
	public void setCanceledBy(String canceledBy) {
		this.canceledBy = canceledBy;
	}
	public String getCancellationReason() {
		return cancellationReason;
	}
	public void setCancellationReason(String cancellationReason) {
		this.cancellationReason = cancellationReason;
	}
	public ServiceRequest getServiceRequest() {
		return serviceRequest;
	}
	public void setServiceRequest(ServiceRequest serviceRequest) {
		this.serviceRequest = serviceRequest;
	}
	
}

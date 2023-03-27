package com.tibil.BecknBAP.model;

import java.time.OffsetDateTime;
import java.util.Date;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseModel {
	private OffsetDateTime createdAt;
	private OffsetDateTime updatedAt;
	
	public BaseModel() {
		super();
	}

	public BaseModel(OffsetDateTime createdAt, OffsetDateTime updatedAt) {
		super();
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public OffsetDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(OffsetDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public OffsetDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(OffsetDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	

}

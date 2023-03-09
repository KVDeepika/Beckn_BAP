package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * CancelMessage
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class CancelMessage {
	@JsonProperty("order_id")
	private String orderId = null;

	@JsonProperty("cancellation_reason_id")
	private String cancellationReasonId = null;

	@JsonProperty("descriptor")
	private Descriptor descriptor = null;

	public CancelMessage orderId(String orderId) {
		this.orderId = orderId;
		return this;
	}

	/**
	 * Get orderId
	 * 
	 * @return orderId
	 **/
	@Schema(required = true, description = "")
	@NotNull

	@Valid
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public CancelMessage cancellationReasonId(String cancellationReasonId) {
		this.cancellationReasonId = cancellationReasonId;
		return this;
	}

	/**
	 * Get cancellationReasonId
	 * 
	 * @return cancellationReasonId
	 **/
	@Schema(description = "")

	@Valid
	public String getCancellationReasonId() {
		return cancellationReasonId;
	}

	public void setCancellationReasonId(String cancellationReasonId) {
		this.cancellationReasonId = cancellationReasonId;
	}

	public CancelMessage descriptor(Descriptor descriptor) {
		this.descriptor = descriptor;
		return this;
	}

	/**
	 * Get descriptor
	 * 
	 * @return descriptor
	 **/
	@Schema(description = "")

	@Valid
	public Descriptor getDescriptor() {
		return descriptor;
	}

	public void setDescriptor(Descriptor descriptor) {
		this.descriptor = descriptor;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CancelMessage cancelMessage = (CancelMessage) o;
		return Objects.equals(this.orderId, cancelMessage.orderId)
				&& Objects.equals(this.cancellationReasonId, cancelMessage.cancellationReasonId)
				&& Objects.equals(this.descriptor, cancelMessage.descriptor);
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderId, cancellationReasonId, descriptor);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CancelMessage {\n");

		sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
		sb.append("    cancellationReasonId: ").append(toIndentedString(cancellationReasonId)).append("\n");
		sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}

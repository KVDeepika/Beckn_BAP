package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * TrackMessage
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class TrackMessage {
	@JsonProperty("order_id")
	private String orderId = null;

	@JsonProperty("callback_url")
	private String callbackUrl = null;

	public TrackMessage orderId(String orderId) {
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

	public TrackMessage callbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
		return this;
	}

	/**
	 * Get callbackUrl
	 * 
	 * @return callbackUrl
	 **/
	@Schema(description = "")

	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TrackMessage trackMessage = (TrackMessage) o;
		return Objects.equals(this.orderId, trackMessage.orderId)
				&& Objects.equals(this.callbackUrl, trackMessage.callbackUrl);
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderId, callbackUrl);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TrackMessage {\n");

		sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
		sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
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

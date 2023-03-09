package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * UpdateMessage
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class UpdateMessage {
	@JsonProperty("update_target")
	private String updateTarget = null;

	@JsonProperty("order")
	private Order order = null;

	public UpdateMessage updateTarget(String updateTarget) {
		this.updateTarget = updateTarget;
		return this;
	}

	/**
	 * Comma separated values of order objects being updated. For example:
	 * ```\"update_target\":\"item,billing,fulfillment\"```
	 * 
	 * @return updateTarget
	 **/
	@Schema(required = true, description = "Comma separated values of order objects being updated. For example: ```\"update_target\":\"item,billing,fulfillment\"```")
	@NotNull

	public String getUpdateTarget() {
		return updateTarget;
	}

	public void setUpdateTarget(String updateTarget) {
		this.updateTarget = updateTarget;
	}

	public UpdateMessage order(Order order) {
		this.order = order;
		return this;
	}

	/**
	 * Get order
	 * 
	 * @return order
	 **/
	@Schema(required = true, description = "")
	@NotNull

	@Valid
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		UpdateMessage updateMessage = (UpdateMessage) o;
		return Objects.equals(this.updateTarget, updateMessage.updateTarget)
				&& Objects.equals(this.order, updateMessage.order);
	}

	@Override
	public int hashCode() {
		return Objects.hash(updateTarget, order);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UpdateMessage {\n");

		sb.append("    updateTarget: ").append(toIndentedString(updateTarget)).append("\n");
		sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

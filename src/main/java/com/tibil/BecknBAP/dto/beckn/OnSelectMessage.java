package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * OnSelectMessage
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class OnSelectMessage {
	@JsonProperty("order")
	private OnSelectMessageOrder order = null;

	public OnSelectMessage order(OnSelectMessageOrder order) {
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
	public OnSelectMessageOrder getOrder() {
		return order;
	}

	public void setOrder(OnSelectMessageOrder order) {
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
		OnSelectMessage onSelectMessage = (OnSelectMessage) o;
		return Objects.equals(this.order, onSelectMessage.order);
	}

	@Override
	public int hashCode() {
		return Objects.hash(order);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OnSelectMessage {\n");

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

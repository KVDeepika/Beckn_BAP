package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * OnInitMessage
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class OnInitMessage {
	@JsonProperty("order")
	private OnInitMessageOrder order = null;

	public OnInitMessage order(OnInitMessageOrder order) {
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
	public OnInitMessageOrder getOrder() {
		return order;
	}

	public void setOrder(OnInitMessageOrder order) {
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
		OnInitMessage onInitMessage = (OnInitMessage) o;
		return Objects.equals(this.order, onInitMessage.order);
	}

	@Override
	public int hashCode() {
		return Objects.hash(order);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OnInitMessage {\n");

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

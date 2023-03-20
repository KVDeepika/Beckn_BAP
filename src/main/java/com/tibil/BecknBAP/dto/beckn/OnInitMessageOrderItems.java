package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * OnInitMessageOrderItems
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class OnInitMessageOrderItems {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("quantity")
	private String quantity = null;

	public OnInitMessageOrderItems id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@Schema(description = "")

	@Valid
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public OnInitMessageOrderItems quantity(String quantity) {
		this.quantity = quantity;
		return this;
	}

	/**
	 * Get quantity
	 * 
	 * @return quantity
	 **/
	@Schema(description = "")

	@Valid
	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OnInitMessageOrderItems onInitMessageOrderItems = (OnInitMessageOrderItems) o;
		return Objects.equals(this.id, onInitMessageOrderItems.id)
				&& Objects.equals(this.quantity, onInitMessageOrderItems.quantity);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, quantity);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OnInitMessageOrderItems {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

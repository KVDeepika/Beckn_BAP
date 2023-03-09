package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * AllOfonSelectMessageOrderItemsItems
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class AllOfonSelectMessageOrderItemsItems extends Item {
	@JsonProperty("quantity")
	private ItemQuantity quantity = null;

	public AllOfonSelectMessageOrderItemsItems quantity(ItemQuantity quantity) {
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
	public ItemQuantity getQuantity() {
		return quantity;
	}

	public void setQuantity(ItemQuantity quantity) {
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
		AllOfonSelectMessageOrderItemsItems allOfonSelectMessageOrderItemsItems = (AllOfonSelectMessageOrderItemsItems) o;
		return Objects.equals(this.quantity, allOfonSelectMessageOrderItemsItems.quantity) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(quantity, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AllOfonSelectMessageOrderItemsItems {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

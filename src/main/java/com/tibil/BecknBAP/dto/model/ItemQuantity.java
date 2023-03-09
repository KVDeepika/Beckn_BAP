package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Describes count or amount of an item
 */
@Schema(description = "Describes count or amount of an item")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class ItemQuantity {
	@JsonProperty("allocated")
	private ItemQuantityAllocated allocated = null;

	@JsonProperty("available")
	private ItemQuantityAllocated available = null;

	@JsonProperty("maximum")
	private ItemQuantityMaximum maximum = null;

	@JsonProperty("minimum")
	private ItemQuantityAllocated minimum = null;

	@JsonProperty("selected")
	private ItemQuantityAllocated selected = null;

	public ItemQuantity allocated(ItemQuantityAllocated allocated) {
		this.allocated = allocated;
		return this;
	}

	/**
	 * Get allocated
	 * 
	 * @return allocated
	 **/
	@Schema(description = "")

	@Valid
	public ItemQuantityAllocated getAllocated() {
		return allocated;
	}

	public void setAllocated(ItemQuantityAllocated allocated) {
		this.allocated = allocated;
	}

	public ItemQuantity available(ItemQuantityAllocated available) {
		this.available = available;
		return this;
	}

	/**
	 * Get available
	 * 
	 * @return available
	 **/
	@Schema(description = "")

	@Valid
	public ItemQuantityAllocated getAvailable() {
		return available;
	}

	public void setAvailable(ItemQuantityAllocated available) {
		this.available = available;
	}

	public ItemQuantity maximum(ItemQuantityMaximum maximum) {
		this.maximum = maximum;
		return this;
	}

	/**
	 * Get maximum
	 * 
	 * @return maximum
	 **/
	@Schema(description = "")

	@Valid
	public ItemQuantityMaximum getMaximum() {
		return maximum;
	}

	public void setMaximum(ItemQuantityMaximum maximum) {
		this.maximum = maximum;
	}

	public ItemQuantity minimum(ItemQuantityAllocated minimum) {
		this.minimum = minimum;
		return this;
	}

	/**
	 * Get minimum
	 * 
	 * @return minimum
	 **/
	@Schema(description = "")

	@Valid
	public ItemQuantityAllocated getMinimum() {
		return minimum;
	}

	public void setMinimum(ItemQuantityAllocated minimum) {
		this.minimum = minimum;
	}

	public ItemQuantity selected(ItemQuantityAllocated selected) {
		this.selected = selected;
		return this;
	}

	/**
	 * Get selected
	 * 
	 * @return selected
	 **/
	@Schema(description = "")

	@Valid
	public ItemQuantityAllocated getSelected() {
		return selected;
	}

	public void setSelected(ItemQuantityAllocated selected) {
		this.selected = selected;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ItemQuantity itemQuantity = (ItemQuantity) o;
		return Objects.equals(this.allocated, itemQuantity.allocated)
				&& Objects.equals(this.available, itemQuantity.available)
				&& Objects.equals(this.maximum, itemQuantity.maximum)
				&& Objects.equals(this.minimum, itemQuantity.minimum)
				&& Objects.equals(this.selected, itemQuantity.selected);
	}

	@Override
	public int hashCode() {
		return Objects.hash(allocated, available, maximum, minimum, selected);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ItemQuantity {\n");

		sb.append("    allocated: ").append(toIndentedString(allocated)).append("\n");
		sb.append("    available: ").append(toIndentedString(available)).append("\n");
		sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
		sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
		sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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

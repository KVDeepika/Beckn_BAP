package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

/**
 * ItemQuantityAllocated
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class ItemQuantityAllocated {
	@JsonProperty("count")
	private Integer count = null;

	@JsonProperty("measure")
	private Scalar measure = null;

	public ItemQuantityAllocated count(Integer count) {
		this.count = count;
		return this;
	}

	/**
	 * Get count minimum: 0
	 * 
	 * @return count
	 **/
	@Schema(description = "")

	@Min(0)
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public ItemQuantityAllocated measure(Scalar measure) {
		this.measure = measure;
		return this;
	}

	/**
	 * Get measure
	 * 
	 * @return measure
	 **/
	@Schema(description = "")

	@Valid
	public Scalar getMeasure() {
		return measure;
	}

	public void setMeasure(Scalar measure) {
		this.measure = measure;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ItemQuantityAllocated itemQuantityAllocated = (ItemQuantityAllocated) o;
		return Objects.equals(this.count, itemQuantityAllocated.count)
				&& Objects.equals(this.measure, itemQuantityAllocated.measure);
	}

	@Override
	public int hashCode() {
		return Objects.hash(count, measure);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ItemQuantityAllocated {\n");

		sb.append("    count: ").append(toIndentedString(count)).append("\n");
		sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
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

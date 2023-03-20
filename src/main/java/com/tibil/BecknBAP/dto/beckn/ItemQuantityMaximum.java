package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

/**
 * ItemQuantityMaximum
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class ItemQuantityMaximum {
	@JsonProperty("count")
	private Integer count = null;

	@JsonProperty("measure")
	private Scalar measure = null;

	public ItemQuantityMaximum count(Integer count) {
		this.count = count;
		return this;
	}

	/**
	 * Get count minimum: 1
	 * 
	 * @return count
	 **/
	@Schema(description = "")

	@Min(1)
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public ItemQuantityMaximum measure(Scalar measure) {
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
		ItemQuantityMaximum itemQuantityMaximum = (ItemQuantityMaximum) o;
		return Objects.equals(this.count, itemQuantityMaximum.count)
				&& Objects.equals(this.measure, itemQuantityMaximum.measure);
	}

	@Override
	public int hashCode() {
		return Objects.hash(count, measure);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ItemQuantityMaximum {\n");

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

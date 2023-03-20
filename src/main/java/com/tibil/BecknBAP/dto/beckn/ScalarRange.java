package com.tibil.BecknBAP.dto.beckn;

import java.math.BigDecimal;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * ScalarRange
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class ScalarRange {
	@JsonProperty("min")
	private BigDecimal min = null;

	@JsonProperty("max")
	private BigDecimal max = null;

	public ScalarRange min(BigDecimal min) {
		this.min = min;
		return this;
	}

	/**
	 * Get min
	 * 
	 * @return min
	 **/
	@Schema(description = "")

	@Valid
	public BigDecimal getMin() {
		return min;
	}

	public void setMin(BigDecimal min) {
		this.min = min;
	}

	public ScalarRange max(BigDecimal max) {
		this.max = max;
		return this;
	}

	/**
	 * Get max
	 * 
	 * @return max
	 **/
	@Schema(description = "")

	@Valid
	public BigDecimal getMax() {
		return max;
	}

	public void setMax(BigDecimal max) {
		this.max = max;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ScalarRange scalarRange = (ScalarRange) o;
		return Objects.equals(this.min, scalarRange.min) && Objects.equals(this.max, scalarRange.max);
	}

	@Override
	public int hashCode() {
		return Objects.hash(min, max);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ScalarRange {\n");

		sb.append("    min: ").append(toIndentedString(min)).append("\n");
		sb.append("    max: ").append(toIndentedString(max)).append("\n");
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

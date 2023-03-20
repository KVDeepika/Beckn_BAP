package com.tibil.BecknBAP.dto.beckn;

import java.math.BigDecimal;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * An object representing a scalar quantity.
 */
@Schema(description = "An object representing a scalar quantity.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Scalar {
	/**
	 * Gets or Sets type
	 */
	public enum TypeEnum {
		CONSTANT("CONSTANT"),

		VARIABLE("VARIABLE");

		private String value;

		TypeEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static TypeEnum fromValue(String text) {
			for (TypeEnum b : TypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("type")
	private TypeEnum type = null;

	@JsonProperty("value")
	private BigDecimal value = null;

	@JsonProperty("estimated_value")
	private BigDecimal estimatedValue = null;

	@JsonProperty("computed_value")
	private BigDecimal computedValue = null;

	@JsonProperty("range")
	private ScalarRange range = null;

	@JsonProperty("unit")
	private String unit = null;

	public Scalar type(TypeEnum type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@Schema(description = "")

	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	public Scalar value(BigDecimal value) {
		this.value = value;
		return this;
	}

	/**
	 * Get value
	 * 
	 * @return value
	 **/
	@Schema(required = true, description = "")
	@NotNull

	@Valid
	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Scalar estimatedValue(BigDecimal estimatedValue) {
		this.estimatedValue = estimatedValue;
		return this;
	}

	/**
	 * Get estimatedValue
	 * 
	 * @return estimatedValue
	 **/
	@Schema(description = "")

	@Valid
	public BigDecimal getEstimatedValue() {
		return estimatedValue;
	}

	public void setEstimatedValue(BigDecimal estimatedValue) {
		this.estimatedValue = estimatedValue;
	}

	public Scalar computedValue(BigDecimal computedValue) {
		this.computedValue = computedValue;
		return this;
	}

	/**
	 * Get computedValue
	 * 
	 * @return computedValue
	 **/
	@Schema(description = "")

	@Valid
	public BigDecimal getComputedValue() {
		return computedValue;
	}

	public void setComputedValue(BigDecimal computedValue) {
		this.computedValue = computedValue;
	}

	public Scalar range(ScalarRange range) {
		this.range = range;
		return this;
	}

	/**
	 * Get range
	 * 
	 * @return range
	 **/
	@Schema(description = "")

	@Valid
	public ScalarRange getRange() {
		return range;
	}

	public void setRange(ScalarRange range) {
		this.range = range;
	}

	public Scalar unit(String unit) {
		this.unit = unit;
		return this;
	}

	/**
	 * Get unit
	 * 
	 * @return unit
	 **/
	@Schema(required = true, description = "")
	@NotNull

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Scalar scalar = (Scalar) o;
		return Objects.equals(this.type, scalar.type) && Objects.equals(this.value, scalar.value)
				&& Objects.equals(this.estimatedValue, scalar.estimatedValue)
				&& Objects.equals(this.computedValue, scalar.computedValue) && Objects.equals(this.range, scalar.range)
				&& Objects.equals(this.unit, scalar.unit);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, value, estimatedValue, computedValue, range, unit);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Scalar {\n");

		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    estimatedValue: ").append(toIndentedString(estimatedValue)).append("\n");
		sb.append("    computedValue: ").append(toIndentedString(computedValue)).append("\n");
		sb.append("    range: ").append(toIndentedString(range)).append("\n");
		sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

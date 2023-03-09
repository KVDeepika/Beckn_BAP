package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * OperatorExperience
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class OperatorExperience {
	@JsonProperty("label")
	private String label = null;

	@JsonProperty("value")
	private String value = null;

	@JsonProperty("unit")
	private String unit = null;

	public OperatorExperience label(String label) {
		this.label = label;
		return this;
	}

	/**
	 * Get label
	 * 
	 * @return label
	 **/
	@Schema(description = "")

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public OperatorExperience value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Get value
	 * 
	 * @return value
	 **/
	@Schema(description = "")

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public OperatorExperience unit(String unit) {
		this.unit = unit;
		return this;
	}

	/**
	 * Get unit
	 * 
	 * @return unit
	 **/
	@Schema(description = "")

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
		OperatorExperience operatorExperience = (OperatorExperience) o;
		return Objects.equals(this.label, operatorExperience.label)
				&& Objects.equals(this.value, operatorExperience.value)
				&& Objects.equals(this.unit, operatorExperience.unit);
	}

	@Override
	public int hashCode() {
		return Objects.hash(label, value, unit);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OperatorExperience {\n");

		sb.append("    label: ").append(toIndentedString(label)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

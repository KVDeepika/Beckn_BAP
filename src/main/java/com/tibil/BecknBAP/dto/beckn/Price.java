package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Pattern;

/**
 * Describes the price of an item. Allows for domain extension.
 */
@Schema(description = "Describes the price of an item. Allows for domain extension.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Price {
	@JsonProperty("currency")
	private String currency = null;

	@JsonProperty("value")
	private String value = null;

	@JsonProperty("estimated_value")
	private String estimatedValue = null;

	@JsonProperty("computed_value")
	private String computedValue = null;

	@JsonProperty("listed_value")
	private String listedValue = null;

	@JsonProperty("offered_value")
	private String offeredValue = null;

	@JsonProperty("minimum_value")
	private String minimumValue = null;

	@JsonProperty("maximum_value")
	private String maximumValue = null;

	public Price currency(String currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * Get currency
	 * 
	 * @return currency
	 **/
	@Schema(description = "")

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Price value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Describes a decimal value
	 * 
	 * @return value
	 **/
	@Schema(description = "Describes a decimal value")

	@Pattern(regexp = "[+-]?([0-9]*[.])?[0-9]+")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Price estimatedValue(String estimatedValue) {
		this.estimatedValue = estimatedValue;
		return this;
	}

	/**
	 * Describes a decimal value
	 * 
	 * @return estimatedValue
	 **/
	@Schema(description = "Describes a decimal value")

	@Pattern(regexp = "[+-]?([0-9]*[.])?[0-9]+")
	public String getEstimatedValue() {
		return estimatedValue;
	}

	public void setEstimatedValue(String estimatedValue) {
		this.estimatedValue = estimatedValue;
	}

	public Price computedValue(String computedValue) {
		this.computedValue = computedValue;
		return this;
	}

	/**
	 * Describes a decimal value
	 * 
	 * @return computedValue
	 **/
	@Schema(description = "Describes a decimal value")

	@Pattern(regexp = "[+-]?([0-9]*[.])?[0-9]+")
	public String getComputedValue() {
		return computedValue;
	}

	public void setComputedValue(String computedValue) {
		this.computedValue = computedValue;
	}

	public Price listedValue(String listedValue) {
		this.listedValue = listedValue;
		return this;
	}

	/**
	 * Describes a decimal value
	 * 
	 * @return listedValue
	 **/
	@Schema(description = "Describes a decimal value")

	@Pattern(regexp = "[+-]?([0-9]*[.])?[0-9]+")
	public String getListedValue() {
		return listedValue;
	}

	public void setListedValue(String listedValue) {
		this.listedValue = listedValue;
	}

	public Price offeredValue(String offeredValue) {
		this.offeredValue = offeredValue;
		return this;
	}

	/**
	 * Describes a decimal value
	 * 
	 * @return offeredValue
	 **/
	@Schema(description = "Describes a decimal value")

	@Pattern(regexp = "[+-]?([0-9]*[.])?[0-9]+")
	public String getOfferedValue() {
		return offeredValue;
	}

	public void setOfferedValue(String offeredValue) {
		this.offeredValue = offeredValue;
	}

	public Price minimumValue(String minimumValue) {
		this.minimumValue = minimumValue;
		return this;
	}

	/**
	 * Describes a decimal value
	 * 
	 * @return minimumValue
	 **/
	@Schema(description = "Describes a decimal value")

	@Pattern(regexp = "[+-]?([0-9]*[.])?[0-9]+")
	public String getMinimumValue() {
		return minimumValue;
	}

	public void setMinimumValue(String minimumValue) {
		this.minimumValue = minimumValue;
	}

	public Price maximumValue(String maximumValue) {
		this.maximumValue = maximumValue;
		return this;
	}

	/**
	 * Describes a decimal value
	 * 
	 * @return maximumValue
	 **/
	@Schema(description = "Describes a decimal value")

	@Pattern(regexp = "[+-]?([0-9]*[.])?[0-9]+")
	public String getMaximumValue() {
		return maximumValue;
	}

	public void setMaximumValue(String maximumValue) {
		this.maximumValue = maximumValue;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Price price = (Price) o;
		return Objects.equals(this.currency, price.currency) && Objects.equals(this.value, price.value)
				&& Objects.equals(this.estimatedValue, price.estimatedValue)
				&& Objects.equals(this.computedValue, price.computedValue)
				&& Objects.equals(this.listedValue, price.listedValue)
				&& Objects.equals(this.offeredValue, price.offeredValue)
				&& Objects.equals(this.minimumValue, price.minimumValue)
				&& Objects.equals(this.maximumValue, price.maximumValue);
	}

	@Override
	public int hashCode() {
		return Objects.hash(currency, value, estimatedValue, computedValue, listedValue, offeredValue, minimumValue,
				maximumValue);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Price {\n");

		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    estimatedValue: ").append(toIndentedString(estimatedValue)).append("\n");
		sb.append("    computedValue: ").append(toIndentedString(computedValue)).append("\n");
		sb.append("    listedValue: ").append(toIndentedString(listedValue)).append("\n");
		sb.append("    offeredValue: ").append(toIndentedString(offeredValue)).append("\n");
		sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
		sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
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

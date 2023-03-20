package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Fee
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Fee {
	@JsonProperty("value")
	private String value = null;

	@JsonProperty("currency")
	private String currency = null;

	public Fee value(String value) {
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

	public Fee currency(String currency) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Fee fee = (Fee) o;
		return Objects.equals(this.value, fee.value) && Objects.equals(this.currency, fee.currency);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value, currency);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Fee {\n");

		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

package com.tibil.BecknBAP.dto.beckn;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Describes a quote
 */
@Schema(description = "Describes a quote")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Quotation {
	@JsonProperty("price")
	private Price price = null;

	@JsonProperty("breakup")
	@Valid
	private List<QuotationBreakup> breakup = null;

	@JsonProperty("ttl")
	private String ttl = null;

	public Quotation price(Price price) {
		this.price = price;
		return this;
	}

	/**
	 * Get price
	 * 
	 * @return price
	 **/
	@Schema(description = "")

	@Valid
	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Quotation breakup(List<QuotationBreakup> breakup) {
		this.breakup = breakup;
		return this;
	}

	public Quotation addBreakupItem(QuotationBreakup breakupItem) {
		if (this.breakup == null) {
			this.breakup = new ArrayList<QuotationBreakup>();
		}
		this.breakup.add(breakupItem);
		return this;
	}

	/**
	 * Get breakup
	 * 
	 * @return breakup
	 **/
	@Schema(description = "")
	@Valid
	public List<QuotationBreakup> getBreakup() {
		return breakup;
	}

	public void setBreakup(List<QuotationBreakup> breakup) {
		this.breakup = breakup;
	}

	public Quotation ttl(String ttl) {
		this.ttl = ttl;
		return this;
	}

	/**
	 * Describes duration as per ISO8601 format
	 * 
	 * @return ttl
	 **/
	@Schema(description = "Describes duration as per ISO8601 format")

	public String getTtl() {
		return ttl;
	}

	public void setTtl(String ttl) {
		this.ttl = ttl;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Quotation quotation = (Quotation) o;
		return Objects.equals(this.price, quotation.price) && Objects.equals(this.breakup, quotation.breakup)
				&& Objects.equals(this.ttl, quotation.ttl);
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, breakup, ttl);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Quotation {\n");

		sb.append("    price: ").append(toIndentedString(price)).append("\n");
		sb.append("    breakup: ").append(toIndentedString(breakup)).append("\n");
		sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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

package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * QuotationBreakup
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class QuotationBreakup {
	@JsonProperty("title")
	private String title = null;

	@JsonProperty("price")
	private Price price = null;

	public QuotationBreakup title(String title) {
		this.title = title;
		return this;
	}

	/**
	 * Get title
	 * 
	 * @return title
	 **/
	@Schema(description = "")

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public QuotationBreakup price(Price price) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		QuotationBreakup quotationBreakup = (QuotationBreakup) o;
		return Objects.equals(this.title, quotationBreakup.title) && Objects.equals(this.price, quotationBreakup.price);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, price);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class QuotationBreakup {\n");

		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

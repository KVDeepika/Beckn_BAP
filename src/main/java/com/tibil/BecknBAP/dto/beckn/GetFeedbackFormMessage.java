package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * GetFeedbackFormMessage
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class GetFeedbackFormMessage {
	@JsonProperty("rating_value")
	private String ratingValue = null;

	@JsonProperty("rating_category")
	private String ratingCategory = null;

	public GetFeedbackFormMessage ratingValue(String ratingValue) {
		this.ratingValue = ratingValue;
		return this;
	}

	/**
	 * Get ratingValue
	 * 
	 * @return ratingValue
	 **/
	@Schema(description = "")

	@Valid
	public String getRatingValue() {
		return ratingValue;
	}

	public void setRatingValue(String ratingValue) {
		this.ratingValue = ratingValue;
	}

	public GetFeedbackFormMessage ratingCategory(String ratingCategory) {
		this.ratingCategory = ratingCategory;
		return this;
	}

	/**
	 * Get ratingCategory
	 * 
	 * @return ratingCategory
	 **/
	@Schema(description = "")

	@Valid
	public String getRatingCategory() {
		return ratingCategory;
	}

	public void setRatingCategory(String ratingCategory) {
		this.ratingCategory = ratingCategory;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetFeedbackFormMessage getFeedbackFormMessage = (GetFeedbackFormMessage) o;
		return Objects.equals(this.ratingValue, getFeedbackFormMessage.ratingValue)
				&& Objects.equals(this.ratingCategory, getFeedbackFormMessage.ratingCategory);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ratingValue, ratingCategory);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetFeedbackFormMessage {\n");

		sb.append("    ratingValue: ").append(toIndentedString(ratingValue)).append("\n");
		sb.append("    ratingCategory: ").append(toIndentedString(ratingCategory)).append("\n");
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

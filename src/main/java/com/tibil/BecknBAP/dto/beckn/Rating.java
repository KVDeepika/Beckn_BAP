package com.tibil.BecknBAP.dto.beckn;

import java.math.BigDecimal;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMin;

/**
 * Describes the rating of a person or an object.
 */
@Schema(description = "Describes the rating of a person or an object.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Rating {
	@JsonProperty("rating_category")
	private String ratingCategory = null;

	@JsonProperty("id")
	private String id = null;

	@JsonProperty("value")
	private BigDecimal value = null;

	@JsonProperty("feedback_form")
	private FeedbackForm feedbackForm = null;

	@JsonProperty("feedback_id")
	private String feedbackId = null;

	public Rating ratingCategory(String ratingCategory) {
		this.ratingCategory = ratingCategory;
		return this;
	}

	/**
	 * Category of the object being rated
	 * 
	 * @return ratingCategory
	 **/
	@Schema(description = "Category of the object being rated")

	public String getRatingCategory() {
		return ratingCategory;
	}

	public void setRatingCategory(String ratingCategory) {
		this.ratingCategory = ratingCategory;
	}

	public Rating id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Id of the object being rated
	 * 
	 * @return id
	 **/
	@Schema(description = "Id of the object being rated")

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Rating value(BigDecimal value) {
		this.value = value;
		return this;
	}

	/**
	 * Rating value given to the object minimum: 0
	 * 
	 * @return value
	 **/
	@Schema(description = "Rating value given to the object")

	@Valid
	@DecimalMin("0")
	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Rating feedbackForm(FeedbackForm feedbackForm) {
		this.feedbackForm = feedbackForm;
		return this;
	}

	/**
	 * Get feedbackForm
	 * 
	 * @return feedbackForm
	 **/
	@Schema(description = "")

	@Valid
	public FeedbackForm getFeedbackForm() {
		return feedbackForm;
	}

	public void setFeedbackForm(FeedbackForm feedbackForm) {
		this.feedbackForm = feedbackForm;
	}

	public Rating feedbackId(String feedbackId) {
		this.feedbackId = feedbackId;
		return this;
	}

	/**
	 * Get feedbackId
	 * 
	 * @return feedbackId
	 **/
	@Schema(description = "")

	@Valid
	public String getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(String feedbackId) {
		this.feedbackId = feedbackId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Rating rating = (Rating) o;
		return Objects.equals(this.ratingCategory, rating.ratingCategory) && Objects.equals(this.id, rating.id)
				&& Objects.equals(this.value, rating.value) && Objects.equals(this.feedbackForm, rating.feedbackForm)
				&& Objects.equals(this.feedbackId, rating.feedbackId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ratingCategory, id, value, feedbackForm, feedbackId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Rating {\n");

		sb.append("    ratingCategory: ").append(toIndentedString(ratingCategory)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    feedbackForm: ").append(toIndentedString(feedbackForm)).append("\n");
		sb.append("    feedbackId: ").append(toIndentedString(feedbackId)).append("\n");
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

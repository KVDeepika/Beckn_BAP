package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RatingAck
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class RatingAck {
	@JsonProperty("feedback_ack")
	private Boolean feedbackAck = null;

	@JsonProperty("rating_ack")
	private Boolean ratingAck = null;

	public RatingAck feedbackAck(Boolean feedbackAck) {
		this.feedbackAck = feedbackAck;
		return this;
	}

	/**
	 * If feedback has been recorded or not
	 * 
	 * @return feedbackAck
	 **/
	@Schema(description = "If feedback has been recorded or not")

	public Boolean isFeedbackAck() {
		return feedbackAck;
	}

	public void setFeedbackAck(Boolean feedbackAck) {
		this.feedbackAck = feedbackAck;
	}

	public RatingAck ratingAck(Boolean ratingAck) {
		this.ratingAck = ratingAck;
		return this;
	}

	/**
	 * If rating has been recorded or not
	 * 
	 * @return ratingAck
	 **/
	@Schema(description = "If rating has been recorded or not")

	public Boolean isRatingAck() {
		return ratingAck;
	}

	public void setRatingAck(Boolean ratingAck) {
		this.ratingAck = ratingAck;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RatingAck ratingAck = (RatingAck) o;
		return Objects.equals(this.feedbackAck, ratingAck.feedbackAck)
				&& Objects.equals(this.ratingAck, ratingAck.ratingAck);
	}

	@Override
	public int hashCode() {
		return Objects.hash(feedbackAck, ratingAck);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RatingAck {\n");

		sb.append("    feedbackAck: ").append(toIndentedString(feedbackAck)).append("\n");
		sb.append("    ratingAck: ").append(toIndentedString(ratingAck)).append("\n");
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

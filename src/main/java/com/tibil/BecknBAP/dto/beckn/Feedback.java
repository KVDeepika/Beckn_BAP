package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Feedback for a service
 */
@Schema(description = "Feedback for a service")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Feedback {
	@JsonProperty("feedback_form")
	private FeedbackForm feedbackForm = null;

	@JsonProperty("feedback_url")
	private FeedbackUrl feedbackUrl = null;

	public Feedback feedbackForm(FeedbackForm feedbackForm) {
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

	public Feedback feedbackUrl(FeedbackUrl feedbackUrl) {
		this.feedbackUrl = feedbackUrl;
		return this;
	}

	/**
	 * Get feedbackUrl
	 * 
	 * @return feedbackUrl
	 **/
	@Schema(description = "")

	@Valid
	public FeedbackUrl getFeedbackUrl() {
		return feedbackUrl;
	}

	public void setFeedbackUrl(FeedbackUrl feedbackUrl) {
		this.feedbackUrl = feedbackUrl;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Feedback feedback = (Feedback) o;
		return Objects.equals(this.feedbackForm, feedback.feedbackForm)
				&& Objects.equals(this.feedbackUrl, feedback.feedbackUrl);
	}

	@Override
	public int hashCode() {
		return Objects.hash(feedbackForm, feedbackUrl);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Feedback {\n");

		sb.append("    feedbackForm: ").append(toIndentedString(feedbackForm)).append("\n");
		sb.append("    feedbackUrl: ").append(toIndentedString(feedbackUrl)).append("\n");
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

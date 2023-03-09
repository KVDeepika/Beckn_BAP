package com.tibil.BecknBAP.dto.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * FeedbackCategoriesBody
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class FeedbackCategoriesBody {
	@JsonProperty("context")
	private Context context = null;

	@JsonProperty("feedback_categories")
	@Valid
	private List<String> feedbackCategories = null;

	public FeedbackCategoriesBody context(Context context) {
		this.context = context;
		return this;
	}

	/**
	 * Get context
	 * 
	 * @return context
	 **/
	@Schema(description = "")

	@Valid
	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public FeedbackCategoriesBody feedbackCategories(List<String> feedbackCategories) {
		this.feedbackCategories = feedbackCategories;
		return this;
	}

	public FeedbackCategoriesBody addFeedbackCategoriesItem(String feedbackCategoriesItem) {
		if (this.feedbackCategories == null) {
			this.feedbackCategories = new ArrayList<String>();
		}
		this.feedbackCategories.add(feedbackCategoriesItem);
		return this;
	}

	/**
	 * Get feedbackCategories
	 * 
	 * @return feedbackCategories
	 **/
	@Schema(description = "")
	@Valid
	public List<String> getFeedbackCategories() {
		return feedbackCategories;
	}

	public void setFeedbackCategories(List<String> feedbackCategories) {
		this.feedbackCategories = feedbackCategories;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FeedbackCategoriesBody feedbackCategoriesBody = (FeedbackCategoriesBody) o;
		return Objects.equals(this.context, feedbackCategoriesBody.context)
				&& Objects.equals(this.feedbackCategories, feedbackCategoriesBody.feedbackCategories);
	}

	@Override
	public int hashCode() {
		return Objects.hash(context, feedbackCategories);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FeedbackCategoriesBody {\n");

		sb.append("    context: ").append(toIndentedString(context)).append("\n");
		sb.append("    feedbackCategories: ").append(toIndentedString(feedbackCategories)).append("\n");
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

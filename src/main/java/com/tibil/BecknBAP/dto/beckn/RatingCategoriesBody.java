package com.tibil.BecknBAP.dto.beckn;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * RatingCategoriesBody
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class RatingCategoriesBody {
	@JsonProperty("context")
	private Context context = null;

	@JsonProperty("rating_categories")
	@Valid
	private List<String> ratingCategories = null;

	public RatingCategoriesBody context(Context context) {
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

	public RatingCategoriesBody ratingCategories(List<String> ratingCategories) {
		this.ratingCategories = ratingCategories;
		return this;
	}

	public RatingCategoriesBody addRatingCategoriesItem(String ratingCategoriesItem) {
		if (this.ratingCategories == null) {
			this.ratingCategories = new ArrayList<String>();
		}
		this.ratingCategories.add(ratingCategoriesItem);
		return this;
	}

	/**
	 * Get ratingCategories
	 * 
	 * @return ratingCategories
	 **/
	@Schema(description = "")
	@Valid
	public List<String> getRatingCategories() {
		return ratingCategories;
	}

	public void setRatingCategories(List<String> ratingCategories) {
		this.ratingCategories = ratingCategories;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RatingCategoriesBody ratingCategoriesBody = (RatingCategoriesBody) o;
		return Objects.equals(this.context, ratingCategoriesBody.context)
				&& Objects.equals(this.ratingCategories, ratingCategoriesBody.ratingCategories);
	}

	@Override
	public int hashCode() {
		return Objects.hash(context, ratingCategories);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RatingCategoriesBody {\n");

		sb.append("    context: ").append(toIndentedString(context)).append("\n");
		sb.append("    ratingCategories: ").append(toIndentedString(ratingCategories)).append("\n");
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

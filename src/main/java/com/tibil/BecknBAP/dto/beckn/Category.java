package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Describes a category
 */
@Schema(description = "Describes a category")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Category {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("parent_category_id")
	private String parentCategoryId = null;

	@JsonProperty("descriptor")
	private Descriptor descriptor = null;

	@JsonProperty("time")
	private Time time = null;

	@JsonProperty("tags")
	private Tags tags = null;

	public Category id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique id of the category
	 * 
	 * @return id
	 **/
	@Schema(description = "Unique id of the category")

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Category parentCategoryId(String parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
		return this;
	}

	/**
	 * Get parentCategoryId
	 * 
	 * @return parentCategoryId
	 **/
	@Schema(description = "")

	@Valid
	public String getParentCategoryId() {
		return parentCategoryId;
	}

	public void setParentCategoryId(String parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}

	public Category descriptor(Descriptor descriptor) {
		this.descriptor = descriptor;
		return this;
	}

	/**
	 * Get descriptor
	 * 
	 * @return descriptor
	 **/
	@Schema(description = "")

	@Valid
	public Descriptor getDescriptor() {
		return descriptor;
	}

	public void setDescriptor(Descriptor descriptor) {
		this.descriptor = descriptor;
	}

	public Category time(Time time) {
		this.time = time;
		return this;
	}

	/**
	 * Get time
	 * 
	 * @return time
	 **/
	@Schema(description = "")

	@Valid
	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Category tags(Tags tags) {
		this.tags = tags;
		return this;
	}

	/**
	 * Get tags
	 * 
	 * @return tags
	 **/
	@Schema(description = "")

	@Valid
	public Tags getTags() {
		return tags;
	}

	public void setTags(Tags tags) {
		this.tags = tags;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Category category = (Category) o;
		return Objects.equals(this.id, category.id) && Objects.equals(this.parentCategoryId, category.parentCategoryId)
				&& Objects.equals(this.descriptor, category.descriptor) && Objects.equals(this.time, category.time)
				&& Objects.equals(this.tags, category.tags);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, parentCategoryId, descriptor, time, tags);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Category {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    parentCategoryId: ").append(toIndentedString(parentCategoryId)).append("\n");
		sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
		sb.append("    time: ").append(toIndentedString(time)).append("\n");
		sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

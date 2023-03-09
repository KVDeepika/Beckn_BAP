package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Describes the dimensions of a real-world object
 */
@Schema(description = "Describes the dimensions of a real-world object")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Dimensions {
	@JsonProperty("length")
	private Scalar length = null;

	@JsonProperty("breadth")
	private Scalar breadth = null;

	@JsonProperty("height")
	private Scalar height = null;

	public Dimensions length(Scalar length) {
		this.length = length;
		return this;
	}

	/**
	 * Get length
	 * 
	 * @return length
	 **/
	@Schema(description = "")

	@Valid
	public Scalar getLength() {
		return length;
	}

	public void setLength(Scalar length) {
		this.length = length;
	}

	public Dimensions breadth(Scalar breadth) {
		this.breadth = breadth;
		return this;
	}

	/**
	 * Get breadth
	 * 
	 * @return breadth
	 **/
	@Schema(description = "")

	@Valid
	public Scalar getBreadth() {
		return breadth;
	}

	public void setBreadth(Scalar breadth) {
		this.breadth = breadth;
	}

	public Dimensions height(Scalar height) {
		this.height = height;
		return this;
	}

	/**
	 * Get height
	 * 
	 * @return height
	 **/
	@Schema(description = "")

	@Valid
	public Scalar getHeight() {
		return height;
	}

	public void setHeight(Scalar height) {
		this.height = height;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Dimensions dimensions = (Dimensions) o;
		return Objects.equals(this.length, dimensions.length) && Objects.equals(this.breadth, dimensions.breadth)
				&& Objects.equals(this.height, dimensions.height);
	}

	@Override
	public int hashCode() {
		return Objects.hash(length, breadth, height);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Dimensions {\n");

		sb.append("    length: ").append(toIndentedString(length)).append("\n");
		sb.append("    breadth: ").append(toIndentedString(breadth)).append("\n");
		sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

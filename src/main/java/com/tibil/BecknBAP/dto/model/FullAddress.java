package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The full postal address.
 */
@Schema(description = "The full postal address.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class FullAddress implements Address {
	@JsonProperty("full")
	private String full = null;

	public FullAddress full(String full) {
		this.full = full;
		return this;
	}

	/**
	 * This is an unstructured string that describes the complete postal address in
	 * one line. If supported, the format of this field should be defined in the
	 * network policy. If this field is set, then the validator must ignore all the
	 * other fields. If this field is unavailable or null, then the validator must
	 * validate all the other fields of this object.
	 * 
	 * @return full
	 **/
	@Schema(description = "This is an unstructured string that describes the complete postal address in one line. If supported, the format of this field should be defined in the network policy. If this field is set, then the validator must ignore all the other fields. If this field is unavailable or null, then the validator must validate all the other fields of this object.")

	public String getFull() {
		return full;
	}

	public void setFull(String full) {
		this.full = full;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FullAddress fullAddress = (FullAddress) o;
		return Objects.equals(this.full, fullAddress.full);
	}

	@Override
	public int hashCode() {
		return Objects.hash(full);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FullAddress {\n");

		sb.append("    full: ").append(toIndentedString(full)).append("\n");
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

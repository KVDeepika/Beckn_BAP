package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Describes a country.
 */
@Schema(description = "Describes a country.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Country {
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("code")
	private String code = null;

	public Country name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the country
	 * 
	 * @return name
	 **/
	@Schema(description = "Name of the country")

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * Country code as per ISO 3166-1 and ISO 3166-2 format
	 * 
	 * @return code
	 **/
	@Schema(description = "Country code as per ISO 3166-1 and ISO 3166-2 format")

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Country country = (Country) o;
		return Objects.equals(this.name, country.name) && Objects.equals(this.code, country.code);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, code);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Country {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

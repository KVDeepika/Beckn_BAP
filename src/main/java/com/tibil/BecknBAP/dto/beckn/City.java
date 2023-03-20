package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Describes a city
 */
@Schema(description = "Describes a city")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class City {
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("code")
	private String code = null;

	public City name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the city
	 * 
	 * @return name
	 **/
	@Schema(description = "Name of the city")

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * City code
	 * 
	 * @return code
	 **/
	@Schema(description = "City code")

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
		City city = (City) o;
		return Objects.equals(this.name, city.name) && Objects.equals(this.code, city.code);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, code);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class City {\n");

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

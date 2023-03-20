package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Describes an organization
 */
@Schema(description = "Describes an organization")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Organization {
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("cred")
	private String cred = null;

	public Organization name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 * 
	 * @return name
	 **/
	@Schema(description = "")

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Organization cred(String cred) {
		this.cred = cred;
		return this;
	}

	/**
	 * Get cred
	 * 
	 * @return cred
	 **/
	@Schema(description = "")

	public String getCred() {
		return cred;
	}

	public void setCred(String cred) {
		this.cred = cred;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Organization organization = (Organization) o;
		return Objects.equals(this.name, organization.name) && Objects.equals(this.cred, organization.cred);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, cred);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Organization {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    cred: ").append(toIndentedString(cred)).append("\n");
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

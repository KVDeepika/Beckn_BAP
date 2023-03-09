package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Describes the agent of a service
 */
@Schema(description = "Describes the agent of a service")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Operator extends Person {
	@JsonProperty("experience")
	private OperatorExperience experience = null;

	public Operator experience(OperatorExperience experience) {
		this.experience = experience;
		return this;
	}

	/**
	 * Get experience
	 * 
	 * @return experience
	 **/
	@Schema(description = "")

	@Valid
	public OperatorExperience getExperience() {
		return experience;
	}

	public void setExperience(OperatorExperience experience) {
		this.experience = experience;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Operator operator = (Operator) o;
		return Objects.equals(this.experience, operator.experience) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(experience, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Operator {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
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

package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Describes the agent or person that fulfills an order.
 */
@Schema(description = "Describes the agent or person that fulfills an order.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Agent extends Person {
	@JsonProperty("phone")
	private String phone = null;

	@JsonProperty("email")
	private String email = null;

	@JsonProperty("tags")
	private Tags agentTags = null;

	@JsonProperty("rateable")
	private Boolean rateable = null;

	public Agent phone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * Get phone
	 * 
	 * @return phone
	 **/
	@Schema(description = "")

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Agent email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Get email
	 * 
	 * @return email
	 **/
	@Schema(description = "")

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Agent agentTags(Tags agentTags) {
		this.agentTags = agentTags;
		return this;
	}

	/**
	 * Get agentTags
	 * 
	 * @return agentTags
	 **/
	@Schema(description = "")

	@Valid
	public Tags getAgentTags() {
		return agentTags;
	}

	public void setAgentTags(Tags agentTags) {
		this.agentTags = agentTags;
	}

	public Agent rateable(Boolean rateable) {
		this.rateable = rateable;
		return this;
	}

	/**
	 * If the entity can be rated or not
	 * 
	 * @return rateable
	 **/
	@Schema(description = "If the entity can be rated or not")

	public Boolean isRateable() {
		return rateable;
	}

	public void setRateable(Boolean rateable) {
		this.rateable = rateable;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Agent agent = (Agent) o;
		return Objects.equals(this.phone, agent.phone) && Objects.equals(this.email, agent.email)
				&& Objects.equals(this.agentTags, agent.agentTags) && Objects.equals(this.rateable, agent.rateable)
				&& super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(phone, email, agentTags, rateable, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Agent {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    agentTags: ").append(toIndentedString(agentTags)).append("\n");
		sb.append("    rateable: ").append(toIndentedString(rateable)).append("\n");
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

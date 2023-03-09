package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Details on the end of fulfillment
 */
@Schema(description = "Details on the end of fulfillment")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class FulfillmentEnd {
	@JsonProperty("location")
	private Location location = null;

	@JsonProperty("time")
	private Time time = null;

	@JsonProperty("instructions")
	private Descriptor instructions = null;

	@JsonProperty("contact")
	private Contact contact = null;

	@JsonProperty("person")
	private Person person = null;

	@JsonProperty("authorization")
	private FulfillmentAuthorization authorization = null;

	public FulfillmentEnd location(Location location) {
		this.location = location;
		return this;
	}

	/**
	 * Get location
	 * 
	 * @return location
	 **/
	@Schema(description = "")

	@Valid
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public FulfillmentEnd time(Time time) {
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

	public FulfillmentEnd instructions(Descriptor instructions) {
		this.instructions = instructions;
		return this;
	}

	/**
	 * Get instructions
	 * 
	 * @return instructions
	 **/
	@Schema(description = "")

	@Valid
	public Descriptor getInstructions() {
		return instructions;
	}

	public void setInstructions(Descriptor instructions) {
		this.instructions = instructions;
	}

	public FulfillmentEnd contact(Contact contact) {
		this.contact = contact;
		return this;
	}

	/**
	 * Get contact
	 * 
	 * @return contact
	 **/
	@Schema(description = "")

	@Valid
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public FulfillmentEnd person(Person person) {
		this.person = person;
		return this;
	}

	/**
	 * Get person
	 * 
	 * @return person
	 **/
	@Schema(description = "")

	@Valid
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public FulfillmentEnd authorization(FulfillmentAuthorization authorization) {
		this.authorization = authorization;
		return this;
	}

	/**
	 * Get authorization
	 * 
	 * @return authorization
	 **/
	@Schema(description = "")

	@Valid
	public FulfillmentAuthorization getAuthorization() {
		return authorization;
	}

	public void setAuthorization(FulfillmentAuthorization authorization) {
		this.authorization = authorization;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FulfillmentEnd fulfillmentEnd = (FulfillmentEnd) o;
		return Objects.equals(this.location, fulfillmentEnd.location) && Objects.equals(this.time, fulfillmentEnd.time)
				&& Objects.equals(this.instructions, fulfillmentEnd.instructions)
				&& Objects.equals(this.contact, fulfillmentEnd.contact)
				&& Objects.equals(this.person, fulfillmentEnd.person)
				&& Objects.equals(this.authorization, fulfillmentEnd.authorization);
	}

	@Override
	public int hashCode() {
		return Objects.hash(location, time, instructions, contact, person, authorization);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FulfillmentEnd {\n");

		sb.append("    location: ").append(toIndentedString(location)).append("\n");
		sb.append("    time: ").append(toIndentedString(time)).append("\n");
		sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
		sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
		sb.append("    person: ").append(toIndentedString(person)).append("\n");
		sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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

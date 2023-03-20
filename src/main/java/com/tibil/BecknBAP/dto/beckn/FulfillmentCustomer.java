package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * FulfillmentCustomer
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class FulfillmentCustomer {
	@JsonProperty("person")
	private Person person = null;

	@JsonProperty("contact")
	private Contact contact = null;

	public FulfillmentCustomer person(Person person) {
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

	public FulfillmentCustomer contact(Contact contact) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FulfillmentCustomer fulfillmentCustomer = (FulfillmentCustomer) o;
		return Objects.equals(this.person, fulfillmentCustomer.person)
				&& Objects.equals(this.contact, fulfillmentCustomer.contact);
	}

	@Override
	public int hashCode() {
		return Objects.hash(person, contact);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FulfillmentCustomer {\n");

		sb.append("    person: ").append(toIndentedString(person)).append("\n");
		sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
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

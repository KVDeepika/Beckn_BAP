package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Describes how a single product/service will be rendered/fulfilled to the end
 * customer
 */
@Schema(description = "Describes how a single product/service will be rendered/fulfilled to the end customer")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Fulfillment {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("type")
	private String type = null;

	@JsonProperty("provider_id")
	private String providerId = null;

	@JsonProperty("rating")
	private String rating = null;

	@JsonProperty("state")
	private State state = null;

	@JsonProperty("tracking")
	private Boolean tracking = false;

	@JsonProperty("customer")
	private FulfillmentCustomer customer = null;

	@JsonProperty("agent")
	private Agent agent = null;

	@JsonProperty("person")
	private Person person = null;

	@JsonProperty("contact")
	private Contact contact = null;

	@JsonProperty("vehicle")
	private Vehicle vehicle = null;

	@JsonProperty("start")
	private FulfillmentStart start = null;

	@JsonProperty("end")
	private FulfillmentEnd end = null;

	@JsonProperty("rateable")
	private Boolean rateable = null;

	@JsonProperty("tags")
	private Tags tags = null;

	public Fulfillment id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique reference ID to the fulfillment of an order
	 * 
	 * @return id
	 **/
	@Schema(description = "Unique reference ID to the fulfillment of an order")

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Fulfillment type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * This describes the type of fulfillment
	 * 
	 * @return type
	 **/
	@Schema(description = "This describes the type of fulfillment")

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Fulfillment providerId(String providerId) {
		this.providerId = providerId;
		return this;
	}

	/**
	 * Get providerId
	 * 
	 * @return providerId
	 **/
	@Schema(description = "")

	@Valid
	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public Fulfillment rating(String rating) {
		this.rating = rating;
		return this;
	}

	/**
	 * Get rating
	 * 
	 * @return rating
	 **/
	@Schema(description = "")

	@Valid
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Fulfillment state(State state) {
		this.state = state;
		return this;
	}

	/**
	 * Get state
	 * 
	 * @return state
	 **/
	@Schema(description = "")

	@Valid
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Fulfillment tracking(Boolean tracking) {
		this.tracking = tracking;
		return this;
	}

	/**
	 * Indicates whether the fulfillment allows tracking
	 * 
	 * @return tracking
	 **/
	@Schema(description = "Indicates whether the fulfillment allows tracking")

	public Boolean isTracking() {
		return tracking;
	}

	public void setTracking(Boolean tracking) {
		this.tracking = tracking;
	}

	public Fulfillment customer(FulfillmentCustomer customer) {
		this.customer = customer;
		return this;
	}

	/**
	 * Get customer
	 * 
	 * @return customer
	 **/
	@Schema(description = "")

	@Valid
	public FulfillmentCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(FulfillmentCustomer customer) {
		this.customer = customer;
	}

	public Fulfillment agent(Agent agent) {
		this.agent = agent;
		return this;
	}

	/**
	 * Get agent
	 * 
	 * @return agent
	 **/
	@Schema(description = "")

	@Valid
	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public Fulfillment person(Person person) {
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

	public Fulfillment contact(Contact contact) {
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

	public Fulfillment vehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		return this;
	}

	/**
	 * Get vehicle
	 * 
	 * @return vehicle
	 **/
	@Schema(description = "")

	@Valid
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Fulfillment start(FulfillmentStart start) {
		this.start = start;
		return this;
	}

	/**
	 * Get start
	 * 
	 * @return start
	 **/
	@Schema(description = "")

	@Valid
	public FulfillmentStart getStart() {
		return start;
	}

	public void setStart(FulfillmentStart start) {
		this.start = start;
	}

	public Fulfillment end(FulfillmentEnd end) {
		this.end = end;
		return this;
	}

	/**
	 * Get end
	 * 
	 * @return end
	 **/
	@Schema(description = "")

	@Valid
	public FulfillmentEnd getEnd() {
		return end;
	}

	public void setEnd(FulfillmentEnd end) {
		this.end = end;
	}

	public Fulfillment rateable(Boolean rateable) {
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

	public Fulfillment tags(Tags tags) {
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
		Fulfillment fulfillment = (Fulfillment) o;
		return Objects.equals(this.id, fulfillment.id) && Objects.equals(this.type, fulfillment.type)
				&& Objects.equals(this.providerId, fulfillment.providerId)
				&& Objects.equals(this.rating, fulfillment.rating) && Objects.equals(this.state, fulfillment.state)
				&& Objects.equals(this.tracking, fulfillment.tracking)
				&& Objects.equals(this.customer, fulfillment.customer) && Objects.equals(this.agent, fulfillment.agent)
				&& Objects.equals(this.person, fulfillment.person) && Objects.equals(this.contact, fulfillment.contact)
				&& Objects.equals(this.vehicle, fulfillment.vehicle) && Objects.equals(this.start, fulfillment.start)
				&& Objects.equals(this.end, fulfillment.end) && Objects.equals(this.rateable, fulfillment.rateable)
				&& Objects.equals(this.tags, fulfillment.tags);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, type, providerId, rating, state, tracking, customer, agent, person, contact, vehicle,
				start, end, rateable, tags);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Fulfillment {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
		sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
		sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
		sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
		sb.append("    person: ").append(toIndentedString(person)).append("\n");
		sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
		sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
		sb.append("    start: ").append(toIndentedString(start)).append("\n");
		sb.append("    end: ").append(toIndentedString(end)).append("\n");
		sb.append("    rateable: ").append(toIndentedString(rateable)).append("\n");
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

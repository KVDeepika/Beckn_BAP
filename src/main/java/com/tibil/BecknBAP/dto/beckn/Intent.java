package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Intent of a user. Used for searching for services
 */
@Schema(description = "Intent of a user. Used for searching for services")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Intent {
	@JsonProperty("descriptor")
	private Descriptor descriptor = null;

	@JsonProperty("provider")
	private Provider provider = null;

	@JsonProperty("fulfillment")
	private Fulfillment fulfillment = null;

	@JsonProperty("payment")
	private Payment payment = null;

	@JsonProperty("category")
	private Category category = null;

	@JsonProperty("offer")
	private Offer offer = null;

	@JsonProperty("item")
	private Item item = null;

	@JsonProperty("tags")
	private Tags tags = null;

	public Intent descriptor(Descriptor descriptor) {
		this.descriptor = descriptor;
		return this;
	}

	/**
	 * Get descriptor
	 * 
	 * @return descriptor
	 **/
	@Schema(description = "")

	@Valid
	public Descriptor getDescriptor() {
		return descriptor;
	}

	public void setDescriptor(Descriptor descriptor) {
		this.descriptor = descriptor;
	}

	public Intent provider(Provider provider) {
		this.provider = provider;
		return this;
	}

	/**
	 * Get provider
	 * 
	 * @return provider
	 **/
	@Schema(description = "")

	@Valid
	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public Intent fulfillment(Fulfillment fulfillment) {
		this.fulfillment = fulfillment;
		return this;
	}

	/**
	 * Get fulfillment
	 * 
	 * @return fulfillment
	 **/
	@Schema(description = "")

	@Valid
	public Fulfillment getFulfillment() {
		return fulfillment;
	}

	public void setFulfillment(Fulfillment fulfillment) {
		this.fulfillment = fulfillment;
	}

	public Intent payment(Payment payment) {
		this.payment = payment;
		return this;
	}

	/**
	 * Get payment
	 * 
	 * @return payment
	 **/
	@Schema(description = "")

	@Valid
	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Intent category(Category category) {
		this.category = category;
		return this;
	}

	/**
	 * Get category
	 * 
	 * @return category
	 **/
	@Schema(description = "")

	@Valid
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Intent offer(Offer offer) {
		this.offer = offer;
		return this;
	}

	/**
	 * Get offer
	 * 
	 * @return offer
	 **/
	@Schema(description = "")

	@Valid
	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public Intent item(Item item) {
		this.item = item;
		return this;
	}

	/**
	 * Get item
	 * 
	 * @return item
	 **/
	@Schema(description = "")

	@Valid
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Intent tags(Tags tags) {
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
		Intent intent = (Intent) o;
		return Objects.equals(this.descriptor, intent.descriptor) && Objects.equals(this.provider, intent.provider)
				&& Objects.equals(this.fulfillment, intent.fulfillment) && Objects.equals(this.payment, intent.payment)
				&& Objects.equals(this.category, intent.category) && Objects.equals(this.offer, intent.offer)
				&& Objects.equals(this.item, intent.item) && Objects.equals(this.tags, intent.tags);
	}

	@Override
	public int hashCode() {
		return Objects.hash(descriptor, provider, fulfillment, payment, category, offer, item, tags);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Intent {\n");

		sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
		sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
		sb.append("    fulfillment: ").append(toIndentedString(fulfillment)).append("\n");
		sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
		sb.append("    category: ").append(toIndentedString(category)).append("\n");
		sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
		sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

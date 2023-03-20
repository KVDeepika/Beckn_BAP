package com.tibil.BecknBAP.dto.beckn;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Describes a BPP catalog
 */
@Schema(description = "Describes a BPP catalog")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Catalog {
	@JsonProperty("descriptor")
	private Descriptor descriptor = null;

	@JsonProperty("categories")
	@Valid
	private List<Category> categories = null;

	@JsonProperty("fulfillments")
	@Valid
	private List<Fulfillment> fulfillments = null;

	@JsonProperty("payments")
	@Valid
	private List<Payment> payments = null;

	@JsonProperty("offers")
	@Valid
	private List<Offer> offers = null;

	@JsonProperty("providers")
	@Valid
	private List<Provider> providers = null;

	@JsonProperty("exp")
	private OffsetDateTime exp = null;

	public Catalog descriptor(Descriptor descriptor) {
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

	public Catalog categories(List<Category> categories) {
		this.categories = categories;
		return this;
	}

	public Catalog addCategoriesItem(Category categoriesItem) {
		if (this.categories == null) {
			this.categories = new ArrayList<Category>();
		}
		this.categories.add(categoriesItem);
		return this;
	}

	/**
	 * Get categories
	 * 
	 * @return categories
	 **/
	@Schema(description = "")
	@Valid
	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public Catalog fulfillments(List<Fulfillment> fulfillments) {
		this.fulfillments = fulfillments;
		return this;
	}

	public Catalog addFulfillmentsItem(Fulfillment fulfillmentsItem) {
		if (this.fulfillments == null) {
			this.fulfillments = new ArrayList<Fulfillment>();
		}
		this.fulfillments.add(fulfillmentsItem);
		return this;
	}

	/**
	 * Get fulfillments
	 * 
	 * @return fulfillments
	 **/
	@Schema(description = "")
	@Valid
	public List<Fulfillment> getFulfillments() {
		return fulfillments;
	}

	public void setFulfillments(List<Fulfillment> fulfillments) {
		this.fulfillments = fulfillments;
	}

	public Catalog payments(List<Payment> payments) {
		this.payments = payments;
		return this;
	}

	public Catalog addPaymentsItem(Payment paymentsItem) {
		if (this.payments == null) {
			this.payments = new ArrayList<Payment>();
		}
		this.payments.add(paymentsItem);
		return this;
	}

	/**
	 * Get payments
	 * 
	 * @return payments
	 **/
	@Schema(description = "")
	@Valid
	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public Catalog offers(List<Offer> offers) {
		this.offers = offers;
		return this;
	}

	public Catalog addOffersItem(Offer offersItem) {
		if (this.offers == null) {
			this.offers = new ArrayList<Offer>();
		}
		this.offers.add(offersItem);
		return this;
	}

	/**
	 * Get offers
	 * 
	 * @return offers
	 **/
	@Schema(description = "")
	@Valid
	public List<Offer> getOffers() {
		return offers;
	}

	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}

	public Catalog providers(List<Provider> providers) {
		this.providers = providers;
		return this;
	}

	public Catalog addProvidersItem(Provider providersItem) {
		if (this.providers == null) {
			this.providers = new ArrayList<Provider>();
		}
		this.providers.add(providersItem);
		return this;
	}

	/**
	 * Get providers
	 * 
	 * @return providers
	 **/
	@Schema(description = "")
	@Valid
	public List<Provider> getProviders() {
		return providers;
	}

	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}

	public Catalog exp(OffsetDateTime exp) {
		this.exp = exp;
		return this;
	}

	/**
	 * Time after which catalog has to be refreshed
	 * 
	 * @return exp
	 **/
	@Schema(description = "Time after which catalog has to be refreshed")

	@Valid
	public OffsetDateTime getExp() {
		return exp;
	}

	public void setExp(OffsetDateTime exp) {
		this.exp = exp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Catalog catalog = (Catalog) o;
		return Objects.equals(this.descriptor, catalog.descriptor)
				&& Objects.equals(this.categories, catalog.categories)
				&& Objects.equals(this.fulfillments, catalog.fulfillments)
				&& Objects.equals(this.payments, catalog.payments) && Objects.equals(this.offers, catalog.offers)
				&& Objects.equals(this.providers, catalog.providers) && Objects.equals(this.exp, catalog.exp);
	}

	@Override
	public int hashCode() {
		return Objects.hash(descriptor, categories, fulfillments, payments, offers, providers, exp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Catalog {\n");

		sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
		sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
		sb.append("    fulfillments: ").append(toIndentedString(fulfillments)).append("\n");
		sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
		sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
		sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
		sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
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

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
 * Describes a service provider. This can be a restaurant, a hospital, a Store
 * etc
 */
@Schema(description = "Describes a service provider. This can be a restaurant, a hospital, a Store etc")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Provider {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("descriptor")
	private Descriptor descriptor = null;

	@JsonProperty("category_id")
	private String categoryId = null;

	@JsonProperty("rating")
	private String rating = null;

	@JsonProperty("time")
	private Time time = null;

	@JsonProperty("categories")
	@Valid
	private List<Category> categories = null;

	@JsonProperty("fulfillments")
	@Valid
	private List<Fulfillment> fulfillments = null;

	@JsonProperty("payments")
	@Valid
	private List<Payment> payments = null;

	@JsonProperty("locations")
	@Valid
	private List<AllOfProviderLocationsItems> locations = null;

	@JsonProperty("offers")
	@Valid
	private List<Offer> offers = null;

	@JsonProperty("items")
	@Valid
	private List<Item> items = null;

	@JsonProperty("exp")
	private OffsetDateTime exp = null;

	@JsonProperty("rateable")
	private Boolean rateable = null;

	@JsonProperty("tags")
	private Tags tags = null;

	public Provider id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Id of the provider
	 * 
	 * @return id
	 **/
	@Schema(description = "Id of the provider")

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Provider descriptor(Descriptor descriptor) {
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

	public Provider categoryId(String categoryId) {
		this.categoryId = categoryId;
		return this;
	}

	/**
	 * Category Id of the provider
	 * 
	 * @return categoryId
	 **/
	@Schema(description = "Category Id of the provider")

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public Provider rating(String rating) {
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

	public Provider time(Time time) {
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

	public Provider categories(List<Category> categories) {
		this.categories = categories;
		return this;
	}

	public Provider addCategoriesItem(Category categoriesItem) {
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

	public Provider fulfillments(List<Fulfillment> fulfillments) {
		this.fulfillments = fulfillments;
		return this;
	}

	public Provider addFulfillmentsItem(Fulfillment fulfillmentsItem) {
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

	public Provider payments(List<Payment> payments) {
		this.payments = payments;
		return this;
	}

	public Provider addPaymentsItem(Payment paymentsItem) {
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

	public Provider locations(List<AllOfProviderLocationsItems> locations) {
		this.locations = locations;
		return this;
	}

	public Provider addLocationsItem(AllOfProviderLocationsItems locationsItem) {
		if (this.locations == null) {
			this.locations = new ArrayList<AllOfProviderLocationsItems>();
		}
		this.locations.add(locationsItem);
		return this;
	}

	/**
	 * Get locations
	 * 
	 * @return locations
	 **/
	@Schema(description = "")

	public List<AllOfProviderLocationsItems> getLocations() {
		return locations;
	}

	public void setLocations(List<AllOfProviderLocationsItems> locations) {
		this.locations = locations;
	}

	public Provider offers(List<Offer> offers) {
		this.offers = offers;
		return this;
	}

	public Provider addOffersItem(Offer offersItem) {
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

	public Provider items(List<Item> items) {
		this.items = items;
		return this;
	}

	public Provider addItemsItem(Item itemsItem) {
		if (this.items == null) {
			this.items = new ArrayList<Item>();
		}
		this.items.add(itemsItem);
		return this;
	}

	/**
	 * Get items
	 * 
	 * @return items
	 **/
	@Schema(description = "")
	@Valid
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Provider exp(OffsetDateTime exp) {
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

	public Provider rateable(Boolean rateable) {
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

	public Provider tags(Tags tags) {
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
		Provider provider = (Provider) o;
		return Objects.equals(this.id, provider.id) && Objects.equals(this.descriptor, provider.descriptor)
				&& Objects.equals(this.categoryId, provider.categoryId) && Objects.equals(this.rating, provider.rating)
				&& Objects.equals(this.time, provider.time) && Objects.equals(this.categories, provider.categories)
				&& Objects.equals(this.fulfillments, provider.fulfillments)
				&& Objects.equals(this.payments, provider.payments)
				&& Objects.equals(this.locations, provider.locations) && Objects.equals(this.offers, provider.offers)
				&& Objects.equals(this.items, provider.items) && Objects.equals(this.exp, provider.exp)
				&& Objects.equals(this.rateable, provider.rateable) && Objects.equals(this.tags, provider.tags);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, descriptor, categoryId, rating, time, categories, fulfillments, payments, locations,
				offers, items, exp, rateable, tags);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Provider {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
		sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
		sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
		sb.append("    time: ").append(toIndentedString(time)).append("\n");
		sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
		sb.append("    fulfillments: ").append(toIndentedString(fulfillments)).append("\n");
		sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
		sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
		sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
		sb.append("    items: ").append(toIndentedString(items)).append("\n");
		sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
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

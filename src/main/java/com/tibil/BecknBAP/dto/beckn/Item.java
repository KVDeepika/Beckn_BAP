package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Describes a product or a service offered to the end consumer by the provider.
 */
@Schema(description = "Describes a product or a service offered to the end consumer by the provider.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Item {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("parent_item_id")
	private String parentItemId = null;

	@JsonProperty("descriptor")
	private Descriptor descriptor = null;

	@JsonProperty("price")
	private Price price = null;

	@JsonProperty("category_id")
	private String categoryId = null;

	@JsonProperty("fulfillment_id")
	private String fulfillmentId = null;

	@JsonProperty("rating")
	private String rating = null;

	@JsonProperty("location_id")
	private String locationId = null;

	@JsonProperty("time")
	private Time time = null;

	@JsonProperty("rateable")
	private Boolean rateable = null;

	@JsonProperty("matched")
	private Boolean matched = null;

	@JsonProperty("related")
	private Boolean related = null;

	@JsonProperty("recommended")
	private Boolean recommended = null;

	@JsonProperty("tags")
	private Tags tags = null;

	public Item id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * This is the most unique identifier of a service item. An example of an Item
	 * ID could be the SKU of a product.
	 * 
	 * @return id
	 **/
	@Schema(description = "This is the most unique identifier of a service item. An example of an Item ID could be the SKU of a product.")

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Item parentItemId(String parentItemId) {
		this.parentItemId = parentItemId;
		return this;
	}

	/**
	 * Get parentItemId
	 * 
	 * @return parentItemId
	 **/
	@Schema(description = "")

	@Valid
	public String getParentItemId() {
		return parentItemId;
	}

	public void setParentItemId(String parentItemId) {
		this.parentItemId = parentItemId;
	}

	public Item descriptor(Descriptor descriptor) {
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

	public Item price(Price price) {
		this.price = price;
		return this;
	}

	/**
	 * Get price
	 * 
	 * @return price
	 **/
	@Schema(description = "")

	@Valid
	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Item categoryId(String categoryId) {
		this.categoryId = categoryId;
		return this;
	}

	/**
	 * Get categoryId
	 * 
	 * @return categoryId
	 **/
	@Schema(description = "")

	@Valid
	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public Item fulfillmentId(String fulfillmentId) {
		this.fulfillmentId = fulfillmentId;
		return this;
	}

	/**
	 * Get fulfillmentId
	 * 
	 * @return fulfillmentId
	 **/
	@Schema(description = "")

	@Valid
	public String getFulfillmentId() {
		return fulfillmentId;
	}

	public void setFulfillmentId(String fulfillmentId) {
		this.fulfillmentId = fulfillmentId;
	}

	public Item rating(String rating) {
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

	public Item locationId(String locationId) {
		this.locationId = locationId;
		return this;
	}

	/**
	 * Get locationId
	 * 
	 * @return locationId
	 **/
	@Schema(description = "")

	@Valid
	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public Item time(Time time) {
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

	public Item rateable(Boolean rateable) {
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

	public Item matched(Boolean matched) {
		this.matched = matched;
		return this;
	}

	/**
	 * Get matched
	 * 
	 * @return matched
	 **/
	@Schema(description = "")

	public Boolean isMatched() {
		return matched;
	}

	public void setMatched(Boolean matched) {
		this.matched = matched;
	}

	public Item related(Boolean related) {
		this.related = related;
		return this;
	}

	/**
	 * Get related
	 * 
	 * @return related
	 **/
	@Schema(description = "")

	public Boolean isRelated() {
		return related;
	}

	public void setRelated(Boolean related) {
		this.related = related;
	}

	public Item recommended(Boolean recommended) {
		this.recommended = recommended;
		return this;
	}

	/**
	 * Get recommended
	 * 
	 * @return recommended
	 **/
	@Schema(description = "")

	public Boolean isRecommended() {
		return recommended;
	}

	public void setRecommended(Boolean recommended) {
		this.recommended = recommended;
	}

	public Item tags(Tags tags) {
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
		Item item = (Item) o;
		return Objects.equals(this.id, item.id) && Objects.equals(this.parentItemId, item.parentItemId)
				&& Objects.equals(this.descriptor, item.descriptor) && Objects.equals(this.price, item.price)
				&& Objects.equals(this.categoryId, item.categoryId)
				&& Objects.equals(this.fulfillmentId, item.fulfillmentId) && Objects.equals(this.rating, item.rating)
				&& Objects.equals(this.locationId, item.locationId) && Objects.equals(this.time, item.time)
				&& Objects.equals(this.rateable, item.rateable) && Objects.equals(this.matched, item.matched)
				&& Objects.equals(this.related, item.related) && Objects.equals(this.recommended, item.recommended)
				&& Objects.equals(this.tags, item.tags);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, parentItemId, descriptor, price, categoryId, fulfillmentId, rating, locationId, time,
				rateable, matched, related, recommended, tags);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Item {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    parentItemId: ").append(toIndentedString(parentItemId)).append("\n");
		sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
		sb.append("    price: ").append(toIndentedString(price)).append("\n");
		sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
		sb.append("    fulfillmentId: ").append(toIndentedString(fulfillmentId)).append("\n");
		sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
		sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
		sb.append("    time: ").append(toIndentedString(time)).append("\n");
		sb.append("    rateable: ").append(toIndentedString(rateable)).append("\n");
		sb.append("    matched: ").append(toIndentedString(matched)).append("\n");
		sb.append("    related: ").append(toIndentedString(related)).append("\n");
		sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
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

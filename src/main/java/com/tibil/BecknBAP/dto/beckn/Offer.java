package com.tibil.BecknBAP.dto.beckn;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Describes an offer
 */
@Schema(description = "Describes an offer")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Offer {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("descriptor")
	private Descriptor descriptor = null;

	@JsonProperty("location_ids")
	@Valid
	private List<String> locationIds = null;

	@JsonProperty("category_ids")
	@Valid
	private List<String> categoryIds = null;

	@JsonProperty("item_ids")
	@Valid
	private List<String> itemIds = null;

	@JsonProperty("time")
	private Time time = null;

	public Offer id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@Schema(description = "")

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Offer descriptor(Descriptor descriptor) {
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

	public Offer locationIds(List<String> locationIds) {
		this.locationIds = locationIds;
		return this;
	}

	public Offer addLocationIdsItem(String locationIdsItem) {
		if (this.locationIds == null) {
			this.locationIds = new ArrayList<String>();
		}
		this.locationIds.add(locationIdsItem);
		return this;
	}

	/**
	 * Get locationIds
	 * 
	 * @return locationIds
	 **/
	@Schema(description = "")
	@Valid
	public List<String> getLocationIds() {
		return locationIds;
	}

	public void setLocationIds(List<String> locationIds) {
		this.locationIds = locationIds;
	}

	public Offer categoryIds(List<String> categoryIds) {
		this.categoryIds = categoryIds;
		return this;
	}

	public Offer addCategoryIdsItem(String categoryIdsItem) {
		if (this.categoryIds == null) {
			this.categoryIds = new ArrayList<String>();
		}
		this.categoryIds.add(categoryIdsItem);
		return this;
	}

	/**
	 * Get categoryIds
	 * 
	 * @return categoryIds
	 **/
	@Schema(description = "")
	@Valid
	public List<String> getCategoryIds() {
		return categoryIds;
	}

	public void setCategoryIds(List<String> categoryIds) {
		this.categoryIds = categoryIds;
	}

	public Offer itemIds(List<String> itemIds) {
		this.itemIds = itemIds;
		return this;
	}

	public Offer addItemIdsItem(String itemIdsItem) {
		if (this.itemIds == null) {
			this.itemIds = new ArrayList<String>();
		}
		this.itemIds.add(itemIdsItem);
		return this;
	}

	/**
	 * Get itemIds
	 * 
	 * @return itemIds
	 **/
	@Schema(description = "")
	@Valid
	public List<String> getItemIds() {
		return itemIds;
	}

	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

	public Offer time(Time time) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Offer offer = (Offer) o;
		return Objects.equals(this.id, offer.id) && Objects.equals(this.descriptor, offer.descriptor)
				&& Objects.equals(this.locationIds, offer.locationIds)
				&& Objects.equals(this.categoryIds, offer.categoryIds) && Objects.equals(this.itemIds, offer.itemIds)
				&& Objects.equals(this.time, offer.time);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, descriptor, locationIds, categoryIds, itemIds, time);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Offer {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
		sb.append("    locationIds: ").append(toIndentedString(locationIds)).append("\n");
		sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
		sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
		sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

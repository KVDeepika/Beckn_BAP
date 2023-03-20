package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * This is typically an optional product or service that can be offered in
 * addition to a product or a service of type Item. Objects of type AddOn should
 * not exist without an associated Item. If a BAP receives an Item with an
 * add-on, it must show it to the user as a selectable object. If any AddOn
 * object is found without an associated Item object, then the validator must
 * throw an error &#x27;NO-PARENT&#x3D;ITEM&#x27; with message &#x27;No parent
 * found&#x27;
 */
@Schema(description = "This is typically an optional product or service that can be offered in addition to a product or a service of type Item. Objects of type AddOn should not exist without an associated Item. If a BAP receives an Item with an add-on, it must show it to the user as a selectable object. If any AddOn object is found without an associated Item object, then the validator must throw an error 'NO-PARENT=ITEM' with message 'No parent found'")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class AddOn {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("item_id")
	private String itemId = null;

	@JsonProperty("optional")
	private Boolean optional = false;

	@JsonProperty("descriptor")
	private Descriptor descriptor = null;

	@JsonProperty("price")
	private Price price = null;

	public AddOn id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * ID of the add-on as present in the source catalog
	 * 
	 * @return id
	 **/
	@Schema(description = "ID of the add-on as present in the source catalog")

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AddOn itemId(String itemId) {
		this.itemId = itemId;
		return this;
	}

	/**
	 * ID of the item this add-on is offered with.
	 * 
	 * @return itemId
	 **/
	@Schema(required = true, description = "ID of the item this add-on is offered with.")
	@NotNull

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public AddOn optional(Boolean optional) {
		this.optional = optional;
		return this;
	}

	/**
	 * This value indicates if the add-on is optional or required to be selected by
	 * the user along with an Item. If this value is set to true, then the BAP must
	 * ensure that the add-on is mandatorily selected by the user while creating the
	 * Order object with the Item.
	 * 
	 * @return optional
	 **/
	@Schema(description = "This value indicates if the add-on is optional or required to be selected by the user along with an Item. If this value is set to true, then the BAP must ensure that the add-on is mandatorily selected by the user while creating the Order object with the Item.")

	public Boolean isOptional() {
		return optional;
	}

	public void setOptional(Boolean optional) {
		this.optional = optional;
	}

	public AddOn descriptor(Descriptor descriptor) {
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

	public AddOn price(Price price) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AddOn addOn = (AddOn) o;
		return Objects.equals(this.id, addOn.id) && Objects.equals(this.itemId, addOn.itemId)
				&& Objects.equals(this.optional, addOn.optional) && Objects.equals(this.descriptor, addOn.descriptor)
				&& Objects.equals(this.price, addOn.price);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, itemId, optional, descriptor, price);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AddOn {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
		sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
		sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
		sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

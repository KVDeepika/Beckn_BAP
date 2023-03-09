package com.tibil.BecknBAP.dto.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * OnSelectMessageOrder
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class OnSelectMessageOrder {
	@JsonProperty("provider")
	private Provider provider = null;

	@JsonProperty("provider_location")
	private Location providerLocation = null;

	@JsonProperty("items")
	@Valid
	private List<AllOfonSelectMessageOrderItemsItems> items = null;

	@JsonProperty("add_ons")
	@Valid
	private List<AddOn> addOns = null;

	@JsonProperty("offers")
	@Valid
	private List<Offer> offers = null;

	@JsonProperty("quote")
	private Quotation quote = null;

	public OnSelectMessageOrder provider(Provider provider) {
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

	public OnSelectMessageOrder providerLocation(Location providerLocation) {
		this.providerLocation = providerLocation;
		return this;
	}

	/**
	 * Get providerLocation
	 * 
	 * @return providerLocation
	 **/
	@Schema(description = "")

	@Valid
	public Location getProviderLocation() {
		return providerLocation;
	}

	public void setProviderLocation(Location providerLocation) {
		this.providerLocation = providerLocation;
	}

	public OnSelectMessageOrder items(List<AllOfonSelectMessageOrderItemsItems> items) {
		this.items = items;
		return this;
	}

	public OnSelectMessageOrder addItemsItem(AllOfonSelectMessageOrderItemsItems itemsItem) {
		if (this.items == null) {
			this.items = new ArrayList<AllOfonSelectMessageOrderItemsItems>();
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

	public List<AllOfonSelectMessageOrderItemsItems> getItems() {
		return items;
	}

	public void setItems(List<AllOfonSelectMessageOrderItemsItems> items) {
		this.items = items;
	}

	public OnSelectMessageOrder addOns(List<AddOn> addOns) {
		this.addOns = addOns;
		return this;
	}

	public OnSelectMessageOrder addAddOnsItem(AddOn addOnsItem) {
		if (this.addOns == null) {
			this.addOns = new ArrayList<AddOn>();
		}
		this.addOns.add(addOnsItem);
		return this;
	}

	/**
	 * Get addOns
	 * 
	 * @return addOns
	 **/
	@Schema(description = "")
	@Valid
	public List<AddOn> getAddOns() {
		return addOns;
	}

	public void setAddOns(List<AddOn> addOns) {
		this.addOns = addOns;
	}

	public OnSelectMessageOrder offers(List<Offer> offers) {
		this.offers = offers;
		return this;
	}

	public OnSelectMessageOrder addOffersItem(Offer offersItem) {
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

	public OnSelectMessageOrder quote(Quotation quote) {
		this.quote = quote;
		return this;
	}

	/**
	 * Get quote
	 * 
	 * @return quote
	 **/
	@Schema(description = "")

	@Valid
	public Quotation getQuote() {
		return quote;
	}

	public void setQuote(Quotation quote) {
		this.quote = quote;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OnSelectMessageOrder onSelectMessageOrder = (OnSelectMessageOrder) o;
		return Objects.equals(this.provider, onSelectMessageOrder.provider)
				&& Objects.equals(this.providerLocation, onSelectMessageOrder.providerLocation)
				&& Objects.equals(this.items, onSelectMessageOrder.items)
				&& Objects.equals(this.addOns, onSelectMessageOrder.addOns)
				&& Objects.equals(this.offers, onSelectMessageOrder.offers)
				&& Objects.equals(this.quote, onSelectMessageOrder.quote);
	}

	@Override
	public int hashCode() {
		return Objects.hash(provider, providerLocation, items, addOns, offers, quote);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OnSelectMessageOrder {\n");

		sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
		sb.append("    providerLocation: ").append(toIndentedString(providerLocation)).append("\n");
		sb.append("    items: ").append(toIndentedString(items)).append("\n");
		sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
		sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
		sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
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

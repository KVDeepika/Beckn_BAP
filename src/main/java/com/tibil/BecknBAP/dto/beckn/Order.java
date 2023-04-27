package com.tibil.BecknBAP.dto.beckn;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Describes the details of an order.
 */
@Schema(description = "Describes the details of an order.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Order {
	@JsonProperty("id")
	private String id = null;

	/**
	 * Describes the state of an order.
	 */
	public enum StateEnum {
		DRAFT("DRAFT"),

		ACTIVE("ACTIVE"),

		COMPLETE("COMPLETE"),

		CANCELLED("CANCELLED");

		private String value;

		StateEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static StateEnum fromValue(String text) {
			for (StateEnum b : StateEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("state")
	private StateEnum state = null;
	
	@JsonProperty("item")
	private Item item = null;


	@JsonProperty("provider")
	private Provider provider = null;

	@JsonProperty("documents")
	@Valid
	private List<Document> documents = null;

	@JsonProperty("billing")
	private Billing billing = null;

	@JsonProperty("fulfillment")
	private Fulfillment fulfillment = null;

	@JsonProperty("quote")
	private Quotation quote = null;

	@JsonProperty("payment")
	private Payment payment = null;

	@JsonProperty("created_at")
	private OffsetDateTime createdAt = null;

	@JsonProperty("updated_at")
	private OffsetDateTime updatedAt = null;

	public Order id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Order ID as generated inside the provider's order management system. If the
	 * provider is unable to generate an order id, then the BPP must generate this
	 * order_id.
	 * 
	 * @return id
	 **/
	@Schema(description = "Order ID as generated inside the provider's order management system. If the provider is unable to generate an order id, then the BPP must generate this order_id.")

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Order state(StateEnum state) {
		this.state = state;
		return this;
	}

	/**
	 * Describes the state of an order.
	 * 
	 * @return state
	 **/
	@Schema(description = "Describes the state of an order.")

	public StateEnum getState() {
		return state;
	}

	public void setState(StateEnum state) {
		this.state = state;
	}

	public Order provider(Provider provider) {
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
	
	public Order item(Item item) {
		this.item = item;
		return this;
	}
	
	@Schema(description = "")

	@Valid
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Order documents(List<Document> documents) {
		this.documents = documents;
		return this;
	}

	public Order addDocumentsItem(Document documentsItem) {
		if (this.documents == null) {
			this.documents = new ArrayList<Document>();
		}
		this.documents.add(documentsItem);
		return this;
	}

	/**
	 * Get documents
	 * 
	 * @return documents
	 **/
	@Schema(description = "")
	@Valid
	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public Order billing(Billing billing) {
		this.billing = billing;
		return this;
	}

	/**
	 * Get billing
	 * 
	 * @return billing
	 **/
	@Schema(description = "")

	@Valid
	public Billing getBilling() {
		return billing;
	}

	public void setBilling(Billing billing) {
		this.billing = billing;
	}

	public Order fulfillment(Fulfillment fulfillment) {
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

	public Order quote(Quotation quote) {
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

	public Order payment(Payment payment) {
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

	public Order createdAt(OffsetDateTime createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	/**
	 * Get createdAt
	 * 
	 * @return createdAt
	 **/
	@Schema(description = "")

	@Valid
	public OffsetDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(OffsetDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public Order updatedAt(OffsetDateTime updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	/**
	 * Get updatedAt
	 * 
	 * @return updatedAt
	 **/
	@Schema(description = "")

	@Valid
	public OffsetDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(OffsetDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Order order = (Order) o;
		return Objects.equals(this.id, order.id) && Objects.equals(this.state, order.state)
				&& Objects.equals(this.provider, order.provider) && Objects.equals(this.item, order.item)&& Objects.equals(this.documents, order.documents)
				&& Objects.equals(this.billing, order.billing) && Objects.equals(this.fulfillment, order.fulfillment)
				&& Objects.equals(this.quote, order.quote) && Objects.equals(this.payment, order.payment)
				&& Objects.equals(this.createdAt, order.createdAt) && Objects.equals(this.updatedAt, order.updatedAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, state, provider, item,documents, billing, fulfillment, quote, payment, createdAt, updatedAt);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Order {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
		sb.append("    item: ").append(toIndentedString(item)).append("\n");

		sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
		sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
		sb.append("    fulfillment: ").append(toIndentedString(fulfillment)).append("\n");
		sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
		sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
		sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
		sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

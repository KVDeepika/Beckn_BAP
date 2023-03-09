package com.tibil.BecknBAP.dto.model;

import java.time.OffsetDateTime;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Describes a beckn message context
 */
@Schema(description = "Describes a beckn message context")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Context {
	@JsonProperty("domain")
	private String domain = null;

	@JsonProperty("country")
	private String country = null;

	@JsonProperty("city")
	private String city = null;

	/**
	 * Defines the Beckn API call. Any actions other than the enumerated actions are
	 * not supported by Beckn Protocol
	 */
	public enum ActionEnum {
		SEARCH("search"),

		SELECT("select"),

		INIT("init"),

		CONFIRM("confirm"),

		UPDATE("update"),

		STATUS("status"),

		TRACK("track"),

		CANCEL("cancel"),

		RATING("rating"),

		SUPPORT("support"),

		ON_SEARCH("on_search"),

		ON_SELECT("on_select"),

		ON_INIT("on_init"),

		ON_CONFIRM("on_confirm"),

		ON_UPDATE("on_update"),

		ON_STATUS("on_status"),

		ON_TRACK("on_track"),

		ON_CANCEL("on_cancel"),

		ON_RATING("on_rating"),

		ON_SUPPORT("on_support");

		private String value;

		ActionEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static ActionEnum fromValue(String text) {
			for (ActionEnum b : ActionEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("action")
	private ActionEnum action = null;

	@JsonProperty("core_version")
	private String coreVersion = null;

	@JsonProperty("bap_id")
	private String bapId = null;

	@JsonProperty("bap_uri")
	private String bapUri = null;

	@JsonProperty("bpp_id")
	private String bppId = null;

	@JsonProperty("bpp_uri")
	private String bppUri = null;

	@JsonProperty("transaction_id")
	private String transactionId = null;

	@JsonProperty("message_id")
	private String messageId = null;

	@JsonProperty("timestamp")
	private OffsetDateTime timestamp = null;

	@JsonProperty("key")
	private String key = null;

	@JsonProperty("ttl")
	private String ttl = null;

	public Context domain(String domain) {
		this.domain = domain;
		return this;
	}

	/**
	 * Describes the domain of an object
	 * 
	 * @return domain
	 **/
	@Schema(required = true, description = "Describes the domain of an object")
	@NotNull

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public Context country(String country) {
		this.country = country;
		return this;
	}

	/**
	 * Get country
	 * 
	 * @return country
	 **/
	@Schema(required = true, description = "")
	@NotNull

	@Valid
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Context city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * Get city
	 * 
	 * @return city
	 **/
	@Schema(required = true, description = "")
	@NotNull

	@Valid
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Context action(ActionEnum action) {
		this.action = action;
		return this;
	}

	/**
	 * Defines the Beckn API call. Any actions other than the enumerated actions are
	 * not supported by Beckn Protocol
	 * 
	 * @return action
	 **/
	@Schema(required = true, description = "Defines the Beckn API call. Any actions other than the enumerated actions are not supported by Beckn Protocol")
	@NotNull

	public ActionEnum getAction() {
		return action;
	}

	public void setAction(ActionEnum action) {
		this.action = action;
	}

	public Context coreVersion(String coreVersion) {
		this.coreVersion = coreVersion;
		return this;
	}

	/**
	 * Version of Beckn core API specification being used
	 * 
	 * @return coreVersion
	 **/
	@Schema(required = true, description = "Version of Beckn core API specification being used")
	@NotNull

	public String getCoreVersion() {
		return coreVersion;
	}

	public void setCoreVersion(String coreVersion) {
		this.coreVersion = coreVersion;
	}

	public Context bapId(String bapId) {
		this.bapId = bapId;
		return this;
	}

	/**
	 * Unique id of the BAP. By default it is the fully qualified domain name of the
	 * BAP
	 * 
	 * @return bapId
	 **/
	@Schema(required = true, description = "Unique id of the BAP. By default it is the fully qualified domain name of the BAP")
	@NotNull

	public String getBapId() {
		return bapId;
	}

	public void setBapId(String bapId) {
		this.bapId = bapId;
	}

	public Context bapUri(String bapUri) {
		this.bapUri = bapUri;
		return this;
	}

	/**
	 * URI of the BAP for accepting callbacks. Must have the same domain name as the
	 * bap_id
	 * 
	 * @return bapUri
	 **/
	@Schema(required = true, description = "URI of the BAP for accepting callbacks. Must have the same domain name as the bap_id")
	@NotNull

	public String getBapUri() {
		return bapUri;
	}

	public void setBapUri(String bapUri) {
		this.bapUri = bapUri;
	}

	public Context bppId(String bppId) {
		this.bppId = bppId;
		return this;
	}

	/**
	 * Unique id of the BPP. By default it is the fully qualified domain name of the
	 * BPP
	 * 
	 * @return bppId
	 **/
	@Schema(description = "Unique id of the BPP. By default it is the fully qualified domain name of the BPP")

	public String getBppId() {
		return bppId;
	}

	public void setBppId(String bppId) {
		this.bppId = bppId;
	}

	public Context bppUri(String bppUri) {
		this.bppUri = bppUri;
		return this;
	}

	/**
	 * URI of the BPP. Must have the same domain name as the bap_id
	 * 
	 * @return bppUri
	 **/
	@Schema(description = "URI of the BPP. Must have the same domain name as the bap_id")

	public String getBppUri() {
		return bppUri;
	}

	public void setBppUri(String bppUri) {
		this.bppUri = bppUri;
	}

	public Context transactionId(String transactionId) {
		this.transactionId = transactionId;
		return this;
	}

	/**
	 * This is a unique value which persists across all API calls from search
	 * through confirm
	 * 
	 * @return transactionId
	 **/
	@Schema(required = true, description = "This is a unique value which persists across all API calls from search through confirm")
	@NotNull

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Context messageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

	/**
	 * This is a unique value which persists during a request / callback cycle
	 * 
	 * @return messageId
	 **/
	@Schema(required = true, description = "This is a unique value which persists during a request / callback cycle")
	@NotNull

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public Context timestamp(OffsetDateTime timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * Time of request generation in RFC3339 format
	 * 
	 * @return timestamp
	 **/
	@Schema(required = true, description = "Time of request generation in RFC3339 format")
	@NotNull

	@Valid
	public OffsetDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(OffsetDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public Context key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * The encryption public key of the sender
	 * 
	 * @return key
	 **/
	@Schema(description = "The encryption public key of the sender")

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Context ttl(String ttl) {
		this.ttl = ttl;
		return this;
	}

	/**
	 * The duration in ISO8601 format after timestamp for which this message holds
	 * valid
	 * 
	 * @return ttl
	 **/
	@Schema(description = "The duration in ISO8601 format after timestamp for which this message holds valid")

	public String getTtl() {
		return ttl;
	}

	public void setTtl(String ttl) {
		this.ttl = ttl;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Context context = (Context) o;
		return Objects.equals(this.domain, context.domain) && Objects.equals(this.country, context.country)
				&& Objects.equals(this.city, context.city) && Objects.equals(this.action, context.action)
				&& Objects.equals(this.coreVersion, context.coreVersion) && Objects.equals(this.bapId, context.bapId)
				&& Objects.equals(this.bapUri, context.bapUri) && Objects.equals(this.bppId, context.bppId)
				&& Objects.equals(this.bppUri, context.bppUri)
				&& Objects.equals(this.transactionId, context.transactionId)
				&& Objects.equals(this.messageId, context.messageId)
				&& Objects.equals(this.timestamp, context.timestamp) && Objects.equals(this.key, context.key)
				&& Objects.equals(this.ttl, context.ttl);
	}

	@Override
	public int hashCode() {
		return Objects.hash(domain, country, city, action, coreVersion, bapId, bapUri, bppId, bppUri, transactionId,
				messageId, timestamp, key, ttl);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Context {\n");

		sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
		sb.append("    country: ").append(toIndentedString(country)).append("\n");
		sb.append("    city: ").append(toIndentedString(city)).append("\n");
		sb.append("    action: ").append(toIndentedString(action)).append("\n");
		sb.append("    coreVersion: ").append(toIndentedString(coreVersion)).append("\n");
		sb.append("    bapId: ").append(toIndentedString(bapId)).append("\n");
		sb.append("    bapUri: ").append(toIndentedString(bapUri)).append("\n");
		sb.append("    bppId: ").append(toIndentedString(bppId)).append("\n");
		sb.append("    bppUri: ").append(toIndentedString(bppUri)).append("\n");
		sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
		sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    key: ").append(toIndentedString(key)).append("\n");
		sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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

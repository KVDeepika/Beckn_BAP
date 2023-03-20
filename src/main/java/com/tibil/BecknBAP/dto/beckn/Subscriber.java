package com.tibil.BecknBAP.dto.beckn;

import java.time.OffsetDateTime;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Any entity which wants to authenticate itself on a network. This can be a
 * BAP, BPP, BG, BPPR or a BGR.
 */
@Schema(description = "Any entity which wants to authenticate itself on a network. This can be a BAP, BPP, BG, BPPR or a BGR.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Subscriber {
	@JsonProperty("subscriber_id")
	private String subscriberId = null;

	/**
	 * Gets or Sets type
	 */
	public enum TypeEnum {
		BAP("bap"),

		BPP("bpp"),

		BG("bg"),

		BPPR("bppr"),

		BGR("bgr");

		private String value;

		TypeEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static TypeEnum fromValue(String text) {
			for (TypeEnum b : TypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("type")
	private TypeEnum type = null;

	@JsonProperty("cb_url")
	private String cbUrl = null;

	@JsonProperty("domain")
	private String domain = null;

	@JsonProperty("city")
	private String city = null;

	@JsonProperty("country")
	private String country = null;

	@JsonProperty("signing_public_key")
	private String signingPublicKey = null;

	@JsonProperty("encryption_public_key")
	private String encryptionPublicKey = null;

	/**
	 * Gets or Sets status
	 */
	public enum StatusEnum {
		INITIATED("INITIATED"),

		UNDER_SUBSCRIPTION("UNDER_SUBSCRIPTION"),

		SUBSCRIBED("SUBSCRIBED"),

		INVALID_SSL("INVALID_SSL"),

		UNSUBSCRIBED("UNSUBSCRIBED");

		private String value;

		StatusEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static StatusEnum fromValue(String text) {
			for (StatusEnum b : StatusEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("status")
	private StatusEnum status = null;

	@JsonProperty("created")
	private OffsetDateTime created = null;

	@JsonProperty("updated")
	private OffsetDateTime updated = null;

	@JsonProperty("expires")
	private OffsetDateTime expires = null;

	public Subscriber subscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
		return this;
	}

	/**
	 * Registered domain name of the subscriber. Must have a valid SSL certificate
	 * issued by a Certificate Authority of the operating region
	 * 
	 * @return subscriberId
	 **/
	@Schema(description = "Registered domain name of the subscriber. Must have a valid SSL certificate issued by a Certificate Authority of the operating region")

	public String getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}

	public Subscriber type(TypeEnum type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@Schema(description = "")

	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	public Subscriber cbUrl(String cbUrl) {
		this.cbUrl = cbUrl;
		return this;
	}

	/**
	 * Callback URL of the subscriber. The Registry will call this URL's
	 * on_subscribe API to validate the subscriber\\'s credentials
	 * 
	 * @return cbUrl
	 **/
	@Schema(description = "Callback URL of the subscriber. The Registry will call this URL's on_subscribe API to validate the subscriber\\'s credentials")

	public String getCbUrl() {
		return cbUrl;
	}

	public void setCbUrl(String cbUrl) {
		this.cbUrl = cbUrl;
	}

	public Subscriber domain(String domain) {
		this.domain = domain;
		return this;
	}

	/**
	 * Describes the domain of an object
	 * 
	 * @return domain
	 **/
	@Schema(description = "Describes the domain of an object")

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public Subscriber city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * Get city
	 * 
	 * @return city
	 **/
	@Schema(description = "")

	@Valid
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Subscriber country(String country) {
		this.country = country;
		return this;
	}

	/**
	 * Get country
	 * 
	 * @return country
	 **/
	@Schema(description = "")

	@Valid
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Subscriber signingPublicKey(String signingPublicKey) {
		this.signingPublicKey = signingPublicKey;
		return this;
	}

	/**
	 * Signing Public key of the subscriber. <br/>
	 * <br/>
	 * Any subscriber platform (BAP, BPP, BG) who wants to transact on the network
	 * must digitally sign the ```requestBody``` using the corresponding private key
	 * of this public key and send it in the transport layer header. In case of
	 * ```HTTP``` it is the ```Authorization``` header. <br>
	 * <br/>
	 * The ```Authorization``` will be used to validate the signature of a BAP or
	 * BPP.<br/>
	 * <br/>
	 * Furthermore, if an API call is being proxied or multicast by a Beckn Gateway,
	 * the BG must use it\\'s signing key to digitally sign the ```requestBody```
	 * using the corresponding private key of this public key and send it in the
	 * ```X-Gateway-Authorization``` header.
	 * 
	 * @return signingPublicKey
	 **/
	@Schema(description = "Signing Public key of the subscriber. <br/><br/>Any subscriber platform (BAP, BPP, BG) who wants to transact on the network must digitally sign the ```requestBody``` using the corresponding private key of this public key and send it in the transport layer header. In case of ```HTTP``` it is the ```Authorization``` header. <br><br/>The ```Authorization``` will be used to validate the signature of a BAP or BPP.<br/><br/>Furthermore, if an API call is being proxied or multicast by a Beckn Gateway, the BG must use it\\'s signing key to digitally sign the ```requestBody``` using the corresponding private key of this public key and send it in the ```X-Gateway-Authorization``` header.")

	public String getSigningPublicKey() {
		return signingPublicKey;
	}

	public void setSigningPublicKey(String signingPublicKey) {
		this.signingPublicKey = signingPublicKey;
	}

	public Subscriber encryptionPublicKey(String encryptionPublicKey) {
		this.encryptionPublicKey = encryptionPublicKey;
		return this;
	}

	/**
	 * Encryption public key of the BAP subscriber. Any BPP must encrypt the
	 * ```requestBody.message``` value of the ```on_search``` API using this public
	 * key.
	 * 
	 * @return encryptionPublicKey
	 **/
	@Schema(description = "Encryption public key of the BAP subscriber. Any BPP must encrypt the ```requestBody.message``` value of the ```on_search``` API using this public key.")

	public String getEncryptionPublicKey() {
		return encryptionPublicKey;
	}

	public void setEncryptionPublicKey(String encryptionPublicKey) {
		this.encryptionPublicKey = encryptionPublicKey;
	}

	public Subscriber status(StatusEnum status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@Schema(description = "")

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public Subscriber created(OffsetDateTime created) {
		this.created = created;
		return this;
	}

	/**
	 * Timestamp when a subscriber was added to the registry with status = INITIATED
	 * 
	 * @return created
	 **/
	@Schema(description = "Timestamp when a subscriber was added to the registry with status = INITIATED")

	@Valid
	public OffsetDateTime getCreated() {
		return created;
	}

	public void setCreated(OffsetDateTime created) {
		this.created = created;
	}

	public Subscriber updated(OffsetDateTime updated) {
		this.updated = updated;
		return this;
	}

	/**
	 * Get updated
	 * 
	 * @return updated
	 **/
	@Schema(description = "")

	@Valid
	public OffsetDateTime getUpdated() {
		return updated;
	}

	public void setUpdated(OffsetDateTime updated) {
		this.updated = updated;
	}

	public Subscriber expires(OffsetDateTime expires) {
		this.expires = expires;
		return this;
	}

	/**
	 * Expiry timestamp in UTC derived from the ```lease_time``` of the subscriber
	 * 
	 * @return expires
	 **/
	@Schema(description = "Expiry timestamp in UTC derived from the ```lease_time``` of the subscriber")

	@Valid
	public OffsetDateTime getExpires() {
		return expires;
	}

	public void setExpires(OffsetDateTime expires) {
		this.expires = expires;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Subscriber subscriber = (Subscriber) o;
		return Objects.equals(this.subscriberId, subscriber.subscriberId) && Objects.equals(this.type, subscriber.type)
				&& Objects.equals(this.cbUrl, subscriber.cbUrl) && Objects.equals(this.domain, subscriber.domain)
				&& Objects.equals(this.city, subscriber.city) && Objects.equals(this.country, subscriber.country)
				&& Objects.equals(this.signingPublicKey, subscriber.signingPublicKey)
				&& Objects.equals(this.encryptionPublicKey, subscriber.encryptionPublicKey)
				&& Objects.equals(this.status, subscriber.status) && Objects.equals(this.created, subscriber.created)
				&& Objects.equals(this.updated, subscriber.updated) && Objects.equals(this.expires, subscriber.expires);
	}

	@Override
	public int hashCode() {
		return Objects.hash(subscriberId, type, cbUrl, domain, city, country, signingPublicKey, encryptionPublicKey,
				status, created, updated, expires);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Subscriber {\n");

		sb.append("    subscriberId: ").append(toIndentedString(subscriberId)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    cbUrl: ").append(toIndentedString(cbUrl)).append("\n");
		sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
		sb.append("    city: ").append(toIndentedString(city)).append("\n");
		sb.append("    country: ").append(toIndentedString(country)).append("\n");
		sb.append("    signingPublicKey: ").append(toIndentedString(signingPublicKey)).append("\n");
		sb.append("    encryptionPublicKey: ").append(toIndentedString(encryptionPublicKey)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    created: ").append(toIndentedString(created)).append("\n");
		sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
		sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
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

package com.tibil.BecknBAP.dto.model;

import java.time.OffsetDateTime;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Describes the mechanism that is used to authorize the start or end of a
 * fulfillment. If set, the BAP must show the authorization code to the BAP user
 * in a specified format. The BAP user must provide this authorization code to
 * the fulfillment agent before the start and/or end of the fulfillment.
 */
@Schema(description = "Describes the mechanism that is used to authorize the start or end of a fulfillment. If set, the BAP must show the authorization code to the BAP user in a specified format. The BAP user must provide this authorization code to the fulfillment agent before the start and/or end of the fulfillment.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class FulfillmentAuthorization {
	/**
	 * Type of authorization mechanism used. If this value is equal to IMAGE, then
	 * the BAP must render this image as-is. If this value is a STING, then the BAP
	 * must clearly display the string to the user. It is recommended that the
	 * string be displayed in a way that it can be copied to the clipboard.
	 */
	public enum TypeEnum {
		IMAGE("IMAGE"),

		STRING("STRING");

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

	@JsonProperty("token")
	private String token = null;

	@JsonProperty("valid_from")
	private OffsetDateTime validFrom = null;

	@JsonProperty("valid_to")
	private OffsetDateTime validTo = null;

	public FulfillmentAuthorization type(TypeEnum type) {
		this.type = type;
		return this;
	}

	/**
	 * Type of authorization mechanism used. If this value is equal to IMAGE, then
	 * the BAP must render this image as-is. If this value is a STING, then the BAP
	 * must clearly display the string to the user. It is recommended that the
	 * string be displayed in a way that it can be copied to the clipboard.
	 * 
	 * @return type
	 **/
	@Schema(description = "Type of authorization mechanism used. If this value is equal to IMAGE, then the BAP must render this image as-is. If this value is a STING, then the BAP must clearly display the string to the user. It is recommended that the string be displayed in a way that it can be copied to the clipboard.")

	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	public FulfillmentAuthorization token(String token) {
		this.token = token;
		return this;
	}

	/**
	 * The code displayed to the user for authorizing the start or end of
	 * fulfillment. This code must be provided to the fufillment agent before the
	 * start and/or end of the fulfillment.
	 * 
	 * @return token
	 **/
	@Schema(description = "The code displayed to the user for authorizing the start or end of fulfillment. This code must be provided to the fufillment agent before the start and/or end of the fulfillment.")

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public FulfillmentAuthorization validFrom(OffsetDateTime validFrom) {
		this.validFrom = validFrom;
		return this;
	}

	/**
	 * Date and time from which token is valid. This token must be shown to the BAP
	 * user only after this time.
	 * 
	 * @return validFrom
	 **/
	@Schema(description = "Date and time from which token is valid. This token must be shown to the BAP user only after this time.")

	@Valid
	public OffsetDateTime getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(OffsetDateTime validFrom) {
		this.validFrom = validFrom;
	}

	public FulfillmentAuthorization validTo(OffsetDateTime validTo) {
		this.validTo = validTo;
		return this;
	}

	/**
	 * Date and time till which token is valid. This token must NOT be shown to the
	 * BAP user after this time.
	 * 
	 * @return validTo
	 **/
	@Schema(description = "Date and time till which token is valid. This token must NOT be shown to the BAP user after this time.")

	@Valid
	public OffsetDateTime getValidTo() {
		return validTo;
	}

	public void setValidTo(OffsetDateTime validTo) {
		this.validTo = validTo;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FulfillmentAuthorization fulfillmentAuthorization = (FulfillmentAuthorization) o;
		return Objects.equals(this.type, fulfillmentAuthorization.type)
				&& Objects.equals(this.token, fulfillmentAuthorization.token)
				&& Objects.equals(this.validFrom, fulfillmentAuthorization.validFrom)
				&& Objects.equals(this.validTo, fulfillmentAuthorization.validTo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, token, validFrom, validTo);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FulfillmentAuthorization {\n");

		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    token: ").append(toIndentedString(token)).append("\n");
		sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
		sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
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

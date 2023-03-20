package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Customer support
 */
@Schema(description = "Customer support")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Support {
	/**
	 * Gets or Sets type
	 */
	public enum TypeEnum {
		ORDER("order"),

		BILLING("billing"),

		FULFILLMENT("fulfillment");

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

	@JsonProperty("ref_id")
	private String refId = null;

	@JsonProperty("channels")
	private Tags channels = null;

	public Support type(TypeEnum type) {
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

	public Support refId(String refId) {
		this.refId = refId;
		return this;
	}

	/**
	 * Get refId
	 * 
	 * @return refId
	 **/
	@Schema(description = "")

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public Support channels(Tags channels) {
		this.channels = channels;
		return this;
	}

	/**
	 * Get channels
	 * 
	 * @return channels
	 **/
	@Schema(description = "")

	@Valid
	public Tags getChannels() {
		return channels;
	}

	public void setChannels(Tags channels) {
		this.channels = channels;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Support support = (Support) o;
		return Objects.equals(this.type, support.type) && Objects.equals(this.refId, support.refId)
				&& Objects.equals(this.channels, support.channels);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, refId, channels);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Support {\n");

		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
		sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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

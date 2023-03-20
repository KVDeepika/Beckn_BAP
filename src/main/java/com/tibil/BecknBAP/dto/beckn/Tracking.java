package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Describes the tracking info of an object
 */
@Schema(description = "Describes the tracking info of an object")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Tracking {
	@JsonProperty("url")
	private String url = null;

	/**
	 * Gets or Sets status
	 */
	public enum StatusEnum {
		ACTIVE("active"),

		INACTIVE("inactive");

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

	public Tracking url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Get url
	 * 
	 * @return url
	 **/
	@Schema(description = "")

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Tracking status(StatusEnum status) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tracking tracking = (Tracking) o;
		return Objects.equals(this.url, tracking.url) && Objects.equals(this.status, tracking.status);
	}

	@Override
	public int hashCode() {
		return Objects.hash(url, status);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tracking {\n");

		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

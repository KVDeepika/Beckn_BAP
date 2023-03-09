package com.tibil.BecknBAP.dto.model;

import java.util.Map;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Describes how a feedback URL will be sent by the BPP
 */
@Schema(description = "Describes how a feedback URL will be sent by the BPP")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class FeedbackUrl {
	@JsonProperty("url")
	private String url = null;

	/**
	 * Gets or Sets tlMethod
	 */
	public enum TlMethodEnum {
		GET("http/get"),

		POST("http/post");

		private String value;

		TlMethodEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static TlMethodEnum fromValue(String text) {
			for (TlMethodEnum b : TlMethodEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("tl_method")
	private TlMethodEnum tlMethod = null;

	@JsonProperty("params")
	private Map params = null;

	public FeedbackUrl url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * feedback URL sent by the BPP
	 * 
	 * @return url
	 **/
	@Schema(description = "feedback URL sent by the BPP")

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public FeedbackUrl tlMethod(TlMethodEnum tlMethod) {
		this.tlMethod = tlMethod;
		return this;
	}

	/**
	 * Get tlMethod
	 * 
	 * @return tlMethod
	 **/
	@Schema(description = "")

	public TlMethodEnum getTlMethod() {
		return tlMethod;
	}

	public void setTlMethod(TlMethodEnum tlMethod) {
		this.tlMethod = tlMethod;
	}

	public FeedbackUrl params(Map params) {
		this.params = params;
		return this;
	}

	/**
	 * Get params
	 * 
	 * @return params
	 **/
	@Schema(description = "")

	@Valid
	public Map getParams() {
		return params;
	}

	public void setParams(Map params) {
		this.params = params;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FeedbackUrl feedbackUrl = (FeedbackUrl) o;
		return Objects.equals(this.url, feedbackUrl.url) && Objects.equals(this.tlMethod, feedbackUrl.tlMethod)
				&& Objects.equals(this.params, feedbackUrl.params);
	}

	@Override
	public int hashCode() {
		return Objects.hash(url, tlMethod, params);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FeedbackUrl {\n");

		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    tlMethod: ").append(toIndentedString(tlMethod)).append("\n");
		sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

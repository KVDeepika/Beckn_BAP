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
 * Describes the terms of payment settlement of an order between a BAP and a
 * BPP. The BAP may choose to send its own settlement terms to the BPP before
 * the confirmation of an order. The BPP can choose to accept it, or send its
 * own settlement terms to the BAP. &lt;br/&gt;&lt;br/&gt; The terms of
 * settlement must contain, &lt;i&gt; &lt;ul&gt;&lt;li&gt;The final amount to be
 * paid by the BAP to the BPP&lt;/li&gt;&lt;li&gt;At what stage must the
 * settlement be done i.e On-order, Pre-fulfillment, On-fulfillment, or
 * Post-Fulfillment&lt;/li&gt;&lt;li&gt;A payment endpoint, in case of online
 * settlement&lt;/li&gt;&lt;li&gt;A reference to the order for which the payment
 * is being made&lt;/li&gt;&lt;li&gt;The destination account where the payment
 * must ultimately go to. This may be a bank account, or a virtual payment
 * address - in case the provider does not want to display the account number to
 * the BAP or its
 * consumer&lt;/li&gt;&lt;/ul&gt;&lt;/i&gt;&lt;b&gt;Note:&lt;/b&gt;&lt;b&gt;&lt;i&gt;&lt;ul&gt;&lt;li&gt;These
 * terms ONLY describe the terms of settlement between the BAP and the
 * BPP.&lt;/li&gt;&lt;li&gt;These do not affect \&quot;how\&quot; the payment is
 * collected from the consumer, and how it is ultimately credited to the
 * provider&#x27;s account.&lt;/li&gt;&lt;li&gt;If the terms of settlement sent
 * by the BAP to the BPP MATCH the terms of settlement sent by the BPP to the
 * BAP, then it indicates a mutual agreement between both the
 * actors.&lt;/li&gt;&lt;li&gt;Once an agreement has been reached, the BAP and
 * BPP can initiate the order confirmation
 * process.&lt;/li&gt;&lt;/ul&gt;&lt;/i&gt;&lt;b/&gt;
 */
@Schema(description = "Describes the terms of payment settlement of an order between a BAP and a BPP. The BAP may choose to send its own settlement terms to the BPP before the confirmation of an order. The BPP can choose to accept it, or send its own settlement terms to the BAP. <br/><br/> The terms of settlement must contain, <i> <ul><li>The final amount to be paid by the BAP to the BPP</li><li>At what stage must the settlement be done i.e On-order, Pre-fulfillment, On-fulfillment, or Post-Fulfillment</li><li>A payment endpoint, in case of online settlement</li><li>A reference to the order for which the payment is being made</li><li>The destination account where the payment must ultimately go to. This may be a bank account, or a virtual payment address - in case the provider does not want to display the account number to the BAP or its consumer</li></ul></i><b>Note:</b><b><i><ul><li>These terms ONLY describe the terms of settlement between the BAP and the BPP.</li><li>These do not affect \"how\" the payment is collected from the consumer, and how it is ultimately credited to the provider's account.</li><li>If the terms of settlement sent by the BAP to the BPP MATCH the terms of settlement sent by the BPP to the BAP, then it indicates a mutual agreement between both the actors.</li><li>Once an agreement has been reached, the BAP and BPP can initiate the order confirmation process.</li></ul></i><b/>")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Payment {
	@JsonProperty("uri")
	private String uri = null;

	/**
	 * Describes the contents of the uri field. If the value is text/html, it is
	 * recommended for the BAP to render the contents inside a webview. This
	 * generally does not render a good user experience on the BAP, hence the
	 * payment page developers are recommended to develop their payment pages in a
	 * mobile-friendly manner.
	 */
	public enum UriMimeTypeEnum {
		TEXT_HTML("text/html"),

		TEXT_PLAIN("text/plain"),

		APPLICATION_OCTET_STREAM_PROVIDER_APPLICATION_ID("application/octet-stream;provider=$application_id");

		private String value;

		UriMimeTypeEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static UriMimeTypeEnum fromValue(String text) {
			for (UriMimeTypeEnum b : UriMimeTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("uri_mime_type")
	private UriMimeTypeEnum uriMimeType = null;

	@JsonProperty("params")
	private Map params = null;

	/**
	 * Gets or Sets type
	 */
	public enum TypeEnum {
		ON_ORDER("ON-ORDER"),

		PRE_FULFILLMENT("PRE-FULFILLMENT"),

		ON_FULFILLMENT("ON-FULFILLMENT"),

		POST_FULFILLMENT("POST-FULFILLMENT");

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

	/**
	 * Gets or Sets status
	 */
	public enum StatusEnum {
		PAID("PAID"),

		NOT_PAID("NOT-PAID");

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

	@JsonProperty("time")
	private Time time = null;

	public Payment uri(String uri) {
		this.uri = uri;
		return this;
	}

	/**
	 * The payment URL of the payee. If this field is empty or missing, it indicates
	 * that the payment has to be settled manually between the payer and the
	 * payee.<br/>
	 * <br/>
	 * <b>Recommendations:</b>
	 * <ul>
	 * <li>The list of supported URI schemes must be published in the network
	 * policy</li>
	 * <li>If this field is set, then the BAP must render this link as a CTA or
	 * render the payment screen within a webview</li>
	 * </ul>
	 * 
	 * @return uri
	 **/
	@Schema(description = "The payment URL of the payee.  If this field is empty or missing, it indicates that the payment has to be settled manually between the payer and the payee.<br/><br/><b>Recommendations:</b><ul><li>The list of supported URI schemes must be published in the network policy</li><li>If this field is set, then the BAP must render this link as a CTA or render the payment screen within a webview</li></ul>")

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Payment uriMimeType(UriMimeTypeEnum uriMimeType) {
		this.uriMimeType = uriMimeType;
		return this;
	}

	/**
	 * Describes the contents of the uri field. If the value is text/html, it is
	 * recommended for the BAP to render the contents inside a webview. This
	 * generally does not render a good user experience on the BAP, hence the
	 * payment page developers are recommended to develop their payment pages in a
	 * mobile-friendly manner.
	 * 
	 * @return uriMimeType
	 **/
	@Schema(description = "Describes the contents of the uri field. If the value is text/html, it is recommended for the BAP to render the contents inside a webview. This generally does not render a good user experience on the BAP, hence the payment page developers are recommended to develop their payment pages in a mobile-friendly manner.")

	public UriMimeTypeEnum getUriMimeType() {
		return uriMimeType;
	}

	public void setUriMimeType(UriMimeTypeEnum uriMimeType) {
		this.uriMimeType = uriMimeType;
	}

	public Payment params(Map params) {
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

	public Payment type(TypeEnum type) {
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

	public Payment status(StatusEnum status) {
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

	public Payment time(Time time) {
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
		Payment payment = (Payment) o;
		return Objects.equals(this.uri, payment.uri) && Objects.equals(this.uriMimeType, payment.uriMimeType)
				&& Objects.equals(this.params, payment.params) && Objects.equals(this.type, payment.type)
				&& Objects.equals(this.status, payment.status) && Objects.equals(this.time, payment.time);
	}

	@Override
	public int hashCode() {
		return Objects.hash(uri, uriMimeType, params, type, status, time);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Payment {\n");

		sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
		sb.append("    uriMimeType: ").append(toIndentedString(uriMimeType)).append("\n");
		sb.append("    params: ").append(toIndentedString(params)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

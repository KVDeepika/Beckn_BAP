package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * This describes an acknowledgement of receipt of a message. Upon receiving a
 * message, the receiver must first authenticate the sender by verifying its
 * digital signature. Upon successful verification of the signature, the
 * receiver must validate the schema of the message. After performing both the
 * operations, the receiver should send an Ack object in response.
 */
@Schema(description = "This describes an acknowledgement of receipt of a message. Upon receiving a message, the receiver must first authenticate the sender by verifying its digital signature. Upon successful verification of the signature, the receiver must validate the schema of the message.  After performing both the operations, the receiver should send an Ack object in response.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Ack {
	/**
	 * Describe the status of the ACK response. If the message passes the
	 * acknowledgement criteria, then the receiver shouls set this value equal to
	 * ACK else it should be set to NACK
	 */
	public enum StatusEnum {
		ACK("ACK"),

		NACK("NACK");

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

	public Ack status(StatusEnum status) {
		this.status = status;
		return this;
	}

	/**
	 * Describe the status of the ACK response. If the message passes the
	 * acknowledgement criteria, then the receiver shouls set this value equal to
	 * ACK else it should be set to NACK
	 * 
	 * @return status
	 **/
	@Schema(required = true, description = "Describe the status of the ACK response. If the message passes the acknowledgement criteria, then the receiver shouls set this value equal to ACK else it should be set to NACK")
	@NotNull

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
		Ack ack = (Ack) o;
		return Objects.equals(this.status, ack.status);
	}

	@Override
	public int hashCode() {
		return Objects.hash(status);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Ack {\n");

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

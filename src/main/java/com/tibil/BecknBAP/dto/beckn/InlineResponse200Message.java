package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * InlineResponse200Message
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class InlineResponse200Message {
	@JsonProperty("ack")
	private Ack ack = null;

	public InlineResponse200Message ack(Ack ack) {
		this.ack = ack;
		return this;
	}

	/**
	 * Get ack
	 * 
	 * @return ack
	 **/
	@Schema(required = true, description = "")
	@NotNull

	@Valid
	public Ack getAck() {
		return ack;
	}

	public void setAck(Ack ack) {
		this.ack = ack;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InlineResponse200Message inlineResponse200Message = (InlineResponse200Message) o;
		return Objects.equals(this.ack, inlineResponse200Message.ack);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ack);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InlineResponse200Message {\n");

		sb.append("    ack: ").append(toIndentedString(ack)).append("\n");
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

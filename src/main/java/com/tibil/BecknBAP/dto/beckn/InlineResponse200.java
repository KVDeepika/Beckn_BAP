package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * InlineResponse200
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class InlineResponse200 {
	@JsonProperty("message")
	private InlineResponse200Message message = null;

	@JsonProperty("error")
	private Error error = null;

	public InlineResponse200 message(InlineResponse200Message message) {
		this.message = message;
		return this;
	}

	/**
	 * Get message
	 * 
	 * @return message
	 **/
	@Schema(required = true, description = "")
	@NotNull

	@Valid
	public InlineResponse200Message getMessage() {
		return message;
	}

	public void setMessage(InlineResponse200Message message) {
		this.message = message;
	}

	public InlineResponse200 error(Error error) {
		this.error = error;
		return this;
	}

	/**
	 * Get error
	 * 
	 * @return error
	 **/
	@Schema(description = "")

	@Valid
	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InlineResponse200 inlineResponse200 = (InlineResponse200) o;
		return Objects.equals(this.message, inlineResponse200.message)
				&& Objects.equals(this.error, inlineResponse200.error);
	}

	@Override
	public int hashCode() {
		return Objects.hash(message, error);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InlineResponse200 {\n");

		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

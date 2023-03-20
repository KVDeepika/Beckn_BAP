package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * InlineResponse2001
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class InlineResponse2001 {
	@JsonProperty("message")
	private InlineResponse200Message message = null;

	@JsonProperty("error")
	private Error error = null;

	public InlineResponse2001 message(InlineResponse200Message message) {
		this.message = message;
		return this;
	}

	/**
	 * Get message
	 * 
	 * @return message
	 **/
	@Schema(description = "")

	@Valid
	public InlineResponse200Message getMessage() {
		return message;
	}

	public void setMessage(InlineResponse200Message message) {
		this.message = message;
	}

	public InlineResponse2001 error(Error error) {
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
		InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
		return Objects.equals(this.message, inlineResponse2001.message)
				&& Objects.equals(this.error, inlineResponse2001.error);
	}

	@Override
	public int hashCode() {
		return Objects.hash(message, error);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InlineResponse2001 {\n");

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

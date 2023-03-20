package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * OnSearchBody
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class OnSearchBody {
	@JsonProperty("context")
	private Context context = null;

	@JsonProperty("message")
	private OnSearchMessage message = null;

	@JsonProperty("error")
	private Error error = null;

	public OnSearchBody context(Context context) {
		this.context = context;
		return this;
	}

	/**
	 * Get context
	 * 
	 * @return context
	 **/
	@Schema(required = true, description = "")
	@NotNull

	@Valid
	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public OnSearchBody message(OnSearchMessage message) {
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
	public OnSearchMessage getMessage() {
		return message;
	}

	public void setMessage(OnSearchMessage message) {
		this.message = message;
	}

	public OnSearchBody error(Error error) {
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
		OnSearchBody onSearchBody = (OnSearchBody) o;
		return Objects.equals(this.context, onSearchBody.context) && Objects.equals(this.message, onSearchBody.message)
				&& Objects.equals(this.error, onSearchBody.error);
	}

	@Override
	public int hashCode() {
		return Objects.hash(context, message, error);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OnSearchBody {\n");

		sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * CancellationReasonsBody
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class CancellationReasonsBody {
	@JsonProperty("context")
	private Context context = null;

	@JsonProperty("message")
	private CancellationReasonsMessage message = null;

	public CancellationReasonsBody context(Context context) {
		this.context = context;
		return this;
	}

	/**
	 * Get context
	 * 
	 * @return context
	 **/
	@Schema(description = "")

	@Valid
	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public CancellationReasonsBody message(CancellationReasonsMessage message) {
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
	public CancellationReasonsMessage getMessage() {
		return message;
	}

	public void setMessage(CancellationReasonsMessage message) {
		this.message = message;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CancellationReasonsBody cancellationReasonsBody = (CancellationReasonsBody) o;
		return Objects.equals(this.context, cancellationReasonsBody.context)
				&& Objects.equals(this.message, cancellationReasonsBody.message);
	}

	@Override
	public int hashCode() {
		return Objects.hash(context, message);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CancellationReasonsBody {\n");

		sb.append("    context: ").append(toIndentedString(context)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

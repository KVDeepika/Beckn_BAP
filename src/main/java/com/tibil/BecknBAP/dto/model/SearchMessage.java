package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * SearchMessage
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class SearchMessage {
	@JsonProperty("intent")
	private Intent intent = null;

	public SearchMessage intent(Intent intent) {
		this.intent = intent;
		return this;
	}

	/**
	 * Get intent
	 * 
	 * @return intent
	 **/
	@Schema(description = "")

	@Valid
	public Intent getIntent() {
		return intent;
	}

	public void setIntent(Intent intent) {
		this.intent = intent;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SearchMessage searchMessage = (SearchMessage) o;
		return Objects.equals(this.intent, searchMessage.intent);
	}

	@Override
	public int hashCode() {
		return Objects.hash(intent);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SearchMessage {\n");

		sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
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

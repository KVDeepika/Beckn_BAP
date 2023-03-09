package com.tibil.BecknBAP.dto.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * CancellationReasonsMessage
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class CancellationReasonsMessage {
	@JsonProperty("cancellation_reasons")
	@Valid
	private List<Option> cancellationReasons = null;

	public CancellationReasonsMessage cancellationReasons(List<Option> cancellationReasons) {
		this.cancellationReasons = cancellationReasons;
		return this;
	}

	public CancellationReasonsMessage addCancellationReasonsItem(Option cancellationReasonsItem) {
		if (this.cancellationReasons == null) {
			this.cancellationReasons = new ArrayList<Option>();
		}
		this.cancellationReasons.add(cancellationReasonsItem);
		return this;
	}

	/**
	 * Get cancellationReasons
	 * 
	 * @return cancellationReasons
	 **/
	@Schema(description = "")
	@Valid
	public List<Option> getCancellationReasons() {
		return cancellationReasons;
	}

	public void setCancellationReasons(List<Option> cancellationReasons) {
		this.cancellationReasons = cancellationReasons;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CancellationReasonsMessage cancellationReasonsMessage = (CancellationReasonsMessage) o;
		return Objects.equals(this.cancellationReasons, cancellationReasonsMessage.cancellationReasons);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cancellationReasons);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CancellationReasonsMessage {\n");

		sb.append("    cancellationReasons: ").append(toIndentedString(cancellationReasons)).append("\n");
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

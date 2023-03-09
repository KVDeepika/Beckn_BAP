package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * OnTrackMessage
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class OnTrackMessage {
	@JsonProperty("tracking")
	private Tracking tracking = null;

	public OnTrackMessage tracking(Tracking tracking) {
		this.tracking = tracking;
		return this;
	}

	/**
	 * Get tracking
	 * 
	 * @return tracking
	 **/
	@Schema(required = true, description = "")
	@NotNull

	@Valid
	public Tracking getTracking() {
		return tracking;
	}

	public void setTracking(Tracking tracking) {
		this.tracking = tracking;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OnTrackMessage onTrackMessage = (OnTrackMessage) o;
		return Objects.equals(this.tracking, onTrackMessage.tracking);
	}

	@Override
	public int hashCode() {
		return Objects.hash(tracking);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OnTrackMessage {\n");

		sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
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

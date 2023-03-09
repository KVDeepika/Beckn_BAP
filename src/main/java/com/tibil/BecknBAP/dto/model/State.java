package com.tibil.BecknBAP.dto.model;

import java.time.OffsetDateTime;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Describes a state
 */
@Schema(description = "Describes a state")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class State {
	@JsonProperty("descriptor")
	private Descriptor descriptor = null;

	@JsonProperty("updated_at")
	private OffsetDateTime updatedAt = null;

	@JsonProperty("updated_by")
	private String updatedBy = null;

	public State descriptor(Descriptor descriptor) {
		this.descriptor = descriptor;
		return this;
	}

	/**
	 * Get descriptor
	 * 
	 * @return descriptor
	 **/
	@Schema(description = "")

	@Valid
	public Descriptor getDescriptor() {
		return descriptor;
	}

	public void setDescriptor(Descriptor descriptor) {
		this.descriptor = descriptor;
	}

	public State updatedAt(OffsetDateTime updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	/**
	 * Get updatedAt
	 * 
	 * @return updatedAt
	 **/
	@Schema(description = "")

	@Valid
	public OffsetDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(OffsetDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public State updatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
		return this;
	}

	/**
	 * ID of entity which changed the state
	 * 
	 * @return updatedBy
	 **/
	@Schema(description = "ID of entity which changed the state")

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		State state = (State) o;
		return Objects.equals(this.descriptor, state.descriptor) && Objects.equals(this.updatedAt, state.updatedAt)
				&& Objects.equals(this.updatedBy, state.updatedBy);
	}

	@Override
	public int hashCode() {
		return Objects.hash(descriptor, updatedAt, updatedBy);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class State {\n");

		sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
		sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
		sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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

package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Describes a policy. Allows for domain extension.
 */
@Schema(description = "Describes a policy. Allows for domain extension.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Policy {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("descriptor")
	private Descriptor descriptor = null;

	@JsonProperty("parent_policy_id")
	private String parentPolicyId = null;

	@JsonProperty("time")
	private Time time = null;

	public Policy id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@Schema(description = "")

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Policy descriptor(Descriptor descriptor) {
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

	public Policy parentPolicyId(String parentPolicyId) {
		this.parentPolicyId = parentPolicyId;
		return this;
	}

	/**
	 * Get parentPolicyId
	 * 
	 * @return parentPolicyId
	 **/
	@Schema(description = "")

	@Valid
	public String getParentPolicyId() {
		return parentPolicyId;
	}

	public void setParentPolicyId(String parentPolicyId) {
		this.parentPolicyId = parentPolicyId;
	}

	public Policy time(Time time) {
		this.time = time;
		return this;
	}

	/**
	 * Get time
	 * 
	 * @return time
	 **/
	@Schema(description = "")

	@Valid
	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Policy policy = (Policy) o;
		return Objects.equals(this.id, policy.id) && Objects.equals(this.descriptor, policy.descriptor)
				&& Objects.equals(this.parentPolicyId, policy.parentPolicyId) && Objects.equals(this.time, policy.time);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, descriptor, parentPolicyId, time);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Policy {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
		sb.append("    parentPolicyId: ").append(toIndentedString(parentPolicyId)).append("\n");
		sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

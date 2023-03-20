package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * SupportMessage
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class SupportMessage {
	@JsonProperty("ref_id")
	private String refId = null;

	public SupportMessage refId(String refId) {
		this.refId = refId;
		return this;
	}

	/**
	 * ID of the element for which support is needed
	 * 
	 * @return refId
	 **/
	@Schema(description = "ID of the element for which support is needed")

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SupportMessage supportMessage = (SupportMessage) o;
		return Objects.equals(this.refId, supportMessage.refId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(refId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SupportMessage {\n");

		sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
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

package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * Describes an error object
 */
@Schema(description = "Describes an error object")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Error {
	/**
	 * Gets or Sets type
	 */
	public enum TypeEnum {
		CONTEXT_ERROR("CONTEXT-ERROR"),

		CORE_ERROR("CORE-ERROR"),

		DOMAIN_ERROR("DOMAIN-ERROR"),

		POLICY_ERROR("POLICY-ERROR"),

		JSON_SCHEMA_ERROR("JSON-SCHEMA-ERROR");

		private String value;

		TypeEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static TypeEnum fromValue(String text) {
			for (TypeEnum b : TypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("type")
	private TypeEnum type = null;

	@JsonProperty("code")
	private String code = null;

	@JsonProperty("path")
	private String path = null;

	@JsonProperty("message")
	private String message = null;

	public Error type(TypeEnum type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@Schema(required = true, description = "")
	@NotNull

	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	public Error code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * Beckn specific error code. For full list of error codes, refer to
	 * docs/protocol-drafts/BECKN-RFC-005-ERROR-CODES-DRAFT-01.md of this repo
	 * 
	 * @return code
	 **/
	@Schema(required = true, description = "Beckn specific error code. For full list of error codes, refer to docs/protocol-drafts/BECKN-RFC-005-ERROR-CODES-DRAFT-01.md of this repo")
	@NotNull

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Error path(String path) {
		this.path = path;
		return this;
	}

	/**
	 * Path to json schema generating the error. Used only during json schema
	 * validation errors
	 * 
	 * @return path
	 **/
	@Schema(description = "Path to json schema generating the error. Used only during json schema validation errors")

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Error message(String message) {
		this.message = message;
		return this;
	}

	/**
	 * Human readable message describing the error
	 * 
	 * @return message
	 **/
	@Schema(description = "Human readable message describing the error")

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
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
		Error error = (Error) o;
		return Objects.equals(this.type, error.type) && Objects.equals(this.code, error.code)
				&& Objects.equals(this.path, error.path) && Objects.equals(this.message, error.message);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, code, path, message);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Error {\n");

		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    code: ").append(toIndentedString(code)).append("\n");
		sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

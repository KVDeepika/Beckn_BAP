package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * OnSearchMessage
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class OnSearchMessage {
	@JsonProperty("catalog")
	private Catalog catalog = null;

	public OnSearchMessage catalog(Catalog catalog) {
		this.catalog = catalog;
		return this;
	}

	/**
	 * Get catalog
	 * 
	 * @return catalog
	 **/
	@Schema(required = true, description = "")
	@NotNull

	@Valid
	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OnSearchMessage onSearchMessage = (OnSearchMessage) o;
		return Objects.equals(this.catalog, onSearchMessage.catalog);
	}

	@Override
	public int hashCode() {
		return Objects.hash(catalog);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OnSearchMessage {\n");

		sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
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

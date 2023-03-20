package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AllOfProviderLocationsItems
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class AllOfProviderLocationsItems extends Location {
	@JsonProperty("rateable")
	private Boolean rateable = null;

	public AllOfProviderLocationsItems rateable(Boolean rateable) {
		this.rateable = rateable;
		return this;
	}

	/**
	 * If the entity can be rated or not
	 * 
	 * @return rateable
	 **/
	@Schema(description = "If the entity can be rated or not")

	public Boolean isRateable() {
		return rateable;
	}

	public void setRateable(Boolean rateable) {
		this.rateable = rateable;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AllOfProviderLocationsItems allOfProviderLocationsItems = (AllOfProviderLocationsItems) o;
		return Objects.equals(this.rateable, allOfProviderLocationsItems.rateable) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(rateable, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AllOfProviderLocationsItems {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    rateable: ").append(toIndentedString(rateable)).append("\n");
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

package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

/**
 * Describes a circular area on the map
 */
@Schema(description = "Describes a circular area on the map")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Circle {
	@JsonProperty("gps")
	private String gps = null;

	@JsonProperty("radius")
	private Scalar radius = null;

	public Circle gps(String gps) {
		this.gps = gps;
		return this;
	}

	/**
	 * Describes a gps coordinate
	 * 
	 * @return gps
	 **/
	@Schema(required = true, description = "Describes a gps coordinate")
	@NotNull

	@Pattern(regexp = "^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?),\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)$")
	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public Circle radius(Scalar radius) {
		this.radius = radius;
		return this;
	}

	/**
	 * Get radius
	 * 
	 * @return radius
	 **/
	@Schema(required = true, description = "")
	@NotNull

	@Valid
	public Scalar getRadius() {
		return radius;
	}

	public void setRadius(Scalar radius) {
		this.radius = radius;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Circle circle = (Circle) o;
		return Objects.equals(this.gps, circle.gps) && Objects.equals(this.radius, circle.radius);
	}

	@Override
	public int hashCode() {
		return Objects.hash(gps, radius);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Circle {\n");

		sb.append("    gps: ").append(toIndentedString(gps)).append("\n");
		sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
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

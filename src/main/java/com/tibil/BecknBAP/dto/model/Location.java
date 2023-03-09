package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;

/**
 * Describes the location of a runtime object.
 */
@Schema(description = "Describes the location of a runtime object.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Location {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("descriptor")
	private Descriptor descriptor = null;

	@JsonProperty("gps")
	private String gps = null;

	@JsonProperty("address")
	private Address address = null;

	@JsonProperty("station_code")
	private String stationCode = null;

	@JsonProperty("city")
	private City city = null;

	@JsonProperty("country")
	private Country country = null;

	@JsonProperty("circle")
	private Circle circle = null;

	@JsonProperty("polygon")
	private String polygon = null;

	@JsonProperty("3dspace")
	private String _3dspace = null;

	@JsonProperty("time")
	private Time time = null;

	public Location id(String id) {
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

	public Location descriptor(Descriptor descriptor) {
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

	public Location gps(String gps) {
		this.gps = gps;
		return this;
	}

	/**
	 * Describes a gps coordinate
	 * 
	 * @return gps
	 **/
	@Schema(description = "Describes a gps coordinate")

	@Pattern(regexp = "^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?),\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)$")
	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public Location address(Address address) {
		this.address = address;
		return this;
	}

	/**
	 * Get address
	 * 
	 * @return address
	 **/
	@Schema(description = "")

	@Valid
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Location stationCode(String stationCode) {
		this.stationCode = stationCode;
		return this;
	}

	/**
	 * Get stationCode
	 * 
	 * @return stationCode
	 **/
	@Schema(description = "")

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public Location city(City city) {
		this.city = city;
		return this;
	}

	/**
	 * Get city
	 * 
	 * @return city
	 **/
	@Schema(description = "")

	@Valid
	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Location country(Country country) {
		this.country = country;
		return this;
	}

	/**
	 * Get country
	 * 
	 * @return country
	 **/
	@Schema(description = "")

	@Valid
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Location circle(Circle circle) {
		this.circle = circle;
		return this;
	}

	/**
	 * Get circle
	 * 
	 * @return circle
	 **/
	@Schema(description = "")

	@Valid
	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Location polygon(String polygon) {
		this.polygon = polygon;
		return this;
	}

	/**
	 * Get polygon
	 * 
	 * @return polygon
	 **/
	@Schema(description = "")

	public String getPolygon() {
		return polygon;
	}

	public void setPolygon(String polygon) {
		this.polygon = polygon;
	}

	public Location _3dspace(String _3dspace) {
		this._3dspace = _3dspace;
		return this;
	}

	/**
	 * Get _3dspace
	 * 
	 * @return _3dspace
	 **/
	@Schema(description = "")

	public String get3dspace() {
		return _3dspace;
	}

	public void set3dspace(String _3dspace) {
		this._3dspace = _3dspace;
	}

	public Location time(Time time) {
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
		Location location = (Location) o;
		return Objects.equals(this.id, location.id) && Objects.equals(this.descriptor, location.descriptor)
				&& Objects.equals(this.gps, location.gps) && Objects.equals(this.address, location.address)
				&& Objects.equals(this.stationCode, location.stationCode) && Objects.equals(this.city, location.city)
				&& Objects.equals(this.country, location.country) && Objects.equals(this.circle, location.circle)
				&& Objects.equals(this.polygon, location.polygon) && Objects.equals(this._3dspace, location._3dspace)
				&& Objects.equals(this.time, location.time);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, descriptor, gps, address, stationCode, city, country, circle, polygon, _3dspace, time);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Location {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
		sb.append("    gps: ").append(toIndentedString(gps)).append("\n");
		sb.append("    address: ").append(toIndentedString(address)).append("\n");
		sb.append("    stationCode: ").append(toIndentedString(stationCode)).append("\n");
		sb.append("    city: ").append(toIndentedString(city)).append("\n");
		sb.append("    country: ").append(toIndentedString(country)).append("\n");
		sb.append("    circle: ").append(toIndentedString(circle)).append("\n");
		sb.append("    polygon: ").append(toIndentedString(polygon)).append("\n");
		sb.append("    _3dspace: ").append(toIndentedString(_3dspace)).append("\n");
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

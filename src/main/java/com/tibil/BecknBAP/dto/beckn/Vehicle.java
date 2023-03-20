package com.tibil.BecknBAP.dto.beckn;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Describes the properties of a vehicle used in a mobility service
 */
@Schema(description = "Describes the properties of a vehicle used in a mobility service")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Vehicle {
	@JsonProperty("category")
	private String category = null;

	@JsonProperty("capacity")
	private Integer capacity = null;

	@JsonProperty("make")
	private String make = null;

	@JsonProperty("model")
	private String model = null;

	@JsonProperty("size")
	private String size = null;

	@JsonProperty("variant")
	private String variant = null;

	@JsonProperty("color")
	private String color = null;

	@JsonProperty("energy_type")
	private String energyType = null;

	@JsonProperty("registration")
	private String registration = null;

	public Vehicle category(String category) {
		this.category = category;
		return this;
	}

	/**
	 * Get category
	 * 
	 * @return category
	 **/
	@Schema(description = "")

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Vehicle capacity(Integer capacity) {
		this.capacity = capacity;
		return this;
	}

	/**
	 * Get capacity
	 * 
	 * @return capacity
	 **/
	@Schema(description = "")

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Vehicle make(String make) {
		this.make = make;
		return this;
	}

	/**
	 * Get make
	 * 
	 * @return make
	 **/
	@Schema(description = "")

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public Vehicle model(String model) {
		this.model = model;
		return this;
	}

	/**
	 * Get model
	 * 
	 * @return model
	 **/
	@Schema(description = "")

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Vehicle size(String size) {
		this.size = size;
		return this;
	}

	/**
	 * Get size
	 * 
	 * @return size
	 **/
	@Schema(description = "")

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Vehicle variant(String variant) {
		this.variant = variant;
		return this;
	}

	/**
	 * Get variant
	 * 
	 * @return variant
	 **/
	@Schema(description = "")

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	public Vehicle color(String color) {
		this.color = color;
		return this;
	}

	/**
	 * Get color
	 * 
	 * @return color
	 **/
	@Schema(description = "")

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Vehicle energyType(String energyType) {
		this.energyType = energyType;
		return this;
	}

	/**
	 * Get energyType
	 * 
	 * @return energyType
	 **/
	@Schema(description = "")

	public String getEnergyType() {
		return energyType;
	}

	public void setEnergyType(String energyType) {
		this.energyType = energyType;
	}

	public Vehicle registration(String registration) {
		this.registration = registration;
		return this;
	}

	/**
	 * Get registration
	 * 
	 * @return registration
	 **/
	@Schema(description = "")

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Vehicle vehicle = (Vehicle) o;
		return Objects.equals(this.category, vehicle.category) && Objects.equals(this.capacity, vehicle.capacity)
				&& Objects.equals(this.make, vehicle.make) && Objects.equals(this.model, vehicle.model)
				&& Objects.equals(this.size, vehicle.size) && Objects.equals(this.variant, vehicle.variant)
				&& Objects.equals(this.color, vehicle.color) && Objects.equals(this.energyType, vehicle.energyType)
				&& Objects.equals(this.registration, vehicle.registration);
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, capacity, make, model, size, variant, color, energyType, registration);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Vehicle {\n");

		sb.append("    category: ").append(toIndentedString(category)).append("\n");
		sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
		sb.append("    make: ").append(toIndentedString(make)).append("\n");
		sb.append("    model: ").append(toIndentedString(model)).append("\n");
		sb.append("    size: ").append(toIndentedString(size)).append("\n");
		sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
		sb.append("    color: ").append(toIndentedString(color)).append("\n");
		sb.append("    energyType: ").append(toIndentedString(energyType)).append("\n");
		sb.append("    registration: ").append(toIndentedString(registration)).append("\n");
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

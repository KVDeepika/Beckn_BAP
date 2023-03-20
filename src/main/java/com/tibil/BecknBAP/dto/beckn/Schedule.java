package com.tibil.BecknBAP.dto.beckn;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Describes a schedule
 */
@Schema(description = "Describes a schedule")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class Schedule {
	@JsonProperty("frequency")
	private String frequency = null;

	@JsonProperty("holidays")
	@Valid
	private List<OffsetDateTime> holidays = null;

	@JsonProperty("times")
	@Valid
	private List<OffsetDateTime> times = null;

	public Schedule frequency(String frequency) {
		this.frequency = frequency;
		return this;
	}

	/**
	 * Describes duration as per ISO8601 format
	 * 
	 * @return frequency
	 **/
	@Schema(description = "Describes duration as per ISO8601 format")

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public Schedule holidays(List<OffsetDateTime> holidays) {
		this.holidays = holidays;
		return this;
	}

	public Schedule addHolidaysItem(OffsetDateTime holidaysItem) {
		if (this.holidays == null) {
			this.holidays = new ArrayList<OffsetDateTime>();
		}
		this.holidays.add(holidaysItem);
		return this;
	}

	/**
	 * Get holidays
	 * 
	 * @return holidays
	 **/
	@Schema(description = "")
	@Valid
	public List<OffsetDateTime> getHolidays() {
		return holidays;
	}

	public void setHolidays(List<OffsetDateTime> holidays) {
		this.holidays = holidays;
	}

	public Schedule times(List<OffsetDateTime> times) {
		this.times = times;
		return this;
	}

	public Schedule addTimesItem(OffsetDateTime timesItem) {
		if (this.times == null) {
			this.times = new ArrayList<OffsetDateTime>();
		}
		this.times.add(timesItem);
		return this;
	}

	/**
	 * Get times
	 * 
	 * @return times
	 **/
	@Schema(description = "")
	@Valid
	public List<OffsetDateTime> getTimes() {
		return times;
	}

	public void setTimes(List<OffsetDateTime> times) {
		this.times = times;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Schedule schedule = (Schedule) o;
		return Objects.equals(this.frequency, schedule.frequency) && Objects.equals(this.holidays, schedule.holidays)
				&& Objects.equals(this.times, schedule.times);
	}

	@Override
	public int hashCode() {
		return Objects.hash(frequency, holidays, times);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Schedule {\n");

		sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
		sb.append("    holidays: ").append(toIndentedString(holidays)).append("\n");
		sb.append("    times: ").append(toIndentedString(times)).append("\n");
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

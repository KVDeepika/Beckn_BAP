package com.tibil.BecknBAP.dto.beckn;

import java.time.OffsetDateTime;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Describes the cancellation policy of an Order.
 */
@Schema(description = "Describes the cancellation policy of an Order.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class CancellationPolicy {
	@JsonProperty("cancellable")
	private Boolean cancellable = null;

	@JsonProperty("cancel_before")
	private OffsetDateTime cancelBefore = null;

	@JsonProperty("cancellation_fee")
	private Fee cancellationFee = null;

	/**
	 * Gets or Sets feeAppliedOn
	 */
	public enum FeeAppliedOnEnum {
		CURRENT_ORDER("CURRENT-ORDER"),

		NEXT_ORDER("NEXT-ORDER");

		private String value;

		FeeAppliedOnEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static FeeAppliedOnEnum fromValue(String text) {
			for (FeeAppliedOnEnum b : FeeAppliedOnEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("fee_applied_on")
	private FeeAppliedOnEnum feeAppliedOn = null;

	/**
	 * Gets or Sets type
	 */
	public enum TypeEnum {
		FULL("full"),

		PARTIAL("partial");

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

	public CancellationPolicy cancellable(Boolean cancellable) {
		this.cancellable = cancellable;
		return this;
	}

	/**
	 * Get cancellable
	 * 
	 * @return cancellable
	 **/
	@Schema(description = "")

	public Boolean isCancellable() {
		return cancellable;
	}

	public void setCancellable(Boolean cancellable) {
		this.cancellable = cancellable;
	}

	public CancellationPolicy cancelBefore(OffsetDateTime cancelBefore) {
		this.cancelBefore = cancelBefore;
		return this;
	}

	/**
	 * Get cancelBefore
	 * 
	 * @return cancelBefore
	 **/
	@Schema(description = "")

	@Valid
	public OffsetDateTime getCancelBefore() {
		return cancelBefore;
	}

	public void setCancelBefore(OffsetDateTime cancelBefore) {
		this.cancelBefore = cancelBefore;
	}

	public CancellationPolicy cancellationFee(Fee cancellationFee) {
		this.cancellationFee = cancellationFee;
		return this;
	}

	/**
	 * Get cancellationFee
	 * 
	 * @return cancellationFee
	 **/
	@Schema(description = "")

	@Valid
	public Fee getCancellationFee() {
		return cancellationFee;
	}

	public void setCancellationFee(Fee cancellationFee) {
		this.cancellationFee = cancellationFee;
	}

	public CancellationPolicy feeAppliedOn(FeeAppliedOnEnum feeAppliedOn) {
		this.feeAppliedOn = feeAppliedOn;
		return this;
	}

	/**
	 * Get feeAppliedOn
	 * 
	 * @return feeAppliedOn
	 **/
	@Schema(description = "")

	public FeeAppliedOnEnum getFeeAppliedOn() {
		return feeAppliedOn;
	}

	public void setFeeAppliedOn(FeeAppliedOnEnum feeAppliedOn) {
		this.feeAppliedOn = feeAppliedOn;
	}

	public CancellationPolicy type(TypeEnum type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@Schema(description = "")

	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CancellationPolicy cancellationPolicy = (CancellationPolicy) o;
		return Objects.equals(this.cancellable, cancellationPolicy.cancellable)
				&& Objects.equals(this.cancelBefore, cancellationPolicy.cancelBefore)
				&& Objects.equals(this.cancellationFee, cancellationPolicy.cancellationFee)
				&& Objects.equals(this.feeAppliedOn, cancellationPolicy.feeAppliedOn)
				&& Objects.equals(this.type, cancellationPolicy.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cancellable, cancelBefore, cancellationFee, feeAppliedOn, type);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CancellationPolicy {\n");

		sb.append("    cancellable: ").append(toIndentedString(cancellable)).append("\n");
		sb.append("    cancelBefore: ").append(toIndentedString(cancelBefore)).append("\n");
		sb.append("    cancellationFee: ").append(toIndentedString(cancellationFee)).append("\n");
		sb.append("    feeAppliedOn: ").append(toIndentedString(feeAppliedOn)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

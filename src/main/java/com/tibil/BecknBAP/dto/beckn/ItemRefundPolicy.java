package com.tibil.BecknBAP.dto.beckn;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Describes the refund policy of an Item when removed from an order
 */
@Schema(description = "Describes the refund policy of an Item when removed from an order")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class ItemRefundPolicy {
	@JsonProperty("refundable")
	private Boolean refundable = null;

	@JsonProperty("refund_applicable_till")
	private OffsetDateTime refundApplicableTill = null;

	/**
	 * Gets or Sets refundType
	 */
	public enum RefundTypeEnum {
		FULLY_REFUNDABLE("FULLY-REFUNDABLE"),

		PARTLY_REFUNDABLE("PARTLY-REFUNDABLE"),

		VARIABLE_REFUND("VARIABLE-REFUND");

		private String value;

		RefundTypeEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static RefundTypeEnum fromValue(String text) {
			for (RefundTypeEnum b : RefundTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("refund_type")
	private RefundTypeEnum refundType = null;

	/**
	 * Gets or Sets refundAmountType
	 */
	public enum RefundAmountTypeEnum {
		CONSTANT_AMOUNT("CONSTANT-AMOUNT"),

		CONSTANT_PERCENTAGE("CONSTANT-PERCENTAGE"),

		VARIABLE_AMOUNT("VARIABLE-AMOUNT"),

		VARIABLE_PERCENTAGE("VARIABLE-PERCENTAGE");

		private String value;

		RefundAmountTypeEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static RefundAmountTypeEnum fromValue(String text) {
			for (RefundAmountTypeEnum b : RefundAmountTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("refund_amount_type")
	private RefundAmountTypeEnum refundAmountType = null;

	@JsonProperty("refund_amount_value")
	private BigDecimal refundAmountValue = null;

	public ItemRefundPolicy refundable(Boolean refundable) {
		this.refundable = refundable;
		return this;
	}

	/**
	 * Get refundable
	 * 
	 * @return refundable
	 **/
	@Schema(description = "")

	public Boolean isRefundable() {
		return refundable;
	}

	public void setRefundable(Boolean refundable) {
		this.refundable = refundable;
	}

	public ItemRefundPolicy refundApplicableTill(OffsetDateTime refundApplicableTill) {
		this.refundApplicableTill = refundApplicableTill;
		return this;
	}

	/**
	 * Get refundApplicableTill
	 * 
	 * @return refundApplicableTill
	 **/
	@Schema(description = "")

	@Valid
	public OffsetDateTime getRefundApplicableTill() {
		return refundApplicableTill;
	}

	public void setRefundApplicableTill(OffsetDateTime refundApplicableTill) {
		this.refundApplicableTill = refundApplicableTill;
	}

	public ItemRefundPolicy refundType(RefundTypeEnum refundType) {
		this.refundType = refundType;
		return this;
	}

	/**
	 * Get refundType
	 * 
	 * @return refundType
	 **/
	@Schema(description = "")

	public RefundTypeEnum getRefundType() {
		return refundType;
	}

	public void setRefundType(RefundTypeEnum refundType) {
		this.refundType = refundType;
	}

	public ItemRefundPolicy refundAmountType(RefundAmountTypeEnum refundAmountType) {
		this.refundAmountType = refundAmountType;
		return this;
	}

	/**
	 * Get refundAmountType
	 * 
	 * @return refundAmountType
	 **/
	@Schema(description = "")

	public RefundAmountTypeEnum getRefundAmountType() {
		return refundAmountType;
	}

	public void setRefundAmountType(RefundAmountTypeEnum refundAmountType) {
		this.refundAmountType = refundAmountType;
	}

	public ItemRefundPolicy refundAmountValue(BigDecimal refundAmountValue) {
		this.refundAmountValue = refundAmountValue;
		return this;
	}

	/**
	 * Get refundAmountValue
	 * 
	 * @return refundAmountValue
	 **/
	@Schema(description = "")

	@Valid
	public BigDecimal getRefundAmountValue() {
		return refundAmountValue;
	}

	public void setRefundAmountValue(BigDecimal refundAmountValue) {
		this.refundAmountValue = refundAmountValue;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ItemRefundPolicy itemRefundPolicy = (ItemRefundPolicy) o;
		return Objects.equals(this.refundable, itemRefundPolicy.refundable)
				&& Objects.equals(this.refundApplicableTill, itemRefundPolicy.refundApplicableTill)
				&& Objects.equals(this.refundType, itemRefundPolicy.refundType)
				&& Objects.equals(this.refundAmountType, itemRefundPolicy.refundAmountType)
				&& Objects.equals(this.refundAmountValue, itemRefundPolicy.refundAmountValue);
	}

	@Override
	public int hashCode() {
		return Objects.hash(refundable, refundApplicableTill, refundType, refundAmountType, refundAmountValue);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ItemRefundPolicy {\n");

		sb.append("    refundable: ").append(toIndentedString(refundable)).append("\n");
		sb.append("    refundApplicableTill: ").append(toIndentedString(refundApplicableTill)).append("\n");
		sb.append("    refundType: ").append(toIndentedString(refundType)).append("\n");
		sb.append("    refundAmountType: ").append(toIndentedString(refundAmountType)).append("\n");
		sb.append("    refundAmountValue: ").append(toIndentedString(refundAmountValue)).append("\n");
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

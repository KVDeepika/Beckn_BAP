package com.tibil.BecknBAP.dto.beckn;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * ReturnReasonsBody
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class ReturnReasonsBody {
	@JsonProperty("context")
	private Context context = null;

	@JsonProperty("return_reasons")
	@Valid
	private List<Option> returnReasons = null;

	public ReturnReasonsBody context(Context context) {
		this.context = context;
		return this;
	}

	/**
	 * Get context
	 * 
	 * @return context
	 **/
	@Schema(description = "")

	@Valid
	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public ReturnReasonsBody returnReasons(List<Option> returnReasons) {
		this.returnReasons = returnReasons;
		return this;
	}

	public ReturnReasonsBody addReturnReasonsItem(Option returnReasonsItem) {
		if (this.returnReasons == null) {
			this.returnReasons = new ArrayList<Option>();
		}
		this.returnReasons.add(returnReasonsItem);
		return this;
	}

	/**
	 * Get returnReasons
	 * 
	 * @return returnReasons
	 **/
	@Schema(description = "")
	@Valid
	public List<Option> getReturnReasons() {
		return returnReasons;
	}

	public void setReturnReasons(List<Option> returnReasons) {
		this.returnReasons = returnReasons;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ReturnReasonsBody returnReasonsBody = (ReturnReasonsBody) o;
		return Objects.equals(this.context, returnReasonsBody.context)
				&& Objects.equals(this.returnReasons, returnReasonsBody.returnReasons);
	}

	@Override
	public int hashCode() {
		return Objects.hash(context, returnReasons);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReturnReasonsBody {\n");

		sb.append("    context: ").append(toIndentedString(context)).append("\n");
		sb.append("    returnReasons: ").append(toIndentedString(returnReasons)).append("\n");
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

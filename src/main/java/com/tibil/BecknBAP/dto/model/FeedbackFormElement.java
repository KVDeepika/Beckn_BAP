package com.tibil.BecknBAP.dto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * An element in the feedback form. It can be question or an answer to the
 * question.
 */
@Schema(description = "An element in the feedback form. It can be question or an answer to the question.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")

public class FeedbackFormElement {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("parent_id")
	private String parentId = null;

	@JsonProperty("question")
	private String question = null;

	@JsonProperty("answer")
	private String answer = null;

	/**
	 * Specifies how the answer option should be rendered.
	 */
	public enum AnswerTypeEnum {
		RADIO("radio"),

		CHECKBOX("checkbox"),

		TEXT("text");

		private String value;

		AnswerTypeEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static AnswerTypeEnum fromValue(String text) {
			for (AnswerTypeEnum b : AnswerTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("answer_type")
	private AnswerTypeEnum answerType = null;

	public FeedbackFormElement id(String id) {
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

	public FeedbackFormElement parentId(String parentId) {
		this.parentId = parentId;
		return this;
	}

	/**
	 * Get parentId
	 * 
	 * @return parentId
	 **/
	@Schema(description = "")

	@Valid
	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public FeedbackFormElement question(String question) {
		this.question = question;
		return this;
	}

	/**
	 * Specifies the question to which the answer options will be contained in the
	 * child FeedbackFormElements
	 * 
	 * @return question
	 **/
	@Schema(description = "Specifies the question to which the answer options will be contained in the child FeedbackFormElements")

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public FeedbackFormElement answer(String answer) {
		this.answer = answer;
		return this;
	}

	/**
	 * Specifies an answer option to which the question will be in the
	 * FeedbackFormElement specified in parent_id
	 * 
	 * @return answer
	 **/
	@Schema(description = "Specifies an answer option to which the question will be in the FeedbackFormElement specified in parent_id")

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public FeedbackFormElement answerType(AnswerTypeEnum answerType) {
		this.answerType = answerType;
		return this;
	}

	/**
	 * Specifies how the answer option should be rendered.
	 * 
	 * @return answerType
	 **/
	@Schema(description = "Specifies how the answer option should be rendered.")

	public AnswerTypeEnum getAnswerType() {
		return answerType;
	}

	public void setAnswerType(AnswerTypeEnum answerType) {
		this.answerType = answerType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FeedbackFormElement feedbackFormElement = (FeedbackFormElement) o;
		return Objects.equals(this.id, feedbackFormElement.id)
				&& Objects.equals(this.parentId, feedbackFormElement.parentId)
				&& Objects.equals(this.question, feedbackFormElement.question)
				&& Objects.equals(this.answer, feedbackFormElement.answer)
				&& Objects.equals(this.answerType, feedbackFormElement.answerType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, parentId, question, answer, answerType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FeedbackFormElement {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
		sb.append("    question: ").append(toIndentedString(question)).append("\n");
		sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
		sb.append("    answerType: ").append(toIndentedString(answerType)).append("\n");
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

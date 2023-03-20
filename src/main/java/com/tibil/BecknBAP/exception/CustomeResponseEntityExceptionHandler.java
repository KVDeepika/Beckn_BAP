package com.tibil.BecknBAP.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.tibil.BecknBAP.dto.beckn.Ack;
import com.tibil.BecknBAP.dto.beckn.Ack.StatusEnum;
import com.tibil.BecknBAP.dto.beckn.Error;
import com.tibil.BecknBAP.dto.beckn.Error.TypeEnum;
import com.tibil.BecknBAP.dto.beckn.InlineResponse200;
import com.tibil.BecknBAP.dto.beckn.InlineResponse200Message;

@ControllerAdvice
public class CustomeResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

		InlineResponse200 responseObj = new InlineResponse200();
		responseObj.setMessage(new InlineResponse200Message().ack(new Ack().status(StatusEnum.NACK)));
		responseObj.setError(new Error().type(TypeEnum.JSON_SCHEMA_ERROR).message(ex.getFieldError().getDefaultMessage()));
				
		return new ResponseEntity<Object>(responseObj, HttpStatus.BAD_REQUEST);
	}
	
	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(
			HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

		InlineResponse200 responseObj = new InlineResponse200();
		responseObj.setMessage(new InlineResponse200Message().ack(new Ack().status(StatusEnum.NACK)));
		responseObj.setError(new Error().type(TypeEnum.JSON_SCHEMA_ERROR).message(ex.getMessage()));
				
		return new ResponseEntity<Object>(responseObj, HttpStatus.BAD_REQUEST);
	}
	

}

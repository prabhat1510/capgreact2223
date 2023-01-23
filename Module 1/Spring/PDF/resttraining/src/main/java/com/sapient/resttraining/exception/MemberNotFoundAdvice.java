/**
 * 
 */
package com.sapient.resttraining.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author admi
 *
 */
@ControllerAdvice
public class MemberNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(MemberNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String memberNotFoundHandler(MemberNotFoundException ex) {
		return ex.getMessage();
	}
	
	
	@ResponseBody
	@ExceptionHandler(MemberUpdateFailedException.class)
	@ResponseStatus(HttpStatus.NOT_MODIFIED)
	String memberUpdationFailed(MemberUpdateFailedException ex){
		return ex.getMessage();
		
	}
}

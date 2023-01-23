/**
 * 
 */
package com.sapient.resttraining.exception;

/**
 * @author admi
 *
 */
public class MemberNotFoundException extends RuntimeException {

	public MemberNotFoundException(Integer id) {
		super("Could not find member " + id);
	}
}


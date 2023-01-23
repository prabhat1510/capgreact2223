/**
 * 
 */
package com.sapient.resttraining.exception;

/**
 * @author admi
 *
 */
public class MemberUpdateFailedException extends RuntimeException{

	public MemberUpdateFailedException(Integer id) {
		super("Could not update member " + id);
	}
}

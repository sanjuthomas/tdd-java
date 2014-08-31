package com.ourownjava.tdd.mockito.exception;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class DirtyWordsExhaustedException extends Exception {

	private static final long serialVersionUID = 1L;

	public DirtyWordsExhaustedException(final String message){
		super(message);
	}
}

package com.ourownjava.tdd.mockito.exception;

/**
 * 
 * @author Sanju Thomas
 *
 */
public interface DirtyWordService {
	
	public String getADirtyWord() throws DirtyWordsExhaustedException;
}

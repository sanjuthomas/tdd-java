package com.ourownjava.tdd.mockito;

import java.util.Random;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class DirtyWordService {
	
	private static String [] dirtyWords = new String [] {"@#$#$", "F@#$#@$", "S@#$#$", "@#$#$#24", "@#$#$^#!@#"};
	

	public String getADirtyWord() {
		return dirtyWords[randomNumber()];
	}
	
	private int randomNumber() {
	    return new Random().nextInt((4 - 0) + 1) + 0;
	}

	
}

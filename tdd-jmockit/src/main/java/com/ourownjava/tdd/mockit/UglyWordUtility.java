package com.ourownjava.tdd.mockit;

import java.util.Random;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class UglyWordUtility {
	
	private static String [] uglyWords = new String [] {"@#$#$", "F@#$#@$", "S@#$#$", "@#$#$#24", "@#$#$^#!@#"};

	public static String getUglyword() {
		return uglyWords[randomNumber()];
	}
	
	private static int randomNumber() {
	    return new Random().nextInt((4 - 0) + 1) + 0;
	}

}

package com.ourownjava.tdd.mockit;

import java.util.Random;

public class UglyWordService {
	
	private static String [] uglyWords = new String [] {"@#$#$", "F@#$#@$", "S@#$#$", "@#$#$#24", "@#$#$^#!@#"};
	

	public String getAnUglyWord() {
		return uglyWords[randomNumber()];
	}
	
	private int randomNumber() {
	    return new Random().nextInt((4 - 0) + 1) + 0;
	}
}

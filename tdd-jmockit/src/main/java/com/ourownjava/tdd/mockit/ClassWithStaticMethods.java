package com.ourownjava.tdd.mockit;

import java.util.List;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class ClassWithStaticMethods {
	
	private static void privateStaticBehavior(){
		throw new RuntimeException("I am a private static method. Why did you call me?");
	}
	
	public static void publicStaticBehavior(){
		throw new RuntimeException("I am a public static method. Why did you call me?");
	}
	
	private static void privateStaticBehaviorWithArguments(final List<String> tokens){
		for(final char c : "Sanju Thomas".toCharArray()){
			tokens.add(String.valueOf(c));
		}
	}
	
	private static String [] privateStaticBehaviorWithArgumentsAndReturnValue(final String token, final String delimiter){
		return token.split(delimiter);
	}
}

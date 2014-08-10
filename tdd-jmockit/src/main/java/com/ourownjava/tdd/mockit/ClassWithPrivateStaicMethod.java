package com.ourownjava.tdd.mockit;

/**
 * 
 * @author thosan
 *
 */
public class ClassWithPrivateStaicMethod {
	
	private static void staticBehavior(){
		throw new RuntimeException("I am a private static method. Why did you call me?");
	}

}

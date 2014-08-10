package com.ourownjava.tdd.mockit;

import java.util.List;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class ClassWithPrivateMethod {
    
	private void privateMethod(){
		throw new RuntimeException("Private Method is invoked!");
	}
	
	private void populateSomeData(final List<String> listOfString){
		for(char c : "Sanju Thomas".toCharArray()){
			listOfString.add(String.valueOf(c));
		}
	}
	
	private String [] splitUsingDelimiter(final String token, final String delimiter){
		return token.split(delimiter);
	}
}

package com.ourownjava.tdd.jmockit;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class BaseClass {
	
	public BaseClass(final String name){
		throw new IllegalArgumentException(name);
	}
}

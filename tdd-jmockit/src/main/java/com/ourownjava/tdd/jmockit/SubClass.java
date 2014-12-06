package com.ourownjava.tdd.jmockit;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class SubClass extends BaseClass{

	private String name;
	
	public SubClass(final String name) {
		super(name);
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}
	
}

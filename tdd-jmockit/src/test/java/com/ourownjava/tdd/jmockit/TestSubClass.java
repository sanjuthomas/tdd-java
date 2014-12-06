package com.ourownjava.tdd.jmockit;

import static org.junit.Assert.assertEquals;
import mockit.Mocked;

import org.junit.Test;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class TestSubClass {

	private SubClass subClass;
	
	@Test
	public void shouldSetNameUsingConstructorInject(@Mocked final BaseClass baseClass){
		subClass = new SubClass("name");
		assertEquals("name", subClass.getName());
	}	
	
}

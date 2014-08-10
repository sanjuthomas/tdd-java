package com.ourownjava.tdd.jmockit;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import mockit.Deencapsulation;

import org.junit.Before;
import org.junit.Test;

import com.ourownjava.tdd.mockit.ClassWithPrivateMethod;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class TestClassWithPrivateMethod {
	
	private ClassWithPrivateMethod classWithPrivateMethod;
	
	@Before
	public void setUp(){
		classWithPrivateMethod = new ClassWithPrivateMethod();
	}
	
	@Test(expected = RuntimeException.class)
	public void shouldInvokePrivateMethod(){
		Deencapsulation.invoke(classWithPrivateMethod, "privateMethod", new Object[]{});
	}
	
	@Test
	public void shouldInvokePrivateMethodWithParameter(){
		final List<String> someDate =  new ArrayList<String>();
		Deencapsulation.invoke(classWithPrivateMethod, "populateSomeData", someDate);
		assertEquals(12, someDate.size());
	}
	
	@Test
	public void shouldInvokePrivateMethodWithParametersThatReturnsSomething(){
		final String [] tokens = Deencapsulation.invoke(classWithPrivateMethod, "splitUsingDelimiter", new Object[] {"Sanju Thomas", " "});
		assertEquals(2, tokens.length);
		assertEquals("Sanju", tokens[0]);
		assertEquals("Thomas", tokens[1]);
	}
}

package com.ourownjava.tdd.jmockit;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import mockit.Deencapsulation;

import org.junit.Test;

import com.ourownjava.tdd.mockit.ClassWithStaicMethods;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class TestClassWithPrivateStaticMethod {

	@Test(expected = RuntimeException.class)
	public void shouldInvokePrivateStaticMethod(){
		Deencapsulation.invoke(ClassWithStaicMethods.class, "privateStaticBehavior", new Object[] {});
	}
	
	@Test(expected = RuntimeException.class)
	public void shouldInvokePublicStaticMethod(){
		Deencapsulation.invoke(ClassWithStaicMethods.class, "publicStaticBehavior", new Object[] {});
	}
	
	@Test
	public void shouldInvokePrivateStaticMethodWithArguments(){
		final List<String> tokens = new ArrayList<String>();
		Deencapsulation.invoke(ClassWithStaicMethods.class, "privateStaticBehaviorWithArguments", tokens);
		assertEquals(12, tokens.size());
	}
	
	@Test
	public void shouldInvokePrivateStaticMethodWithArgumentsAndReturnValue(){
		final String [] tokens = Deencapsulation.invoke(ClassWithStaicMethods.class, 
				"privateStaticBehaviorWithArgumentsAndReturnValue", new Object[] {"Sanju Thomas", " "});
		assertEquals(2, tokens.length);
		assertEquals("Sanju", tokens[0]);
		assertEquals("Thomas", tokens[1]);
	}
}

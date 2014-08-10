package com.ourownjava.tdd.jmockit;

import mockit.Deencapsulation;

import org.junit.Test;

import com.ourownjava.tdd.mockit.ClassWithPrivateStaicMethod;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class TestClassWithPrivateStaticMethod {

	@Test(expected = RuntimeException.class)
	public void shouldInvokePriateStaticMethod(){
		Deencapsulation.invoke(ClassWithPrivateStaicMethod.class, "staticBehavior", new Object[] {});
	}
	
}

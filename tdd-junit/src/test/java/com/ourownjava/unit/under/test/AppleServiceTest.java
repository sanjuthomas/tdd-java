package com.ourownjava.unit.under.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ourownjava.model.Apple;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class AppleServiceTest {
	
	private AppleService appleService;
	
	@Before
	public void setUp(){
		appleService = new AppleService();
	}
	
	@Test
	public void shouldGet100ApplesBadAssertion(){
		final List<Apple> apples = appleService.getApple(100);
		assertNotNull(apples);
	}
	
	@Test
	public void shouldGet100ApplesBadAssertion1(){
		final List<Apple> apples = appleService.getApple(100);
		assertTrue(apples.size() > 0);
	}
	
	@Test
	public void shouldGet100ApplesGoodAssertion(){
		final List<Apple> apples = appleService.getApple(100);
		assertEquals(100, apples.size());
	}
}

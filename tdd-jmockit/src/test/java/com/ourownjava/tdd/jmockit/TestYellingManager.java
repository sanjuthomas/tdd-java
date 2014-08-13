package com.ourownjava.tdd.jmockit;

import static org.junit.Assert.assertEquals;
import mockit.Mock;
import mockit.MockUp;

import org.junit.Before;
import org.junit.Test;

import com.ourownjava.tdd.mockit.UglyWordUtility;
import com.ourownjava.tdd.mockit.YellingManager;

public class TestYellingManager {

	private YellingManager yellingManager;

	@Before
	public void setUp() {
		yellingManager = new YellingManager();
	}

	@Test
	public void shouldYell() {
		new MockUp<UglyWordUtility>() {
			@Mock
			public String getUglyword() {
				return "Your are a real nice guy";
			}
		};

		final String yell = yellingManager.yell();
		assertEquals("Your are a real nice guy", yell);
	}
}

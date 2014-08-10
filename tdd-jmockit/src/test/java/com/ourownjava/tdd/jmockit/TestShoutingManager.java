package com.ourownjava.tdd.jmockit;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Random;

import mockit.Deencapsulation;
import mockit.Injectable;
import mockit.NonStrictExpectations;
import mockit.Verifications;

import org.junit.Before;
import org.junit.Test;

import com.ourownjava.tdd.mockit.ShoutingManager;
import com.ourownjava.tdd.mockit.UglyWordService;

public class TestShoutingManager {
	
	private String [] goodWords = new String [] {"You are so nice", "This is an excellent test case", 
			"Good work", "We had an excellent release", "You work really hard"};
	
	private ShoutingManager shoutingManger;
	
	//using @Injectable annotation we are mocking the UglyWordService
	@Injectable
	private UglyWordService uglyWordService;
	
	@Before
	public void setUp(){
		shoutingManger = new ShoutingManager();
		//now we are injecting the mocked UglyWordService to shoutingManger instance
		Deencapsulation.setField(shoutingManger, "uglyWordService", uglyWordService);
	}
	
	//we are now testing the shout behavior of the shouting manger
	//we are smart developers, we mocked shouting manager's UglyWordService
	//and wired a mocked UglyWordService into shoutingManager object.
	@Test
	public void shouldShout(){
		
		new NonStrictExpectations(){{
			uglyWordService.getAnUglyWord();
			returns(goodWords[randomNumber()]);
		}};
		
		final String word = shoutingManger.shout();
		assertTrue(Arrays.asList(goodWords).contains(word));
		
		new Verifications() {{
			uglyWordService.getAnUglyWord();
		}};
	}
	
	
	private int randomNumber(){
		return new Random().nextInt((4 - 0) + 1) + 0;
	}
}

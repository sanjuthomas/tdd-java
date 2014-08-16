package com.ourownjava.tdd.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * 
 * @author Sanju Thomas
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class TestShoutingManager {
	
	@Mock
	private DirtyWordService dirtyWordService;
	
	@InjectMocks
	private ShoutingManager shoutingManager;
	
	//we are mocking the dirtyWordService of the shoutingManager
	//whenever getADirtyWord() method is called on dirtyWordService 
	//it will now return "You are such a nice person" 
	//We are smart developers..The dump manager will now start talking good words.
	@Before
	public void setUp(){
		when(dirtyWordService.getADirtyWord()).thenReturn("You are such a nice persion");
	}
	
	@Test
	public void shouldShout(){
		final String shout = shoutingManager.shout();
		assertEquals("You are such a nice persion", shout);
	}
	
}

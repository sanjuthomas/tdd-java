package com.ourownjava.tdd.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

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
   
	@InjectMocks
	private ShoutingManager shoutingManager;
	
	@Mock
	private DirtyWordService dirtyWordService;
	
	@Before
	public void setUp(){
		initMocks(this);
		when(dirtyWordService.getADirtyWord()).thenReturn("You are such a nice persion");
	}
	
	@Test
	public void shouldShout(){
		final String shout = shoutingManager.shout();
		assertEquals("You are such a nice persion", shout);
	}
	
}

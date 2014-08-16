package com.ourownjava.tdd.mockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class TestShoutingManager {
   
	private ShoutingManager shoutingManager;
	
	@Mock
	private DirtyWordService dirtyWordService;
	
	@Before
	public void setUp(){
		this.shoutingManager = new ShoutingManager();
	}
	
	@Test
	public void shouldShout(){
		
	}
	
}

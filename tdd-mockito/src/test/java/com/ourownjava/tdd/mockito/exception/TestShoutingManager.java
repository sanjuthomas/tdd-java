package com.ourownjava.tdd.mockito.exception;

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
	
	@InjectMocks
	private ShoutingManager shoutingManager;
	
	@Mock
	private DirtyWordService dirtyWordService;
	
	@Before
	public void setUp() throws DirtyWordsExhaustedException{
		when(dirtyWordService.getADirtyWord()).thenThrow(new DirtyWordsExhaustedException("To test the dirty words exhausted exception"));
	}
	
	@Test(expected = DirtyWordsExhaustedException.class)
	public void shouldGetDirtyWordsExhaustedException() throws DirtyWordsExhaustedException{
		shoutingManager.getADirtyWord();
	}

}

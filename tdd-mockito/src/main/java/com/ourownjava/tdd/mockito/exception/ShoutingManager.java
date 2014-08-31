package com.ourownjava.tdd.mockito.exception;

public class ShoutingManager {

	private DirtyWordService dirtyWordService;
	
	public String getADirtyWord() throws DirtyWordsExhaustedException{
		return dirtyWordService.getADirtyWord();
	}

}

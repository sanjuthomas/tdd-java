package com.ourownjava.tdd.mockito;

/**
 * @author Sanju Thomas
 *
 */
public class ShoutingManager {
    
	private DirtyWordService dirtyWordService;
	
	/**
	 * 
	 * @return
	 */
	public String shout(){
		return dirtyWordService.getADirtyWord();
	}
	
	
}

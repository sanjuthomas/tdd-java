package com.ourownjava.tdd.mockit;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class ShoutingManager {

	private UglyWordService uglyWordService;
	
	
	public String shout(){
		return uglyWordService.getAnUglyWord();
	}
}

package com.ourownjava.tdd.mockito.exception;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class DirtyWordService {

	private static final Byte MAXIMUM_DIRTY_WORDS_PER_DAY = 5;
	
	private Byte dirtyWordCount = 0;
	
	private String [] dirtyWords = new String [] {"@#$SFS!@#", "@#$#^$%s", "%^&^&!2s", "@#$^*(!d", "&*(*(@d"};
	
	public String getADirtyWord() throws DirtyWordsExhaustedException{
		if(dirtyWordCount < MAXIMUM_DIRTY_WORDS_PER_DAY){
			dirtyWordCount ++;
			return dirtyWords[dirtyWordCount - 1];	
		}
		throw new DirtyWordsExhaustedException("No more dirty word, you may create another instance of mine!");
	}
}

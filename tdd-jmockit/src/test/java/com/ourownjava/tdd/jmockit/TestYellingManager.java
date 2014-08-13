package com.ourownjava.tdd.jmockit;

import mockit.Mock;
import mockit.MockUp;

import com.ourownjava.tdd.mockit.UglyWordUtility;

public class TestYellingManager {
	
	 public void shouldYell(){
			new MockUp<UglyWordUtility>()
			{
				@Mock
				public String isEventDispatchThread()
				{
					return "Your are a real nice guy"; 
				}
			};
				
			
	 }
}

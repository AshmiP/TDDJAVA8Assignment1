package com.yash.Vowels;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VowelsTest  {

    private Vowels vowels = new Vowels();
	 
	@Test
	public void shouldCountNumberOfVowelsInString() {
		
		Integer expectedCount = 2;
		
		Integer actualCount = vowels.countVowels("Hello");
	
	    assertEquals(expectedCount,actualCount);
	}
}

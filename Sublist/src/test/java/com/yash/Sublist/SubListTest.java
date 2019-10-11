package com.yash.Sublist;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SubListTest  {
	
	private SubList sublist = new SubList();
	
	@Test
	public void shouldCreateSublistFromGivenList() {
		
		List<Integer> expectedSublist = Arrays.asList(60,70,80,90,11);
		
		List<Integer> actualSublist = sublist.createSubList(5,10,Arrays.asList(10,20,30,40,50,60,70,80,90,11,22,33));
		
		assertEquals(expectedSublist, actualSublist);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void shouldThrowSublistFromGivenList() {
		
		List<Integer> expectedSublist = Arrays.asList(60,70,80,90,11);
		
		List<Integer> actualSublist = sublist.createSubList(5,15,Arrays.asList(10,20,30,40,50,60,70,80,90,11,22,33));
		
		assertEquals(expectedSublist, actualSublist);
	}
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowIllegalSublistFromGivenList() {
		
		List<Integer> expectedSublist = Arrays.asList(60,70,80,90,11);
		
		List<Integer> actualSublist = sublist.createSubList(15,1,Arrays.asList(10,20,30,40,50,60,70,80,90,11,22,33));
		
		assertEquals(expectedSublist, actualSublist);
	}

}

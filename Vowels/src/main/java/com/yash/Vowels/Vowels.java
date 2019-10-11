package com.yash.Vowels;

public class Vowels {

	public Integer countVowels(String str) {	
		return str.replaceAll("[^AaEeIiOoUu]", "").length();
	}
}

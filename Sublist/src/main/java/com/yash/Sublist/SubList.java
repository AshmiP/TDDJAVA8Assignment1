package com.yash.Sublist;

import java.util.List;

public class SubList {

	public List<Integer> createSubList(int startIndex, int endIndex, List<Integer> originalList) {

		return originalList.subList(startIndex, endIndex);
	}

}

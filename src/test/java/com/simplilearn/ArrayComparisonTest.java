package com.simplilearn;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ArrayComparisonTest {
	
	
	@Test
	void testIntegerArrayEquality() {
		int[] expected = {1,2,3,4,5,6};
		int[] actual = {1,2,3,4,5,6};
		assertArrayEquals(expected, actual,"The integer array should be equal");
	}
	
	@Test
	void testArrayEqualityWithDifferentOrder() {
		int[] expected = {1,2,3,4,5};
		int[] actual = {5,4,3,2,1};
		
		assertArrayEquals(expected, actual,"The integer array should not be equal and the order is different");
	}
	
	@Test
	void testStringArrayEquality() {
		String[] expected = {"hello","world"};
		String[] actual = {"hello","world"};
		assertArrayEquals(expected,actual,"The string array should be equals");
	}
}

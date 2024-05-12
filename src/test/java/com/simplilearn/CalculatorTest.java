package com.simplilearn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private Calculator calculator;
	
	@BeforeEach
	public void setup() {
		calculator = new Calculator();
	}
	@Test
	public void testAddition() {
		assertEquals(10, calculator.add(7, 3));
		
	}
	
	@Test
	public void testSubtraction() {
		assertEquals(4, calculator.subtract(7,3));
	}
}

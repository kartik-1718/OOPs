package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.demo.Calculator;

public class CalculatorTest {

	@Test
	@DisplayName("Adding 2 Numbers ")
	public void testAddMethod() {
		Calculator calc = new Calculator() ;
			int sum = calc.add(10,100);
			assertEquals(110,sum);
			System.out.println("The Total Sum Is : "+sum);
		}
	

@Test
@DisplayName("Subtracting  2 Numbers ")
public void testSubMethod() {
	Calculator calc = new Calculator() ;
		int subtract = calc.sub(10,100);
		assertEquals(-90,subtract);
		System.out.println("The Subtracted value is  Is : "+subtract);
	}



@Test
@DisplayName("Multiplying 2 Numbers ")
public void testProductMethod() {
	Calculator calc = new Calculator() ;
		int prod = calc.product(10,100);
		assertEquals(1000,prod);
		System.out.println("The Product Is : "+prod);
	}
}





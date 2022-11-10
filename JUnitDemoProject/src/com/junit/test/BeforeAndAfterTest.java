package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.demo.Calculator;

class BeforeAndAfterTest {

	
	Calculator calc;
	
	@BeforeEach
	public void init() {
		calc = new Calculator();
		System.out.println("This is printed before each method");
	}
	@Test
	@DisplayName("Adding 2 Numbers ")
	public void testAddMethod() {
	
			int sum = calc.add(10,100);
			assertEquals(110,sum);
			System.out.println("The Total Sum Is : "+sum);
		}
	@AfterEach
	public void after() {
		System.out.println("This is printed after each method");
	}
	

@Test
@DisplayName("Subtracting  2 Numbers ")
public void testSubMethod() {

		int subtract = calc.sub(10,100);
		assertEquals(-90,subtract);
		System.out.println("The Subtracted value is  Is : "+subtract);
	}



@Test
@DisplayName("Multiplying 2 Numbers ")
public void testProductMethod() {
	
		int prod = calc.product(10,100);
		assertEquals(1000,prod);
		System.out.println("The Product Is : "+prod);
	}
}

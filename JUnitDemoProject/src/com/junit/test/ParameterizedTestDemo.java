package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestDemo {
	
	
	
		//--------value source---------------------
	@ParameterizedTest(name="{index} -Run with the args = {0}")
	@ValueSource(ints= {1,3,5,7})
		public void valueSourceTest(int args) {
		System.out.println(args);
	}

	//------------Enum Source--------------------
	enum TV{
		Lg,Samsung,Sony;
	}
	
	@ParameterizedTest
	@EnumSource(TV.class)
	public void enumSourceTest(TV tv) {
		System.out.println(tv);
	}
	
	public static String [] cars() {
		return new String[] {"Maruti,Honda,TAta"};
	}
	
	@ParameterizedTest
	@MethodSource("cars")
	public void methodSourceTest(String cars) {
		System.out.println(cars);
	}
	
	@ParameterizedTest
	@CsvSource({"ABC","BHK","GHU","JHU"})
	public void csvSourceTest(String name) {
		System.out.println(name);
	}
	
	
}

package com.devhandson;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddNumbersTest {

	@Test
	public void addNum() {
		AddNumbers add= new AddNumbers();
		assertEquals(10,add.addNumbers(5, 5));
		
	}
	public void subtractNum() {
		AddNumbers add= new AddNumbers();
		assertEquals(5,add.addNumbers(10, 5));
		
	}

}

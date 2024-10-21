package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	void addtest() {
		assertEquals(5,Calculator.add(2, 3));

	}
	
	@Test
	void subtest() {
		assertEquals(5,Calculator.sub(8, 3));

	}

}

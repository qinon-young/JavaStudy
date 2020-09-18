package com.qinon.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import com.qinon.demo.*;

class CalculatorlTest {

	@Test
	void testAdd() {
		Calculatorl c=new Calculatorl();
		int result=c.add(2, 5);
		Assert.assertEquals(result, 7);
	}

	@Test
	void testMinus() {
		fail("Not yet implemented");
	}

	@Test
	void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	void testDivide() {
		fail("Not yet implemented");
	}

}

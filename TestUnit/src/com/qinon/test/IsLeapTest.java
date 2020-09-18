package com.qinon.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.qinon.demo.IsLeap;

class IsLeapTest {

	@Test
	void testIsleap01() {
		IsLeap isLeap=new IsLeap();
		int result= isLeap.isleap(1999);
		Assert.assertEquals(result, 0);
	}
	
	@Test
	void testIsleap02() {
		IsLeap isLeap=new IsLeap();
		int result= isLeap.isleap(2000);
		Assert.assertEquals(result, 1);
	}
	
	@Test
	void testIsleap03() {
		IsLeap isLeap=new IsLeap();
		int result= isLeap.isleap(1000);
		Assert.assertEquals(result, 0);
	}
	
	@Test
	void testIsleap04() {
		IsLeap isLeap=new IsLeap();
		int result= isLeap.isleap(1996);
		Assert.assertEquals(result, 1);
	}

}

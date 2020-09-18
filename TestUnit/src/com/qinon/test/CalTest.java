package com.qinon.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.qinon.demo.Cal;

import junit.framework.Assert;

class CalTest {


	@Test
	void testAdd() {
		Assert.assertEquals(2, Cal.add(1, 1));
	}

}

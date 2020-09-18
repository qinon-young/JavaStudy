package com.qinon.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.qinon.demo.NextDate;

import junit.framework.Assert;

class NextDateTest {

	@SuppressWarnings("deprecation")
	@Test
	void testNextDate01() {
		String result=NextDate.nextDate("2020��4��1��");
		System.out.println(result);
		Assert.assertEquals(result, "2020��4��2��");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate02() {
		String result=NextDate.nextDate("2020��4��30��");
		System.out.println(result);
		Assert.assertEquals(result, "2020��5��1��");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate03() {
		String result=NextDate.nextDate("2020��4��31��");
		System.out.println(result);
		Assert.assertEquals(result, "�������������");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate04() {
		String result=NextDate.nextDate("2020��1��1��");
		System.out.println(result);
		Assert.assertEquals(result, "2020��1��2��");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate05() {
		String result=NextDate.nextDate("2020��1��31��");
		System.out.println(result);
		Assert.assertEquals(result, "2020��2��1��");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate06() {
		String result=NextDate.nextDate("2020��12��1��");
		System.out.println(result);
		Assert.assertEquals(result, "2020��12��1��");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate07() {
		String result=NextDate.nextDate("2020��12��31��");
		System.out.println(result);
		Assert.assertEquals(result, "2021��1��1��");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate08() {
		String result=NextDate.nextDate("2020��2��1��");
		System.out.println(result);
		Assert.assertEquals(result, "2020��2��2��");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate09() {
		String result=NextDate.nextDate("2020��2��28��");
		System.out.println(result);
		Assert.assertEquals(result, "2020��2��29��");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate10() {
		String result=NextDate.nextDate("2019��2��28��");
		System.out.println(result);
		Assert.assertEquals(result, "2019��3��1��");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate11() {
		String result=NextDate.nextDate("2020��2��29��");
		System.out.println(result);
		Assert.assertEquals(result, "2020��3��1��");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate12() {
		String result=NextDate.nextDate("2019��2��29��");
		System.out.println(result);
		Assert.assertEquals(result, "�������������");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate13() {
		String result=NextDate.nextDate("2020��2��30��");
		System.out.println(result);
		Assert.assertEquals(result, "�������������");
	}

	
}

package com.qinon.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.qinon.demo.NextDate;

import junit.framework.Assert;

class NextDateTest {

	@SuppressWarnings("deprecation")
	@Test
	void testNextDate01() {
		String result=NextDate.nextDate("2020年4月1日");
		System.out.println(result);
		Assert.assertEquals(result, "2020年4月2日");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate02() {
		String result=NextDate.nextDate("2020年4月30日");
		System.out.println(result);
		Assert.assertEquals(result, "2020年5月1日");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate03() {
		String result=NextDate.nextDate("2020年4月31日");
		System.out.println(result);
		Assert.assertEquals(result, "输入的日期有误！");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate04() {
		String result=NextDate.nextDate("2020年1月1日");
		System.out.println(result);
		Assert.assertEquals(result, "2020年1月2日");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate05() {
		String result=NextDate.nextDate("2020年1月31日");
		System.out.println(result);
		Assert.assertEquals(result, "2020年2月1日");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate06() {
		String result=NextDate.nextDate("2020年12月1日");
		System.out.println(result);
		Assert.assertEquals(result, "2020年12月1日");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate07() {
		String result=NextDate.nextDate("2020年12月31日");
		System.out.println(result);
		Assert.assertEquals(result, "2021年1月1日");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate08() {
		String result=NextDate.nextDate("2020年2月1日");
		System.out.println(result);
		Assert.assertEquals(result, "2020年2月2日");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate09() {
		String result=NextDate.nextDate("2020年2月28日");
		System.out.println(result);
		Assert.assertEquals(result, "2020年2月29日");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate10() {
		String result=NextDate.nextDate("2019年2月28日");
		System.out.println(result);
		Assert.assertEquals(result, "2019年3月1日");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate11() {
		String result=NextDate.nextDate("2020年2月29日");
		System.out.println(result);
		Assert.assertEquals(result, "2020年3月1日");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate12() {
		String result=NextDate.nextDate("2019年2月29日");
		System.out.println(result);
		Assert.assertEquals(result, "输入的日期有误！");
	}
	@SuppressWarnings("deprecation")
	@Test
	void testNextDate13() {
		String result=NextDate.nextDate("2020年2月30日");
		System.out.println(result);
		Assert.assertEquals(result, "输入的日期有误！");
	}

	
}

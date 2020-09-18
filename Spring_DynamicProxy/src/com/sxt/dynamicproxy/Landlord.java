package com.sxt.dynamicproxy;

public class Landlord implements Rent{

	@Override
	public void rent() {
		System.out.println("房屋出租");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("收取房租");
	}

}

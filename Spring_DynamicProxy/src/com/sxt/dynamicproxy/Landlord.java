package com.sxt.dynamicproxy;

public class Landlord implements Rent{

	@Override
	public void rent() {
		System.out.println("���ݳ���");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("��ȡ����");
	}

}

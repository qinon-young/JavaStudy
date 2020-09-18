package com.sxt.dynamicproxy;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		
		 Landlord landlord=new Landlord(); ProxyInvocationHandler pihHandler=new
		 ProxyInvocationHandler(); pihHandler.setTarget(landlord); Rent
		 rent=(Rent)pihHandler.getProxy(); rent.rent(); rent.charge();
		
		 pihHandler.setTarget(new ArrayList());
		 List list=(List)pihHandler.getProxy();
		 list.add("22");
	}
}

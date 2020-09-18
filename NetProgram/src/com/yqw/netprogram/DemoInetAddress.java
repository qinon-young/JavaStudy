package com.yqw.netprogram;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class DemoInetAddress {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InetAddress localaAddress=InetAddress.getLocalHost();
		InetAddress  remoteAddress=InetAddress.getByName("www.baidu.com");
		System.out.println(localaAddress.getHostAddress());
		System.out.println(remoteAddress.getHostAddress());
		System.out.println(remoteAddress.isReachable(3000));
		System.out.println(remoteAddress.getHostName());
	}

}

package com.yqw.netprogram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket client=new DatagramSocket(3000);
		String string="Hello!";
		DatagramPacket packet=new DatagramPacket(string.getBytes(), 
					string.getBytes().length,InetAddress.getByName("localhost"),8900);
		System.out.println("sender message...");
		client.send(packet);
		client.close();
	}

}

package com.yqw.netprogram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket server=new DatagramSocket(8900);
		byte[] buf=new byte[1024];
		DatagramPacket packet=new DatagramPacket(buf, buf.length);
		System.out.println("waiting receiver data...");
		while(true) {
			server.receive(packet);
			String string=new String(packet.getData(),0,packet.getLength());
			System.out.println(packet.getAddress()+":"+packet.getPort()+
							"  :  "+string);
		}
	}

}

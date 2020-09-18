package com.yqw.netprogram.chatroom;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.Buffer;

public class ChatReceiver implements Runnable{
	private DatagramSocket server;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			byte[] buf=new byte[1024];
			DatagramPacket packet=new DatagramPacket(buf, buf.length);
			while(true) {
				server.receive(packet);
				String string=new String(packet.getData(),0,packet.getLength());
				System.out.println("Receiver: "+packet.getAddress()+
						":"+packet.getPort()+"  :  "+string);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public ChatReceiver(DatagramSocket server) {
		super();
		this.server = server;
	}
	
}

package com.yqw.netprogram.chatroom;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSend implements Runnable{
	private DatagramSocket client;
	private int targetPort;
	public ChatSend(DatagramSocket client, int targetPort) {
		super();
		this.client = client;
		this.targetPort = targetPort;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		while(true) {
			try {
				String data=scanner.nextLine();
				byte[] buf=data.getBytes();
				DatagramPacket packet=new DatagramPacket(buf, buf.length,
						InetAddress.getByName("127.0.0.255"),targetPort
						);
				client.send(packet);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
	
}

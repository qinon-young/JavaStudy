package com.yqw.netprogram.chatroom;

import java.net.DatagramSocket;
import java.util.Scanner;

public class ChatRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("please input port for char_server:");
		int serverPort=scanner.nextInt();
		System.out.println("please input port for target:");
		int targetPort=scanner.nextInt();
		System.out.println("Char Room initialize success and start!");
		try {
			DatagramSocket socket=new DatagramSocket(serverPort);
			
			new Thread(new ChatReceiver(socket),"Receiver server").start();
			new Thread(new ChatSend(socket, targetPort),"Send server").start();;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

package com.yqw.netprogram.tcp;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadTCPServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket serverSocket=new ServerSocket(7788);
		while(true) {
			Socket client=serverSocket.accept();
			System.out.println("connect client success,start to interchange data");
			OutputStream os=client.getOutputStream();
			os.write(("server response to client ").getBytes());
			Thread.sleep(5000);
			os.close();
			client.close();
		}
	}

}

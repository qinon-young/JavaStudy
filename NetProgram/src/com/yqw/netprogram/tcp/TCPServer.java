package com.yqw.netprogram.tcp;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket serverSocket=new ServerSocket(7788);
		while(true) {
			Socket client=serverSocket.accept();
			Thread thread=new Thread(() ->{
				try {
					int port=client.getPort();
					System.out.println("connect client_port:"+port +" success,start to interchange data");
					OutputStream os=client.getOutputStream();
					os.write(("server response to client ").getBytes());
					Thread.sleep(5000);
					os.close();
					client.close();
				} catch (Exception e) {
					// TODO: handle exception
				}	
			});
			thread.start();
		}
	}

}

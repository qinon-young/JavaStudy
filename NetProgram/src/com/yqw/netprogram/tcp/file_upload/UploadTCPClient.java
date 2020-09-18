package com.yqw.netprogram.tcp.file_upload;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class UploadTCPClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket client=new Socket(InetAddress.getLocalHost(),10001);
		OutputStream out=client.getOutputStream();
		FileInputStream fis=new FileInputStream("C:\\Users\\yqw\\Desktop\\java\\IODemo\\temp.png");
		byte[] buf=new byte[1024];
		int len=0;
		System.out.println("connect to server,start upload files");
		while((len=fis.read(buf))!=-1) {
			out.write(buf,0,len);
		}
		
		client.shutdownOutput();
		InputStream is=client.getInputStream();
		byte[] bufMsg=new byte[1024];
		int len2=is.read(bufMsg);
		while((len2)!=-1) {
			System.out.println(new String(bufMsg,0,len2));
			len2=is.read(bufMsg);
		}
		out.close();
		is.close();
		fis.close();
		client.close();
	}
	

}

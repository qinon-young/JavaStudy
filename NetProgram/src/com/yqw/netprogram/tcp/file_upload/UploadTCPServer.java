package com.yqw.netprogram.tcp.file_upload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadTCPServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket serverSocket=new ServerSocket(10001);
		while(true) {
			Socket client=serverSocket.accept();
			new Thread(new ServerThread(client)).start();
		}
	}

}
class ServerThread implements Runnable{
	private Socket sock;
	public ServerThread(Socket sock) {
		super();
		this.sock = sock;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String ip=sock.getInetAddress().getHostAddress();
		int count=1;
		try {
			File parentFile=new File("C:\\Users\\yqw\\Desktop\\java\\NetProgram\\upload");
			if(!parentFile.exists()) {
				parentFile.mkdir();
			}
			File file=new File(parentFile,ip+"("+count+").png");
			while(file.exists()) {
				file=new File(parentFile,ip+"("+count+++").png");
			}
			InputStream in=sock.getInputStream();
			FileOutputStream fos=new FileOutputStream(file);
			byte[] buf=new byte[1024];
			int len=0;
			while((len=in.read(buf))!=-1) {
				fos.write(buf,0,len);
			}
			OutputStream out=sock.getOutputStream();
			out.write("upload success!".getBytes());
			in.close();
			fos.close();
			sock.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}

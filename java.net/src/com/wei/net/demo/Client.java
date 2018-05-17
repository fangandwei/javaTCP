package com.wei.net.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//使用java包中的java.net.socket实现客户端的功能

public class Client {
	
   public static void main(String[] args) {
	   try {
		//建立连接
		//连接本地的10000端口
		Socket socket1=new Socket("127.0.0.1", 10000);
		//数据交互
		//得到两个流对象
		OutputStream outputStream = socket1.getOutputStream();
		InputStream is = socket1.getInputStream();
//		向服务器发送hello
		outputStream.write("helloServer".getBytes());
		//接收服务器传过来的数据,打印在控制台上
		is = socket1.getInputStream();
        byte[] b = new byte[1024];
        int n = is.read(b);
        System.out.println("服务器对咱们发过去的hello数据给出的反馈是"+new String(b,0,n));
		/*byte [] b=new byte [1024];
		int len=0;
		while((len=inputStream.read(b))!=-1){
		     System.out.println("服务器对咱们发过去的hello数据给出的反馈是"+new String(b,0,len));
		}
	*/
		//关闭连接
		is.close();
		outputStream.close();
		socket1.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   
	   
	   
	   
	   
	   
	   
}	

}

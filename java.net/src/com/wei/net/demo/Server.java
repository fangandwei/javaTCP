package com.wei.net.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) {
		
		try {
			//注册端口监听
			ServerSocket ss=new ServerSocket(10000);
			//获得连接
			Socket socket = ss.accept();
			//交换数据
			InputStream in = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            os.write("hello ".getBytes());
            byte [] b=new byte[1024];
            int len;
            while((len=in.read(b))!=-1){
            	System.out.println("客户端发过来的数据是："+new String(b, 0, len));
            }
           
			//关闭连接
            in.close();
            os.close();
            socket.close();
            ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
    
}

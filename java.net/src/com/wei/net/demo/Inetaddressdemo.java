package com.wei.net.demo;

import java.io.IOException;
import java.net.InetAddress;

//学习java网络编程Inetaddress类的使用
public class Inetaddressdemo {
	
   public static void main(String[] args) throws IOException {
	
	   InetAddress iad=InetAddress.getByName("www.baidu.com");
	   //iad代表的是域名加/后面加ip地址
	   System.out.println(iad);
	   InetAddress in2=InetAddress.getByName("127.0.0.1");
	   System.out.println(in2);
	   InetAddress inet3=InetAddress.getLocalHost();
       System.out.println(inet3);//PC-201805061650/192.168.1.42
       String host =inet3.getHostName();
       System.out.println("域名："+host);//域名：PC-201805061650
       String ip=inet3.getHostAddress();
       System.out.println("IP:"+ip);//IP:192.168.1.42
	   
	   
	   
	   
	   
	   
	   
}	
	

}

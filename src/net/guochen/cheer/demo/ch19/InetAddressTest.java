package net.guochen.cheer.demo.ch19;

import java.net.InetAddress;

public class InetAddressTest {
	public static void main(String[] args)throws Exception{
		
		InetAddress local=InetAddress.getLocalHost();
		
		System.out.println(local.getHostAddress());
		System.out.println(local.getCanonicalHostName());
		
		InetAddress remoteliujian=InetAddress.getByName("VA9SDNDJSUEZ1P6");
		//已知局域网刘建主机名，获取刘建IP地址
		System.out.println(remoteliujian.getHostAddress());
		
	}

}

package net.guochen.cheer.excrcise.ch19;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class MyHost {
	public static void main(String [] args) {
		InetAddress ip=null;
		
		try {
			ip=InetAddress.getByName("PC133");
			System.out.println("������:"+ip.getHostName());
			System.out.println("����IP��ַ:"+ip.getHostAddress());
			System.out.println("����IP��ַ:"+InetAddress.getLocalHost().getHostAddress());
		}catch(UnknownHostException e) {
			e.printStackTrace();
			
		}
	}
	
}
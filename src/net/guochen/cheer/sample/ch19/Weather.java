package net.guochen.cheer.sample.ch19;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.Socket;

public class Weather extends Thread { //创建类，该类为多线程执行程序、
	String weather="节目预报:八点有大型晚会，请收听";
	int port =9898;  //定义端口
	InetAddress iaddress= null;  //创建InetAddress对象
	MulticastSocket socket=null;//声明多点广播套接字
	Weather(){ //构造方法
		try{
			iaddress=InetAddress.getByName("224.255.10.0");
			socket=new MulticastSocket(port);//实例化多点广播套接字
			socket.setTimeToLive(1);//指定发送范围是本地网络
			socket.joinGroup(iaddress);//加入广播组
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void run(){
		DatagramPacket packet=null;
		byte data[]=weather.getBytes();
		packet=new DatagramPacket(data,data.length,iaddress,port);
		System.out.println(new String(data));
		try{
			socket.send(packet);
			sleep(3000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

public static void main(String [] args){
	Weather w=new Weather();
	w.start();
    }
}
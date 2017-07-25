package net.guochen.cheer.sample.ch19;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.Socket;

public class Weather extends Thread { //�����࣬����Ϊ���߳�ִ�г���
	String weather="��ĿԤ��:�˵��д�����ᣬ������";
	int port =9898;  //����˿�
	InetAddress iaddress= null;  //����InetAddress����
	MulticastSocket socket=null;//�������㲥�׽���
	Weather(){ //���췽��
		try{
			iaddress=InetAddress.getByName("224.255.10.0");
			socket=new MulticastSocket(port);//ʵ�������㲥�׽���
			socket.setTimeToLive(1);//ָ�����ͷ�Χ�Ǳ�������
			socket.joinGroup(iaddress);//����㲥��
			
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
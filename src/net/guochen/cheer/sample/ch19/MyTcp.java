package net.guochen.cheer.sample.ch19;

import java.io.*;
import java.net.*;

public class MyTcp {
	private BufferedReader reader;
	private ServerSocket server;
	private Socket socket;
	void getserver(){
		try{
			server=new ServerSocket(8998);//ʵ����socket����
			System.out.println("�������׽����Ѿ������ɹ�");//�����Ϣ
			while (true){    //����׽���������״̬
				System.out.println("�ȴ��ͻ���������");//�����Ϣ
				socket=server.accept();   //ʵ����socket����
				reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				//ʵ����BufferedReader����
				getClietMessage();//����getClientMessage()����
			}
		}catch(Exception e){
			e.printStackTrace();   //����쳣��Ϣ
		}
	}
	private void getClietMessage(){
		
		try{
			while(true){    //����׽���������״̬
				System.out.println("�ͻ���:"+reader.readLine());//��ÿͻ�����Ϣ
			}
		}catch(Exception e){
			e.printStackTrace(); // ����쳣��Ϣ
		}
		try{
			if(reader!=null){
				reader.close();//�ر���
				
			}
			if(socket!=null){
				socket.close();//�ر��׽���
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void main(String[]args){
		MyTcp tcp=new MyTcp();
		tcp.getserver();
	}
}

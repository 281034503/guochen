package net.guochen.cheer.sample.ch15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example_01 {
	public static void main(String[]args){
		try{
			FileOutputStream fs=new FileOutputStream("F:/javalianxi/word1.txt");
			//����FileOutputStream����
			DataOutputStream ds=new DataOutputStream(fs);
			//����DataOutputStream����
			ds.writeUTF("ʹ��writeUFT()����д������,");  //д������ļ�����
			ds.writeChars("ʹ��writeChars()����д������,");
			ds.writeBytes("ʹ��writeBytes()����д������.");
			ds.close();   //�����ر�
			
			FileInputStream fis=new FileInputStream("F:/javalianxi/word1.txt");
			//����FileInputStream
			DataInputStream dis=new DataInputStream(fis);
			//����DataInputStream
			
			System.out.println(dis.readUTF());    //���ļ��������
		
		}catch (Exception e){
			e.printStackTrace();   //����쳣��Ϣ
		}
	}

}

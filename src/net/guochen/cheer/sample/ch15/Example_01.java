package net.guochen.cheer.sample.ch15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example_01 {
	public static void main(String[]args){
		try{
			FileOutputStream fs=new FileOutputStream("F:/javalianxi/word1.txt");
			//创建FileOutputStream对象
			DataOutputStream ds=new DataOutputStream(fs);
			//创建DataOutputStream对象
			ds.writeUTF("使用writeUFT()方法写入数据,");  //写入磁盘文件数据
			ds.writeChars("使用writeChars()方法写入数据,");
			ds.writeBytes("使用writeBytes()方法写入数据.");
			ds.close();   //将流关闭
			
			FileInputStream fis=new FileInputStream("F:/javalianxi/word1.txt");
			//创建FileInputStream
			DataInputStream dis=new DataInputStream(fis);
			//创建DataInputStream
			
			System.out.println(dis.readUTF());    //将文件数据输出
		
		}catch (Exception e){
			e.printStackTrace();   //输出异常信息
		}
	}

}

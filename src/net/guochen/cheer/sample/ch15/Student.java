package net.guochen.cheer.sample.ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Student {
	public static void main(String[] args){
		String content[]={"�þò���","�������","����ϵ","�þúþ�"};   
		File file=new File("F:/javalianxi/world.txt");//�����ļ�����
		try{
			FileWriter fw=new FileWriter(file);  //����FileWriter�����
			BufferedWriter bufw=new BufferedWriter(fw);
			for(int k=0;k<content.length;k++){  //ѭ����������
				bufw.write(content[k]);   //���ַ��������е�Ԫ��д�뵽�����ļ���
				bufw.newLine();  //�������еĵ���Ԫ���Ե��е���ʽд���ļ�
			}
			bufw.close();//��BufferedWriter���ر�
			fw.close(); //��FileWriter���ر�
			
		}catch(Exception e){   //�����쳣
			e.printStackTrace();
			
		}
		try{
			FileReader fr=new FileReader(file);  //����FileReader�����
			BufferedReader bufr=new BufferedReader(fr);
			String s=null;   //�����ַ�������
			int i=0;       //����int�ͱ���
			while((s=bufr.readLine())!=null){
				i++;    //����������������
				System.out.println("��"+i+"��"+s);   //����ļ�����
			}
			bufr.close();  //��FileReader���ر�
			fr.close();  //��FileReader���ر�
		}catch(Exception e){   //�����쳣
			e.printStackTrace();
			
		}
	}

}

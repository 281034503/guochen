package net.guochen.cheer.sample.ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTest2 {
	public static void main(String[] args){
		File file=new File("F:/javalianxi/word.txt");   //�����ļ�����
		try{    //��׽�쳣
			FileOutputStream out=new FileOutputStream(file);
			//����FileOutputStream����
			byte buy[]="����һֻСë¿���Ҵ���Ҳ���".getBytes();
			//����byte������
			out.write(buy);  //�������е���Ϣд�뵽�ļ���
			out.close();    //�����ر�
		}catch(Exception e){   //catch��䴦���쳣��Ϣ
			e.printStackTrace();
		}
		try{    
			FileInputStream in=new FileInputStream(file);
			//����FileInputStream�����
			byte byt[]=new byte[1024];   //����byte������
			int len=in.read(byt);    //���ļ��ж�ȡ��Ϣ
			System.out.println("�ļ��е���Ϣ�ǣ�"+new String(byt,0,len));
			in.close();   //�ر���
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}

}

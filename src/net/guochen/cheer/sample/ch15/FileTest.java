package net.guochen.cheer.sample.ch15;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file=new File("F:/javalianxi/Word.txt");   //�����ļ�����
		if(file.exists()){        //������ļ�����
			file.delete();       //���ļ�ɾ��
			System.out.println("�ļ���ɾ��");     //�������ʾ��Ϣ
		}else {                       //����ļ�������
			try{            //try���鲶׽���ܳ��ֵ��쳣
				file.createNewFile();    //���ļ�����
				System.out.println("�ļ��Ѵ���");   //�������ʾ��Ϣ
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}

}
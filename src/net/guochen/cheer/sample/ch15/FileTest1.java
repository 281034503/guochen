package net.guochen.cheer.sample.ch15;

import java.io.File;

public class FileTest1 {
	public static void main(String[] args){
		File file=new File("F:/javalianxi/word.txt");   //�����ļ�����
		if(file.exists()){     //����ļ�����
			String name=file.getName();   //��ȡ�ļ�����
			long length=file.length();    //��ȡ�ļ�����
			boolean hidden=file.isHidden();    //�ж��ļ��Ƿ�Ϊ�����ļ�
			System.out.println("�ļ�����:"+name);
			System.out.println("���ļ������ǣ�"+length);
			System.out.println("���ļ��������ļ���"+hidden);
		}else{    //����ļ�������
			System.out.println("���ļ�������");    //�����Ϣ
			
		}
	}

}

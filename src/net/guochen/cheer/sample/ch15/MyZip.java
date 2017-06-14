package net.guochen.cheer.sample.ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class MyZip {
	private void zip(String zipFileName,File inputFile)throws Exception{
		ZipOutputStream out=new ZipOutputStream(new FileOutputStream(zipFileName));
		//����ZipOutputStream�����
		zip(out,inputFile,"");   //���÷���
		System.out.println("ѹ����...");   //�����Ϣ
		out.close();   //�����ر�
	}
	private void zip(ZipOutputStream out,File f,String base)throws Exception{
		//��������
		if(f.isDirectory()){   //���Դ˳���·������ʾ���ļ��Ƿ�Ϊһ��Ŀ¼
			File[]fl=f.listFiles();   //��ȡ·������
			if(base.length()!=0){
				out.putNextEntry(new ZipEntry(base+"/"));
				for(int i=0;i<fl.length;i++){
					//ѭ�����������е��ļ�
					zip(out,fl[i],base+fl[i]);
				}
			}else{
				out.putNextEntry(new ZipEntry(base));
				//�����µĽ����
				FileInputStream in=new FileInputStream(f);
				 //����FileInputDtream����
				int b;      //����int����
				System.out.println(base);
				while((b=in.read())!=-1){    //���û�е�������β��
					out.write(b);   //���ֽ�д�뵱ǰZIP��Ŀ
				}
			in.close();    //�ر���
			
		}
	}

}
	
	public static void main(String[]temp){
		MyZip book=new MyZip();   //������������
		try{
			book.zip("F:/javalianxi/Word45.zip", new File("F:/javalianxi/Word.txt"));
             //���÷���������Ϊѹ������ļ���Ҫѹ�����ļ�
			System.out.println("ѹ�����");   //�����Ϣ
			
		}catch(Exception ex){
			
		}
	}
}
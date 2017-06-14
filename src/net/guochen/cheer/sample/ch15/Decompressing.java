package net.guochen.cheer.sample.ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import org.omg.CORBA_2_3.portable.OutputStream;

/*public class Decompressing {
	public static void main(String[]temp){
		File file=new File("F:/javalianxi/Word45.zip");
		ZipInputStream zin;
		try{
			ZipFile zipFile=new ZipFile(file);
			zin=new ZipInputStream(new FileInputStream(file));
			ZipEntry entry=zin.getNextEntry();
			while(((entry=zin.getNextEntry())!=null)&&!entry.isDirectory()){
				File tmp=new File("F:/javalianxi"+entry.getName());
				if(!tmp.exists()){
					tmp.getParentFile().mkdirs();
					FileOutputStream os=new FileOutputStream(tmp);
					InputStream in=zipFile.getInputStream(entry);
					int count=0;
					while((count=in.read())!=-1){
						os.write(count);
					}
					os.close();
					in.close();
				}
			}zin.closeEntry();
			System.out.println(entry.getName()+"��ѹ�ɹ�");
		zin.close();
	}catch(Exception e)  {
		e.printStackTrace();
	  }

	}
}   */




public class Decompressing { // �����ļ�
	public static void main(String[] temp) {
		ZipInputStream zin; // ����ZipInputStream����
		try {      // try��䲶����ܷ������쳣
			zin = new ZipInputStream(new FileInputStream("F:/javalianxi/Word45.zip"));
			 // ʵ��������ָ��Ҫ���н�ѹ���ļ�
			ZipEntry entry = zin.getNextEntry(); // ��ȡ��һ��ZipEntry
			while (((entry = zin.getNextEntry()) != null)&& !entry.isDirectory()) {
				// ���entry��Ϊ�գ�������ͬһĿ¼��
				File file = new File("F:/javalianxi" + entry.getName()); // ��ȡ�ļ�Ŀ¼
				System.out.println(file);
				if (!file.exists()) { // ������ļ�������
					file.mkdirs();// �����ļ������ļ���
					file.createNewFile(); // �����ļ�
				}
				zin.closeEntry(); // �رյ�ǰentry
				System.out.println(entry.getName() + "��ѹ�ɹ�");
			}
			zin.close();   // �ر���
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

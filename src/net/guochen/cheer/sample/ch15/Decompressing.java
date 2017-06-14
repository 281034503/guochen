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
			System.out.println(entry.getName()+"解压成功");
		zin.close();
	}catch(Exception e)  {
		e.printStackTrace();
	  }

	}
}   */




public class Decompressing { // 创建文件
	public static void main(String[] temp) {
		ZipInputStream zin; // 创建ZipInputStream对象
		try {      // try语句捕获可能发生的异常
			zin = new ZipInputStream(new FileInputStream("F:/javalianxi/Word45.zip"));
			 // 实例化对象，指明要进行解压的文件
			ZipEntry entry = zin.getNextEntry(); // 获取下一个ZipEntry
			while (((entry = zin.getNextEntry()) != null)&& !entry.isDirectory()) {
				// 如果entry不为空，并不在同一目录下
				File file = new File("F:/javalianxi" + entry.getName()); // 获取文件目录
				System.out.println(file);
				if (!file.exists()) { // 如果该文件不存在
					file.mkdirs();// 创建文件所在文件夹
					file.createNewFile(); // 创建文件
				}
				zin.closeEntry(); // 关闭当前entry
				System.out.println(entry.getName() + "解压成功");
			}
			zin.close();   // 关闭流
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

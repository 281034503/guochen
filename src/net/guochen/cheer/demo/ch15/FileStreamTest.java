package net.guochen.cheer.demo.ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreamTest {
	public static void main(String[] agrs) throws Exception{
		File f=new File("E:/BaiduYunDownload/a1");
		FileOutputStream out=new FileOutputStream(f);
		String content="_Welcome  ‰»Î ‰≥ˆ";
		out.write(content.getBytes());
		out.flush();
		out.close();
		
		FileInputStream in=new FileInputStream(f);
		byte[]_content=new byte[in.available()];
		in.read(_content);
		
		String readConcent=new String(_content);
		
		System.out.println(readConcent);
		in.close();
		
	}

}

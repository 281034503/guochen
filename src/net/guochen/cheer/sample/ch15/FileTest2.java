package net.guochen.cheer.sample.ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTest2 {
	public static void main(String[] args){
		File file=new File("F:/javalianxi/word.txt");   //创建文件对象
		try{    //捕捉异常
			FileOutputStream out=new FileOutputStream(file);
			//创建FileOutputStream对象
			byte buy[]="我有一只小毛驴，我从来也不骑。".getBytes();
			//创建byte型数组
			out.write(buy);  //将数组中的信息写入到文件中
			out.close();    //将流关闭
		}catch(Exception e){   //catch语句处理异常信息
			e.printStackTrace();
		}
		try{    
			FileInputStream in=new FileInputStream(file);
			//创建FileInputStream类对象
			byte byt[]=new byte[1024];   //创建byte型数组
			int len=in.read(byt);    //从文件中读取信息
			System.out.println("文件中的信息是："+new String(byt,0,len));
			in.close();   //关闭流
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}

}

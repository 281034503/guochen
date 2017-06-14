package net.guochen.cheer.sample.ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class MyZip {
	private void zip(String zipFileName,File inputFile)throws Exception{
		ZipOutputStream out=new ZipOutputStream(new FileOutputStream(zipFileName));
		//创建ZipOutputStream类对象
		zip(out,inputFile,"");   //调用方法
		System.out.println("压缩中...");   //输出信息
		out.close();   //将流关闭
	}
	private void zip(ZipOutputStream out,File f,String base)throws Exception{
		//方法重载
		if(f.isDirectory()){   //测试此抽象路径名表示的文件是否为一个目录
			File[]fl=f.listFiles();   //获取路径数组
			if(base.length()!=0){
				out.putNextEntry(new ZipEntry(base+"/"));
				for(int i=0;i<fl.length;i++){
					//循环变量数组中的文件
					zip(out,fl[i],base+fl[i]);
				}
			}else{
				out.putNextEntry(new ZipEntry(base));
				//创建新的进入点
				FileInputStream in=new FileInputStream(f);
				 //创建FileInputDtream对象
				int b;      //定义int变量
				System.out.println(base);
				while((b=in.read())!=-1){    //如果没有到达流的尾部
					out.write(b);   //将字节写入当前ZIP条目
				}
			in.close();    //关闭流
			
		}
	}

}
	
	public static void main(String[]temp){
		MyZip book=new MyZip();   //创建本例对象
		try{
			book.zip("F:/javalianxi/Word45.zip", new File("F:/javalianxi/Word.txt"));
             //调用方法，参数为压缩后的文件与要压缩的文件
			System.out.println("压缩完成");   //输出信息
			
		}catch(Exception ex){
			
		}
	}
}
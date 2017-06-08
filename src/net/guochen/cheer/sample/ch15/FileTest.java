package net.guochen.cheer.sample.ch15;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file=new File("F:/javalianxi/Word.txt");   //创建文件对象
		if(file.exists()){        //如果该文件存在
			file.delete();       //将文件删除
			System.out.println("文件已删除");     //输出的提示信息
		}else {                       //如果文件不存在
			try{            //try语句块捕捉可能出现的异常
				file.createNewFile();    //该文件存在
				System.out.println("文件已创建");   //输出的提示信息
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}

}

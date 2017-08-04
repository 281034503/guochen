package net.guochen.cheer.excrcise.ch15;

import java.io.FileInputStream;

import javax.swing.ProgressMonitorInputStream;

public class Student {
	public static void main(String [] args) {
		byte b[]=new byte[2];
		try {
			FileInputStream fis=new FileInputStream("D:/word.txt");
			ProgressMonitorInputStream in=new ProgressMonitorInputStream(null,"¶ÁÈ¡ÎÄ¼þ",fis);
			while(in.read(b)!=-1) {
				String s=new String(b);
				System.out.print(s);
				Thread.sleep(100);
			}
		}catch (Exception e) {
				e.printStackTrace();
			}
		
	}

}

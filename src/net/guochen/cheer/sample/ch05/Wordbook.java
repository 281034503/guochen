package net.guochen.cheer.sample.ch05;

public class Wordbook {     //创建类
	public static void main(String[] args){    //主方法
		
		String str=new String("b");   //定义字符串
		
		String str2=new String("a");   //定义字符串
		
		String str3=new String("c");   //定义字符串
		
		System.out.println(str+"compareTo"+str2+":"+str.compareTo(str2));
		//将str1与str2比较的结果输出
		System.out.println(str+"compareTo"+str3+":"+str.compareTo(str3));
		//将str1与str2比较的结果输出
	}

}

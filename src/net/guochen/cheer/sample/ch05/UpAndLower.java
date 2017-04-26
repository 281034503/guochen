package net.guochen.cheer.sample.ch05;

public class UpAndLower {    //创建类
	public static void main(String[] args){    //主方法
		String str=new String("abc DEF");  //创建字符串str
		String newstr=str.toLowerCase();    //把str转化为小写
		String newstr2=str.toUpperCase();   //把str转化为大写
		System.out.println(newstr);         //输出转化后的小写
		System.out.println(newstr2);       //输出转化后的大写
	}

}

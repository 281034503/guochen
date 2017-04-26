package net.guochen.cheer.sample.ch05;

public class Blak {    //创建类
	public static void main(String[] args){    //主方法
		String str="    Java    class";   //定义字符串
		System.out.println("字符串原来的长度："+str.length());
		//输出字符串原来的长度
		System.out.println("去掉空格后的长度："+str.trim().length());
		//输出去掉字符串最前面和最后面的空格
	}

}

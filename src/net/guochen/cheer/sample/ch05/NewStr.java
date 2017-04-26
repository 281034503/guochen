package net.guochen.cheer.sample.ch05;

public class NewStr {    //创建类
	public static void main(String[] args){    //主方法
		String str="address";    //字符串定量
		String newstr=str.replace("a","A");  //把字符串中的a替换成A，并返回给newstr
		System.out.println(newstr);  //输出替换后的newstr信息
	}

}

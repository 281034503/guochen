package net.guochen.cheer.sample.ch12;

public class Thundering {     //创建类
	public static void main(String[] agrs){    //主方法
		String str="lili";     //定义字符创
		System.out.println(str+"年龄是：");    //输出的提示信息
		int age=Integer.parseInt("20L");     //数据类型的转换，将字符串转换为整数，20L会报错
		System.out.println(age);    //输出信息
		
	}

}

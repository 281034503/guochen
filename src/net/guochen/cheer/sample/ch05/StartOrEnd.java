package net.guochen.cheer.sample.ch05;

public class StartOrEnd {
	public static void main(String[] args){
		String num1="22045612";   //定义字符串num1
		String num2="21304578";    //定于字符串num2
		boolean b=num1.startsWith("22");   //判断字符串num1是否以22开头
		boolean b2=num1.endsWith("78");   //判断字符串num1是否以78结束
		boolean b3=num2.startsWith("22");  //判断字符串num2是否以22开头
		boolean b4=num2.endsWith("78");    //判断字符串num2是否以78结束
		System.out.println("字符串num1是以22开头的吗"+b);
		System.out.println("字符串num1是以78结束的吗"+b2);
		System.out.println("字符串num2是以22开头的吗"+b3);
		System.out.println("字符串num2是以78结束的吗"+b4);
		
		
	}

}

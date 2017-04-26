package net.guochen.cheer.sample.ch05;

public class Opinion {   //创建类
	public static void main(String[] args){   //主方法
		
		String s1=new String("abc");    //创建字符串对象s1
		
		String s2=new String("ABC");    //创建字符串对象s2
		
		String s3=new String("abc");     //创建字符串对象s3
		
		boolean b=s1.equals(s2);        //使用equals（）方法比较s1和S2是否相等
		
		boolean b2=s1.equalsIgnoreCase(s2);
		//使用equalslgnoreCase()方法比较s1和s2是否相等
		System.out.println(s1 + " equals " + s2+":" + b);
		//输出s1对比s2的结果
		System.out.println(s1+" equalslgnoreCase "+s2+":"+b2);
		//输出s1对比s2的结果
		
		
	}

}

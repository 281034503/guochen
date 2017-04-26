package net.guochen.cheer.sample.ch05;

public class Division {   //创建类
   public static void main(String[] args){    //主方法
	   String str="192.168.0.1";    //创建字符串
	   
	   String[]firstArray=str.split("\\.");
	   //按照"."进行分割，使用转义字符"\\.
	   
	   String[]secondArray=str.split("\\.",2);
	   //按照"."进项两次分割，使用转义字符"\\."
	   
	   System.out.println("str的原值为:["+str+"]");
	   //输出str原值
	   
	   System.out.print("全部分割的结果： ");
	   //输出全部分割结果
	   
	   for (String a:firstArray){
		   System.out.print("["+a+"]");
	   }
	   System.out.println();   //换行
	   
	   System.out.print("分割两次的结果: ");
	   //输出分割两次的结果
	   for (String a:secondArray){
		   System.out.print("["+a+"]");
	   }
	   System.out.println();
	   }
   }



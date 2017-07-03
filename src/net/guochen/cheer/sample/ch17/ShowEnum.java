package net.guochen.cheer.sample.ch17;

import net.guochen.cheer.sample.ch17.ConstantsTest.Constants2;

public class ShowEnum {
	enum Constans2{  //将常量放置在枚举类型中
		Constant_A,constan_B
	}
	//循环由values()方法返回数组
	public static void main(String [] args){
		
		for(int i=0;i<Constants2.values().length;i++){
			System.out.println("枚举类型成员变量："+Constants2.values()[i]);
			//将枚举成员变量打印
		}
		
	}

}

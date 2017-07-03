package net.guochen.cheer.sample.ch17;

import net.guochen.cheer.sample.ch17.EnumMethodTest.Constants2;

public class EnumindexTest {
	enum Constant2{   //将常量放置在枚举类型中
		Constant_A,Constant_B,Constants_C
		}
	public static void main(String[]args){
		for(int i=0;i<Constants2.values().length;i++){
			
			System.out.println(Constants2.values()[i]+"在枚举类型中位置索引值"
			    +Constants2.values()[i].ordinal());
		    //在循环中获取枚举类型成员的索引位置
		
		}
		
	}

}

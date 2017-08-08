package net.guochen.cheer.excrcise.ch17;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class UseCase1 {
	
	enum Constants2{   //将常量放置在枚举类型中
		Constants_A,Constants_B
	}	
	public static void doit2(Constants2 c) {
		//定义一个方法，这里的参数为枚举类型对象
		switch(c) {// 根据枚举类型对象做不同操作
		case Constants_A:
			System.out.println("doit2() Constans_A");
			break;
		case Constants_B:
			System.out.println("doit2() Constans_B");
			break;
			
		}
	}
	
	public static void main(String [] args) {
		UseCase1.doit2(Constants2.Constants_A);
		UseCase1.doit2(Constants2.Constants_B);
	}

}

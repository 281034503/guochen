package net.guochen.cheer.sample.ch07;

public class StaticTest {
	final static double PI=3.1415;     //在类中定义静态常量
	static int id;      //在类中定义静态变量
	
	public static void method1(){    //在类中定义静态方法
		//do Something
	}
	
	public void method2(){
		System.out.println(StaticTest.PI);     //调用静态常量
		System.out.println(StaticTest.id);  //调用静态变量
		StaticTest.method1();    //调用静态方法
	}

}

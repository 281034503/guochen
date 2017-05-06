package net.guochen.cheer.sample.ch07;

public class Stctictest {
	
	static Stctictest instance = new Stctictest();   //自行添加
	
	static double PI=3.1415;   //在类中定义静态常量
	static int id;             //在类中定义静态变量
	public static void method1(){   //在类中定义静态方法
		//do Something
	}
	public static void method2(){      //在类中定义一个非静态方法
		System.out.println(Stctictest.PI);     //调用静态常量
		System.out.println(Stctictest.id);    //调用静态变量
		StaticTest.method1();      // //调用静态方法
	}
	public static Stctictest method3(){    //在类中定义一个静态方法
		method2();      //调用非静态方法
		return instance;     //在return语句中使用this关键字
	}  

}

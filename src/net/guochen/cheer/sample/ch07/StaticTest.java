package net.guochen.cheer.sample.ch07;

public class StaticTest {
	final static double PI=3.1415;     //�����ж��徲̬����
	static int id;      //�����ж��徲̬����
	
	public static void method1(){    //�����ж��徲̬����
		//do Something
	}
	
	public void method2(){
		System.out.println(StaticTest.PI);     //���þ�̬����
		System.out.println(StaticTest.id);  //���þ�̬����
		StaticTest.method1();    //���þ�̬����
	}

}

package net.guochen.cheer.sample.ch07;

public class Stctictest {
	
	static Stctictest instance = new Stctictest();   //�������
	
	static double PI=3.1415;   //�����ж��徲̬����
	static int id;             //�����ж��徲̬����
	public static void method1(){   //�����ж��徲̬����
		//do Something
	}
	public static void method2(){      //�����ж���һ���Ǿ�̬����
		System.out.println(Stctictest.PI);     //���þ�̬����
		System.out.println(Stctictest.id);    //���þ�̬����
		StaticTest.method1();      // //���þ�̬����
	}
	public static Stctictest method3(){    //�����ж���һ����̬����
		method2();      //���÷Ǿ�̬����
		return instance;     //��return�����ʹ��this�ؼ���
	}  

}

package com.lzw;
interface Outinterface{     //����һ���ӿ�
	Object outinter = null;

	public void f();
}
public class InterfaceInner {
	private static Outinterface outinter;
	public static void main(String[] agrs){
		OuterClass2 out=new OuterClass2();
		
		//ʵ����һ��OuterClass2����
		Outinterface outinter=out.doit();
		//����doit()����������һ��Outinterface�ӿ�
		outinter.f();    //����f()����
	}
}	
	class OuterClass2{
		private class innerClass implements Outinterface{
			innerClass(String s){     //�ڲ��๹�췽��
				System.out.println(s);
			}
			public void f(){   //ʵ�ֽӿ��е�f()����
				System.out.println("�����ڲ����е�f()����");
			}
		}
		public Outinterface doit(){
			//����һ������������ֵ����ΪOutinterface�ӿ�
			return new innerClass("�����ڲ��๹�췽��");
		}
	}



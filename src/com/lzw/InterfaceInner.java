package com.lzw;
interface Outinterface{     //定义一个接口
	Object outinter = null;

	public void f();
}
public class InterfaceInner {
	private static Outinterface outinter;
	public static void main(String[] agrs){
		OuterClass2 out=new OuterClass2();
		
		//实例化一个OuterClass2对象
		Outinterface outinter=out.doit();
		//调用doit()方法，返回一个Outinterface接口
		outinter.f();    //调用f()方法
	}
}	
	class OuterClass2{
		private class innerClass implements Outinterface{
			innerClass(String s){     //内部类构造方法
				System.out.println(s);
			}
			public void f(){   //实现接口中的f()方法
				System.out.println("访问内部类中的f()方法");
			}
		}
		public Outinterface doit(){
			//定义一个方法，返回值类型为Outinterface接口
			return new innerClass("访问内部类构造方法");
		}
	}



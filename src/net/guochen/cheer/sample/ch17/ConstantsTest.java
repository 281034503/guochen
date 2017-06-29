package net.guochen.cheer.sample.ch17;

 interface Constants{     //将常量放置在接口中
	 public static final int Constants_A=1;
	 public static final int Constants_B=12;
	 
	 
 }

public class ConstantsTest {
	enum Constants2{    //将常量放置在枚举类型中
		Constants_A,Constatants_B
	}
	//使用接口定义常量
	public static void doit(int c){   //定义一个方法，这里的参数为int型
		switch(c){      //根据常量的值做不同的操作
		case Constants.Constants_A:
		System.out.println("doit()Constants_A");
		break;
		}
	}
	public static void doit2(Constants2 c){
		//定义一个参数对象是枚举类型的方法
		switch(c){    //根据枚举类型对象做不同操作
		case Constants_A:
		System.out.println("doit2()Constatns_A");
		break;
		case Constatants_B:
		System.out.println("doit2()Constants_B");
		break;
		}
	}
	public static void main(String[] args){
		ConstantsTest.doit(Constants.Constants_A);
		//使用接口中定义的常量
		ConstantsTest.doit2(Constants2.Constants_A);
		//使用枚举中定义的常量
		ConstantsTest.doit2(Constants2.Constatants_B);
		//使用枚举中定义的常量
		ConstantsTest.doit(3);
		//ConstantsTest.doit2(3);
	}
	
	

}

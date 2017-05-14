package com.lzw;
import static java.lang.System.out;
import java.util.Random;
class Test{
	int i=0;
}

public class FinalData {
	static Random rand=new Random();
	private final int VALUE_1=9;    //声明一个final变量
	private static final int VALUE_2=10;     //声明一个final、static常量
	private final Test teat=new Test();    //声明一个final引用
	private Test test2=new Test();       //声明一个不是fianl的引用
	private final static int[]a={1,2,3,4,5,6};    //声明一个定fianl的数组
	private final int i4=rand.nextInt(20);
	private int value2;
	private Test test;
	private static final int i5=rand.nextInt(20);
	public String toString(){
		return i4+""+i5+"";
	}
	
	
	public static void main(String[] agrs){
		FinalData Data=new FinalData();
		Data.test=new Test();
	//可以对指定为final的引用中的成员变量赋值
		//但不能讲定义为final的引用指向其他引用
		
		Data.value2++;
		//不能改变定义为fianl的常量值
		Data.test2=new Test();   //可以将没有定义为fianl的引用指向其他引用
		
		for(int i=0;i<Data.a.length;i++){
			a[i]=9;
			//不能对定义为fianl的数组赋值
		}
		out.println(Data);
		out.println("data2");
		out.print(new FinalData());
		out.print(Data);
	}
		
	

}

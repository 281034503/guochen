package net.guochen.cheer.sample.ch11;

import javafx.animation.ScaleTransition;

public class StaticlnnerClass {
	int x=100;    //非静态成员变量
	static class Inner{     //静态类
		void doitInner(){
			// System.out.println("外部类"+x); //调用外部类的成员变量x
		}
		public static void main(String agrs[]){
			System.out.println("a");
		}
	}

}

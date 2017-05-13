package net.guochen.cheer.sample.ch10;

public class Objectinstance {
	
	public String toString(){      //重写toString()方法		
		return"在"+getClass().getName()+"类中重写toString()方法";		
	}
	public static void main(String[] agrs){
		System.out.println(new Objectinstance());    //打印本类对象
	}

}

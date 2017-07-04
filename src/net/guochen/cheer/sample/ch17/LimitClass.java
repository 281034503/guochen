package net.guochen.cheer.sample.ch17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LimitClass<T extends List> {
	//限制泛型的类型
	public static void main(String[]args){
		LimitClass<ArrayList>I1=new LimitClass<ArrayList>();
		LimitClass<LinkedList>I2=new LimitClass<LinkedList>();
		//可以实例化已经实现List接口的类
		
	}
	

}

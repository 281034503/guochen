package net.guochen.cheer.sample.ch14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Muster {     //创建Muster类
	public static void main(String[] args){
		Collection<String>list=new ArrayList<>();
		//实例化集合对象
		list.add("a");
		list.add("b");
		list.add("c");
		//向集合添加数据
		Iterator<String>it=list.iterator();
		//创建迭代器
		while(it.hasNext()){
			// 判断是否有下一个元素
			String str=(String)it.next();
			// 获取集合中元素
			System.out.println(str);
		}
	}
}

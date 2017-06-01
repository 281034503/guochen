package net.guochen.cheer.sample.ch14;

import java.util.ArrayList;
import java.util.List;

public class Gather {
	public static void main(String[] args){
		List<String> list=new ArrayList<>();   //创建集合对象
		list.add("a");      //想集合添加元素
		list.add("b");
		list.add("c");
		int i=(int)(Math.random()*list.size());   //获取list之间的随机数
		System.out.println("随机获取数组的元素："+list.get(i));
		
		list.remove(2);  //将制定索引位置的元素从集合中移除
		
		System.out.println("将索引是'2'的元素从数组移除后,数组中的元素是:");
		
		for(int j=0;j<list.size();j++){
			//循环遍历集合
			
			System.out.println(list.get(j));
			
		}
	}

}

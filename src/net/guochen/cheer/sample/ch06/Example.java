package net.guochen.cheer.sample.ch06;

import java.util.Arrays;    //调用java.util.Arrays

public class Example {     //创建类
	public static void main(String[] args){    //主方法
		int ia[]=new int[]{1,8,9,4,5};     //创建一维int数组，长度为5，初始化数组
		Arrays.sort(ia);     //将数组进行排序
		int index=Arrays.binarySearch(ia,4);   //查找数组ia中元素的索引位置
		System.out.println("4的索引位置是:"+index);    //将索引输出
		
			
	}
}

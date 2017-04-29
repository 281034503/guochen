package net.guochen.cheer.sample.ch06;

import java.util.Arrays;    //导入java.util.Arrays类

public class Rakel {    //创建类
	
	public static void main(String[] args){     //主方法
		
		String str[]=new String[]{"ab","cd","ef"};     //定义字符串数组
		
		Arrays.sort(str);     //将数组排序
		
		int index=Arrays.binarySearch(str, 0,2,"cd");     //搜索索引位置0到2之前的元素cd的索引位置
		
		System.out.print("cd的索引位置是: "+index);   //将索引输出
	}

}

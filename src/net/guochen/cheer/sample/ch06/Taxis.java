package net.guochen.cheer.sample.ch06;

import java.util.Arrays;

public class Taxis {      //创建类
	public static void main(String[] args){    //主方法
		int arr[]=new int[]{23,42,12,8};    //创建一维数组长度为4，并赋值
		Arrays.sort(arr);    //将数组进行排序   ，，只能升序不能降序
		for(int i=0;i<arr.length;i++){     //循环遍历排序后的数组
			System.out.println(arr[i]);    //将排序后数组中的各个元素输出
		}
		
	}

}

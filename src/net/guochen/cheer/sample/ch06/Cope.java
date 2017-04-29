package net.guochen.cheer.sample.ch06;

import java.util.Arrays;   //导入java.util.Arrays类

public class Cope {       //创建类
	public static void main(String[] args){      //主方法
		int arr[]=new int[]{23,42,12};      //创建int型数组，长度为3的一维数组
		int newarr[]=Arrays.copyOf(arr,5);     //复制arr数组值给newarr数组，长度为5
		for(int i=0;i<newarr.length;i++){     //循环变量后输出
			System.out.println(newarr[i]);   //输出newarr数组的内容，原数组长度为3，复制后长度为5，不足的补0
		}
			
		}
}

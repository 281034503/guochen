package net.guochen.cheer.sample.ch06;

import java.util.Arrays;

public class Repeat {     //创建类
	public static void mian(String[] args){     //主方法
		
		int arr[]=new int[]{29,45,32,94,8};    //创建一维数组，长度为5，初始值
		
		int newarr[]=Arrays.copyOfRange(arr,0,3);   //复制从0到3索引位置的元素
		
		for(int i=0;i<newarr.length;i++){    
			
			System.out.print(newarr[i]);   
		}
		
	}

}

package net.guochen.cheer.sample.ch06;

import java.util.Arrays;   //导入java.util.Arrays类方法

public class Swap {        //创建类
	public static void main(String[] args){     //主方法
		int arr[]=new int[7];    //创建int型一维数组，长度为5
		Arrays.fill(arr, 8);    //使用同一值对数组进行填满，
		//Arrays.fill 数组填充
		for(int i=0;i<arr.length;i++){    //循环遍历数组中的元素
			System.out.println("第"+ i + "个元素是:" +arr[i]);
			//将数组中的元素依次输出
			
		}
	}

}

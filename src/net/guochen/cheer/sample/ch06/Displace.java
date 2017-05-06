package net.guochen.cheer.sample.ch06;

import java.util.Arrays;    //导入java.util.Arrays类方法

public class Displace {    //创建类
	public static void main(String[] args){    //主方法
		int arr[]=new int[]{45,12,2,10};    //定义一维数组初始化int型数组arr
		Arrays.fill(arr, 1,2,8);    //替换第一个元素的索引到第二个元素的索引的值
        for(int i=0;i<arr.length;i++){    //循环遍历数组中的元素
			
			System.out.println("第"+i+"个元素是:"+arr[i]);
			//将数组中的每个元素输出
		}
		
	}

}

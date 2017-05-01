package net.guochen.cheer.excrcise.ch06;

import java.util.Arrays;

public class Three {
	public static void main(String[] args) {
		String arr[]=new String []{"ff","hh","tt","ee","aa"};
		System.out.println("替换前：");
		for (String arr1:arr) {     //数组arr赋值给arr1
			System.out.print(arr1+"," );    //输出替换前的参数
		}
		Arrays.fill(arr, 2, 3, "bb");   //把数组中索引位置2的参数替换成bb
		System.out.println();     //跳行
		System.out.println("替换后: ");
		for (String arr2:arr){     //替换后的数组赋值给arr2
			System.out.print(arr2+",");
		}
		
	}

}

package net.guochen.cheer.sample.ch06;

public class Matrix {
	public static void main(String[] args) {
		int a[][]=new int[3][4];     //定义二位数组
		
		for(int i=0;i<a.length;i++){   //
			
		for(int j=0;j<a.length;j++){    //循环便利数组中的每个元素
			
			System.out.print(a[i][j]);    //将数组中的元素输出
		}
		System.out.println();		  //输出空格
}  
	}
}

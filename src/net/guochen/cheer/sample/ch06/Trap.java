package net.guochen.cheer.sample.ch06;

public class Trap {     //创建类
	public static void main(String[] args) {    //主方法
		int b[][]=new int[][]{{1},{2,3},{4,5,6}};    //定义二位数组
		for (int k=0;k<b.length;k++){
			for(int c=0;c<b[k].length;c++){    //循环遍历二维数组中的每个元数
				System.out.print(b[k][c]);    //将数组红的元素输出，不换行
			}
			System.out.println();    //输出空格
		}
	}

}

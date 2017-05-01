package net.guochen.cheer.excrcise.ch06;

import java.util.Arrays;

public class Two {
	public static void main(String[] args) {
		int arr[] = new int[] { 4, 8, 2, 6, 12, 9 }; // 创建一维数组
		Arrays.sort(arr); // 对数组进行排序

		for (int i = 0; i < arr.length; i++) { // 循环获取排序后的数组
			System.out.print(arr[i]); // 输出排序后的结果
			System.out.print(",");
		}
		System.out.println(); // 换行
		System.out.print("最小数组为：" + arr[0]); // 输出最小数字

	}
}

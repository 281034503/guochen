package net.guochen.cheer.excrcise.ch06;

import java.util.Arrays;

public class Two {
	public static void main(String[] args) {
		int arr[] = new int[] { 4, 8, 2, 6, 12, 9 }; // ����һά����
		Arrays.sort(arr); // �������������

		for (int i = 0; i < arr.length; i++) { // ѭ����ȡ����������
			System.out.print(arr[i]); // ��������Ľ��
			System.out.print(",");
		}
		System.out.println(); // ����
		System.out.print("��С����Ϊ��" + arr[0]); // �����С����

	}
}

package net.guochen.cheer.excrcise.ch06;

import java.util.Arrays;

public class Three {
	public static void main(String[] args) {
		String arr[]=new String []{"ff","hh","tt","ee","aa"};
		System.out.println("�滻ǰ��");
		for (String arr1:arr) {     //����arr��ֵ��arr1
			System.out.print(arr1+"," );    //����滻ǰ�Ĳ���
		}
		Arrays.fill(arr, 2, 3, "bb");   //������������λ��2�Ĳ����滻��bb
		System.out.println();     //����
		System.out.println("�滻��: ");
		for (String arr2:arr){     //�滻������鸳ֵ��arr2
			System.out.print(arr2+",");
		}
		
	}

}

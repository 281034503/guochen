package net.guochen.cheer.sample.ch06;

import java.util.Arrays;

public class Taxis {      //������
	public static void main(String[] args){    //������
		int arr[]=new int[]{23,42,12,8};    //����һά���鳤��Ϊ4������ֵ
		Arrays.sort(arr);    //�������������   ����ֻ�������ܽ���
		for(int i=0;i<arr.length;i++){     //ѭ����������������
			System.out.println(arr[i]);    //������������еĸ���Ԫ�����
		}
		
	}

}

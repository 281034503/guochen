package net.guochen.cheer.sample.ch06;

import java.util.Arrays;   //����java.util.Arrays�෽��

public class Swap {        //������
	public static void main(String[] args){     //������
		int arr[]=new int[7];    //����int��һά���飬����Ϊ5
		Arrays.fill(arr, 8);    //ʹ��ͬһֵ���������������
		//Arrays.fill �������
		for(int i=0;i<arr.length;i++){    //ѭ�����������е�Ԫ��
			System.out.println("��"+ i + "��Ԫ����:" +arr[i]);
			//�������е�Ԫ���������
			
		}
	}

}

package net.guochen.cheer.sample.ch06;

import java.util.Arrays;   //����java.util.Arrays��

public class Cope {       //������
	public static void main(String[] args){      //������
		int arr[]=new int[]{23,42,12};      //����int�����飬����Ϊ3��һά����
		int newarr[]=Arrays.copyOf(arr,5);     //����arr����ֵ��newarr���飬����Ϊ5
		for(int i=0;i<newarr.length;i++){     //ѭ�����������
			System.out.println(newarr[i]);   //���newarr��������ݣ�ԭ���鳤��Ϊ3�����ƺ󳤶�Ϊ5������Ĳ�0
		}
			
		}
}

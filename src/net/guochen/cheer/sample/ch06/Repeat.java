package net.guochen.cheer.sample.ch06;

import java.util.Arrays;

public class Repeat {     //������
	public static void mian(String[] args){     //������
		
		int arr[]=new int[]{29,45,32,94,8};    //����һά���飬����Ϊ5����ʼֵ
		
		int newarr[]=Arrays.copyOfRange(arr,0,3);   //���ƴ�0��3����λ�õ�Ԫ��
		
		for(int i=0;i<newarr.length;i++){    
			
			System.out.print(newarr[i]);   
		}
		
	}

}

package net.guochen.cheer.sample.ch06;

import java.util.Arrays;    //����java.util.Arrays

public class Example {     //������
	public static void main(String[] args){    //������
		int ia[]=new int[]{1,8,9,4,5};     //����һάint���飬����Ϊ5����ʼ������
		Arrays.sort(ia);     //�������������
		int index=Arrays.binarySearch(ia,4);   //��������ia��Ԫ�ص�����λ��
		System.out.println("4������λ����:"+index);    //���������
		
			
	}
}

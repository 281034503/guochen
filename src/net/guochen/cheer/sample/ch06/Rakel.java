package net.guochen.cheer.sample.ch06;

import java.util.Arrays;    //����java.util.Arrays��

public class Rakel {    //������
	
	public static void main(String[] args){     //������
		
		String str[]=new String[]{"ab","cd","ef"};     //�����ַ�������
		
		Arrays.sort(str);     //����������
		
		int index=Arrays.binarySearch(str, 0,2,"cd");     //��������λ��0��2֮ǰ��Ԫ��cd������λ��
		
		System.out.print("cd������λ����: "+index);   //���������
	}

}

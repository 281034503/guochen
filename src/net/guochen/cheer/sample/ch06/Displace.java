package net.guochen.cheer.sample.ch06;

import java.util.Arrays;    //����java.util.Arrays�෽��

public class Displace {    //������
	public static void main(String[] args){    //������
		int arr[]=new int[]{45,12,2,10};    //����һά�����ʼ��int������arr
		Arrays.fill(arr, 1,2,8);    //�滻��һ��Ԫ�ص��������ڶ���Ԫ�ص�������ֵ
        for(int i=0;i<arr.length;i++){    //ѭ�����������е�Ԫ��
			
			System.out.println("��"+i+"��Ԫ����:"+arr[i]);
			//�������е�ÿ��Ԫ�����
		}
		
	}

}

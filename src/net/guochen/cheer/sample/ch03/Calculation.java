package net.guochen.cheer.sample.ch03;

public class Calculation {       //������
	public static void main(String[] args){
		int a=2;     //��������int�ͱ���a
		int b=5;      //��������int�ͱ���b
		//����boolean�ͱ��������ڱ���Ӧ���߼��������&&����ķ���ֵ
		boolean result=((a>b)&&(a!=b));
		//����boolean�ͱ��������ڱ���Ӧ���߼��������||����ķ���ֵ
		boolean result2=((a>b)||(a!=b));
		System.out.println(result);   //������result���
		System.out.println(result2);   //������result2���
		
		
	}

}

package net.guochen.cheer.sample.ch09;

import java.math.BigInteger;

public class BiglntegerDemo{
	public static void main(String[] agrs){
		
		BigInteger biginstance=new BigInteger("4");   //ʵ����һ��������
	
		System.out.println("�ӷ�������"+biginstance.add(new BigInteger("2")));
		//ȡ�ô����ּ�2�Ĳ���
		
		System.out.println("��������:"+biginstance.subtract(new BigInteger("2")));
		//ȡ�ô����ּ�2�Ĳ���
		
		System.out.println("�˷�����:"+biginstance.multiply(new BigInteger("2")));
		//ȡ�ô����ֳ�2�Ĳ���
		
		System.out.println("��������:"+biginstance.divide(new BigInteger("2")));
		//ȡ�ô����ֳ���2�Ĳ���
		
		System.out.println("ȡ��:"+biginstance.divideAndRemainder(new BigInteger("3"))[0]);
		//ȡ�ô����ֳ���3����
		
		System.out.println("ȡ����:"+biginstance.divideAndRemainder(new BigInteger("3"))[1]);
		//ȡ�ô����ֳ���3������
		
		System.out.println("��2�η�����:"+biginstance.pow(2));
		//ȡ�ô����ֵ�2�η�
		
		System.out.println("ȡ�෴��������"+biginstance.negate());
		//ȡ�ô����ֵ��෴��
	}

}




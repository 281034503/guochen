package net.guochen.cheer.sample.ch17;

import org.apache.poi.ss.formula.functions.T;

public class OverClass <T> {    //���巺����
	private T over;    //���巺�ͳ�Ա����
	public T getOver(){     //����getXXX()����
		return over;
		
	}
	public void setOver(T over){   //����setXXX()����
		this.over=over;
	}
	
	public static void main(String[] args){
		OverClass<Boolean>over1=new OverClass<Boolean>();
		//ʵ����һ��Boolean�͵Ķ���
		OverClass<Float>over2=new OverClass<Float>();
		//ʵ����һ��Float�͵Ķ���
		over1.setOver(true);   //����Ҫ��������ת��
		over2.setOver(12.3f);
		Boolean b=over1.getOver(); //����Ҫ��������ת��
		Float f=over2.getOver();
		System.out.println(b);
		System.out.println(f);
		
		
	}
	
	

}

package net.guochen.cheer.sample.ch09;

import java.text.DecimalFormat;

public class DecimalFormatSimpleDemo {
	//ʹ��ʵ��������ʱ���ø�ʽ��ģʽ
	static public void SimgleFormat(String pattern,double value){
		//ʵ����DecimalFormat����
		DecimalFormat myFormat=new DecimalFormat(pattern);
		String output=myFormat.format(value);    //�����ֽ��и�ʽ��
		System.out.println(value+""+pattern+""+output);
		
	}
	
	//ʹ��applyPattern()���������ֽ��и�ʽ��
	static public void UseApplyPatternMethodFormat(String pattern,double value){
		DecimalFormat myFormat=new DecimalFormat();
		myFormat.applyPattern(pattern);
		System.out
		           .println();
		
		
	}

}

package net.guochen.cheer.sample.ch09;

import java.text.DecimalFormat;

public class DecimalFormatSimpleDemo {
	//ʹ��ʵ��������ʱ���ø�ʽ��ģʽ
	static public void SimgleFormat(String pattern,double value){
		//ʵ����DecimalFormat����
		DecimalFormat myFormat=new DecimalFormat(pattern);
		String output=myFormat.format(value);
		System.out.println(value+""+pattern+""+output);
	}

}

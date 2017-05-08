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
		           .println(value+""+pattern+""+myFormat.format(value));
	}
	public static void main(String[] ages){
		SimgleFormat("###,###,###",123456.789);    //���þ�̬SimgleFormat()����
		SimgleFormat("00000000.###kg",123456.789);   //�����ֺ���ϵ�λ
		//���ո�ʽģ���ʽ�����֣������ڵ�λ��0��ʾ
		SimgleFormat("000000.000",123.78);
		//���þ�̬UseApplypatternMethodFormat()����
		UseApplyPatternMethodFormat("#.###%",0.789);
		//��С������ʽ��λ��λ
		UseApplyPatternMethodFormat("###.##",123456.789);
		//������ת��λǧ������ʽ
		UseApplyPatternMethodFormat("0.00\u2030",0.789);
		
		
	}

}

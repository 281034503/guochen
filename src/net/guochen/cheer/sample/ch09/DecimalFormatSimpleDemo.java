package net.guochen.cheer.sample.ch09;

import java.text.DecimalFormat;

public class DecimalFormatSimpleDemo {
	//使用实例化对象时设置格式化模式
	static public void SimgleFormat(String pattern,double value){
		//实例化DecimalFormat对象
		DecimalFormat myFormat=new DecimalFormat(pattern);
		String output=myFormat.format(value);    //将数字进行格式化
		System.out.println(value+""+pattern+""+output);
		
	}
	
	//使用applyPattern()方法对数字进行格式化
	static public void UseApplyPatternMethodFormat(String pattern,double value){
		DecimalFormat myFormat=new DecimalFormat();
		myFormat.applyPattern(pattern);
		System.out
		           .println();
		
		
	}

}

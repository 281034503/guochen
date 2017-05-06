package net.guochen.cheer.sample.ch09;

import java.text.DecimalFormat;

public class DecimalFormatSimpleDemo {
	//使用实例化对象时设置格式化模式
	static public void SimgleFormat(String pattern,double value){
		//实例化DecimalFormat对象
		DecimalFormat myFormat=new DecimalFormat(pattern);
		String output=myFormat.format(value);
		System.out.println(value+""+pattern+""+output);
	}

}

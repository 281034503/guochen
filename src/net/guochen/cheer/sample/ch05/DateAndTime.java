package net.guochen.cheer.sample.ch05;

import java.util.Date;   //导入java.util.Date类

public class DateAndTime {   //创建类
	
    public static void main(String[] args){    //主方法
    	
    	Date date=new Date();    //将date进行格式化
    	String time=String.format("%tT", date);
    	String form=String.format("%tc", date);
    	System.out.println("全部的时间信息是："+time);
    	System.out.println("年-月-日格式："+form);
    }

}

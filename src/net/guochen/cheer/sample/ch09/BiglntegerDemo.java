package net.guochen.cheer.sample.ch09;

import java.math.BigInteger;

public class BiglntegerDemo{
	public static void main(String[] agrs){
		
		BigInteger biginstance=new BigInteger("4");   //实例化一个大数字
	
		System.out.println("加法操作："+biginstance.add(new BigInteger("2")));
		//取该大数字加2的操作
		
		System.out.println("减法操作:"+biginstance.subtract(new BigInteger("2")));
		//取该大数字减2的操作
		
		System.out.println("乘法操作:"+biginstance.multiply(new BigInteger("2")));
		//取该大数字乘2的操作
		
		System.out.println("除法操作:"+biginstance.divide(new BigInteger("2")));
		//取该大数字除以2的操作
		
		System.out.println("取商:"+biginstance.divideAndRemainder(new BigInteger("3"))[0]);
		//取该大数字除以3的商
		
		System.out.println("取余数:"+biginstance.divideAndRemainder(new BigInteger("3"))[1]);
		//取该大数字除以3的余数
		
		System.out.println("做2次方操作:"+biginstance.pow(2));
		//取该大数字的2次方
		
		System.out.println("取相反数操作："+biginstance.negate());
		//取该大数字的相反数
	}

}




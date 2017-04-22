package net.guochen.cheer.demo.ch09;

import java.math.BigInteger;

public class BiglntegerText {

	public static void main(String[] args) {
	//	Integer i=new Integer("1000000000000000000000");
		//System.out.println(i);
		
		BigInteger bi=new BigInteger("100000000000000000000000");
		
		System.out.println(bi);
		
		BigInteger result =bi.add(new BigInteger("20000000000000000000"));
		
		System.out.println(result);
		
		
	}

}

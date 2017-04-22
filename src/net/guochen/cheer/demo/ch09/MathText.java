package net.guochen.cheer.demo.ch09;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class MathText {

	public static void main(String[] args) {
		
		NumberFormat nf=new DecimalFormat("00.00");
		double value=Math.sin(Math.PI*30/180);
		System.out.println(Math.sin(Math.PI*30/180));
		System.out.println(nf.format(value));
	
	}

}

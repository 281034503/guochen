package net.guochen.cheer.demo.ch09;

import java.net.StandardSocketOptions;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DecimalFormatTest {

	public static void main(String[] args) {
		NumberFormat nf= new DecimalFormat("#,##.00");
		double value=1999.991d;
		System.out.println(nf.format(value));
		

	}

}

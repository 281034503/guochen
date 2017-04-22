package net.guochen.cheer.demo.ch09;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) throws Exception{
		Date date=new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		
		
		date=new Date(2017,4,22);
		System.out.println(date);
		
		DateFormat df= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(df.format(new Date()));
		
		
		Date _data =df.parse("22/04/2017 16:30:38");
		
		System.out.println(df.format(_data));
	
	}

}

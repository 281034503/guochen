package net.guochen.cheer.sample.ch05;
import java.util.Date;    //导入java.util.Date类
public class GetDate {    //新建类
	public static void main(String[] agrs){    //主方法
		Date date=new Date();     //创建Date对象date
		String hour=String.format("%tH", date);   //将date格式化
		String mintu=String.format("%tM",date );
		String second=String.format("%tS",date);
		System.out.println("现在是:"+hour+"时"+mintu+"分"+second+"秒");
		
	}

}

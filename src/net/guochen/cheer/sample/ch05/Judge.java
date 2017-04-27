package net.guochen.cheer.sample.ch05;

public class Judge {
	public static void main(String[]args){
		
		String regex="\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		//定义要匹配E-mail地址的正则表达式
		String str1="aaa@";   //定义要验证的字符串
		String str2="aaaaa";。
		String str3="1111@111ffyu.dfg.com";
		
		if (str1.matches(regex)){    //判断字符串变量是否与正则表达式匹配
			System.out.println(str1+"是一个合法的E-mail地址格式");
		}
		if (str2.matches(regex)){
		System.out.println(str2+"是一个合法的E-mail地址格式");
		}
		if (str3.matches(regex)){
		System.out.println(str3+"是一个合法的E-mail地址格式");
		  }
		}
	}



package net.guochen.cheer.excrcise.ch05;

public class Three {
public static void main(String[] args) {
	String Tel="1[^27]\\d{9}";    //1开头的数字，2和7以外的两位数字，9位的任何数字
	String Text="13584949649";
	if (Text.matches(Tel)){   //判断是Text与Tel是否匹配
		System.out.println(Text+ "是合法的手机号");
	}
	else  {
	System.out.println(Text+ "不合法的手机号");
}
}
}
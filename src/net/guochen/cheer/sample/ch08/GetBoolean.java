package net.guochen.cheer.sample.ch08;

public class GetBoolean {
	public static void main(String[] args) {
		Boolean b1=new Boolean(true);   //创建Boolean对象
		Boolean b2=new Boolean("ok");
		System.out.println("b1:"+b1.booleanValue());
		System.out.println("b2:"+b2.booleanValue());
	}

}

package net.guochen.cheer.excrcise.ch05;

public class Four {

	public static void main(String[] args) {
		
		StringBuilder a1=new StringBuilder("");    //创建字符串生成器
		
		for(int i=1;i<=10;i++) {     //for循环操作
			
			a1.append(i);    //循环追加字符
			 
		}
		System.out.println(a1.toString());
		
	}

}

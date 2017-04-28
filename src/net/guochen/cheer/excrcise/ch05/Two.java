package net.guochen.cheer.excrcise.ch05;

public class Two {
	public static void main(String[] args) {
		String a="hello world";
		String b="HELLO TOMORROW";
		String a1=a.substring(2, 6);    //截取字符串2和6的位置
		String b1=b.substring(2, 7);    //截取字符串2和6的位置
		//System.out.println(a1);
		//System.out.println(b1);
		if (a1.equalsIgnoreCase(b1)){     //判断截取的字符串是否一样，并且输出结果
			System.out.println("两个子串相同");
		}
		else {
			System.out.println("两个子串不相同");
		}  
	}

}

package net.guochen.cheer.sample.ch04;

public class ContinueTest {

	public static void main(String[] args) {
		for(int i=1;i<20;i++){
			if(i%2==0){     //如果i是偶数
				continue;     //跳到下一循环前的语句
			}
			System.out.println(i);    //输出i的值都是奇数
		}
	}

}

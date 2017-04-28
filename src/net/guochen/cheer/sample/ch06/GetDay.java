package net.guochen.cheer.sample.ch06;

public class GetDay {
	public static void main(String[] args) {
		int day[]=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};  //建立12个元素个数
		for(int i=0;i<12;i++){      //利用for循环输出12个月
			System.out.println((i+1)+"月有"+day[i]+"天");
		}
	}

}

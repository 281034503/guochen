package net.guochen.cheer.sample.ch06;

public class GetDay {
	public static void main(String[] args) {
		int day[]=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};  //����12��Ԫ�ظ���
		for(int i=0;i<12;i++){      //����forѭ�����12����
			System.out.println((i+1)+"����"+day[i]+"��");
		}
	}

}

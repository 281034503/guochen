package net.guochen.cheer.sample.ch18;

public class ThreadTest extends Thread{   //ָ���̳�Thead��
	private int count=10;
	public void run(){    //����run����
		while (true){
			System.out.print(count+"  ");   //��ӡcount����
			if(--count==0){    //ʹcount�����Լ������Լ�Ϊ0ʱ���˳�ѭ��
				return;
			}
		}
	}
	
	public static void main(String[] args){
		new ThreadTest().start();
	}

}

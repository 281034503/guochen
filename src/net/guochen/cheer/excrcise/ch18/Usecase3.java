package net.guochen.cheer.excrcise.ch18;

public class Usecase3 extends Thread {

	int index = 0;
	String[]str={"Hello","Java","World","study","��ҪѧϰJava����","Java��̴ʵ��ܰ���ѧϰ�������Լ���������"};

	public void run() {
		while (true) {
			System.out.println(str[index++ % 6]);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Usecase3().start();
	}
}

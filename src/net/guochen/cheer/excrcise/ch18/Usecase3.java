package net.guochen.cheer.excrcise.ch18;

public class Usecase3 extends Thread {

	int index = 0;
	String[]str={"Hello","Java","World","study","我要学习Java语言","Java编程词典能伴我学习、工作以及独立开发"};

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

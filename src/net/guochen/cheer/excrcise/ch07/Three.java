package net.guochen.cheer.excrcise.ch07;

public class Three {
	public static void main(String[] args) {
		int lengh=args.length;
		if (lengh==0){
			System.out.println("无运行参数");
		}
		else{
	for (int i=1;i<=args.length;i++){
		System.out.println(i);
	}
		}
	}
}

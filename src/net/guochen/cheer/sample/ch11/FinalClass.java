package net.guochen.cheer.sample.ch11;

public class FinalClass {
	int a=3;
	void doit(){
	}
	public static void main(String[] agrs){
		FinalClass f=new FinalClass();
		f.a++;
		System.out.println(f.a);
	}

}

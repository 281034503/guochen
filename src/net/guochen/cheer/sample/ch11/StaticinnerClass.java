package net.guochen.cheer.sample.ch11;

public class StaticinnerClass {
	int x=100;
	static class inner{
		void doitinner(){
		//System.out.println("外部类"+x);
		//调用外部类的成员变量X	
		}
		public static void main(String[] agrs){
			System.out.println("a");
		}
	}

}

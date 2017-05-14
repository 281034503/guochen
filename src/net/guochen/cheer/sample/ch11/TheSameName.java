package net.guochen.cheer.sample.ch11;

public class TheSameName {
	private int x;
	private class inner{
		private int x=9;
		public void doit(int x){
			x++;    //调用的形参X
			this.x++;    //调用内部类的变量X
			TheSameName.this.x++;    //调用外部类的变量X
		}
	}
}



package net.guochen.cheer.sample.ch11;

public class TheSameName {
	private int x;
	private class inner{
		private int x=9;
		public void doit(int x){
			x++;    //���õ��β�X
			this.x++;    //�����ڲ���ı���X
			TheSameName.this.x++;    //�����ⲿ��ı���X
		}
	}
}



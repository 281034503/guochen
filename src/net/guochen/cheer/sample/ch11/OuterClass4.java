package net.guochen.cheer.sample.ch11;

public class OuterClass4 {
	public Outinterface2 doit(){     //����doit()����
		return new Outinterface2(){    //���������ڲ���
			private int i=0;
			public int getValue(){
				return i;
				
			}
		};
	}

}

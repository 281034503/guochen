package net.guochen.cheer.sample.ch11;

public class OuterClass4 {
	public Outinterface2 doit(){     //定义doit()方法
		return new Outinterface2(){    //声明匿名内部类
			private int i=0;
			public int getValue(){
				return i;
				
			}
		};
	}

}

package net.guochen.cheer.sample.ch07;

public class CerateObject {
	public CerateObject(){       //构造方法
		System.out.println("创建对象");
	}
      public static void main(String[] agrs){    //主方法
    	  new CerateObject();    //直接调用构造方法中的代码

	}

}

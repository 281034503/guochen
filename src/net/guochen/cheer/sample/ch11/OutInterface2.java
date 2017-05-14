package net.guochen.cheer.sample.ch11;


interface Outinterface2{
	}
class OuterClass3{
	public Outinterface2 doit(final String x){
		//doit()方法参数为final类型
		class innerClass2 implements Outinterface2 {
			//在doit()方法中定义一个内部类
			innerClass2(String s){
				s=x;
				System.out.println(s);
			}
		}
		return new innerClass2("doit");
	}
}




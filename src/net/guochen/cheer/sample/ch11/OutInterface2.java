package net.guochen.cheer.sample.ch11;


interface Outinterface2{
	}
class OuterClass3{
	public Outinterface2 doit(final String x){
		//doit()��������Ϊfinal����
		class innerClass2 implements Outinterface2 {
			//��doit()�����ж���һ���ڲ���
			innerClass2(String s){
				s=x;
				System.out.println(s);
			}
		}
		return new innerClass2("doit");
	}
}




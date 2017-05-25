package net.guochen.cheer.excrcise.ch10;

public class Two {
	public void doSomething(){
		System.out.println("父类.doSonmething");
	}
	public void doAnything(){
		System.out.println("父类.doAnything");
	}
	public static void main(String[] agrs){
		Two a=new three();
		a.doSomething();
		a.doAnything();
		
	} 
}
class three extends Two{
	public void doAnything(){
		System.out.println("子类.doAnything");
	}
}

package net.guochen.cheer.excrcise.ch10;

public class Two {
	public void doSomething(){
		System.out.println("����.doSonmething");
	}
	public void doAnything(){
		System.out.println("����.doAnything");
	}
	public static void main(String[] agrs){
		Two a=new three();
		a.doSomething();
		a.doAnything();
		
	} 
}
class three extends Two{
	public void doAnything(){
		System.out.println("����.doAnything");
	}
}

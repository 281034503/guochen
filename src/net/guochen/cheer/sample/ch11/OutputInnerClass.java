package net.guochen.cheer.sample.ch11;

public class OutputInnerClass extends ClassA.ClassB {
	//¼Ì³ĞÄÚ²¿ÀàClassB
	public OutputInnerClass(ClassA a){
		a.super();
	}

}
class ClassA{
	class ClassB{
		
	}
}

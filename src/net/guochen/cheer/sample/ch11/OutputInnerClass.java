package net.guochen.cheer.sample.ch11;

public class OutputInnerClass extends ClassA.ClassB {
	//�̳��ڲ���ClassB
	public OutputInnerClass(ClassA a){
		a.super();
	}

}
class ClassA{
	class ClassB{
		
	}
}

package net.guochen.cheer.excrcise.ch10;

public abstract class Threee {    //������
	abstract void testAbstract();
	Threee(){   //��1������ִ�и��๹�췽��
		System.out.println("before testAbstract()");
		testAbstract();  
		//��������˳��󷽷����������า�ǵķ������������Atest���testAbstract��������
	
		System.out.println("after testAbstarcat()");
	}
	public static void main(String[] agrs){
		new Atest();
		
	}

}
class Atest extends Threee{
	private int i=1;   //��2��ʹ��Ա�������г�ʼ��
	void testAbstract(){
		
		System.out.println("testAbstract"+i);
	}
	public Atest(){  //��3���������๹�췽��
		System.out.println(i);
	}
}

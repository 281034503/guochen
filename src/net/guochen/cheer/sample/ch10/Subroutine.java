package net.guochen.cheer.sample.ch10;

class Parent {    //����
	Parent(){
		System.out.println("���ø����Parent()���췽��");
	}

}


class SubParent extends Parent {      //�̳�Parent��
	SubParent(){
		System.out.println("���������SubParent()���췽��");
	}
}
public class Subroutine extends SubParent{     //�̳�SubParent��
	Subroutine(){
		System.out.println("���������Subbroutine()���췽��");
	}
	public static void main(String[] agrs){     //ʵ�����������
		Subroutine s=new Subroutine();
	}
  }


package net.guochen.cheer.sample.ch10;

public class Objectinstance {
	
	public String toString(){      //��дtoString()����		
		return"��"+getClass().getName()+"������дtoString()����";		
	}
	public static void main(String[] agrs){
		System.out.println(new Objectinstance());    //��ӡ�������
	}

}

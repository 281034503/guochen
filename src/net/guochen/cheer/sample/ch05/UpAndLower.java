package net.guochen.cheer.sample.ch05;

public class UpAndLower {    //������
	public static void main(String[] args){    //������
		String str=new String("abc DEF");  //�����ַ���str
		String newstr=str.toLowerCase();    //��strת��ΪСд
		String newstr2=str.toUpperCase();   //��strת��Ϊ��д
		System.out.println(newstr);         //���ת�����Сд
		System.out.println(newstr2);       //���ת����Ĵ�д
	}

}

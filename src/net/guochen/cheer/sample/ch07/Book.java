package net.guochen.cheer.sample.ch07;

public class Book {
	private String name;   //����һ��String�͵ĳ�Ա����
	
	public String getName(){   //����һ��getName()����
		int id =0;     //�ֲ�����
		setName("Java");   //����������������
		return id+this.name;   //���÷�������ֵ
	}
	private void setName(String name){     //����һ��setName��������
		this.name=name;    //������ֵ�������е� ��Ա����
		
	}
	public Book getBook(){ 
		return this;    //����Book������
	}

}

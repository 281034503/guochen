package net.guochen.cheer.sample.ch17;

public class Test {
	
	private Object b;      //����Object���ͳ�Ա����
	
	public Object getB(){     //������Ӧ��getXXX()����
		return b;
		
	}
	
	public void setB(Object b){    //������Ӧ��setXXX()����
		this.b=b;
		
	}
	
	public static void main(String[] args){
		Test t=new Test();
		t.setB(new Boolean(true));    //����ת�Ͳ���
		System.out.println(t.getB());
		t.setB(new Float(12.3));
		Float f=(Float)(t.getB());    //����ת�Ͳ���
		System.out.println(f);
		
	}

}

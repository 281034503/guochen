package net.guochen.cheer.sample.ch07;

public class AccessProperty {
	static int i =47;
	public void call(){          //�����Ա����
		System.out.println(" ����call�������췽��");    //�����Ա����
		for(i=0;i<3;i++){
			System.out.println(i+"");
			if(i==2){
				System.out.println("\n");
			}
		}
	}
	public AccessProperty(){     //���幹�췽��
	}
	public static void main(String[] agrs){
		AccessProperty t1=new AccessProperty();    //����һ������
		AccessProperty t2=new AccessProperty();    //������һ������
		t2.i=60;         //����Ա������ֵΪ60
		System.out.println("��һ��ʵ��������ñ���i�Ľ����" +t1.i++);
		//ʹ�õ�һ������������Ա����
		t1.call();    //ʹ�õ�һ������������Ա����
		System.out.println("�ڶ���ʵ��������ñ���i�Ľ����" +t2.i++);
		//ʹ�õڶ�������������Ա����
		t2.call();     //ʹ�õ�һ������������Ա����
	}

}



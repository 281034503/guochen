package net.guochen.cheer.sample.ch07;

public class TransferProperty {
	int i =47;
	public void call(){          //�����Ա����
		System.out.println(" ����call�������췽��");    //�����Ա����
		for(i=0;i<3;i++){
			System.out.println(i+"");
			if(i==2){
				System.out.println("\n");
			}
		}
	}
	public TransferProperty(){     //���幹�췽��
	}
	public static void main(String[] agrs){
		TransferProperty t1=new TransferProperty();    //����һ������
		TransferProperty t2=new TransferProperty();    //������һ������
		t2.i=60;         //����Ա������ֵΪ60
		System.out.println("��һ��ʵ��������ñ���i�Ľ����" +t1.i++);
		//ʹ�õ�һ������������Ա����
		t1.call();    //ʹ�õ�һ������������Ա����
		System.out.println("�ڶ���ʵ��������ñ���i�Ľ����" +t2.i++);
		//ʹ�õڶ�������������Ա����
		t2.call();     //ʹ�õ�һ������������Ա����
	}

}

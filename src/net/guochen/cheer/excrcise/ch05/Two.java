package net.guochen.cheer.excrcise.ch05;

public class Two {
	public static void main(String[] args) {
		String a="hello world";
		String b="HELLO TOMORROW";
		String a1=a.substring(2, 6);    //��ȡ�ַ���2��6��λ��
		String b1=b.substring(2, 7);    //��ȡ�ַ���2��6��λ��
		//System.out.println(a1);
		//System.out.println(b1);
		if (a1.equalsIgnoreCase(b1)){     //�жϽ�ȡ���ַ����Ƿ�һ��������������
			System.out.println("�����Ӵ���ͬ");
		}
		else {
			System.out.println("�����Ӵ�����ͬ");
		}  
	}

}

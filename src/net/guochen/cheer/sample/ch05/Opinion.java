package net.guochen.cheer.sample.ch05;

public class Opinion {   //������
	public static void main(String[] args){   //������
		
		String s1=new String("abc");    //�����ַ�������s1
		
		String s2=new String("ABC");    //�����ַ�������s2
		
		String s3=new String("abc");     //�����ַ�������s3
		
		boolean b=s1.equals(s2);        //ʹ��equals���������Ƚ�s1��S2�Ƿ����
		
		boolean b2=s1.equalsIgnoreCase(s2);
		//ʹ��equalslgnoreCase()�����Ƚ�s1��s2�Ƿ����
		System.out.println(s1 + " equals " + s2+":" + b);
		//���s1�Ա�s2�Ľ��
		System.out.println(s1+" equalslgnoreCase "+s2+":"+b2);
		//���s1�Ա�s2�Ľ��
		
		
	}

}

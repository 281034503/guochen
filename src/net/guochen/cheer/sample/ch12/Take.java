package net.guochen.cheer.sample.ch12;

public class Take {     //������
	public static void main(String[] agrs){
		try{       //try����а������ܳ����쳣�ĳ������
			String str="lili";    //�����ַ�������
			System.out.println(str+"�����ǣ�");    //�������ʾ��Ϣ
			int age=Integer.parseInt("20L");     //�������͵�ת�������ַ���ת��Ϊ������20L�ᱨ��
			System.out.println(age);    //�����Ϣ			
		}
		catch (Exception e){     //catch����������ȡ�쳣��Ϣ
			e.printStackTrace();     //����쳣����
		}
		System.out.println("program over");    //�����Ϣ
	}

}

package net.guochen.cheer.sample.ch17;

public class EnumMethodTest {
	enum Constants2{
		//������������ö��������
		Constants_A,Constants_B
	}
	//����Ƚ�ö�����ͷ�������������Ϊö������
	public static void compare(Constants2 c){
		
		for(int i=0;i<Constants2.values().length;i++){
			
			//����values()�������ص�������ѭ������
			System.out.println(c+"��"+Constants2.values()[i]+"�ıȽϽ��Ϊ:"
		                           +c.compareTo(Constants2.values()[i]));
			//���ȽϽ������
		}
	}
	
	public static void main(String[]atgs){
		compare(Constants2.valueOf("Constants_B"));
		//���������е���compare()����
	}

}

package net.guochen.cheer.excrcise.ch05;

public class Three {
public static void main(String[] args) {
	String Tel="1[^27]\\d{9}";    //1��ͷ�����֣�2��7�������λ���֣�9λ���κ�����
	String Text="13584949649";
	if (Text.matches(Tel)){   //�ж���Text��Tel�Ƿ�ƥ��
		System.out.println(Text+ "�ǺϷ����ֻ���");
	}
	else  {
	System.out.println(Text+ "���Ϸ����ֻ���");
}
}
}
package net.guochen.cheer.sample.ch05;

public class Judge {
	public static void main(String[]args){
		
		String regex="\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		//����Ҫƥ��E-mail��ַ���������ʽ
		String str1="aaa@";   //����Ҫ��֤���ַ���
		String str2="aaaaa";��
		String str3="1111@111ffyu.dfg.com";
		
		if (str1.matches(regex)){    //�ж��ַ��������Ƿ����������ʽƥ��
			System.out.println(str1+"��һ���Ϸ���E-mail��ַ��ʽ");
		}
		if (str2.matches(regex)){
		System.out.println(str2+"��һ���Ϸ���E-mail��ַ��ʽ");
		}
		if (str3.matches(regex)){
		System.out.println(str3+"��һ���Ϸ���E-mail��ַ��ʽ");
		  }
		}
	}


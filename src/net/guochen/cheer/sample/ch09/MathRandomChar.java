package net.guochen.cheer.sample.ch09;

public class MathRandomChar {
	
	public static char GetRandomChar(char cha1,char cha2){
		//�����ȡ�����ַ�֮�������ַ�
		return (char) (cha1+Math.random()*(cha2-cha1+1));
	}
		public static void main(String[] agrs){
			System.out.println("����Сд�ַ�"+ GetRandomChar('a','z'));
			//��ȡa--z֮�������ַ�
			System.out.println("�����д�ַ�"+ GetRandomChar('A','Z'));
			//��ȡA--Z֮�������ַ�
			System.out.println("0��9���������ַ�"+ GetRandomChar('0','9'));
			//��ȡ0--9֮�������ַ�
			
		}
	
		
	}


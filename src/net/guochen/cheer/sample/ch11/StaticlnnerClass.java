package net.guochen.cheer.sample.ch11;

import javafx.animation.ScaleTransition;

public class StaticlnnerClass {
	int x=100;    //�Ǿ�̬��Ա����
	static class Inner{     //��̬��
		void doitInner(){
			// System.out.println("�ⲿ��"+x); //�����ⲿ��ĳ�Ա����x
		}
		public static void main(String agrs[]){
			System.out.println("a");
		}
	}

}

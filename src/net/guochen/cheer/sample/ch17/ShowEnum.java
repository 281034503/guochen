package net.guochen.cheer.sample.ch17;

import net.guochen.cheer.sample.ch17.ConstantsTest.Constants2;

public class ShowEnum {
	enum Constans2{  //������������ö��������
		Constant_A,constan_B
	}
	//ѭ����values()������������
	public static void main(String [] args){
		
		for(int i=0;i<Constants2.values().length;i++){
			System.out.println("ö�����ͳ�Ա������"+Constants2.values()[i]);
			//��ö�ٳ�Ա������ӡ
		}
		
	}

}

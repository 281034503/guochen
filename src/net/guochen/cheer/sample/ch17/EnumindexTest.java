package net.guochen.cheer.sample.ch17;

import net.guochen.cheer.sample.ch17.EnumMethodTest.Constants2;

public class EnumindexTest {
	enum Constant2{   //������������ö��������
		Constant_A,Constant_B,Constants_C
		}
	public static void main(String[]args){
		for(int i=0;i<Constants2.values().length;i++){
			
			System.out.println(Constants2.values()[i]+"��ö��������λ������ֵ"
			    +Constants2.values()[i].ordinal());
		    //��ѭ���л�ȡö�����ͳ�Ա������λ��
		
		}
		
	}

}

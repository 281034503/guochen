package net.guochen.cheer.sample.ch17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class AnyClass {
	public static void main(String[]args){
		ArrayList<Integer>a=new ArrayList<Integer>();
		//����ArrayList���������������ڵ�ֵ����ΪInteger
		a.add(1);   //Ϊ���������ֵ
		for(int i=0;i<a.size();i++){
				System.out.println("��ȡArrayList������ֵ:"+a.get(i));
				//���������ĳ���ѭ����ʾ�����ڵ�ֵ
	}
		Map<Integer,String>m=new HashMap<Integer,String>();
		//����HashMap���������������ļ������ֵ���ͷֱ�Integer��String��
		for(int i=0;i<5;i++){
			m.put(i,"��Ա"+i);   //Ϊ�������������ֵ
		}
		
		
		for(int i=0;i<m.size();i++){
			//���ݼ�ֵ����ȡ��ֵ
			System.out.println("��ȡMap������ֵ"+m.get(i));
		}
		
		Vector<String>v=new Vector<String>();
		//����vector������ʹ�����е�����ΪString��
		for(int i=0;i<5;i++){
			v.addElement("��Ա"+i);
			//Ϊvector�����������
		}
		for(int i=0;i<v.size();i++){
			//��ʾ�����е�����
			System.out.println("��ȡVertor������ֵ"+v.get(i));
		}
	}
}

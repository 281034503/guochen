package net.guochen.cheer.sample.ch14;

import java.util.ArrayList;
import java.util.List;

public class Gather {
	public static void main(String[] args){
		List<String> list=new ArrayList<>();   //�������϶���
		list.add("a");      //�뼯�����Ԫ��
		list.add("b");
		list.add("c");
		int i=(int)(Math.random()*list.size());   //��ȡlist֮��������
		System.out.println("�����ȡ�����Ԫ�أ�"+list.get(i));
		
		list.remove(2);  //���ƶ�����λ�õ�Ԫ�شӼ������Ƴ�
		
		System.out.println("��������'2'��Ԫ�ش������Ƴ���,�����е�Ԫ����:");
		
		for(int j=0;j<list.size();j++){
			//ѭ����������
			
			System.out.println(list.get(j));
			
		}
	}

}

package net.guochen.cheer.sample.ch14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UpdateStuTest {
	public static void main(String[] args){
		Map<String,String>map=new HashMap<>();  //����Mapʵ��
		map.put("01","��ͬѧ");  //�򼯺�����Ӷ���
		map.put("02","κͬѧ");
		
		Set<String>set=map.keySet();
		//����Map����������key����ļ���
		Iterator<String>it=set.iterator();
		//�������ϵ�����
		System.out.println("key�����е�Ԫ��:");
		
		while(it.hasNext()){
			//��������
			System.out.println(it.next());
		}
		
		
		
		
		Collection<String>coll=map.values();
		//����Map����������valuesֵ�ü���
		it=coll.iterator();
		
		System.out.println("valuse�����е�Ԫ�أ�");
		
		while (it.hasNext()){
		//��������	
			System.out.println(it.next());
		}
	}

}

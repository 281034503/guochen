package net.guochen.cheer.sample.ch17;

import java.util.HashMap;
import java.util.Map;

public class MutiOverClass <K,V>{
	public Map<K,V>m=new HashMap<K,V>();
	//����һ������HashMapʵ��
	
	public void put(K k, V v){
		//����put����������Ӧ�ļ�ֵ��������뼯�϶�����
		m.put(k, v);
	}
	public V get(K k){   //���ݼ�����ȡ��ֵ
		return m.get(k);
		
	}
	public static void main(String[]args){
		MutiOverClass<Integer,String>mu=new MutiOverClass<Integer,String>();
		//ʵ�������������
		for(int i=0;i<5;i++){
			mu.put(i, "���Ǽ��ϳ�Ա"+i);
			//���ݼ��ϵĳ���ѭ�������������ֵ���뼯����
		}
		for(int i=0;i<mu.m.size();i++){
			//����get()������ȡ�����е�ֵ
			System.out.println(mu.get(i));
		}
	}
	
	

}

package net.guochen.cheer.sample.ch17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class AnyClass {
	public static void main(String[]args){
		ArrayList<Integer>a=new ArrayList<Integer>();
		//定义ArrayList容器，设置容器内的值类型为Integer
		a.add(1);   //为容器添加新值
		for(int i=0;i<a.size();i++){
				System.out.println("获取ArrayList容器的值:"+a.get(i));
				//根据容器的长度循环显示容器内的值
	}
		Map<Integer,String>m=new HashMap<Integer,String>();
		//定义HashMap容器，设置容器的键名与键值类型分别Integer与String型
		for(int i=0;i<5;i++){
			m.put(i,"成员"+i);   //为容器填充键名与键值
		}
		
		
		for(int i=0;i<m.size();i++){
			//根据键值名获取键值
			System.out.println("获取Map容器的值"+m.get(i));
		}
		
		Vector<String>v=new Vector<String>();
		//定义vector容器，使容器中的内容为String型
		for(int i=0;i<5;i++){
			v.addElement("成员"+i);
			//为vector容器添加内容
		}
		for(int i=0;i<v.size();i++){
			//显示容器中的内容
			System.out.println("获取Vertor容器的值"+v.get(i));
		}
	}
}

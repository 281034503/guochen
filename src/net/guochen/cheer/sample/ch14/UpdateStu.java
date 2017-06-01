package net.guochen.cheer.sample.ch14;

import java.util.Iterator;
import java.util.TreeSet;

public  class UpdateStu implements Comparable<Object>{
	//������ʵ��Comparable�ӿ�
	String name;
	long id;
	
	public UpdateStu(String name,long id){
		this.id=id;
		this.name=name;
		
	}
	public int compareTo(Object o){
		
		UpdateStu upstu=(UpdateStu)o;
		
		int result=id>upstu.id?1:(id==upstu.id?0:-1);
		
		return result;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
		
	}
	public long getid(){
		return id;
		
	}
	public void setid(long id){
		this.id=id;
		
	}

	public static void main(String[] args){
		
		UpdateStu stu1=new UpdateStu("��ͬѧ",01011);   //����UpdateStu����
		UpdateStu stu2=new UpdateStu("��ͬѧ",01021);
		UpdateStu stu3=new UpdateStu("��ͬѧ",01051);
		UpdateStu stu4=new UpdateStu("��ͬѧ",01012);
		
		TreeSet<UpdateStu>tree=new TreeSet<>(); 
		
		tree.add(stu1);  //�򼯺���Ӷ���
		tree.add(stu2);
		tree.add(stu3);
		tree.add(stu4);
		
		Iterator<UpdateStu>it=tree.iterator();
		//Set�����е����ж���ĵ�����
		System.out.println("Set�����е�����Ԫ�أ�");
		
		while (it.hasNext()){
			//��������
			UpdateStu stu=(UpdateStu)it.next();
			System.out.println(stu.getid()+""+stu.getName());
			
		}
		it=tree.headSet(stu2).iterator();
		//��ȡ����stu2����֮ǰ�Ķ���
		System.out.println("��ȡǰ�沿�ֵļ���:");
		while(it.hasNext()){    //��������
			UpdateStu stu=(UpdateStu)it.next();
			System.out.println(stu.getid()+""+stu.getName());
		}
		
		it=tree.subSet(stu2, stu3).iterator();
		//��ȡ����stu2��stu3֮��Ķ���
		System.out.println("��ȡ�м䲿�ֵļ���");
		while (it.hasNext()){    //��������
			UpdateStu stu=(UpdateStu)it.next();
			System.out.println(stu.getid()+""+stu.getName());
		}
		
		
	}
}

package net.guochen.cheer.sample.ch14;

import java.util.Iterator;
import java.util.TreeSet;

public  class UpdateStu implements Comparable<Object>{
	//创建类实现Comparable接口
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
		
		UpdateStu stu1=new UpdateStu("李同学",01011);   //创建UpdateStu对象
		UpdateStu stu2=new UpdateStu("陈同学",01021);
		UpdateStu stu3=new UpdateStu("王同学",01051);
		UpdateStu stu4=new UpdateStu("马同学",01012);
		
		TreeSet<UpdateStu>tree=new TreeSet<>(); 
		
		tree.add(stu1);  //向集合添加对象
		tree.add(stu2);
		tree.add(stu3);
		tree.add(stu4);
		
		Iterator<UpdateStu>it=tree.iterator();
		//Set集合中的所有对象的迭代器
		System.out.println("Set集合中的所有元素：");
		
		while (it.hasNext()){
			//遍历集合
			UpdateStu stu=(UpdateStu)it.next();
			System.out.println(stu.getid()+""+stu.getName());
			
		}
		it=tree.headSet(stu2).iterator();
		//截取排在stu2对象之前的对象
		System.out.println("截取前面部分的集合:");
		while(it.hasNext()){    //遍历集合
			UpdateStu stu=(UpdateStu)it.next();
			System.out.println(stu.getid()+""+stu.getName());
		}
		
		it=tree.subSet(stu2, stu3).iterator();
		//截取排在stu2与stu3之间的对象
		System.out.println("截取中间部分的集合");
		while (it.hasNext()){    //遍历集合
			UpdateStu stu=(UpdateStu)it.next();
			System.out.println(stu.getid()+""+stu.getName());
		}
		
		
	}
}

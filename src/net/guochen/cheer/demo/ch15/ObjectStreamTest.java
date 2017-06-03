package net.guochen.cheer.demo.ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.StandardSocketOptions;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class ObjectStreamTest {
	
	private static final DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
	public static void main(String[] args)throws Exception{
		
		Person p=new Person();
		
	    p.setId(UUID.randomUUID().toString().replaceAll("-",""));
		p.setName("zhangsan");
		p.setBirthday(df.parse("1987-10-10"));
		
		ObjectOutputStream out=null;
				
		FileOutputStream outFile = null;
		try{

		outFile=new FileOutputStream("F:"+File.separatorChar+"javatest/object.bin");
		
		out=new ObjectOutputStream(outFile);
		
		out.writeObject(p);
		out.flush();
		
	}finally{	
		if(outFile!=null){
			outFile.close();
			
		}
		if(out!=null){
			out.close();
		}
	}
		
		
		
		ObjectInputStream in=null;
		FileInputStream inFile=null;
		
		try{
	
			inFile=new FileInputStream("F:"+File.separatorChar+"javatest/object.bin");
			
			in=new ObjectInputStream(inFile);
			 Object _p = in.readObject();
			
		
			if(_p instanceof Person){
				Person __p=(Person)_p;
				System.out.println("Varrible [__p]->"+__p);
			}
			
		}finally{
			if(inFile!=null){
				inFile.close();
			}
			if(in!=null){
				in.close();
			}
		}
			
		
		

		
	}

}


class  Person implements java.io.Serializable{
	private String name;
	private int age;
	private Date birthday;
	public String getName() {
		return name;
	}
	public void setId(String replaceAll) {
		// TODO Auto-generated method stub
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}



public String toString(){
	StringBuilder sb=new StringBuilder(1024);
	sb.append(getClass().getName()).append("[\n")
	.append("id=").append(getAge()).append("\n")
	.append("birthday=").append(getBirthday()).append("\n")
	.append("]");
	return sb.toString();
	
   }
}
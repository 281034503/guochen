package net.guochen.cheer.sample.ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class Gradation {
	static Connection con;//����Connection����
	static Statement sql;//����Statement����
	static ResultSet res;//����ResultSet����
	
	public Connection getConnection(){//�������ݿⷽ��
		try{
			Class.forName("con.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql:"+"//127.0.0.1:3306/test","root","123456");
		}catch (Exception e){
			e.printStackTrace();
		}
		return con;//����Connection����
			
		}
	public static void main(String [] args){
		Gradation c=new Gradation();//�����������
		con=c.getConnection();//�����ݿ⽨������
		try{
			sql=(Statement) con.createStatement();//ʵ����Statement����
			res=sql.executeQuery("select*from tb stu");//ִ��SQL��䣬���ؽ����
			while (res.next()){   //�����ǰ��䲻�����һ�������ѭ��
				String id=res.getString("id");//��ȡ������ID���ֶ�ֵ
				String name=res.getString("name");//��ȡ������name���ֶ�ֵ
				String sex=res.getString("sex");//��ȡ������sex���ֶ�ֵ
				String birthday=res.getString("birthday");//��ȡ������birthday���ֶ�ֵ
				System.out.print("���:"+id);  //����ֵ���
				System.out.print("����:"+name);
				System.out.print("�Ա�:"+sex);
				System.out.println("����:"+birthday);
				
			}
		}catch (Exception e){
			e.printStackTrace();
			
		}
				
	
	
	}

}

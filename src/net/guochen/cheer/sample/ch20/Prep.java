package net.guochen.cheer.sample.ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Prep {

	static Connection con;//����Connection����
	static ResultSet res;//����ResultSet����
	static PreparedStatement sql;//����Ԥ�������
	
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
		Prep c=new Prep();//�����������
		con=c.getConnection();//�����ݿ⽨������
		try{
			sql= con.prepareStatement("slect * from tb_stu"+"where id=?");//ʵ����Ԥ�������
			sql.setInt(1,4);//���ò���
			res=sql.executeQuery();//ִ��Ԥ�������
			while (res.next()){   //�����ǰ��䲻�����һ�������ѭ��
				String id=res.getString("1");//��ȡ������ID���ֶ�ֵ
				String name=res.getString("name");//��ȡ������name���ֶ�ֵ
				String sex=res.getString("sex");//��ȡ������sex���ֶ�ֵ
				String birthday=res.getString("birthday");//��ȡ������birthday���ֶ�ֵ
				System.out.print("���:"+id);  //����ֵ���
				System.out.print("����:"+name);
				System.out.print("�Ա�:"+sex);
				System.out.println("����:"+birthday);
				
			}
		}catch (Exception e){//�����쳣��Ϣ
			e.printStackTrace();//����쳣��Ϣ
			
		}
	}
}



package net.guochen.cheer.sample.ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
	Connection con;//����Connection����
	public Connection getConnection(){  //��������ֵΪConnection�ķ���
		try{
			Class.forName("com.mysql.jdbc.Driver");   //�������ݿ�������
			System.out.println("���ݿ��������سɹ�");
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		try{
			con=DriverManager.getConnection("jdbc:mysql:"+"//127.0.0.1:3306/test","root","123456");
			//ͨ���������ݿ��URL��ȡ���ݿ����Ӷ���
			System.out.println("���ݿ����ӳɹ�");
		}catch (SQLException e){
			e.printStackTrace();
		}
		return con;//������Ҫ�󷵻�һ��connection����
		
	}
	
	public static void main(String [] args){
		Conn c=new Conn();  //�����������
		c.getConnection();  //�����������ݿ�ķ���
	}

}

package net.guochen.cheer.excrcise.ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertStu {
	static Connection con;
	static PreparedStatement sql;
	static ResultSet res;
	
	public Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jsbc:mysql:"+"//127.0.0.1:3306/test","root","123456");
		}catch (Exception e){
			e.printStackTrace();
		}
		return con;
	}
		
		public static void main(String[] args) {
			InsertStu c=new InsertStu();
			con=c.getConnection();
			try{
				sql=con.prepareStatement("insert into tb_stu(name,sex,birthday) values(?,?,?)");
				sql.setString(1, "��ĳ");
				sql.setString(2, "Ů");
				sql.setString(3, "1990-10-20");
				sql.executeUpdate();
				System.out.println("���ݲ���ɹ�");
			}catch(SQLException e){
				e.printStackTrace();
				
			}
			
		}
		
	}



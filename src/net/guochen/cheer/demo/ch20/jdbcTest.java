package net.guochen.cheer.demo.ch20;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class jdbcTest {
	public static void main(String[] args)throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/huashan","root","123456");
		
		System.out.println(connection.getClass());
		
	     Statement stmt=connection.createStatement();
		System.out.println(stmt.getClass());
		ResultSet rs=stmt.executeQuery("select * from sys_log");
		
		System.out.println(rs.getClass());
		
		while (rs.next()){
			String id=rs.getString("id");
			String type=rs.getString("type");
			String title=rs.getString("title");
			Date createDate=rs.getDate("create_date");
			System.out.println(id+"\t"+type+"\t"+title+"\t"+createDate);
			
		}
		
		rs.close();
		stmt.close();
		connection.close();
	}

}

package net.guochen.cheer.sample.ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
	Connection con;//声明Connection方法
	public Connection getConnection(){  //建立返回值为Connection的方法
		try{
			Class.forName("com.mysql.jdbc.Driver");   //加载数据库驱动类
			System.out.println("数据库驱动加载成功");
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		try{
			con=DriverManager.getConnection("jdbc:mysql:"+"//127.0.0.1:3306/test","root","123456");
			//通过访问数据库的URL获取数据库连接对象
			System.out.println("数据库连接成功");
		}catch (SQLException e){
			e.printStackTrace();
		}
		return con;//按方法要求返回一个connection对象
		
	}
	
	public static void main(String [] args){
		Conn c=new Conn();  //创建本类对象
		c.getConnection();  //调用连接数据库的方法
	}

}

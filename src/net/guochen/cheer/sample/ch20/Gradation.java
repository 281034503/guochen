package net.guochen.cheer.sample.ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class Gradation {
	static Connection con;//声明Connection对象
	static Statement sql;//声明Statement对象
	static ResultSet res;//声明ResultSet对象
	
	public Connection getConnection(){//连接数据库方法
		try{
			Class.forName("con.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql:"+"//127.0.0.1:3306/test","root","123456");
		}catch (Exception e){
			e.printStackTrace();
		}
		return con;//返回Connection对象
			
		}
	public static void main(String [] args){
		Gradation c=new Gradation();//创建本类对象
		con=c.getConnection();//与数据库建立连接
		try{
			sql=(Statement) con.createStatement();//实例化Statement对象
			res=sql.executeQuery("select*from tb stu");//执行SQL语句，返回结果集
			while (res.next()){   //如果当前语句不是最后一条则进入循环
				String id=res.getString("id");//获取列名是ID的字段值
				String name=res.getString("name");//获取列名是name的字段值
				String sex=res.getString("sex");//获取列名是sex的字段值
				String birthday=res.getString("birthday");//获取列名是birthday的字段值
				System.out.print("编号:"+id);  //将列值输出
				System.out.print("姓名:"+name);
				System.out.print("性别:"+sex);
				System.out.println("生日:"+birthday);
				
			}
		}catch (Exception e){
			e.printStackTrace();
			
		}
				
	
	
	}

}

package net.guochen.cheer.sample.ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Prep {

	static Connection con;//声明Connection对象
	static ResultSet res;//声明ResultSet对象
	static PreparedStatement sql;//声明预处理对象
	
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
		Prep c=new Prep();//创建本类对象
		con=c.getConnection();//与数据库建立连接
		try{
			sql= con.prepareStatement("slect * from tb_stu"+"where id=?");//实例化预处理对象
			sql.setInt(1,4);//设置参数
			res=sql.executeQuery();//执行预处理语句
			while (res.next()){   //如果当前语句不是最后一条则进入循环
				String id=res.getString("1");//获取列名是ID的字段值
				String name=res.getString("name");//获取列名是name的字段值
				String sex=res.getString("sex");//获取列名是sex的字段值
				String birthday=res.getString("birthday");//获取列名是birthday的字段值
				System.out.print("编号:"+id);  //将列值输出
				System.out.print("姓名:"+name);
				System.out.print("性别:"+sex);
				System.out.println("生日:"+birthday);
				
			}
		}catch (Exception e){//处理异常信息
			e.printStackTrace();//输出异常信息
			
		}
	}
}



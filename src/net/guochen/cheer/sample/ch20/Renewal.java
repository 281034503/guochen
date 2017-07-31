package net.guochen.cheer.sample.ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class Renewal {

	static Connection con;//声明Connection对象
	static PreparedStatement sql;//声明声明PreparedStatement对象
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
		Renewal c=new Renewal();//创建本类对象
		con=c.getConnection();//与数据库建立连接
		try{
			sql=con.prepareStatement("select * from tb_stu");//查询数据库
			res=sql.executeQuery();//执行SQL语句
			System.out.println("执行增加、修改、删除前数据:");
			while (res.next()){   //如果当前语句不是最后一条则进入循环
				String id=res.getString("1");// 遍历查询结果集
				String name=res.getString("name");
				String sex=res.getString("sex");
				String birthday=res.getString("birthday");
				System.out.print("编号:"+id);  //将列值输出
				System.out.print("姓名:"+name);
				System.out.print("性别:"+sex);
				System.out.println("生日:"+birthday);
				
			}
			sql=con.prepareStatement("insert into tb stu(name,sex,birthday) values(?,?,?)");
			sql.setString(1, "张一");//预处理添加数据
			sql.setString(2, "女");
			sql.setString(3, "2012-12-1");
			sql.executeUpdate();
			sql=con.prepareStatement("update tb_stu set birthday"+"=? where id=?");
			sql.setString(1, "2012-12-02");// 更新数据
			sql.setInt(2, 1);//更新数据
			sql.executeUpdate();
			Statement stmt=(Statement) con.createStatement();
			stmt.executeUpdate("delete from tb_stu where id=1");//查询修改数据后的tb_stu表中数据
			sql=con.prepareStatement("select*from tb_stu");
			res=sql.executeQuery();//执行SQl语句
			System.out.println("执行增加、修改、删除后的数据:");
			while (res.next()){
				String id=res.getString(1);
				String name=res.getString("name");
				String sex = res.getString("sex");
				String birthday = res.getString("birthday");
				System.out.print("编号：" + id);
				System.out.print(" 姓名：" + name);
				System.out.print(" 性别:" + sex);
				System.out.println(" 生日：" + birthday);
			}
			
			
			
		}catch (Exception e){//处理异常信息
			e.printStackTrace();//输出异常信息
			
		}
	}			

}

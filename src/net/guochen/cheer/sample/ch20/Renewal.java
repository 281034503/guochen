package net.guochen.cheer.sample.ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class Renewal {

	static Connection con;//����Connection����
	static PreparedStatement sql;//��������PreparedStatement����
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
		Renewal c=new Renewal();//�����������
		con=c.getConnection();//�����ݿ⽨������
		try{
			sql=con.prepareStatement("select * from tb_stu");//��ѯ���ݿ�
			res=sql.executeQuery();//ִ��SQL���
			System.out.println("ִ�����ӡ��޸ġ�ɾ��ǰ����:");
			while (res.next()){   //�����ǰ��䲻�����һ�������ѭ��
				String id=res.getString("1");// ������ѯ�����
				String name=res.getString("name");
				String sex=res.getString("sex");
				String birthday=res.getString("birthday");
				System.out.print("���:"+id);  //����ֵ���
				System.out.print("����:"+name);
				System.out.print("�Ա�:"+sex);
				System.out.println("����:"+birthday);
				
			}
			sql=con.prepareStatement("insert into tb stu(name,sex,birthday) values(?,?,?)");
			sql.setString(1, "��һ");//Ԥ�����������
			sql.setString(2, "Ů");
			sql.setString(3, "2012-12-1");
			sql.executeUpdate();
			sql=con.prepareStatement("update tb_stu set birthday"+"=? where id=?");
			sql.setString(1, "2012-12-02");// ��������
			sql.setInt(2, 1);//��������
			sql.executeUpdate();
			Statement stmt=(Statement) con.createStatement();
			stmt.executeUpdate("delete from tb_stu where id=1");//��ѯ�޸����ݺ��tb_stu��������
			sql=con.prepareStatement("select*from tb_stu");
			res=sql.executeQuery();//ִ��SQl���
			System.out.println("ִ�����ӡ��޸ġ�ɾ���������:");
			while (res.next()){
				String id=res.getString(1);
				String name=res.getString("name");
				String sex = res.getString("sex");
				String birthday = res.getString("birthday");
				System.out.print("��ţ�" + id);
				System.out.print(" ������" + name);
				System.out.print(" �Ա�:" + sex);
				System.out.println(" ���գ�" + birthday);
			}
			
			
			
		}catch (Exception e){//�����쳣��Ϣ
			e.printStackTrace();//����쳣��Ϣ
			
		}
	}			

}

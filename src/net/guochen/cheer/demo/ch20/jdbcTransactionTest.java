package net.guochen.cheer.demo.ch20;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcTransactionTest {
	
		public static void main(String agrs[]) {
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.err.println(e.getMessage());
			}
			String jdbcUrl = "jdbc:mysql://localhost:3306/huashan";
			String uesr = "root";
			String password = "123456";
			Connection conn = null;
			DatabaseMetaData metaData = null;
			ResultSet rs = null;
			try {
				conn = DriverManager.getConnection(jdbcUrl, uesr, password);
				conn.setAutoCommit(false);
				conn.setSavepoint();

			    PreparedStatement ps = conn.prepareStatement("update sys_account set amost=? where id=?");
				ps.setInt(1, 50000);
				ps.setInt(2, 1);
				ps.execute();
				conn.commit();

			} catch (SQLException e) {
				System.err.println(e.getMessage());
			} finally {
				try {

					if (rs != null) {
						rs.close();
					}
					if (metaData != null) {
						metaData = null;
					}
					if (conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}

			}
		}

	}



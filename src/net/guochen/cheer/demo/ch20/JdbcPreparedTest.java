package net.guochen.cheer.demo.ch20;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class JdbcPreparedTest {
	public static void main(String agrs[]){
	      try{Class.forName("com.mysql.jdbc.Driver");
	      }catch(ClassNotFoundException e){
	    	  System.err.println(e.getMessage());
	      }
	      String jdbcUrl ="jdbc:mysql://localhost:3306/huashan";
	      String uesr="root";
	      String password="123456";
	      Connection conn=null;
	      DatabaseMetaData metaData=null;
	      ResultSet rs=null;
	      try{
	    	  conn =DriverManager.getConnection(jdbcUrl,uesr,password);
	    	  PreparedStatement ps=conn.prepareStatement("select * from sys_log limit ?,?");
	    	  
	    	  for(int i=1;i<7;i++){
	    		  ps.setInt(1, (i-1)*10+1);
	    		  ps.setInt(2, 10);
	    		  System.out.println("µÚ"+i+"Ò³µÄ¼ÇÂ¼");
	    		  rs=ps.executeQuery();
	    		  while(rs.next()){
	    			  String id =rs.getString("id");
	    			  String type=rs.getString("type");
	    			  String title=rs.getString("title");
	    			  Timestamp createDate = rs.getTimestamp("create_date");
	    			  System.out.println(id+"\t"+type+"\t"+title+"\t"+createDate);
	    		  }
	    		  
	    	  }    
	      }catch(SQLException e){
	    	  System.err.println(e.getMessage());
	      }finally{
	    	  try{
	    		  if(rs!=null){
		    		  rs.close();
		    	  }if(metaData!=null){
		    		  metaData=null;
		    	  }if(conn!=null){
		    		  conn.close();
		    	  }
	    	  }catch(SQLException e){
	    		  System.out.println(e.getMessage());
	    	  }
	    	  
	      }
	     }

}

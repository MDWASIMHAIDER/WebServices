package com.nt.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
	public static void main(String[] args) {
		/*Connection con=null;
		Statement st=null;
		String query=null;
		ResultSet rs=null;
		try {
			//register jdbc drvier s/w
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//establish the connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			//create Statement object
			if(con!=null)
				st=con.createStatement();
			//prepare SQL Query
			query="SELECT COUNT(*) FROM STUDENT";
			//send and execute SQL Query in DB s/w
			if(st!=null)
				rs=st.executeQuery(query);
			if(rs!=null) {
				rs.next();
				System.out.println("Record count::"+rs.getInt(1));
				//System.out.println("Record count::"+rs.getInt("count(*)"));
			}
		}//try
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(ClassNotFoundException  cnf) {
			cnf.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//close jdbc objs
			try {
				if(rs!=null)
					rs.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(st!=null)
					st.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			
		}//finally
*/ 	
	String str="ABCD";
	char[] ch=str.toCharArray();
	for(int i=0;i<ch.length;i++) {
	//	if(i<=count) {
			for(int j=0;j<=i;j++) {
				System.out.print(ch[j]);
			}System.out.println(" ");
//	}
	}
	}//main
}//class



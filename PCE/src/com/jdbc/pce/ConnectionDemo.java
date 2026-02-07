package com.jdbc.pce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		String url = "jdbc:mysql://localhost:3306/collage?useSSL=false&serverTimezone=UTC";
		
		String user="root";
		String pass="$Uju1432";
		String sql ="Select * from Student";
		
		//1) Loading the driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//2)Establishing the connection 
		Connection con= DriverManager.getConnection(url, user, pass);
		
		// 3)create statement 
		
		Statement st= con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		
		
	}

}

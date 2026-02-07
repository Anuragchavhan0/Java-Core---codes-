package com.jdbc.pce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CreateTableApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/collage?useSSL=false&serverTimezone=UTC";
			String user="root";
			String pass="$Uju1432";
		
	   	    String query = "INSERT INTO phone values (? , ? , ?)";
		
	        Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver loaded succesfully ");
				
				Connection con= DriverManager.getConnection(url, user, pass);
				System.out.println("connectionn Established Successfully");
				
				PreparedStatement pst= con.prepareStatement(query);
				
				
				Scanner sc = new Scanner(System.in);
				System.out.println(" Please enter id ");
				int id= sc.nextInt();
				System.out.println(" Please enter brand ");
				String brand=sc.next();
				System.out.println(" Please enter price ");
				int price= sc.nextInt();

				  pst.setInt(1, id);
				  pst.setString(2, brand);	
				  pst.setInt(3, price);
				  
				  pst.executeUpdate();
					

				pst.close();
				con.close();
				
				
	}

}

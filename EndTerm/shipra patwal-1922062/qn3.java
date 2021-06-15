package com.database.program;
import java.sql.*;
import java.util.Scanner;



public class DataPrepared {

	public static void main(String[] args) {
		
		try {
			

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url ="jdbc:mysql://localhost:///db1";
			String user ="root";
			String password ="Shipra8218#";
			Connection con=DriverManager.getConnection(url, user, password);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Name");
			String Name=sc.next();
			System.out.println("Enter Roll_Number");
			int Roll_Number=sc.nextInt();
			System.out.println("Enter percentage");
			double percentage=sc.nextDouble();
			
			String sql="insert into student(?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, Name);
			pst.setInt(2, Roll_Number);
			pst.setDouble(3, percentage);
			int c=pst.executeUpdate();
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery("select * from student");
			while(rs.next())
			{
			
			System.out.println("Name of student"+rs.getString(1));
			System.out.println("Roll_Number of student"+rs.getInt(2));
			System.out.println("percentage of student"+rs.getDouble(3));
			}
			if(Roll_Number >= 64)
			{
			System.out.println("INVALID throw Exception"+Roll_Number);
		}
		else
			{
				System.out.println("Roll_Number :"+Roll_Number);
		}
			pst.close();
			con.close();
			
			
		}
		catch(ClassNotFoundException c){
			c.printStackTrace();	
		}

		catch(SQLException s){
			s.printStackTrace();
		}
		}
	

	}


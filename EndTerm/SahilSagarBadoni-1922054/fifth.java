package com.database.programs;
import java.util.*;
import java.sql.*;
public class fifth {

	public static void main(String[] args) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/db1","root","a41d89bc");
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter the Rollno:");
					int Rollno=sc.nextInt();
					if(Rollno>0 && Rollno<=63)
						System.out.println("Valid Rollno");
					else
						throw new ArithmeticException("Invalid Rollno");
					System.out.println("Enter the name of the student:");
					String Name=sc.next();
					System.out.println("Enter the percentage:");
					Double percentage=sc.nextDouble();
					String sql="Insert into Student values(?,?,?)";
					PreparedStatement ptm=con.prepareStatement(sql);
					ptm.setString(1, Name);
					ptm.setInt(2, Rollno);
					ptm.setDouble(3, percentage);
					int c=ptm.executeUpdate();
					if(c!=0)
					{
						System.out.println("Data Inserted"+" "+c);
					}
					else
					{
						System.out.println("Data Not Inserted");
					}
					ptm.close();
					con.close();
				}
				catch(SQLException s)
				{
					s.printStackTrace();
				}
				catch(ClassNotFoundException c)
				{
					c.printStackTrace();
				}
			}



	}

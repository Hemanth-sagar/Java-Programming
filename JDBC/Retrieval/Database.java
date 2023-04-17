package com.mysqlprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabasePgm {

		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inputStreamReader);
		
		Registeration registeration = new Registeration();
		int result;
		public static Connection getConn() throws SQLException, ClassNotFoundException{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/ltiStudent","root","12345678");
			return c;
		}
		void insertData() {
			
			try {
				System.out.println("Enter Registeration Number:");
				registeration.setRegisteration(Integer.parseInt(br.readLine()));
				System.out.println("Enter the Name:");
				registeration.setName(br.readLine());
				System.out.println("Enter the Department:");
				registeration.setDept(br.readLine());
				System.out.println("Enter registeration mobileno:");
				registeration.setMobileno(Long.parseLong(br.readLine()));
				
				Connection c = getConn();
				//interface
				PreparedStatement ps = c.prepareStatement("insert into registeration (registerno,name,dept,mobileNumber) values(?,?,?,?)");
				ps.setInt(1, registeration.getRegisteration());
				ps.setString(2, registeration.getName());
				ps.setString(3, registeration.getDept());
				ps.setLong(4, registeration.getMobileno());
				//for executing statement
				result = ps.executeUpdate();
				if(result>0) {
					System.out.println("Insertion done successfully");
				}else {
					System.out.println("Error in Insertion");
				}
				
			}catch(IOException ioe) {
				System.out.println("Exception is"+ioe.getMessage());
			}catch(ClassNotFoundException cn) {
				System.out.println("Exception is"+cn.getMessage());
			}catch(SQLException sqle) {
				System.out.println("Exception is "+sqle.getMessage());
			}
		}
		void reterivalData() throws NumberFormatException, IOException {
			System.out.println("Enter the registeration number u want to retrieve");
			registeration.setRegisteration(Integer.parseInt(br.readLine()));
			try {
				Connection c = getConn();
				PreparedStatement ps=c.prepareStatement("select * from registeration where registerNo=?" );
				ps.setInt(1, registeration.getRegisteration());
				ResultSet resultSet = ps.executeQuery();
				while(resultSet.next()) {
					System.out.println("Register Number is :"+resultSet.getInt(2));
					System.out.println("Name is:"+resultSet.getString(3));
					System.out.println("Department is:"+resultSet.getString(4));
					System.out.println("Mobile number is:"+resultSet.getString(5));
				}
				
				
			}catch(Exception e) {
				System.out.println("Exception :"+e.getMessage());
			}
		}
		
		void check() throws NumberFormatException, IOException {
			System.out.println("---------Welcome to JDBC Operation----------");
			System.out.println("Enter below options:\n1.Insert \n2.Reterival \n3.Update \n4.Deletion");
			int option=Integer.parseInt(br.readLine());
			switch (option) {
			case 1:
				this.insertData();
				break;
			case 2:
				this.reterivalData();
				break;
			case 3:
				System.out.println("fill code for this");
				break;
			case 4:
				System.out.println("fill code for this");
				break;
			default:
				System.out.println("Enter the correct choice");
				this.check();
				break;
			
				
					
			}
			
		}
		
		
		public static void main(String[] args) throws NumberFormatException, IOException {
			DatabasePgm dp = new DatabasePgm();
			dp.check();
//			dp.insertData();
//			dp.reterivalData();
		}


}

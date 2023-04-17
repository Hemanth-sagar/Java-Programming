package com.mysqlprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabasePgm {

		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inputStreamReader);
		
		Registeration registeration = new Registeration();
		int result;
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
				
				Class.forName("com.mysql.cj.jdbc.Driver");
															//link--                dbname,     user,password
				Connection c = DriverManager.getConnection("jdbc:mysql://localhost/ltiStudent","root","12345678");
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
		public static void main(String[] args) {
			DatabasePgm dp = new DatabasePgm();
			dp.insertData();
		}


}

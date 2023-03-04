package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&serverTimeZone=UTC";
		String username = "hbstudent";
		String password = "hbstudent";
		try {
			Connection myConn = DriverManager.getConnection(url,username,password);
			System.out.println("connection");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

package com.mcflapps.FitnessApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
//	Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Alien.class); 	
//	
//	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//	SessionFactory sf = con.buildSessionFactory(reg);
//	
//	Session session = sf.openSession();
//	
//	Transaction tx = session.beginTransaction();
	
	static Connection conn = null;
	Statement stmt = null;
	
	public static Connection getConnection() throws Exception {
		try {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/fitness_app";
		String username = "";
		String password = "";
		
		Class.forName(driver);
		
		
		conn = DriverManager.getConnection(url, username, password);
		System.out.println("Connected");

		return conn;
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public static void connection() {
		try {
			Connection conn = getConnection();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	

}


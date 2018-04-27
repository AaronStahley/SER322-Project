package main.java.project.server;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlConnection{
	
	private String userName = "ser322";
	private String password = "Mz0XVgQ_9?Cc";
	private String databaseName = "bank"; 
	
	private boolean isConnected = false; 
	
	public SqlConnection() {
		
	}
	

	
	public Connection connectToLocal(String userName, String password, String databaseName) {
		
		
		databaseName = databaseName + "?useSSL=false";
			
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			
			
			Connection con = DriverManager.getConnection(  
			"jdbc:mysql://den1.mysql1.gear.host/",userName,password);  
			isConnected = true; 
			return con; 
			}catch(Exception e){ System.out.println(e);}
		
		return null; 

	}
	
	public Connection getConnection() {
		
		return connectToLocal(this.userName, this.password, this.databaseName);
		
	}
	
	public boolean isConnected() {
		
		connectToLocal(this.userName, this.password, this.databaseName);
		
		return isConnected; 
	}


}

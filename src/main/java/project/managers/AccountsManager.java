package main.java.project.managers;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Vector;

import main.java.project.server.SqlConnection;

public class AccountsManager {
	
	static SqlConnection con =  new SqlConnection();
	
	static Vector<Account> accounts = new Vector();
	
	AccountsManager() {
		 
	}
	
	public static void populateFromSQL() {
		
		accounts.clear();

		
		String query = "select accID, accType, balance, dateCreated " +
	               "from " + "bank" + ".account";
		 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	
	        	accounts.addElement(new Account(rs.getInt("accID"),rs.getString("accType"),
	        			 rs.getFloat("balance"),rs.getDate("dateCreated")));
	        
	        }
	 
	    } catch (SQLException e ) {
	    }

	}
	
	public static void getAcountsGreater(int value) {
		
		accounts.clear();

		String query = "SELECT accID, accType, balance, dateCreated " +
	               "FROM " + "bank" + ".account Where balance >" + value;

		try {
			
			Statement stmt = con.getConnection().createStatement();
		    ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	accounts.addElement(new Account(rs.getInt("accID"),rs.getString("accType"),
	        			 rs.getFloat("balance"),rs.getDate("dateCreated")));
	        
	        }
	     
	    } catch (SQLException e ) {
	    	System.out.println("QUERY WRONG");
	    }

	}
	
	public static void getAcountsLess(int value) {
		
		accounts.clear();

		String query = "SELECT accID, accType, balance, dateCreated " +
	               "FROM " + "bank" + ".account Where balance <" + value;

		try {
			
			Statement stmt = con.getConnection().createStatement();
		    ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	accounts.addElement(new Account(rs.getInt("accID"),rs.getString("accType"),
	        			 rs.getFloat("balance"),rs.getDate("dateCreated")));
	        
	        }
	     
	    } catch (SQLException e ) {
	    	System.out.println("QUERY WRONG");
	    }

	}
	
    public static Collection<Account> getAccounts() {
    
        return accounts;
    }
	
	
	

}

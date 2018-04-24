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
	
	private static SqlConnection con =  new SqlConnection();
	
	private static Vector<Account> accounts = new Vector();
	
	AccountsManager() {
		 
	}
	
	/**
	 * @author Aaron Stahley 4/23/2018
	 * Gets all data from the accounts table
	 */
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
	
	/**
	 * @author Aaron Stahley 4/23/2018
	 * Gets accounts greater than a value.
	 * @param value number you want to find accounts greater than
	 */
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
	    	System.out.println("QUERY WRONG - getAcountsGreater");
	    }

	}
	
	/**
	 * @author Aaron Stahley 4/23/2018
	 * Gets accounts with balance less than value.
	 * @param value number you want to find accounts less than than
	 */
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
	    	System.out.println("QUERY WRONG - getAcountsLess");
	    }

	}
	
	/**
	 * @author Aaron Stahley 4/23/2018
	 * Gets accounts with balance equal to value.
	 * @param value number you want to find accounts equal to
	 */
	public static void getAcountsBalance(int value) {
			
			accounts.clear();
	
			String query = "SELECT accID, accType, balance, dateCreated " +
		               "FROM " + "bank" + ".account Where balance =" + value;
	
			try {
				
				Statement stmt = con.getConnection().createStatement();
			    ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	accounts.addElement(new Account(rs.getInt("accID"),rs.getString("accType"),
		        			 rs.getFloat("balance"),rs.getDate("dateCreated")));
		        
		        }
		     
		    } catch (SQLException e ) {
		    	System.out.println("QUERY WRONG - getAcountsBalance");
		    }
	
		}
	
	/**
	 * Returns Accounts with ID matching the given input. 
	 * should only ever populate account vector with one
	 * account since ID's are unique.
	 * @author aaronstahley 04/23/2018
	 * @param accID an integer value of an accountID
	 */
	public static void getAcountsID(int accID) {
		
		accounts.clear();

		String query = "SELECT accID, accType, balance, dateCreated " +
	               "FROM " + "bank" + ".account Where accID =" + accID;

		try {
			
			Statement stmt = con.getConnection().createStatement();
		    ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	accounts.addElement(new Account(rs.getInt("accID"),rs.getString("accType"),
	        			 rs.getFloat("balance"),rs.getDate("dateCreated")));
	        
	        }
	     
	    } catch (SQLException e ) {
	    	System.out.println("QUERY WRONG - getAcountsID");
	    }

	}
	
	/**
	 * Returns all accounts with account type matching the string input. 
	 * @author aaronstahley 04/23/2018
	 * @param accType type of account. 
	 */
	public static void getAcountsWithType(String accType) {
			
			accounts.clear();
	
			String query = "SELECT accID, accType, balance, dateCreated " +
		               "FROM " + "bank" + ".account Where accType =" + "'" + accType + "'";
	
			try {
				
				Statement stmt = con.getConnection().createStatement();
			    ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	accounts.addElement(new Account(rs.getInt("accID"),rs.getString("accType"),
		        			 rs.getFloat("balance"),rs.getDate("dateCreated")));
		        
		        }
		     
		    } catch (SQLException e ) {
		    	System.out.println("QUERY WRONG - getAcountsWithType");
		    }
	
		}
		
		
		
	/**
	 * @author Aaron Stahley 4/23/2018
	 * Gets all accounts in the vector
	 * @return account vector
	 */
    public static Collection<Account> getAccounts() {
    
        return accounts;
    }
    
    	


}

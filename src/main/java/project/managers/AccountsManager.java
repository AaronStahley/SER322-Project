package main.java.project.managers;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Collection;
import java.util.Vector;

import main.java.project.server.SqlConnection;
import main.java.project.view.AccountsPanel;

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

		
		String query = "select account.accID, accType, balance, dateCreated, fName, lName " + 
	               "from  ser322.account,ser322.customer " + 
	               "WHERE  customer.accID = account.accID " +
	               "ORDER BY balance DESC";
		 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	
	        	accounts.addElement(new Account(rs.getInt("accID"),rs.getString("accType"),
	        			 rs.getFloat("balance"),rs.getDate("dateCreated"), rs.getString("fName"), rs.getString("lName")));
	        
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
		
		String query = "select account.accID, accType, balance, dateCreated, fName, lName " + 
	               "from  ser322.account,ser322.customer " + 
	               "WHERE  customer.accID = account.accID AND balance >" + value;

		

		try {
			
			Statement stmt = con.getConnection().createStatement();
		    ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	accounts.addElement(new Account(rs.getInt("accID"),rs.getString("accType"),
	        			 rs.getFloat("balance"),rs.getDate("dateCreated"), rs.getString("fName"), rs.getString("lName")));
	        
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

		String query = "select account.accID, accType, balance, dateCreated, fName, lName " + 
	               "from  ser322.account,ser322.customer " + 
	               "WHERE  customer.accID = account.accID AND balance <" + value;

		try {
			
			Statement stmt = con.getConnection().createStatement();
		    ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	accounts.addElement(new Account(rs.getInt("accID"),rs.getString("accType"),
	        			 rs.getFloat("balance"),rs.getDate("dateCreated"), rs.getString("fName"), rs.getString("lName")));
	        
	        }
	     
	    } catch (SQLException e ) {
	    	System.out.println("QUERY WRONG - getAcountsLess");
	    }

	}
	
	/**
	 * Gets accounts with balance equal to value.
	 * @author Aaron Stahley 4/23/2018
	 * @param value number you want to find accounts equal to
	 */
	public static void getAcountsBalance(int value) {
			
			accounts.clear();

			String query = "select account.accID, accType, balance, dateCreated, fName, lName " + 
		               "from  ser322.account,ser322.customer " + 
		               "WHERE  customer.accID = account.accID AND balance =" + value;
	
			try {
				
				Statement stmt = con.getConnection().createStatement();
			    ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	accounts.addElement(new Account(rs.getInt("accID"),rs.getString("accType"),
		        			 rs.getFloat("balance"),rs.getDate("dateCreated"), rs.getString("fName"), rs.getString("lName")));
		        
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

		String query = "select account.accID, accType, balance, dateCreated, fName, lName " + 
	               "from  ser322.account,ser322.customer " + 
	               "WHERE  customer.accID = account.accID AND account.accID =" + accID;

		try {
			
			Statement stmt = con.getConnection().createStatement();
		    ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	accounts.addElement(new Account(rs.getInt("accID"),rs.getString("accType"),
	        			 rs.getFloat("balance"),rs.getDate("dateCreated"), rs.getString("fName"), rs.getString("lName")));
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
			
			String query = "select account.accID, accType, balance, dateCreated, fName, lName " + 
		               "from  ser322.account,ser322.customer " + 
		               "WHERE  customer.accID = account.accID AND accType =" + "'" + accType + "'";
	
			try {
				
				Statement stmt = con.getConnection().createStatement();
			    ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	accounts.addElement(new Account(rs.getInt("accID"),rs.getString("accType"),
		        			 rs.getFloat("balance"),rs.getDate("dateCreated"), rs.getString("fName"), rs.getString("lName")));
		        
		        }
		     
		    } catch (SQLException e ) {
		    	System.out.println("QUERY WRONG - getAcountsWithType");
		    }
	
		}
	
	/**
	 * Returns all accounts with first name type matching the string input. 
	 * @author aaronstahley 04/23/2018
	 * @param firstName account Name 
	 */
	public static void getAcountsWithfName(String firstName) {
			
			accounts.clear();
			
			String query = "select account.accID, accType, balance, dateCreated, fName, lName " + 
		               "from  ser322.account,ser322.customer " + 
		               "WHERE  customer.accID = account.accID AND fName =" + "'" + firstName + "'";
	
			try {
				
				Statement stmt = con.getConnection().createStatement();
			    ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	accounts.addElement(new Account(rs.getInt("accID"),rs.getString("accType"),
		        			 rs.getFloat("balance"),rs.getDate("dateCreated"), rs.getString("fName"), rs.getString("lName")));
		        
		        }
		     
		    } catch (SQLException e ) {
		    	System.out.println("QUERY WRONG - getAcountsWithfName");
		    }
	
		}
	
	/**
	 * Returns all accounts with last name type matching the string input. 
	 * @author aaronstahley 04/23/2018
	 * @param firstName account Name 
	 */
	public static void getAcountsWithlName(String lastName) {
			
			accounts.clear();
			
			String query = "select account.accID, accType, balance, dateCreated, fName, lName " + 
		               "from  ser322.account,ser322.customer " + 
		               "WHERE  customer.accID = account.accID AND lName =" + "'" + lastName + "'";
	
			try {
				
				Statement stmt = con.getConnection().createStatement();
			    ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	accounts.addElement(new Account(rs.getInt("accID"),rs.getString("accType"),
		        			 rs.getFloat("balance"),rs.getDate("dateCreated"), rs.getString("fName"), rs.getString("lName")));
		        
		        }
		     
		    } catch (SQLException e ) {
		    	System.out.println("QUERY WRONG - getAcountsWithlName");
		    }
	
		}
	
	/**
	 * Returns all accounts created after specified date
	 * @author aaronstahley 04/23/2018
	 * @param date 
	 */
	public static void getAccountDateAfter(java.util.Date date) {
		
		
	    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		
		accounts.clear();
		
		String query = "select account.accID, accType, balance, dateCreated, fName, lName " + 
	               "from  ser322.account,ser322.customer " + 
	               "WHERE  customer.accID = account.accID AND dateCreated >" + "'" + sqlDate + "'";

		try {
			
			Statement stmt = con.getConnection().createStatement();
		    ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	accounts.addElement(new Account(rs.getInt("accID"),rs.getString("accType"),
	        			 rs.getFloat("balance"),rs.getDate("dateCreated"), rs.getString("fName"), rs.getString("lName")));
	        
	        }
	     
	    } catch (SQLException e ) {
	    	System.out.println("QUERY WRONG - getAccountDateAfter");
	    }

	}
	
	/**
	 * Returns all accounts created before specified date
	 * @author aaronstahley 04/23/2018
	 * @param date
	 */
	public static void getAccountDateBefore(java.util.Date date) {
			
			
		    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			
			accounts.clear();
	
			String query = "select account.accID, accType, balance, dateCreated, fName, lName " + 
		               "from  ser322.account,ser322.customer " + 
		               "WHERE  customer.accID = account.accID AND dateCreated <" + "'" + sqlDate + "'";
	
			try {
				
				Statement stmt = con.getConnection().createStatement();
			    ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	accounts.addElement(new Account(rs.getInt("accID"),rs.getString("accType"),
		        			 rs.getFloat("balance"),rs.getDate("dateCreated"), rs.getString("fName"), rs.getString("lName")));
		        }
		     
		    } catch (SQLException e ) {
		    	System.out.println("QUERY WRONG - getAccountDateBefore");
		    }
	
		}
		
	/**
	 * Returns all accounts created on specified date
	 * @author aaronstahley 04/23/2018
	 * @param date
	 */
	public static void getAccountCreatedOn(java.util.Date date) {
		
	
	    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		
		accounts.clear();

		String query = "select account.accID, accType, balance, dateCreated, fName, lName " + 
	               "from  ser322.account,ser322.customer " + 
	               "WHERE  customer.accID = account.accID AND dateCreated =" + "'" + sqlDate + "'";

		try {
			
			Statement stmt = con.getConnection().createStatement();
		    ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	accounts.addElement(new Account(rs.getInt("accID"),rs.getString("accType"),
	        			 rs.getFloat("balance"),rs.getDate("dateCreated"), rs.getString("fName"), rs.getString("lName")));
	        
	        }
	     
	    } catch (SQLException e ) {
	    	System.out.println("QUERY WRONG - getAccountCreatedOn");
	    }

	}
	
	public static void getDescBalance() {
		
				
		accounts.clear();

		String query = "select account.accID, accType, balance, dateCreated, fName, lName " + 
	               "from  ser322.account,ser322.customer " + 
	               "WHERE  customer.accID = account.accID " +
	               "ORDER BY balance ASC";

		try {
			
			Statement stmt = con.getConnection().createStatement();
		    ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	accounts.addElement(new Account(rs.getInt("accID"),rs.getString("accType"),
	        			 rs.getFloat("balance"),rs.getDate("dateCreated"), rs.getString("fName"), rs.getString("lName")));
	        
	        }
	     
	    } catch (SQLException e ) {
	    	System.out.println("QUERY WRONG - getDescBalance");
	    }

	}
	
	public static void addAccount(String accType, float balance, String fName, String lName, float interest) {
		
		
		// create a Statement from the connection
		Statement stmt;
		try {
			stmt = con.getConnection().createStatement();
			// insert the data
			
			java.sql.Date currentDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());

			
			stmt.executeUpdate("INSERT INTO ser322.account " + "VALUES (NULL, '" + accType + "', " + balance + ", '" + currentDate + "'); " +
			"SET @last_id_in_account = Last_INSERT_ID();" + 
			"INSERT INTO interest_rate VALUES(@last_id_in_account, (SELECT accType FROM account WHERE accID = @last_id_in_account)," + interest + ");");
			
		} catch (SQLException e) {
			System.out.println("[ERROR] - Add Account Error");
			e.printStackTrace();
		}
		
		AccountsManager.populateFromSQL();
		AccountsPanel.refreshTabel(); 
	     

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

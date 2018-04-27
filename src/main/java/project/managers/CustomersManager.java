package main.java.project.managers;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Vector;

import main.java.project.server.SqlConnection;

public class CustomersManager {

	
	private static SqlConnection con =  new SqlConnection();
	
	private static Vector<Customer> customers = new Vector();
	
	public CustomersManager() {
		
	}
	
	public static void populateFromSQL() {
			
			customers.clear();
			
			
			String query = "select customer.SSN, customer.accID, fName, lName, dateJoined, DOB, stNum, stName, city, state, zip, email " +
		               "from ser322.customer, ser322.email " +
		               "where email.SSN = customer.SSN";
			
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	customers.addElement(new Customer(rs.getString("SSN"), rs.getInt("accID"), rs.getString("fName"),
		        			rs.getString("lName"), rs.getDate("dateJoined"), rs.getDate("DOB"), rs.getInt("stNum"),
		        			rs.getString("stName"), rs.getString("city"), rs.getString("state"), rs.getInt("zip"), rs.getString("email")));
		        }
		 
		    } catch (SQLException e ) {
		    		System.out.println("QUERY WRONG"); 
		    }
			
		}
	
	/**
	 * Returns customer with specified SSN
	 * @author aaronstahley 04/26/2018
	 * @param ssn customers unique ssn
	 */
	public static void getCustomersSSN(String ssn) {
		
		customers.clear();
	
		
		String query = "select customer.SSN, customer.accID, fName, lName, dateJoined, DOB, stNum, stName, city, state, zip, email " +
	               "from ser322.customer, ser322.email " +
	               "where email.SSN = customer.SSN AND customer.SSN ="  + "'" + ssn + "'";
		
		 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	
	        	customers.addElement(new Customer(rs.getString("SSN"), rs.getInt("accID"), rs.getString("fName"),
	        			rs.getString("lName"), rs.getDate("dateJoined"), rs.getDate("DOB"), rs.getInt("stNum"),
	        			rs.getString("stName"), rs.getString("city"), rs.getString("state"), rs.getInt("zip"), rs.getString("email")));
	        }
	 
	    } catch (SQLException e ) {
	    		System.out.println("QUERY WRONG - getCustomersSSN"); 
	    }
		
	}
	
	/**
	 * Returns a customers with accID 
	 * @author aaronstahley 04/26/2018
	 * @param ssn customers accID
	 */
	public static void getCustomersAccID(String accID) {
		
		customers.clear();
	
		
		String query = "select customer.SSN, customer.accID, fName, lName, dateJoined, DOB, stNum, stName, city, state, zip, email " +
	               "from ser322.customer, ser322.email " +
	               "where email.SSN = customer.SSN AND customer.accID ="  + "'" + accID + "'";
		
		 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	
	        	customers.addElement(new Customer(rs.getString("SSN"), rs.getInt("accID"), rs.getString("fName"),
	        			rs.getString("lName"), rs.getDate("dateJoined"), rs.getDate("DOB"), rs.getInt("stNum"),
	        			rs.getString("stName"), rs.getString("city"), rs.getString("state"), rs.getInt("zip"), rs.getString("email")));
	        }
	 
	    } catch (SQLException e ) {
	    		System.out.println("QUERY WRONG - getCustomersAccID"); 
	    }
		
	}
	
	/**
	 * Returns a customers with firstName 
	 * @author aaronstahley 04/26/2018
	 * @param fName name of customers to retrieve
	 */
	public static void getCustomersfName(String fName) {
		
		customers.clear();
	
		String query = "select customer.SSN, customer.accID, fName, lName, dateJoined, DOB, stNum, stName, city, state, zip, email " +
	               "from ser322.customer, ser322.email " +
	               "where email.SSN = customer.SSN AND fName ="  + "'" + fName + "'";
	 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	
	        	customers.addElement(new Customer(rs.getString("SSN"), rs.getInt("accID"), rs.getString("fName"),
	        			rs.getString("lName"), rs.getDate("dateJoined"), rs.getDate("DOB"), rs.getInt("stNum"),
	        			rs.getString("stName"), rs.getString("city"), rs.getString("state"), rs.getInt("zip"), rs.getString("email")));
	        }
	 
	    } catch (SQLException e ) {
	    		System.out.println("QUERY WRONG - getCustomersfName"); 
	    }
		
	}
	
	/**
	 * Returns a customers with lastName 
	 * @author aaronstahley 04/26/2018
	 * @param lName name of customers to retrieve
	 */
	public static void getCustomerslName(String lName) {
		
		customers.clear();
	
		String query = "select customer.SSN, customer.accID, fName, lName, dateJoined, DOB, stNum, stName, city, state, zip, email " +
	               "from ser322.customer, ser322.email " +
	               "where email.SSN = customer.SSN AND lName ="  + "'" + lName + "'";
	 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	
	        	customers.addElement(new Customer(rs.getString("SSN"), rs.getInt("accID"), rs.getString("fName"),
	        			rs.getString("lName"), rs.getDate("dateJoined"), rs.getDate("DOB"), rs.getInt("stNum"),
	        			rs.getString("stName"), rs.getString("city"), rs.getString("state"), rs.getInt("zip"), rs.getString("email")));
	        }
	 
	    } catch (SQLException e ) {
	    		System.out.println("QUERY WRONG - getCustomerslName"); 
	    }
		
	}
	
	/**
	 * Returns a customers by date Joined
	 * @author aaronstahley 04/26/2018
	 * @param date
	 */
	public static void getCustomersDateJoined(java.util.Date date) {
		
	    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		
		customers.clear();
	
		String query = "select customer.SSN, customer.accID, fName, lName, customer.dateJoined, DOB, stNum, stName, city, state, zip, email " +
	               "from ser322.customer, ser322.email " +
	               "where email.SSN = customer.SSN AND customer.dateJoined ="  + "'" + sqlDate + "'";
	 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	customers.addElement(new Customer(rs.getString("SSN"), rs.getInt("accID"), rs.getString("fName"),
	        			rs.getString("lName"), rs.getDate("dateJoined"), rs.getDate("DOB"), rs.getInt("stNum"),
	        			rs.getString("stName"), rs.getString("city"), rs.getString("state"), rs.getInt("zip"), rs.getString("email")));
	        }
	 
	    } catch (SQLException e ) {
	    		System.out.println("QUERY WRONG - getCustomersDateJoined"); 
	    }
		
	}
	
	/**
	 * Returns a customers by dob
	 * @author aaronstahley 04/26/2018
	 * @param date
	 */
	public static void getCustomersDob(java.util.Date date) {
		
	    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		
		customers.clear();
	
		String query = "select customer.SSN, customer.accID, fName, lName, customer.dateJoined, DOB, stNum, stName, city, state, zip, email " +
	               "from ser322.customer, ser322.email " +
	               "where email.SSN = customer.SSN AND customer.DOB ="  + "'" + sqlDate + "'";
	 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	customers.addElement(new Customer(rs.getString("SSN"), rs.getInt("accID"), rs.getString("fName"),
	        			rs.getString("lName"), rs.getDate("dateJoined"), rs.getDate("DOB"), rs.getInt("stNum"),
	        			rs.getString("stName"), rs.getString("city"), rs.getString("state"), rs.getInt("zip"), rs.getString("email")));
	        }
	 
	    } catch (SQLException e ) {
	    		System.out.println("QUERY WRONG - getCustomersDob"); 
	    }
		
	}
	
	/**
	 * Returns a customers by street number
	 * @author aaronstahley 04/26/2018
	 * @param stNum
	 */
	public static void getCustomersstNum(int stNum) {
		
		
		customers.clear();
	
		String query = "select customer.SSN, customer.accID, fName, lName, customer.dateJoined, DOB, stNum, stName, city, state, zip, email " +
	               "from ser322.customer, ser322.email " +
	               "where email.SSN = customer.SSN AND customer.stNum ="  + stNum; 
	 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	customers.addElement(new Customer(rs.getString("SSN"), rs.getInt("accID"), rs.getString("fName"),
	        			rs.getString("lName"), rs.getDate("dateJoined"), rs.getDate("DOB"), rs.getInt("stNum"),
	        			rs.getString("stName"), rs.getString("city"), rs.getString("state"), rs.getInt("zip"), rs.getString("email")));
	        }
	 
	    } catch (SQLException e ) {
	    		System.out.println("QUERY WRONG - getCustomersstNum"); 
	    }
		
	}
	
	public static void getCustomersStName(String stName) {
		
		customers.clear();
	
		String query = "select customer.SSN, customer.accID, fName, lName, dateJoined, DOB, stNum, stName, city, state, zip, email " +
	               "from ser322.customer, ser322.email " +
	               "where email.SSN = customer.SSN AND stName ="  + "'" + stName + "'";
	 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	
	        	customers.addElement(new Customer(rs.getString("SSN"), rs.getInt("accID"), rs.getString("fName"),
	        			rs.getString("lName"), rs.getDate("dateJoined"), rs.getDate("DOB"), rs.getInt("stNum"),
	        			rs.getString("stName"), rs.getString("city"), rs.getString("state"), rs.getInt("zip"), rs.getString("email")));
	        }
	 
	    } catch (SQLException e ) {
	    		System.out.println("QUERY WRONG - getCustomerslstName"); 
	    }
		
	}
	

	public static void getCustomersCity(String city) {
		
		customers.clear();
	
		String query = "select customer.SSN, customer.accID, fName, lName, dateJoined, DOB, stNum, stName, city, state, zip, email " +
	               "from ser322.customer, ser322.email " +
	               "where email.SSN = customer.SSN AND city ="  + "'" + city + "'";
	 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	
	        	customers.addElement(new Customer(rs.getString("SSN"), rs.getInt("accID"), rs.getString("fName"),
	        			rs.getString("lName"), rs.getDate("dateJoined"), rs.getDate("DOB"), rs.getInt("stNum"),
	        			rs.getString("stName"), rs.getString("city"), rs.getString("state"), rs.getInt("zip"), rs.getString("email")));
	        }
	 
	    } catch (SQLException e ) {
	    		System.out.println("QUERY WRONG - getCustomersCity"); 
	    }
		
	}
		
	public static void getCustomersState(String state) {
			
			customers.clear();
		
			String query = "select customer.SSN, customer.accID, fName, lName, dateJoined, DOB, stNum, stName, city, state, zip, email " +
		               "from ser322.customer, ser322.email " +
		               "where email.SSN = customer.SSN AND state ="  + "'" + state + "'";
		 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	customers.addElement(new Customer(rs.getString("SSN"), rs.getInt("accID"), rs.getString("fName"),
		        			rs.getString("lName"), rs.getDate("dateJoined"), rs.getDate("DOB"), rs.getInt("stNum"),
		        			rs.getString("stName"), rs.getString("city"), rs.getString("state"), rs.getInt("zip"), rs.getString("email")));
		        }
		 
		    } catch (SQLException e ) {
		    		System.out.println("QUERY WRONG - getCustomersCity"); 
		    }
			
		}
	
	public static void getCustomersZip(int zip) {
		
		
		customers.clear();
	
		String query = "select customer.SSN, customer.accID, fName, lName, customer.dateJoined, DOB, stNum, stName, city, state, zip, email " +
	               "from ser322.customer, ser322.email " +
	               "where email.SSN = customer.SSN AND customer.zip ="  + zip; 
	 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	customers.addElement(new Customer(rs.getString("SSN"), rs.getInt("accID"), rs.getString("fName"),
	        			rs.getString("lName"), rs.getDate("dateJoined"), rs.getDate("DOB"), rs.getInt("stNum"),
	        			rs.getString("stName"), rs.getString("city"), rs.getString("state"), rs.getInt("zip"), rs.getString("email")));
	        }
	 
	    } catch (SQLException e ) {
	    		System.out.println("QUERY WRONG - getCustomersZip"); 
	    }
	}
	
	
	public static void getCustomersEmail(String email) {
			
			customers.clear();
		
			String query = "select customer.SSN, customer.accID, fName, lName, dateJoined, DOB, stNum, stName, city, state, zip, email " +
		               "from ser322.customer, ser322.email " +
		               "where email.SSN = customer.SSN AND email ="  + "'" + email + "'";
		 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	customers.addElement(new Customer(rs.getString("SSN"), rs.getInt("accID"), rs.getString("fName"),
		        			rs.getString("lName"), rs.getDate("dateJoined"), rs.getDate("DOB"), rs.getInt("stNum"),
		        			rs.getString("stName"), rs.getString("city"), rs.getString("state"), rs.getInt("zip"), rs.getString("email")));
		        }
		 
		    } catch (SQLException e ) {
		    		System.out.println("QUERY WRONG - getCustomersCity"); 
		    }
			
		}
		
		




    public static Collection<Customer> getCustomers() {
        
        return customers;
    }
}

package main.java.project.managers;

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
			
			String query = "select SSN, accID, fName, lName, dateJoined, DOB, stNum, stName, city, state, zip " +
		               "from " + "ser322" + ".customer";
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	customers.addElement(new Customer(rs.getInt("SSN"),rs.getInt("accID"),
		        			 rs.getString("fName"),rs.getString("lName"), rs.getDate("dateJoined"), rs.getDate("DOB"), rs.getInt("stNum"),
		        			 rs.getString("stName"), rs.getString("city"), rs.getString("state"),
		        			 rs.getInt("zip")));
		        
		        }
		 
		    } catch (SQLException e ) {
		    }
			
		}

    public static Collection<Customer> getCustomers() {
        
        return customers;
    }
}

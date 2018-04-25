package main.java.project.managers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Vector;

import main.java.project.server.SqlConnection;

public class AtmManager {
		
	private static SqlConnection con =  new SqlConnection();
	
	private static Vector<Atm> atms = new Vector();

	public AtmManager() {
	
		
	}
	
	public static void populateFromSQL() {
			
			atms.clear();
			
			String query = "select atmID, branchID, balance, maxCash, stNum, stName, city, states, zip " +
							"from " + "ser322" + ".ATM";
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	atms.addElement(new Atm(rs.getInt("atmID"),rs.getInt("branchID"),
		        			 rs.getInt("balance"),rs.getInt("maxCash"), rs.getInt("stNum"),
		        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
		        			 rs.getInt("zip")));
		        	
		        }
		 
		    } catch (SQLException e ) {
		    }
		}
	
	   public static Collection<Atm> getAtms() {
	        
	        return atms;
	    }	
	   
}

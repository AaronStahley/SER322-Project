package main.java.project.managers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Vector;

import main.java.project.server.SqlConnection;

public class EmployeesManager {
	
	private static SqlConnection con =  new SqlConnection();
	
	private static Vector<Employee> employees = new Vector();
	
	public EmployeesManager() {
		
	}
	

	public static void populateFromSQL() {
		
		employees.clear();
		
		String query = "select empID, SSN, FName, lName, stNum, stName, city, states, zip " +
	               "from " + "ser322" + ".employees";
		 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	
	        	employees.addElement(new Employee(rs.getInt("empID"),rs.getInt("SSN"),
	        			 rs.getString("FName"),rs.getString("lName"), rs.getString("stNum"),
	        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
	        			 rs.getInt("zip")));
	        
	        }
	 
	    } catch (SQLException e ) {
	    }
		
	}

    public static Collection<Employee> getEmployees() {
        
        return employees;
    }


}

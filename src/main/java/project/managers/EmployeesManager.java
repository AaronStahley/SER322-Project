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
		
		String query = "select empID, employees.SSN, FName, lName, stNum, stName, city, states, zip, email, position, branch_Name " 
	               + "from  ser322.employees,ser322.email, ser322.works_at, ser322.works_for "
                   + "WHERE email.SSN = employees.SSN AND works_at.emp_ID = employees.empID AND  works_for.emp_ID = employees.empID";
                   
		 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	
	        	employees.addElement(new Employee(rs.getInt("empID"),rs.getString("SSN"),
	        			 rs.getString("FName"),rs.getString("lName"), rs.getInt("stNum"),
	        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
	        			 rs.getInt("zip"), rs.getString("email"), rs.getString("position"), rs.getString("branch_Name")));
	        
	        }
	 
	    } catch (SQLException e ) {
	    }
		
	}
	
	public static void getEmployeeId(int id) {
			
			employees.clear();
			
			String query = "select empID, employees.SSN, FName, lName, stNum, stName, city, states, zip, email, position, branch_Name " 
		               + "from  ser322.employees,ser322.email, ser322.works_at, ser322.works_for "
	                   + "WHERE email.SSN = employees.SSN AND works_at.emp_ID = employees.empID AND  works_for.emp_ID = employees.empID "
		               + "AND employees.empID =" + id;
	                   
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	employees.addElement(new Employee(rs.getInt("empID"),rs.getString("SSN"),
		        			 rs.getString("FName"),rs.getString("lName"), rs.getInt("stNum"),
		        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
		        			 rs.getInt("zip"), rs.getString("email"), rs.getString("position"), rs.getString("branch_Name")));
		        
		        }
		 
		    } catch (SQLException e ) {
		    		System.out.println("QUERY WRONG - getEmployeeId");

		    }
			
	}
	
	public static void getEmployeeSSN(String ssn) {
		
		employees.clear();
		
		String query = "select empID, employees.SSN, FName, lName, stNum, stName, city, states, zip, email, position, branch_Name " 
	               + "from  ser322.employees,ser322.email, ser322.works_at, ser322.works_for "
                   + "WHERE email.SSN = employees.SSN AND works_at.emp_ID = employees.empID AND  works_for.emp_ID = employees.empID "
	               + "AND employees.SSN =" + "'" + ssn + "'";
                   
		 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	
	        	employees.addElement(new Employee(rs.getInt("empID"),rs.getString("SSN"),
	        			 rs.getString("FName"),rs.getString("lName"), rs.getInt("stNum"),
	        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
	        			 rs.getInt("zip"), rs.getString("email"), rs.getString("position"), rs.getString("branch_Name")));
	        
	        }
	 
	    } catch (SQLException e ) {
	    		System.out.println("QUERY WRONG - getEmployeeSSN");

	    }
		
	}
	
	public static void getEmployeeFName(String fName) {
			
			employees.clear();
			
			String query = "select empID, employees.SSN, FName, lName, stNum, stName, city, states, zip, email, position, branch_Name " 
		               + "from  ser322.employees,ser322.email, ser322.works_at, ser322.works_for "
	                   + "WHERE email.SSN = employees.SSN AND works_at.emp_ID = employees.empID AND  works_for.emp_ID = employees.empID "
		               + "AND employees.FName =" + "'" + fName + "'";
	                   
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	employees.addElement(new Employee(rs.getInt("empID"),rs.getString("SSN"),
		        			 rs.getString("FName"),rs.getString("lName"), rs.getInt("stNum"),
		        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
		        			 rs.getInt("zip"), rs.getString("email"), rs.getString("position"), rs.getString("branch_Name")));
		        
		        }
		 
		    } catch (SQLException e ) {
		    		System.out.println("QUERY WRONG - getEmployeeFName");
		    }
			
	}
	
	public static void getEmployeelName(String lName) {
		
		employees.clear();
		
		String query = "select empID, employees.SSN, FName, lName, stNum, stName, city, states, zip, email, position, branch_Name " 
	               + "from  ser322.employees,ser322.email, ser322.works_at, ser322.works_for "
                   + "WHERE email.SSN = employees.SSN AND works_at.emp_ID = employees.empID AND  works_for.emp_ID = employees.empID "
	               + "AND employees.lName =" + "'" + lName + "'";
                   
		 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	
	        	employees.addElement(new Employee(rs.getInt("empID"),rs.getString("SSN"),
	        			 rs.getString("FName"),rs.getString("lName"), rs.getInt("stNum"),
	        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
	        			 rs.getInt("zip"), rs.getString("email"), rs.getString("position"), rs.getString("branch_Name")));
	        
	        }
	 
	    } catch (SQLException e ) {
	    		System.out.println("QUERY WRONG - getEmployeeLName");
	    }
		
	}
	
	public static void getEmployeePosition(String position) {
		
		employees.clear();
		
		String query = "select empID, employees.SSN, FName, lName, stNum, stName, city, states, zip, email, position, branch_Name " 
	               + "from  ser322.employees,ser322.email, ser322.works_at, ser322.works_for "
                   + "WHERE email.SSN = employees.SSN AND works_at.emp_ID = employees.empID AND  works_for.emp_ID = employees.empID "
	               + "AND works_for.position =" + "'" + position + "'";
                   
		 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	
	        	employees.addElement(new Employee(rs.getInt("empID"),rs.getString("SSN"),
	        			 rs.getString("FName"),rs.getString("lName"), rs.getInt("stNum"),
	        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
	        			 rs.getInt("zip"), rs.getString("email"), rs.getString("position"), rs.getString("branch_Name")));
	        
	        }
	 
	    } catch (SQLException e ) {
	    		System.out.println("QUERY WRONG - getEmployeePosition");
	    }
		
	}
	
	public static void getEmployeeWorksAt(String branchName) {
		
		employees.clear();
		
		String query = "select empID, employees.SSN, FName, lName, stNum, stName, city, states, zip, email, position, branch_Name " 
	               + "from  ser322.employees,ser322.email, ser322.works_at, ser322.works_for "
                   + "WHERE email.SSN = employees.SSN AND works_at.emp_ID = employees.empID AND  works_for.emp_ID = employees.empID "
	               + "AND works_at.branch_Name =" + "'" + branchName + "'";
                   
		 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	
	        	employees.addElement(new Employee(rs.getInt("empID"),rs.getString("SSN"),
	        			 rs.getString("FName"),rs.getString("lName"), rs.getInt("stNum"),
	        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
	        			 rs.getInt("zip"), rs.getString("email"), rs.getString("position"), rs.getString("branch_Name")));
	        
	        }
	 
	    } catch (SQLException e ) {
	    		System.out.println("QUERY WRONG - getEmployeeWorksAt");
	    }
		
	}
	
	public static void getEmployeeStNum(int stNum) {
			
			employees.clear();
			
			String query = "select empID, employees.SSN, FName, lName, stNum, stName, city, states, zip, email, position, branch_Name " 
		               + "from  ser322.employees,ser322.email, ser322.works_at, ser322.works_for "
	                   + "WHERE email.SSN = employees.SSN AND works_at.emp_ID = employees.empID AND  works_for.emp_ID = employees.empID "
		               + "AND stNum =" + stNum;
	                   
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	employees.addElement(new Employee(rs.getInt("empID"),rs.getString("SSN"),
		        			 rs.getString("FName"),rs.getString("lName"), rs.getInt("stNum"),
		        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
		        			 rs.getInt("zip"), rs.getString("email"), rs.getString("position"), rs.getString("branch_Name")));
		        
		        }
		 
		    } catch (SQLException e ) {
		    		System.out.println("QUERY WRONG - getEmployeeStNum");
		    }
			
	}
	
	public static void getEmployeeStName(String stName) {
		
		employees.clear();
		
		String query = "select empID, employees.SSN, FName, lName, stNum, stName, city, states, zip, email, position, branch_Name " 
	               + "from  ser322.employees,ser322.email, ser322.works_at, ser322.works_for "
                   + "WHERE email.SSN = employees.SSN AND works_at.emp_ID = employees.empID AND  works_for.emp_ID = employees.empID "
	               + "AND employees.stName =" + "'" + stName + "'";
                   
		 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	
	        	employees.addElement(new Employee(rs.getInt("empID"),rs.getString("SSN"),
	        			 rs.getString("FName"),rs.getString("lName"), rs.getInt("stNum"),
	        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
	        			 rs.getInt("zip"), rs.getString("email"), rs.getString("position"), rs.getString("branch_Name")));
	        
	        }
	 
	    } catch (SQLException e ) {
	    		System.out.println("QUERY WRONG - getEmployeeStName");
	    }
		
	}
	
	public static void getEmployeeCity(String city) {
			
			employees.clear();
			
			String query = "select empID, employees.SSN, FName, lName, stNum, stName, city, states, zip, email, position, branch_Name " 
		               + "from  ser322.employees,ser322.email, ser322.works_at, ser322.works_for "
	                   + "WHERE email.SSN = employees.SSN AND works_at.emp_ID = employees.empID AND  works_for.emp_ID = employees.empID "
		               + "AND employees.city =" + "'" + city + "'";
	                   
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	employees.addElement(new Employee(rs.getInt("empID"),rs.getString("SSN"),
		        			 rs.getString("FName"),rs.getString("lName"), rs.getInt("stNum"),
		        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
		        			 rs.getInt("zip"), rs.getString("email"), rs.getString("position"), rs.getString("branch_Name")));
		        
		        }
		 
		    } catch (SQLException e ) {
		    		System.out.println("QUERY WRONG - getEmployeeCity");
		    }
			
	}
	
	public static void getEmployeeState(String state) {
			
			employees.clear();
			
			String query = "select empID, employees.SSN, FName, lName, stNum, stName, city, states, zip, email, position, branch_Name " 
		               + "from  ser322.employees,ser322.email, ser322.works_at, ser322.works_for "
	                   + "WHERE email.SSN = employees.SSN AND works_at.emp_ID = employees.empID AND  works_for.emp_ID = employees.empID "
		               + "AND employees.states =" + "'" + state + "'";
	                   
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	employees.addElement(new Employee(rs.getInt("empID"),rs.getString("SSN"),
		        			 rs.getString("FName"),rs.getString("lName"), rs.getInt("stNum"),
		        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
		        			 rs.getInt("zip"), rs.getString("email"), rs.getString("position"), rs.getString("branch_Name")));
		        
		        }
		 
		    } catch (SQLException e ) {
		    		System.out.println("QUERY WRONG - getEmployeeState");
		    }
			
	}
	
	public static void getEmployeeZip(int zip) {
		
		employees.clear();
		
		String query = "select empID, employees.SSN, FName, lName, stNum, stName, city, states, zip, email, position, branch_Name " 
	               + "from  ser322.employees,ser322.email, ser322.works_at, ser322.works_for "
                   + "WHERE email.SSN = employees.SSN AND works_at.emp_ID = employees.empID AND  works_for.emp_ID = employees.empID "
	               + "AND employees.zip =" + zip;
                   
		 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	
	        	employees.addElement(new Employee(rs.getInt("empID"),rs.getString("SSN"),
	        			 rs.getString("FName"),rs.getString("lName"), rs.getInt("stNum"),
	        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
	        			 rs.getInt("zip"), rs.getString("email"), rs.getString("position"), rs.getString("branch_Name")));
	        
	        }
	 
	    } catch (SQLException e ) {
	    		System.out.println("QUERY WRONG - getEmployeeZip");
	    }
		
	}
	
	public static void getEmployeeEmail(String email) {
		
		employees.clear();
		
		String query = "select empID, employees.SSN, FName, lName, stNum, stName, city, states, zip, email, position, branch_Name " 
	               + "from  ser322.employees,ser322.email, ser322.works_at, ser322.works_for "
                   + "WHERE email.SSN = employees.SSN AND works_at.emp_ID = employees.empID AND  works_for.emp_ID = employees.empID "
	               + "AND email.email =" + "'" + email + "'";
                   
		 	
		try {
	        Statement stmt = con.getConnection().createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	        	
	        	employees.addElement(new Employee(rs.getInt("empID"),rs.getString("SSN"),
	        			 rs.getString("FName"),rs.getString("lName"), rs.getInt("stNum"),
	        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
	        			 rs.getInt("zip"), rs.getString("email"), rs.getString("position"), rs.getString("branch_Name")));
	        
	        }
	 
	    } catch (SQLException e ) {
	    		System.out.println("QUERY WRONG - getEmployeeEmail");
	    }
		
}
	



    public static Collection<Employee> getEmployees() {
        
        return employees;
    }


}

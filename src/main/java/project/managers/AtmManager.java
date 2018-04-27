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
			
			String query = "select atmID, branchName, balance, maxCash, ATM.stNum, ATM.stName, ATM.city, ATM.states, ATM.zip " + 
					"from ser322.ATM, ser322.branch " + 
					"where ATM.branchID = branch.branchID";
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	atms.addElement(new Atm(rs.getInt("atmID"),rs.getString("branchName"),
		        			 rs.getInt("balance"),rs.getInt("maxCash"), rs.getInt("stNum"),
		        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
		        			 rs.getInt("zip")));
		        	
		        }
		 
		    } catch (SQLException e ) {
		    		System.out.println("QUERY WRONG - populateFromSQL");

		    }
		}
	
		public static void getAtmId(int id) {
			
			atms.clear();
		
			
			String query = "select atmID, branchName, balance, maxCash, ATM.stNum, ATM.stName, ATM.city, ATM.states, ATM.zip " + 
					"from ser322.ATM, ser322.branch " + 
					"where ATM.branchID = branch.branchID AND atmId =" + id;
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	atms.addElement(new Atm(rs.getInt("atmID"),rs.getString("branchName"),
		        			 rs.getInt("balance"),rs.getInt("maxCash"), rs.getInt("stNum"),
		        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
		        			 rs.getInt("zip")));
		        	
		        }
		 
		    } catch (SQLException e ) {
	    			System.out.println("QUERY WRONG - getAtmId");

		    }
		}
		
		public static void getAtmBranchName(String branchName) {
				
				atms.clear();
			
				
				String query = "select atmID, branchName, balance, maxCash, ATM.stNum, ATM.stName, ATM.city, ATM.states, ATM.zip " + 
						"from ser322.ATM, ser322.branch " + 
						"where ATM.branchID = branch.branchID AND branch.branchName =" + "'" + branchName + "'";
				 	
				try {
			        Statement stmt = con.getConnection().createStatement();
			        ResultSet rs = stmt.executeQuery(query);
			        while (rs.next()) {
			        	
			        	atms.addElement(new Atm(rs.getInt("atmID"),rs.getString("branchName"),
			        			 rs.getInt("balance"),rs.getInt("maxCash"), rs.getInt("stNum"),
			        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
			        			 rs.getInt("zip")));
			        	
			        }
			 
			    } catch (SQLException e ) {
		    			System.out.println("QUERY WRONG - getAtmBranchName");
	
			    }
		}
		
		public static void getBalanceAt(int balance) {
				
				atms.clear();
			
				
				String query = "select atmID, branchName, balance, maxCash, ATM.stNum, ATM.stName, ATM.city, ATM.states, ATM.zip " + 
						"from ser322.ATM, ser322.branch " + 
						"where ATM.branchID = branch.branchID AND balance =" + balance;
				 	
				try {
			        Statement stmt = con.getConnection().createStatement();
			        ResultSet rs = stmt.executeQuery(query);
			        while (rs.next()) {
			        	
			        	atms.addElement(new Atm(rs.getInt("atmID"),rs.getString("branchName"),
			        			 rs.getInt("balance"),rs.getInt("maxCash"), rs.getInt("stNum"),
			        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
			        			 rs.getInt("zip")));
			        	
			        }
			 
			    } catch (SQLException e ) {
		    			System.out.println("QUERY WRONG - getBalanceAt");
	
			    }
		}
		
		public static void getBalanceAbove(int balance) {
			
			atms.clear();
					
			String query = "select atmID, branchName, balance, maxCash, ATM.stNum, ATM.stName, ATM.city, ATM.states, ATM.zip " + 
					"from ser322.ATM, ser322.branch " + 
					"where ATM.branchID = branch.branchID AND balance >" + balance;
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	atms.addElement(new Atm(rs.getInt("atmID"),rs.getString("branchName"),
		        			 rs.getInt("balance"),rs.getInt("maxCash"), rs.getInt("stNum"),
		        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
		        			 rs.getInt("zip")));
		        	
		        }
		 
		    } catch (SQLException e ) {
	    			System.out.println("QUERY WRONG - getBalanceAbove");

		    }
		}
		
		public static void getBalanceBellow(int balance) {
			
			atms.clear();
					
			String query = "select atmID, branchName, balance, maxCash, ATM.stNum, ATM.stName, ATM.city, ATM.states, ATM.zip " + 
					"from ser322.ATM, ser322.branch " + 
					"where ATM.branchID = branch.branchID AND balance <" + balance;
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	atms.addElement(new Atm(rs.getInt("atmID"),rs.getString("branchName"),
		        			 rs.getInt("balance"),rs.getInt("maxCash"), rs.getInt("stNum"),
		        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
		        			 rs.getInt("zip")));
		        	
		        }
		 
		    } catch (SQLException e ) {
	    			System.out.println("QUERY WRONG - getBalanceBellow");

		    }
		}
		
		public static void getMaxCashAt(int maxCash) {
			
			atms.clear();
		
			
			String query = "select atmID, branchName, balance, maxCash, ATM.stNum, ATM.stName, ATM.city, ATM.states, ATM.zip " + 
					"from ser322.ATM, ser322.branch " + 
					"where ATM.branchID = branch.branchID AND maxCash =" + maxCash;
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	atms.addElement(new Atm(rs.getInt("atmID"),rs.getString("branchName"),
		        			 rs.getInt("balance"),rs.getInt("maxCash"), rs.getInt("stNum"),
		        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
		        			 rs.getInt("zip")));
		        	
		        }
		 
		    } catch (SQLException e ) {
	    			System.out.println("QUERY WRONG - getMaxCashAt");

		    }
		}
		
		public static void getMaxCashAbove(int maxCash) {
			
			atms.clear();
		
			
			String query = "select atmID, branchName, balance, maxCash, ATM.stNum, ATM.stName, ATM.city, ATM.states, ATM.zip " + 
					"from ser322.ATM, ser322.branch " + 
					"where ATM.branchID = branch.branchID AND maxCash >" + maxCash;
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	atms.addElement(new Atm(rs.getInt("atmID"),rs.getString("branchName"),
		        			 rs.getInt("balance"),rs.getInt("maxCash"), rs.getInt("stNum"),
		        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
		        			 rs.getInt("zip")));
		        	
		        }
		 
		    } catch (SQLException e ) {
	    			System.out.println("QUERY WRONG - getMaxCashAbove");

		    }
		}
		
		public static void getMaxCashBellow(int maxCash) {
			
			atms.clear();
		
			
			String query = "select atmID, branchName, balance, maxCash, ATM.stNum, ATM.stName, ATM.city, ATM.states, ATM.zip " + 
					"from ser322.ATM, ser322.branch " + 
					"where ATM.branchID = branch.branchID AND maxCash <" + maxCash;
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	atms.addElement(new Atm(rs.getInt("atmID"),rs.getString("branchName"),
		        			 rs.getInt("balance"),rs.getInt("maxCash"), rs.getInt("stNum"),
		        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
		        			 rs.getInt("zip")));
		        	
		        }
		 
		    } catch (SQLException e ) {
	    			System.out.println("QUERY WRONG - getMaxCashBellow");

		    }
		}
		
		public static void getAtmStNum(int stNum) {
			
			atms.clear();
		
			
			String query = "select atmID, branchName, balance, maxCash, ATM.stNum, ATM.stName, ATM.city, ATM.states, ATM.zip " + 
					"from ser322.ATM, ser322.branch " + 
					"where ATM.branchID = branch.branchID AND ATM.stNum =" + stNum;
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	atms.addElement(new Atm(rs.getInt("atmID"),rs.getString("branchName"),
		        			 rs.getInt("balance"),rs.getInt("maxCash"), rs.getInt("stNum"),
		        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
		        			 rs.getInt("zip")));
		        	
		        }
		 
		    } catch (SQLException e ) {
	    			System.out.println("QUERY WRONG - getAtmStNum");

		    }
		}
		
		public static void getAtmStName(String stName) {
			
			atms.clear();
		
			
			String query = "select atmID, branchName, balance, maxCash, ATM.stNum, ATM.stName, ATM.city, ATM.states, ATM.zip " + 
					"from ser322.ATM, ser322.branch " + 
					"where ATM.branchID = branch.branchID AND ATM.stName =" + "'" + stName + "'";
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	atms.addElement(new Atm(rs.getInt("atmID"),rs.getString("branchName"),
		        			 rs.getInt("balance"),rs.getInt("maxCash"), rs.getInt("stNum"),
		        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
		        			 rs.getInt("zip")));
		        	
		        }
		 
		    } catch (SQLException e ) {
	    			System.out.println("QUERY WRONG - getAtmStName");

		    }
		}
		
		public static void getAtmCity(String city) {
			
			atms.clear();
		
			
			String query = "select atmID, branchName, balance, maxCash, ATM.stNum, ATM.stName, ATM.city, ATM.states, ATM.zip " + 
					"from ser322.ATM, ser322.branch " + 
					"where ATM.branchID = branch.branchID AND ATM.city =" + "'" + city + "'";
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	atms.addElement(new Atm(rs.getInt("atmID"),rs.getString("branchName"),
		        			 rs.getInt("balance"),rs.getInt("maxCash"), rs.getInt("stNum"),
		        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
		        			 rs.getInt("zip")));
		        	
		        }
		 
		    } catch (SQLException e ) {
	    			System.out.println("QUERY WRONG - getAtmCity");

		    }
		}
		
		public static void getAtmState(String state) {
			
			atms.clear();
		
			
			String query = "select atmID, branchName, balance, maxCash, ATM.stNum, ATM.stName, ATM.city, ATM.states, ATM.zip " + 
					"from ser322.ATM, ser322.branch " + 
					"where ATM.branchID = branch.branchID AND ATM.states =" + "'" + state + "'";
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	atms.addElement(new Atm(rs.getInt("atmID"),rs.getString("branchName"),
		        			 rs.getInt("balance"),rs.getInt("maxCash"), rs.getInt("stNum"),
		        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
		        			 rs.getInt("zip")));
		        	
		        }
		 
		    } catch (SQLException e ) {
	    			System.out.println("QUERY WRONG - getAtmState");

		    }
		}
		
		public static void getAtmZip(int zip) {
			
			atms.clear();
		
			
			String query = "select atmID, branchName, balance, maxCash, ATM.stNum, ATM.stName, ATM.city, ATM.states, ATM.zip " + 
					"from ser322.ATM, ser322.branch " + 
					"where ATM.branchID = branch.branchID AND ATM.zip =" + zip;
			 	
			try {
		        Statement stmt = con.getConnection().createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		        	
		        	atms.addElement(new Atm(rs.getInt("atmID"),rs.getString("branchName"),
		        			 rs.getInt("balance"),rs.getInt("maxCash"), rs.getInt("stNum"),
		        			 rs.getString("stName"), rs.getString("city"), rs.getString("states"),
		        			 rs.getInt("zip")));
		        	
		        }
		 
		    } catch (SQLException e ) {
	    			System.out.println("QUERY WRONG - getAtmZip");

		    }
		}	
	
	   public static Collection<Atm> getAtms() {
	        
	        return atms;
	    }	
	   
}

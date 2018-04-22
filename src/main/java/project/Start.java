package main.java.project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;

import main.java.project.view.AccountsPanel;
import main.java.project.view.HeaderPanel;
import main.java.project.view.NavBarPanel;

/**
 * 
 * @author aaronstahley
 * @version 1.0
 * Main class to start project 
 *
 */
public class Start {

	public static void main(String[] args) {
		
		Connection con = null;
		
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/bank","root","password");  
			
			}catch(Exception e){ System.out.println(e);} 
		
		   String query = "select accID, accType, balance, dateCreated " +
                  "from " + "bank" + ".account";
		
		 
						
		JFrame frame = new JFrame("Bank App");
		
		HeaderPanel header = new HeaderPanel(); 
		NavBarPanel leftNav = new NavBarPanel(); 
		
		AccountsPanel accountP = new AccountsPanel(); 
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		
		frame.setSize(1100, 800);
		
		//Adds all panels to the frame. 
		frame.getContentPane().add(header, BorderLayout.NORTH);
		frame.getContentPane().add(leftNav, BorderLayout.WEST);
		frame.getContentPane().add(accountP, BorderLayout.CENTER);
		//frame.getContentPane().add(new AccountsPanel(), BorderLayout.CENTER);
		
		//frame.pack();
		frame.setLocationRelativeTo(null); //Centers Frame
		frame.setVisible(true);
	}
	
	 


}




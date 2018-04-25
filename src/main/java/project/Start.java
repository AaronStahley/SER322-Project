package main.java.project;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;

import main.java.project.view.AccountsPanel;
import main.java.project.view.AtmPanel;
import main.java.project.view.EmployeesPanel;
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
	
	static JFrame frame = new JFrame("Bank App");
	
	private static JPanel cards = new JPanel(); 
	
	private static HeaderPanel header = new HeaderPanel(); 
	private static NavBarPanel leftNav = new NavBarPanel(); 
	
	private static AccountsPanel accountP = new AccountsPanel();
	private static EmployeesPanel employeesP = new EmployeesPanel();
	private static AtmPanel atmP = new AtmPanel(); 

	public static void main(String[] args) {
		
		cards.setLayout(new CardLayout());
		cards.add(accountP, "accountP");
		cards.add(employeesP, "employeesP");
		cards.add(atmP, "atmP"); 	
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		
		frame.setSize(1050, 780);
		frame.setMinimumSize(new Dimension(1220,780));
		
		//Adds all panels to the frame. 
		frame.getContentPane().add(header, BorderLayout.NORTH);
		frame.getContentPane().add(leftNav, BorderLayout.WEST);
		frame.getContentPane().add(cards, BorderLayout.CENTER);

		//frame.getContentPane().add(new AccountsPanel(), BorderLayout.CENTER);
		
		//frame.pack();
		frame.setLocationRelativeTo(null); //Centers Frame
		frame.setVisible(true);
	}
	
	public static void switchFrames(int frame) {
		
	    CardLayout cl = (CardLayout)(cards.getLayout());

		
		if(frame == 1) {
			
		    cl.show(cards, "accountP");

			 
		}else if(frame == 2) {
			
			cl.show(cards, "employeesP"); 
			
		}else if(frame == 3) {
			
			cl.show(cards, "atmP"); 
			
		}
	}
	
	 


}




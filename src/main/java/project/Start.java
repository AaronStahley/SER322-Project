package main.java.project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

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
						
		JFrame frame = new JFrame("Bank App");
		
		HeaderPanel header = new HeaderPanel(); 
		NavBarPanel leftNav = new NavBarPanel(); 
		
		AccountsPanel accountP = new AccountsPanel(); 
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

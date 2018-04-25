package main.java.project.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import main.java.project.Start;

public class NavBarPanel extends JPanel{

	private static final long serialVersionUID = 1L;

	
	private JButton accountB = new JButton();
	private JButton employeesB = new JButton();
	private JButton atmB = new JButton(); 
	private JButton customerB = new JButton();
	
	private int buttonSize = 130;
	
	public NavBarPanel() {
		
		
		//-----------Panel_Attributes-----------//

		this.setPreferredSize(new Dimension(130,1000));
		this.setBackground(Color.WHITE);
		this.setLayout(new FlowLayout());
		
		//-----------------End---------------------//

		
		
		//----------Button_Attributes-----------//
	
		accountB.setIcon(new ImageIcon(NavBarPanel.class.getResource("/Accounts_Icon.png")));
		accountB.setFont(new java.awt.Font("Dialog", 1, 15));
		accountB.setBorderPainted(false);
		accountB.setPreferredSize(new Dimension(buttonSize, buttonSize));
		accountB.setHorizontalTextPosition(SwingConstants.CENTER);
		accountB.setText("Accounts");
		accountB.setVerticalAlignment(SwingConstants.TOP);
		accountB.setVerticalTextPosition(SwingConstants.BOTTOM);
		accountB.setOpaque(true);
		accountB.setBackground(new Color(151, 217, 247));
		accountB.setMargin(new Insets(0, 0, 0, 0));
		accountB.setSelected(true);
		accountB.setContentAreaFilled(true);
		accountB.setFocusPainted(false); 
		accountB.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Start.switchFrames(1);
				
				accountB.setOpaque(true);
				accountB.setContentAreaFilled(true);
				
				employeesB.setOpaque(false);
				employeesB.setContentAreaFilled(false);
				
				atmB.setOpaque(false);
				atmB.setContentAreaFilled(false);
				
				customerB.setOpaque(false);
				customerB.setContentAreaFilled(false);
			}
		});		
	
		employeesB.setIcon(new ImageIcon(NavBarPanel.class.getResource("/Employee_Icon.png")));
		employeesB.setFont(new java.awt.Font("Dialog", 1, 15));
		employeesB.setBorderPainted(false);
		employeesB.setPreferredSize(new Dimension(buttonSize, buttonSize));
		employeesB.setHorizontalTextPosition(SwingConstants.CENTER);
		employeesB.setText("Employees");	
		employeesB.setVerticalAlignment(SwingConstants.TOP);
		employeesB.setVerticalTextPosition(SwingConstants.BOTTOM);
		employeesB.setOpaque(false);
		employeesB.setBackground(new Color(151, 217, 247));
		employeesB.setMargin(new Insets(0, 0, 0, 0));
		employeesB.setContentAreaFilled(false);
		employeesB.setFocusPainted(false); 
		employeesB.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Start.switchFrames(2);

				accountB.setOpaque(false);
				accountB.setContentAreaFilled(false);
				
				employeesB.setOpaque(true);
				employeesB.setContentAreaFilled(true);
				
				atmB.setOpaque(false);
				atmB.setContentAreaFilled(false);
				
				customerB.setOpaque(false);
				customerB.setContentAreaFilled(false);

			}
		});
		
		atmB.setIcon(new ImageIcon(NavBarPanel.class.getResource("/ATM_Icon.png")));
		atmB.setFont(new java.awt.Font("Dialog", 1, 15));
		atmB.setBorderPainted(false);
		atmB.setPreferredSize(new Dimension(buttonSize, buttonSize));
		atmB.setHorizontalTextPosition(SwingConstants.CENTER);
		atmB.setText("ATM");	
		atmB.setVerticalAlignment(SwingConstants.TOP);
		atmB.setVerticalTextPosition(SwingConstants.BOTTOM);
		atmB.setOpaque(false);
		atmB.setBackground(new Color(151, 217, 247));
		atmB.setMargin(new Insets(0, 0, 0, 0));
		atmB.setContentAreaFilled(false);
		atmB.setFocusPainted(false); 
		atmB.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Start.switchFrames(3);

				accountB.setOpaque(false);
				accountB.setContentAreaFilled(false);
				
				employeesB.setOpaque(false);
				employeesB.setContentAreaFilled(false);
				
				atmB.setOpaque(true);
				atmB.setContentAreaFilled(true);
				
				customerB.setOpaque(false);
				customerB.setContentAreaFilled(false);
			}
		});
		
		customerB.setIcon(new ImageIcon(NavBarPanel.class.getResource("/Customer_Icon.png")));
		customerB.setFont(new java.awt.Font("Dialog", 1, 15));
		customerB.setBorderPainted(false);
		customerB.setPreferredSize(new Dimension(buttonSize, buttonSize));
		customerB.setHorizontalTextPosition(SwingConstants.CENTER);
		customerB.setText("Customers");	
		customerB.setVerticalAlignment(SwingConstants.TOP);
		customerB.setVerticalTextPosition(SwingConstants.BOTTOM);
		customerB.setOpaque(false);
		customerB.setBackground(new Color(151, 217, 247));
		customerB.setMargin(new Insets(0, 0, 0, 0));
		customerB.setContentAreaFilled(false);
		customerB.setFocusPainted(false); 
		customerB.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Start.switchFrames(4);
				
				accountB.setOpaque(false);
				accountB.setContentAreaFilled(false);
				
				employeesB.setOpaque(false);
				employeesB.setContentAreaFilled(false);
				
				atmB.setOpaque(false);
				atmB.setContentAreaFilled(false);
				
				customerB.setOpaque(true);
				customerB.setContentAreaFilled(true);

			}
		});
		
		//-----------------End---------------------//

			
		this.add(accountB, BorderLayout.CENTER);
		this.add(employeesB, BorderLayout.CENTER);
		this.add(atmB, BorderLayout.CENTER);
		this.add(customerB, BorderLayout.CENTER);

		
	}
	

}

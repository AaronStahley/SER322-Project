package main.java.project.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import main.java.project.tables.AccountTable;
import main.java.project.tables.EmployeeTable;

public class EmployeesPanel extends JPanel {
	
	private JPanel bottomPanel = new JPanel();
	private JPanel empIdPanel = new JPanel(); 
	private JPanel ssnPanel = new JPanel(); 
	private JPanel fNamePanel = new JPanel();
	private JPanel lNamePanel = new JPanel(); 
	private JPanel stNumPanel = new JPanel(); 
	private JPanel stNamePanel = new JPanel(); 
	private JPanel cityPanel = new JPanel();
	private JPanel statesPanel = new JPanel(); 
	private JPanel zipPanel = new JPanel();	
	private JPanel buttonPanel = new JPanel();


	private JLabel empIdLbl = new JLabel(); 
	private JLabel ssnLbl = new JLabel();
	private JLabel fNameLbl = new JLabel();
	private JLabel lNameLbl = new JLabel();
	private JLabel stNumLbl = new JLabel();
	private JLabel stNameLbl = new JLabel();
	private JLabel cityLbl = new JLabel();
	private JLabel statesLbl = new JLabel();
	private JLabel zipLbl = new JLabel();

	private JTextField empIdField = new JTextField();
	private JTextField ssnField = new JTextField(); 
	private JTextField fNameField = new JTextField();
	private JTextField lNameField = new JTextField();
	private JTextField stNumField = new JTextField();
	private JTextField stNameField = new JTextField();
	private JTextField cityField = new JTextField();
	private JTextField statesField = new JTextField();
	private JTextField zipField = new JTextField();

	//private JCheckBox sortDescendingB = new JCheckBox();
	
	private JScrollPane scrollPane = new JScrollPane();
	
	private JButton clearB = new JButton(); 
	private JButton submitB = new JButton();
	
	private EmployeeTable employeeTable = new EmployeeTable(); 
	
	public EmployeesPanel() {
		
		this.setPreferredSize(new Dimension(1000,1000));
		this.setBackground(Color.WHITE);		
		this.setLayout(new BorderLayout());
		
		scrollPane.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 0, Color.BLACK));
        scrollPane.getViewport().add(employeeTable, null);
        
        employeeTable.setBackground(Color.WHITE);
        employeeTable.setMaximumSize(new Dimension(32767, 32767));
        employeeTable.setRowHeight(24);
        
        FlowLayout fl = new FlowLayout();
		fl.setHgap(20); //Gap of components horizontal
		fl.setVgap(10); // Gap of components vertical
		
		bottomPanel.setPreferredSize(new Dimension(100,210));
		bottomPanel.setLayout(fl);
		bottomPanel.setBackground(Color.WHITE);
		bottomPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		empIdPanel.setLayout(new FlowLayout());
		empIdPanel.setBackground(Color.WHITE);
		
		ssnPanel.setLayout(new FlowLayout());
		ssnPanel.setBackground(Color.WHITE);
		
		fNamePanel.setLayout(new FlowLayout());
		fNamePanel.setBackground(Color.WHITE);
		
		lNamePanel.setLayout(new FlowLayout());
		lNamePanel.setBackground(Color.WHITE);
		
		stNumPanel.setLayout(new FlowLayout());
		stNumPanel.setBackground(Color.WHITE);
		
		stNamePanel.setLayout(new FlowLayout());
		stNamePanel.setBackground(Color.WHITE);
		
		cityPanel.setLayout(new FlowLayout());
		cityPanel.setBackground(Color.WHITE);
		
		statesPanel.setLayout(new FlowLayout());
		statesPanel.setBackground(Color.WHITE);
		
		zipPanel.setLayout(new FlowLayout());
		zipPanel.setBackground(Color.WHITE);
		
		buttonPanel.setLayout(fl);
		buttonPanel.setBackground(Color.WHITE); 
		
		
		
		//-------------Bottom Panel Attributes--------------//

		empIdLbl.setText("Employee ID:");
		empIdLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		empIdLbl.setPreferredSize(new Dimension(130, 30));
		
		empIdField.setText(null);
		empIdField.setFont(new java.awt.Font("Dialog", 1, 18));
		empIdField.setPreferredSize(new Dimension(150,30));
		
		empIdPanel.add(empIdLbl);
		empIdPanel.add(empIdField);
		
		ssnLbl.setText("Employee SSN:");
		ssnLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		ssnLbl.setPreferredSize(new Dimension(150, 30));
		
		ssnField.setText(null);
		ssnField.setFont(new java.awt.Font("Dialog", 1, 18));
		ssnField.setPreferredSize(new Dimension(150,30));
		
		ssnPanel.add(ssnLbl);
		ssnPanel.add(ssnField);
		
		fNameLbl.setText("First Name:");
		fNameLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		fNameLbl.setPreferredSize(new Dimension(120, 30));
		
		fNameField.setText(null);
		fNameField.setFont(new java.awt.Font("Dialog", 1, 18));
		fNameField.setPreferredSize(new Dimension(150,30));
		
		fNamePanel.add(fNameLbl);
		fNamePanel.add(fNameField);
		
		lNameLbl.setText("Last Name:");
		lNameLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		lNameLbl.setPreferredSize(new Dimension(120, 30));
		
		lNameField.setText(null);
		lNameField.setFont(new java.awt.Font("Dialog", 1, 18));
		lNameField.setPreferredSize(new Dimension(150,30));
		
		lNamePanel.add(lNameLbl);
		lNamePanel.add(lNameField);
		
		stNumLbl.setText("Street Number:");
		stNumLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		stNumLbl.setPreferredSize(new Dimension(150, 30));
		
		stNumField.setText(null);
		stNumField.setFont(new java.awt.Font("Dialog", 1, 18));
		stNumField.setPreferredSize(new Dimension(150,30));
		
		stNumPanel.add(stNumLbl);
		stNumPanel.add(stNumField);
		
		stNameLbl.setText("Street Name:");
		stNameLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		stNameLbl.setPreferredSize(new Dimension(130, 30));
		
		stNameField.setText(null);
		stNameField.setFont(new java.awt.Font("Dialog", 1, 18));
		stNameField.setPreferredSize(new Dimension(150,30));
		
		stNamePanel.add(stNameLbl);
		stNamePanel.add(stNameField);
		
		cityLbl.setText("City:");
		cityLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		cityLbl.setPreferredSize(new Dimension(50, 30));
		
		cityField.setText(null);
		cityField.setFont(new java.awt.Font("Dialog", 1, 18));
		cityField.setPreferredSize(new Dimension(150,30));
		
		cityPanel.add(cityLbl);
		cityPanel.add(cityField);
		
		statesLbl.setText("State:");
		statesLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		statesLbl.setPreferredSize(new Dimension(60, 30));
		
		statesField.setText(null);
		statesField.setFont(new java.awt.Font("Dialog", 1, 18));
		statesField.setPreferredSize(new Dimension(150,30));
		
		statesPanel.add(statesLbl);
		statesPanel.add(statesField);
		
		zipLbl.setText("Zip Code:");
		zipLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		zipLbl.setPreferredSize(new Dimension(95, 30));
		
		zipField.setText(null);
		zipField.setFont(new java.awt.Font("Dialog", 1, 18));
		zipField.setPreferredSize(new Dimension(150,30));
		
		zipPanel.add(zipLbl);
		zipPanel.add(zipField);
		
		clearB.setText("Clear All");
		clearB.setFont(new java.awt.Font("Dialog", 1, 18));
		clearB.setPreferredSize(new Dimension(120,30));
		
		submitB.setText("Submit");
        submitB.setFont(new java.awt.Font("Dialog", 1, 18));
		submitB.setPreferredSize(new Dimension(120,30));
		
		buttonPanel.add(clearB);
		buttonPanel.add(submitB);
		
	    //--------End of Bottom Panel Attributes ----------//

		bottomPanel.add(empIdPanel);
		bottomPanel.add(ssnPanel);
		bottomPanel.add(fNamePanel);
		bottomPanel.add(lNamePanel);
		bottomPanel.add(stNumPanel);
		bottomPanel.add(stNamePanel);
		bottomPanel.add(cityPanel);
		bottomPanel.add(statesPanel);
		bottomPanel.add(zipPanel);
		bottomPanel.add(buttonPanel);
		
		this.add(scrollPane, BorderLayout.CENTER);
	    this.add(bottomPanel, BorderLayout.SOUTH);
	    
	    //-------Button Action Listeners----------//
	    
		//------END of Action Listeners-----------//


		
	}
	
	   public void removePanel() {
	    	
	    	 this.removeAll();
	    	 this.revalidate();
			 this.repaint();
	    }
	    
	    public void addPanel() {
	    	
	    	
	    	this.add(scrollPane, BorderLayout.CENTER);
		    this.add(bottomPanel, BorderLayout.SOUTH);
	    }
	
	
}

package main.java.project.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import main.java.project.tables.AtmTable;
import main.java.project.tables.EmployeeTable;

public class AtmPanel extends JPanel{
	
	private JPanel bottomPanel = new JPanel();
	private JPanel atmIdPanel = new JPanel(); 
	private JPanel branchIdPanel = new JPanel(); 
	private JPanel balancePanel = new JPanel();
	private JPanel balanceEqBPanel = new JPanel(); 
	private JPanel maxCashPanel = new JPanel(); 
	private JPanel stNumPanel = new JPanel(); 
	private JPanel stNamePanel = new JPanel(); 
	private JPanel cityPanel = new JPanel();
	private JPanel statesPanel = new JPanel(); 
	private JPanel zipPanel = new JPanel();	
	private JPanel buttonPanel = new JPanel();

	private JLabel atmIdLbl = new JLabel(); 
	private JLabel branchIdLbl = new JLabel();
	private JLabel balanceLbl = new JLabel();
	private JLabel maxCashLbl = new JLabel();
	private JLabel stNumLbl = new JLabel();
	private JLabel stNameLbl = new JLabel();
	private JLabel cityLbl = new JLabel();
	private JLabel statesLbl = new JLabel();
	private JLabel zipLbl = new JLabel();

	private JTextField atmIdField = new JTextField();
	private JTextField branchIdField = new JTextField(); 
	private JTextField balanceField = new JTextField();
	private JTextField maxCashField = new JTextField();
	private JTextField stNumField = new JTextField();
	private JTextField stNameField = new JTextField();
	private JTextField cityField = new JTextField();
	private JTextField statesField = new JTextField();
	private JTextField zipField = new JTextField();

	//private JCheckBox sortDescendingB = new JCheckBox();
	private JCheckBox balanceLessB = new JCheckBox();
	private JCheckBox balanceGreaterB = new JCheckBox();
	
	private JScrollPane scrollPane = new JScrollPane();
	
	private JButton clearB = new JButton(); 
	private JButton submitB = new JButton();
	
	private AtmTable atmTable = new AtmTable(); 
	
	public AtmPanel() {
		
		this.setPreferredSize(new Dimension(1000,1000));
		this.setBackground(Color.WHITE);		
		this.setLayout(new BorderLayout());
		
		scrollPane.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 0, Color.BLACK));
        scrollPane.getViewport().add(atmTable, null);
        
        atmTable.setBackground(Color.WHITE);
        atmTable.setMaximumSize(new Dimension(32767, 32767));
        atmTable.setRowHeight(24);
        
        FlowLayout fl = new FlowLayout();
		fl.setHgap(20); //Gap of components horizontal
		fl.setVgap(10); // Gap of components vertical
		
		bottomPanel.setPreferredSize(new Dimension(100,235));
		bottomPanel.setLayout(fl);
		bottomPanel.setBackground(Color.WHITE);
		bottomPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		atmIdPanel.setLayout(new FlowLayout());
		atmIdPanel.setBackground(Color.WHITE);
		
		branchIdPanel.setLayout(new FlowLayout());
		branchIdPanel.setBackground(Color.WHITE);
		
		balancePanel.setLayout(new FlowLayout());
		balancePanel.setBackground(Color.WHITE);
		
		balanceEqBPanel.setLayout(new BorderLayout());
		balanceEqBPanel.setPreferredSize(new Dimension(50,55));
		balanceEqBPanel.setBackground(Color.white);
		
		maxCashPanel.setLayout(new FlowLayout());
		maxCashPanel.setBackground(Color.WHITE);
		
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
		
		atmIdLbl.setText("Atm ID:");
		atmIdLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		atmIdLbl.setPreferredSize(new Dimension(80, 30));
		
		atmIdField.setText(null);
		atmIdField.setFont(new java.awt.Font("Dialog", 1, 18));
		atmIdField.setPreferredSize(new Dimension(150,30));
		
		atmIdPanel.add(atmIdLbl);
		atmIdPanel.add(atmIdField);
		
		branchIdLbl.setText("Branch ID:");
		branchIdLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		branchIdLbl.setPreferredSize(new Dimension(105, 30));
		
		branchIdField.setText(null);
		branchIdField.setFont(new java.awt.Font("Dialog", 1, 18));
		branchIdField.setPreferredSize(new Dimension(150,30));
		
		branchIdPanel.add(branchIdLbl);
		branchIdPanel.add(branchIdField);
		
		balanceLbl.setText("Balance:");
		balanceLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		balanceLbl.setPreferredSize(new Dimension(90, 30));
		
		balanceField.setText(null);
		balanceField.setFont(new java.awt.Font("Dialog", 1, 18));
		balanceField.setPreferredSize(new Dimension(150,30));
		
		balanceGreaterB.setText(">");
		balanceGreaterB.setFont(new java.awt.Font("Dialog", 1, 18));
		balanceGreaterB.setMnemonic(KeyEvent.VK_C); 
		balanceGreaterB.setSelected(false);
		balanceGreaterB.setHorizontalTextPosition(SwingConstants.LEFT);
		balanceGreaterB.setFocusPainted(false);
		balanceGreaterB.setBackground(Color.WHITE);
		
		balanceLessB.setText("<");
		balanceLessB.setFont(new java.awt.Font("Dialog", 1, 18));
		balanceLessB.setMnemonic(KeyEvent.VK_C); 
		balanceLessB.setSelected(false);
		balanceLessB.setHorizontalTextPosition(SwingConstants.LEFT);
		balanceLessB.setFocusPainted(false);
		balanceLessB.setBackground(Color.WHITE);
		
		balanceEqBPanel.add(balanceGreaterB, BorderLayout.NORTH);
		balanceEqBPanel.add(balanceLessB, BorderLayout.SOUTH);
		balancePanel.add(balanceLbl);
		balancePanel.add(balanceField);
		balancePanel.add(balanceEqBPanel);
		
		maxCashLbl.setText("Max Cash:");
		maxCashLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		maxCashLbl.setPreferredSize(new Dimension(105, 30));
		
		maxCashField.setText(null);
		maxCashField.setFont(new java.awt.Font("Dialog", 1, 18));
		maxCashField.setPreferredSize(new Dimension(150,30));
		
		maxCashPanel.add(maxCashLbl);
		maxCashPanel.add(maxCashField);
		
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
		zipLbl.setPreferredSize(new Dimension(100, 30));
		
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

		bottomPanel.add(atmIdPanel);
		bottomPanel.add(branchIdPanel);
		bottomPanel.add(balancePanel);
		bottomPanel.add(maxCashPanel);
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
	
}

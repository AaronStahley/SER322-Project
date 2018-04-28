package main.java.project.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import main.java.project.managers.AccountsManager;
import main.java.project.managers.AtmManager;
import main.java.project.tables.AtmTable;
import main.java.project.tables.EmployeeTable;

public class AtmPanel extends JPanel{
	
	private JPanel bottomPanel = new JPanel();
	private JPanel atmIdPanel = new JPanel(); 
	private JPanel branchNamePanel = new JPanel(); 
	private JPanel balancePanel = new JPanel();
	private JPanel balanceEqBPanel = new JPanel(); 
	private JPanel maxCashPanel = new JPanel(); 
	private JPanel maxCashBPanel = new JPanel(); 
	private JPanel stNumPanel = new JPanel(); 
	private JPanel stNamePanel = new JPanel(); 
	private JPanel cityPanel = new JPanel();
	private JPanel statesPanel = new JPanel(); 
	private JPanel zipPanel = new JPanel();	
	private JPanel buttonPanel = new JPanel();
	private JPanel topNavbarPanel = new JPanel(); 


	private JLabel atmIdLbl = new JLabel(); 
	private JLabel branchNameLbl = new JLabel();
	private JLabel balanceLbl = new JLabel();
	private JLabel maxCashLbl = new JLabel();
	private JLabel stNumLbl = new JLabel();
	private JLabel stNameLbl = new JLabel();
	private JLabel cityLbl = new JLabel();
	private JLabel statesLbl = new JLabel();
	private JLabel zipLbl = new JLabel();

	private JTextField atmIdField = new JTextField();
	private JTextField branchNameField = new JTextField(); 
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
	private JCheckBox maxCashLessB = new JCheckBox();
	private JCheckBox maxCashGreaterB = new JCheckBox();
	
	private JButton addButton = new JButton();
	
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
		
		topNavbarPanel.setPreferredSize(new Dimension(100,35));
		topNavbarPanel.setLayout(new BorderLayout());
		topNavbarPanel.setBackground(Color.WHITE); 
		topNavbarPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		
		atmIdPanel.setLayout(new FlowLayout());
		atmIdPanel.setBackground(Color.WHITE);
		
		branchNamePanel.setLayout(new FlowLayout());
		branchNamePanel.setBackground(Color.WHITE);
		
		balancePanel.setLayout(new FlowLayout());
		balancePanel.setBackground(Color.WHITE);
		
		balanceEqBPanel.setLayout(new BorderLayout());
		balanceEqBPanel.setPreferredSize(new Dimension(50,55));
		balanceEqBPanel.setBackground(Color.white);
		
		maxCashPanel.setLayout(new FlowLayout());
		maxCashPanel.setBackground(Color.WHITE);
		
		maxCashBPanel.setLayout(new BorderLayout());
		maxCashBPanel.setPreferredSize(new Dimension(50,55));
		maxCashBPanel.setBackground(Color.white);
		
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
		
		branchNameLbl.setText("Branch Name:");
		branchNameLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		branchNameLbl.setPreferredSize(new Dimension(150, 30));
		
		branchNameField.setText(null);
		branchNameField.setFont(new java.awt.Font("Dialog", 1, 18));
		branchNameField.setPreferredSize(new Dimension(150,30));
		
		branchNamePanel.add(branchNameLbl);
		branchNamePanel.add(branchNameField);
		
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
		
		maxCashGreaterB.setText(">");
		maxCashGreaterB.setFont(new java.awt.Font("Dialog", 1, 18));
		maxCashGreaterB.setMnemonic(KeyEvent.VK_C); 
		maxCashGreaterB.setSelected(false);
		maxCashGreaterB.setHorizontalTextPosition(SwingConstants.LEFT);
		maxCashGreaterB.setFocusPainted(false);
		maxCashGreaterB.setBackground(Color.WHITE);
		
		maxCashLessB.setText("<");
		maxCashLessB.setFont(new java.awt.Font("Dialog", 1, 18));
		maxCashLessB.setMnemonic(KeyEvent.VK_C); 
		maxCashLessB.setSelected(false);
		maxCashLessB.setHorizontalTextPosition(SwingConstants.LEFT);
		maxCashLessB.setFocusPainted(false);
		maxCashLessB.setBackground(Color.WHITE);
		
		maxCashBPanel.add(maxCashGreaterB, BorderLayout.NORTH);
		maxCashBPanel.add(maxCashLessB, BorderLayout.SOUTH);
		maxCashPanel.add(maxCashLbl);
		maxCashPanel.add(maxCashField);
		maxCashPanel.add(maxCashBPanel);
		
		stNumLbl.setText("Street Number:");
		stNumLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		stNumLbl.setPreferredSize(new Dimension(160, 30));
		
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
		
		addButton.setIcon(new ImageIcon(NavBarPanel.class.getResource("/Add_Icon.png")));
		addButton.setFont(new java.awt.Font("Dialog", 1, 15));
		addButton.setBorderPainted(false);
		addButton.setPreferredSize(new Dimension(30, 30));
		addButton.setOpaque(false);
		//addButton.setBackground(new Color(151, 217, 247));
		addButton.setMargin(new Insets(0, 5, 0, 0));
		addButton.setToolTipText("Add Account");
		addButton.setSelected(false);
		addButton.setContentAreaFilled(true);
		addButton.setFocusPainted(false); 
		
		topNavbarPanel.add(addButton, BorderLayout.LINE_START); 
		
	    //--------End of Bottom Panel Attributes ----------//

		bottomPanel.add(atmIdPanel);
		bottomPanel.add(branchNamePanel);
		bottomPanel.add(balancePanel);
		bottomPanel.add(maxCashPanel);
		bottomPanel.add(stNumPanel);
		bottomPanel.add(stNamePanel);
		bottomPanel.add(cityPanel);
		bottomPanel.add(statesPanel);
		bottomPanel.add(zipPanel);
		bottomPanel.add(buttonPanel);
		
        this.add(topNavbarPanel, BorderLayout.NORTH);
		this.add(scrollPane, BorderLayout.CENTER);
	    this.add(bottomPanel, BorderLayout.SOUTH);
	    
	    //-------Button Action Listeners----------//
	    
	    submitB.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  
				  //Displays an error if the fields are blank.
				  if(isFieldsEmpty() == true) {
					  errorPopUpBox("Please Enter a value in one of the search fields","Error");
				  }else {
					  
					    new Thread(new Runnable(){
					        @Override
					        public void run(){
					        	
					        		getAtmId();
					        		getAtmBranchName();
					        		getBalance();
					        		getMaxCash();
					        		getAtmStNum();
					        		getAtmStName();
					        		getAtmCity();
					        		getAtmState();
					        		getAtmZip();
					        		atmTable.refresh();
					        }
					    }).start();
					
				  }	  
			  } 
			});
	    
	    balanceGreaterB.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  if(balanceGreaterB.isSelected() == true) {
					  balanceLessB.setSelected(false);
				  }
			  } 
		});
		
	    balanceLessB.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  if(balanceLessB.isSelected() == true) {
					  balanceGreaterB.setSelected(false);
				  }
			  } 
		});
	    
	    this.maxCashGreaterB.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  if(maxCashGreaterB.isSelected() == true) {
					  maxCashLessB.setSelected(false);
				  }
			  } 
		});
		
	    maxCashLessB.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  if(maxCashLessB.isSelected() == true) {
					  maxCashGreaterB.setSelected(false);
				  }
			  } 
		});
	    
	    clearB.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  
				  new Thread(new Runnable(){
				        @Override
				        public void run(){
				        	
							clearAllFields(); 
				        		atmTable.refresh();
				        }
				    }).start();
			  } 
		});

		//------END of Action Listeners-----------//

	
	}
	
	/**
	 * @author aaronstahley 04/23/2018
	 * Checks to see if text fields are empty. 
	 * @return
	 */
	public boolean isFieldsEmpty() {
		
		if(atmIdField.getText().equals("") && branchNameField.getText().equals("") && balanceField.getText().equals("")
				&& maxCashField.getText().equals("") && maxCashField.getText().equals("") && stNumField.getText().equals("")
				&& stNameField.getText().equals("") && cityField.getText().equals("") && statesField.getText().equals("") 
				&& zipField.getText().equals("")) {
			return true; 
		}
		
		return false; 
	}
	
	public void clearAllFields() {
		atmIdField.setText("");
		branchNameField.setText("");
		balanceField.setText("");
		maxCashField.setText("");
		stNumField.setText("");
		stNameField.setText("");
		cityField.setText("");
		statesField.setText("");
		zipField.setText("");
		
		this.balanceGreaterB.setSelected(false);
		this.balanceLessB.setSelected(false);
		this.maxCashGreaterB.setSelected(false);
		this.maxCashLessB.setSelected(false);

		AtmManager.populateFromSQL();
		atmTable.refresh();

	}
	
	public void getAtmId() {
		if(atmIdField.getText().equals("")) {
			
		}else {
			AtmManager.getAtmId(Integer.parseInt(atmIdField.getText()));
		}
	}
	
	public void getAtmBranchName() {
		if(branchNameField.getText().equals("")) {
			
		}else {
			AtmManager.getAtmBranchName(branchNameField.getText());
		}
	}
	
	public void getBalance() {
		if(balanceField.getText().equals("")) {
			
		}else if(balanceLessB.isSelected() == true) {
			AtmManager.getBalanceBellow(Integer.parseInt(balanceField.getText()));
		}else if(balanceGreaterB.isSelected() == true) {
			AtmManager.getBalanceAbove(Integer.parseInt(balanceField.getText()));
		}else {
			AtmManager.getBalanceAt(Integer.parseInt(balanceField.getText()));

		}
	}
	
	public void getMaxCash() {
		if(maxCashField.getText().equals("")) {
			
		}else if(maxCashLessB.isSelected() == true) {
			AtmManager.getMaxCashBellow(Integer.parseInt(maxCashField.getText()));
		}else if(maxCashGreaterB.isSelected() == true) {
			AtmManager.getMaxCashAbove(Integer.parseInt(maxCashField.getText()));
		}else {
			AtmManager.getMaxCashAt(Integer.parseInt(maxCashField.getText()));

		}
	}
	
	public void getAtmStNum() {
		if(stNumField.getText().equals("")) {
			
		}else {
			AtmManager.getAtmStNum(Integer.parseInt(stNumField.getText()));
		}
	}
	
	public void getAtmStName() {
		if(stNameField.getText().equals("")) {
			
		}else {
			AtmManager.getAtmStName(stNameField.getText());
		}
	}
	
	public void getAtmCity() {
		if(cityField.getText().equals("")) {
			
		}else {
			AtmManager.getAtmCity(cityField.getText());
		}
	}

	public void getAtmState() {
		if(statesField.getText().equals("")) {
			
		}else {
			AtmManager.getAtmState(statesField.getText());
		}
	}
	
	public void getAtmZip() {
		if(zipField.getText().equals("")) {
			
		}else {
			AtmManager.getAtmZip(Integer.parseInt(zipField.getText()));
		}
	}
	
	
	
	public static void errorPopUpBox(String infoMessage, String titleBar)
	{
		JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " +
				titleBar, JOptionPane.ERROR_MESSAGE);
	}
	
}

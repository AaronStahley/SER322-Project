package main.java.project.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import main.java.project.managers.CustomersManager;
import main.java.project.tables.CustomerTable;

public class CustomersPanel extends JPanel{
	
	private JPanel bottomPanel = new JPanel();
	private JPanel ssnPanel = new JPanel(); 
	private JPanel accIdPanel = new JPanel(); 
	private JPanel fNamePanel = new JPanel();
	private JPanel lNamePanel = new JPanel(); 
	private JPanel dateJoinedPanel = new JPanel(); 
	private JPanel dobPanel = new JPanel(); 
	private JPanel stNumPanel = new JPanel(); 
	private JPanel stNamePanel = new JPanel(); 
	private JPanel cityPanel = new JPanel();
	private JPanel statesPanel = new JPanel(); 
	private JPanel zipPanel = new JPanel();	
	private JPanel buttonPanel = new JPanel();
	private JPanel emailPanel = new JPanel(); 
	private JPanel topNavbarPanel = new JPanel(); 


	private JLabel ssnLbl = new JLabel();
	private JLabel accIdLbl = new JLabel(); 
	private JLabel fNameLbl = new JLabel();
	private JLabel lNameLbl = new JLabel();
	private JLabel dateJoinedLbl = new JLabel(); 
	private JLabel dobLbl = new JLabel(); 
	private JLabel stNumLbl = new JLabel();
	private JLabel stNameLbl = new JLabel();
	private JLabel cityLbl = new JLabel();
	private JLabel statesLbl = new JLabel();
	private JLabel zipLbl = new JLabel();
	private JLabel emailLbl = new JLabel();

	private JTextField ssnField = new JTextField(); 
	private JTextField accIdField = new JTextField();
	private JTextField fNameField = new JTextField();
	private JTextField lNameField = new JTextField();
	private JTextField dateJoinedField = new JTextField();
	private JTextField dobField = new JTextField(); 
	private JTextField stNumField = new JTextField();
	private JTextField stNameField = new JTextField();
	private JTextField cityField = new JTextField();
	private JTextField statesField = new JTextField();
	private JTextField zipField = new JTextField();
	private JTextField emailField = new JTextField(); 
	
	//private JCheckBox sortDescendingB = new JCheckBox();
	
	private JButton addButton = new JButton();

	
	private JScrollPane scrollPane = new JScrollPane();
		
	private JButton clearB = new JButton(); 
	private JButton submitB = new JButton();
		
	private CustomerTable customerTable = new CustomerTable(); 
	
	public CustomersPanel() {
		
		this.setPreferredSize(new Dimension(1000,1000));
		this.setBackground(Color.WHITE);		
		this.setLayout(new BorderLayout());
		
		scrollPane.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 0, Color.BLACK));
        scrollPane.getViewport().add(customerTable, null);
        
        customerTable.setBackground(Color.WHITE);
        customerTable.setMaximumSize(new Dimension(32767, 32767));
        customerTable.setRowHeight(24);
        
        FlowLayout fl = new FlowLayout();
		fl.setHgap(20); //Gap of components horizontal
		fl.setVgap(10); // Gap of components vertical
		
		bottomPanel.setPreferredSize(new Dimension(100,210));
		bottomPanel.setLayout(fl);
		bottomPanel.setBackground(Color.WHITE);
		bottomPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		topNavbarPanel.setPreferredSize(new Dimension(100,35));
		topNavbarPanel.setLayout(new BorderLayout());
		topNavbarPanel.setBackground(Color.WHITE); 
		topNavbarPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		
		
		ssnPanel.setLayout(new FlowLayout());
		ssnPanel.setBackground(Color.WHITE);
		
		accIdPanel.setLayout(new FlowLayout());
		accIdPanel.setBackground(Color.WHITE);
		
		fNamePanel.setLayout(new FlowLayout());
		fNamePanel.setBackground(Color.WHITE);
		
		lNamePanel.setLayout(new FlowLayout());
		lNamePanel.setBackground(Color.WHITE);
		
		dateJoinedPanel.setLayout(new FlowLayout());
		dateJoinedPanel.setBackground(Color.WHITE);
		
		dobPanel.setLayout(new FlowLayout());
		dobPanel.setBackground(Color.WHITE);
		
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
		
		emailPanel.setLayout(new FlowLayout());
		emailPanel.setBackground(Color.WHITE);
		
		buttonPanel.setLayout(fl);
		buttonPanel.setBackground(Color.WHITE); 
		
		//-------------Bottom Panel Attributes--------------//
		
		ssnLbl.setText("Customer SSN:");
		ssnLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		ssnLbl.setPreferredSize(new Dimension(150, 30));
		
		ssnField.setText(null);
		ssnField.setFont(new java.awt.Font("Dialog", 1, 18));
		ssnField.setPreferredSize(new Dimension(150,30));
		
		ssnPanel.add(ssnLbl);
		ssnPanel.add(ssnField);
		

		accIdLbl.setText("Account ID:");
		accIdLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		accIdLbl.setPreferredSize(new Dimension(130, 30));
				
		accIdField.setText(null);
		accIdField.setFont(new java.awt.Font("Dialog", 1, 18));
		accIdField.setPreferredSize(new Dimension(150,30));
				
		accIdPanel.add(accIdLbl);
		accIdPanel.add(accIdField);
				
				
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
		
		dateJoinedLbl.setText("Date Joined:");
		dateJoinedLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		dateJoinedLbl.setPreferredSize(new Dimension(140, 30));
				
		dateJoinedField.setText(null);
		dateJoinedField.setFont(new java.awt.Font("Dialog", 1, 18));
		dateJoinedField.setPreferredSize(new Dimension(150,30));
				
		dateJoinedPanel.add(dateJoinedLbl);
		dateJoinedPanel.add(dateJoinedField);
		
		dobLbl.setText("Birth Date:");
		dobLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		dobLbl.setPreferredSize(new Dimension(140, 30));
				
		dobField.setText(null);
		dobField.setFont(new java.awt.Font("Dialog", 1, 18));
		dobField.setPreferredSize(new Dimension(150,30));
				
		dobPanel.add(dobLbl);
		dobPanel.add(dobField);
				
		stNumLbl.setText("Street Number:");
		stNumLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		stNumLbl.setPreferredSize(new Dimension(170, 30));
				
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
		zipLbl.setPreferredSize(new Dimension(110, 30));
				
		zipField.setText(null);
		zipField.setFont(new java.awt.Font("Dialog", 1, 18));
		zipField.setPreferredSize(new Dimension(150,30));
				
		zipPanel.add(zipLbl);
		zipPanel.add(zipField);
		
		emailLbl.setText("Email:");
		emailLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		emailLbl.setPreferredSize(new Dimension(80, 30));
				
		emailField.setText(null);
		emailField.setFont(new java.awt.Font("Dialog", 1, 18));
		emailField.setPreferredSize(new Dimension(150,30));
				
		emailPanel.add(emailLbl);
		emailPanel.add(emailField);
				
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
		
		bottomPanel.add(ssnPanel);
		bottomPanel.add(accIdPanel);
		bottomPanel.add(fNamePanel);
		bottomPanel.add(lNamePanel);
		bottomPanel.add(dateJoinedPanel);
		bottomPanel.add(dobPanel);
		bottomPanel.add(stNumPanel);
		bottomPanel.add(stNamePanel);
		bottomPanel.add(cityPanel);
		bottomPanel.add(statesPanel);
		bottomPanel.add(zipPanel);
		bottomPanel.add(emailPanel); 
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
					        	
					        		getCustomerSSN();
					        		getCustomerAccID();
					        		getCustomerfName(); 
					        		getCustomerlName();
					        		getCustomerDateJoined();
					        		getCustomerDob();
					        		getCustomerstNum(); 
					        		getCustomerstName(); 
					        		getCustomersCity();
					        		getCustomersState();
					        		getCustomersZip();
					        		getCustomersEmail(); 
					        		customerTable.refresh();
					        		
					        }
					    }).start();			
				  }	  
			  } 
			});
	    
	    
	    clearB.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  clearAllFields();
			  }
	    });
	    
		//------END of Action Listeners-----------//
		
		
	}
	
	public void clearAllFields() {
		ssnField.setText("");
		accIdField.setText("");
		fNameField.setText("");
		lNameField.setText("");
		dateJoinedField.setText("");
		dobField.setText("");
		stNumField.setText("");
		stNameField.setText("");
		cityField.setText("");
		statesField.setText("");
		zipField.setText("");
		emailField.setText("");
	}
	
	/**
	 * @author aaronstahley 04/23/2018
	 * Checks to see if text fields are empty. 
	 * @return
	 */
	public boolean isFieldsEmpty() {
		
		if(ssnField.getText().equals("") && accIdField.getText().equals("") && fNameField.getText().equals("")
				&& lNameField.getText().equals("") && dateJoinedField.getText().equals("") && dobField.getText().equals("")
				&& stNumField.getText().equals("") && stNameField.getText().equals("") && cityField.getText().equals("")
				&& statesField.getText().equals("") && zipField.getText().equals("") && emailField.getText().equals("")) {
			return true; 
		}
		
		return false; 
	}
	
	
	public void getCustomerSSN() {
		if(ssnField.getText().equals("")) {
			
		}else {
			CustomersManager.getCustomersSSN(ssnField.getText());
		}
	}
	
	public void getCustomerAccID() {
		if(accIdField.getText().equals("")) {
			
		}else {
			CustomersManager.getCustomersAccID(accIdField.getText());
		}
	}
	
	public void getCustomerfName() {
		if(fNameField.getText().equals("")) {
			
		}else {
			CustomersManager.getCustomersfName(fNameField.getText());
		}
	}
	
	public void getCustomerlName() {
		if(lNameField.getText().equals("")) {
			
		}else {
			CustomersManager.getCustomerslName(lNameField.getText());
		}
	}
	
	public void getCustomerDateJoined() {
		
		String testDate = dateJoinedField.getText();
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		if(dateJoinedField.getText().equals("")) {
			
		}else {
			
			try {
				Date date = formatter.parse(testDate);
				CustomersManager.getCustomersDateJoined(date);
			} catch (ParseException e) {
				errorPopUpBox("Date must be in format yyyy-mm-dd","Formating Error");
				e.printStackTrace();
			}
		}
	}
	
	public void getCustomerDob() {
			
			String testDate = dobField.getText();
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			
			if(dobField.getText().equals("")) {
				
			}else {
				
				try {
					Date date = formatter.parse(testDate);
					CustomersManager.getCustomersDob(date);
				} catch (ParseException e) {
					errorPopUpBox("Date must be in format yyyy-mm-dd","Formating Error");
					e.printStackTrace();
				}
			}
		}
	
	public void getCustomerstNum() {
		if(stNumField.getText().equals("")) {
			
		}else {
			CustomersManager.getCustomersstNum(Integer.parseInt(stNumField.getText()));
		}
	}
	
	public void getCustomerstName() {
		if(stNameField.getText().equals("")) {
			
		}else {
			CustomersManager.getCustomersStName(stNameField.getText());
		}
	}
	
	
	public void getCustomersCity() {
		if(cityField.getText().equals("")) {
			
		}else {
			CustomersManager.getCustomersCity(cityField.getText());
		}
	}
	
	public void getCustomersState() {
		if(statesField.getText().equals("")) {
			
		}else {
			CustomersManager.getCustomersState(statesField.getText());
		}
	}
	
	public void getCustomersZip() {
		if(zipField.getText().equals("")) {
			
		}else {
			CustomersManager.getCustomersZip(Integer.parseInt(zipField.getText()));
		}
	}
	
	public void getCustomersEmail() {
		if(emailField.getText().equals("")) {
			
		}else {
			CustomersManager.getCustomersEmail(emailField.getText());
		}
	}
		
		
		
	public static void errorPopUpBox(String infoMessage, String titleBar)
	{
		JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " +
				titleBar, JOptionPane.ERROR_MESSAGE);
	}
		


}

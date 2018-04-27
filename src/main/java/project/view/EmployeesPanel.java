package main.java.project.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import main.java.project.managers.AccountsManager;
import main.java.project.managers.EmployeesManager;
import main.java.project.tables.AccountTable;
import main.java.project.tables.EmployeeTable;

public class EmployeesPanel extends JPanel {
	
	private JPanel bottomPanel = new JPanel();
	private JPanel empIdPanel = new JPanel(); 
	private JPanel ssnPanel = new JPanel(); 
	private JPanel fNamePanel = new JPanel();
	private JPanel lNamePanel = new JPanel();
	private JPanel positionPanel = new JPanel();
	private JPanel worksAtPanel = new JPanel(); 
	private JPanel stNumPanel = new JPanel(); 
	private JPanel stNamePanel = new JPanel(); 
	private JPanel cityPanel = new JPanel();
	private JPanel statesPanel = new JPanel(); 
	private JPanel zipPanel = new JPanel();	
	private JPanel emailPanel = new JPanel();
	private JPanel buttonPanel = new JPanel();


	private JLabel empIdLbl = new JLabel(); 
	private JLabel ssnLbl = new JLabel();
	private JLabel fNameLbl = new JLabel();
	private JLabel lNameLbl = new JLabel();
	private JLabel positionLbl = new JLabel();
	private JLabel worksAtLbl = new JLabel(); 
	private JLabel stNumLbl = new JLabel();
	private JLabel stNameLbl = new JLabel();
	private JLabel cityLbl = new JLabel();
	private JLabel statesLbl = new JLabel();
	private JLabel zipLbl = new JLabel();
	private JLabel emailLbl = new JLabel();

	private JTextField empIdField = new JTextField();
	private JTextField ssnField = new JTextField(); 
	private JTextField fNameField = new JTextField();
	private JTextField lNameField = new JTextField();
	private JTextField positionField = new JTextField();
	private JTextField worksAtField = new JTextField(); 
	private JTextField stNumField = new JTextField();
	private JTextField stNameField = new JTextField();
	private JTextField cityField = new JTextField();
	private JTextField statesField = new JTextField();
	private JTextField zipField = new JTextField();
	private JTextField emailField = new JTextField(); 

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
		
		positionPanel.setLayout(new FlowLayout());
		positionPanel.setBackground(Color.WHITE);
		
		worksAtPanel.setLayout(new FlowLayout());
		worksAtPanel.setBackground(Color.WHITE);
		
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

		empIdLbl.setText("Employee ID:");
		empIdLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		empIdLbl.setPreferredSize(new Dimension(140, 30));
		
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
		
		positionLbl.setText("Position:");
		positionLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		positionLbl.setPreferredSize(new Dimension(110, 30));
		
		positionField.setText(null);
		positionField.setFont(new java.awt.Font("Dialog", 1, 18));
		positionField.setPreferredSize(new Dimension(150,30));
		
		positionPanel.add(positionLbl);
		positionPanel.add(positionField);
		
		worksAtLbl.setText("Works At:");
		worksAtLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		worksAtLbl.setPreferredSize(new Dimension(115, 30));
		
		worksAtField.setText(null);
		worksAtField.setFont(new java.awt.Font("Dialog", 1, 18));
		worksAtField.setPreferredSize(new Dimension(150,30));
		
		worksAtPanel.add(worksAtLbl);
		worksAtPanel.add(worksAtField);
		
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
		zipLbl.setPreferredSize(new Dimension(105, 30));
		
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
		
	    //--------End of Bottom Panel Attributes ----------//

		bottomPanel.add(empIdPanel);
		bottomPanel.add(ssnPanel);
		bottomPanel.add(fNamePanel);
		bottomPanel.add(lNamePanel);
		bottomPanel.add(positionPanel);
		bottomPanel.add(worksAtPanel);
		bottomPanel.add(stNumPanel);
		bottomPanel.add(stNamePanel);
		bottomPanel.add(cityPanel);
		bottomPanel.add(statesPanel);
		bottomPanel.add(zipPanel);
		bottomPanel.add(emailPanel); 
		bottomPanel.add(buttonPanel);
		
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
					       
					        		getEmployeeId();
					        		getEmployeeSSN(); 
					        		getEmployeeFName(); 
					        		getEmployeeLName();
					        		getEmployeePosition();
					        		getEmployeeWorksAt();
					        		employeeTable.refresh();
					        }
					    }).start();
					
				  }	  
			  } 
			});
	    
	    clearB.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  
				  
				  new Thread(new Runnable(){
				        @Override
				        public void run(){
				        	
							 clearAllFields(); 
							 
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
		
		if(empIdField.getText().equals("") && ssnField.getText().equals("") && 
			 fNameField.getText().equals("") && lNameField.getText().equals("") &&
			 positionField.getText().equals("") && worksAtField.getText().equals("") &&
			 stNumField.getText().equals("") && stNameField.getText().equals("") &&
			 cityField.getText().equals("") && statesField.getText().equals("") &&
			 zipField.getText().equals("") && emailField.getText().equals("")) {
			return true; 
		}
		
		return false; 
	}
	
	public void clearAllFields() {
		empIdField.setText("");
		ssnField.setText("");
		fNameField.setText("");
		lNameField.setText("");
		positionField.setText("");
		worksAtField.setText("");
		stNumField.setText("");
		stNameField.setText("");
		cityField.setText("");
		statesField.setText("");
		zipField.setText("");
		emailField.setText("");


		
		EmployeesManager.populateFromSQL();
		employeeTable.refresh();

	}
	
	
	public void getEmployeeId() {
		if(empIdField.getText().equals("")) {
			
		}else {
			EmployeesManager.getEmployeeId(Integer.parseInt(empIdField.getText()));
		}
	}
	
	public void getEmployeeSSN() {
		if(ssnField.getText().equals("")) {
			
		}else {
			EmployeesManager.getEmployeeSSN(ssnField.getText());
		}
	}
	
	public void getEmployeeFName() {
		if(fNameField.getText().equals("")) {
			
		}else {
			EmployeesManager.getEmployeeFName(fNameField.getText());
		}
	}
	
	public void getEmployeeLName() {
		if(lNameField.getText().equals("")) {
			
		}else {
			EmployeesManager.getEmployeelName(lNameField.getText());
		}
	}
	
	public void getEmployeePosition() {
		if(positionField.getText().equals("")) {
			
		}else {
			EmployeesManager.getEmployeePosition(positionField.getText());
		}
	}
	
	public void getEmployeeWorksAt() {
		if(worksAtField.getText().equals("")) {
			
		}else {
			EmployeesManager.getEmployeeWorksAt(worksAtField.getText());
		}
	}
	
	public static void errorPopUpBox(String infoMessage, String titleBar)
	{
		JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " +
				titleBar, JOptionPane.ERROR_MESSAGE);
	}
	
	
}

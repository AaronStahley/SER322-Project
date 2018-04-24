package main.java.project.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Color;
import java.awt.ComponentOrientation;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import main.java.project.managers.AccountsManager;
import main.java.project.tables.AccountTable;

public class AccountsPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel bottomPanel = new JPanel();
	private JPanel accIdPanel = new JPanel(); 
	private JPanel accTypePanel = new JPanel(); 
	private JPanel balancePanel = new JPanel();
	private JPanel dateCreatedPanel = new JPanel(); 
	private JPanel sortButtonsPanel = new JPanel(); 
	private JPanel buttonPanel = new JPanel();
	private JPanel equalityBPanel = new JPanel(); 
	
	private JLabel accIdLbl = new JLabel(); 
	private JLabel accTypeLbl = new JLabel();
	private JLabel balanceLbl = new JLabel();
	private JLabel dateCreatedLbl = new JLabel();

	private JTextField accIdField = new JTextField();
	private JTextField accTypeField = new JTextField(); 
	private JTextField balanceField = new JTextField();
	private JTextField dateCreatedField = new JTextField();
	
	private JCheckBox sortDescendingB = new JCheckBox();
	private JCheckBox lessThanB = new JCheckBox();
	private JCheckBox greaterThanB = new JCheckBox();
	
	private JScrollPane scrollPane = new JScrollPane();
	
	private JButton clearB = new JButton(); 
	private JButton submitB = new JButton();
	
	private AccountTable accountTable = new AccountTable(); 

	
	public AccountsPanel() {
		
		this.setPreferredSize(new Dimension(1000,1000));
		this.setBackground(Color.WHITE);		
		this.setLayout(new BorderLayout());
		
        scrollPane.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 0, Color.BLACK));
        scrollPane.getViewport().add(accountTable, null);

        
		accountTable.setBackground(Color.WHITE);
		accountTable.setMaximumSize(new Dimension(32767, 32767));
		accountTable.setRowHeight(24);

		FlowLayout fl = new FlowLayout();
		fl.setHgap(20); //Gap of components horizontal
		fl.setVgap(10); // Gap of components vertical
		
		
		bottomPanel.setPreferredSize(new Dimension(100,130));
		bottomPanel.setLayout(fl);
		bottomPanel.setBackground(Color.WHITE);
		bottomPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		
		
		accIdPanel.setLayout(new FlowLayout());
		accIdPanel.setBackground(Color.WHITE);
		
		accTypePanel.setLayout(new FlowLayout()); 
		accTypePanel.setBackground(Color.WHITE);

		balancePanel.setLayout(new FlowLayout());
		balancePanel.setBackground(Color.WHITE);
		
		equalityBPanel.setLayout(new BorderLayout());
		equalityBPanel.setPreferredSize(new Dimension(50,55));
		equalityBPanel.setBackground(Color.white);
		
		dateCreatedPanel.setLayout(new FlowLayout());
		dateCreatedPanel.setBackground(Color.WHITE);

		sortButtonsPanel.setLayout(new FlowLayout());
		sortButtonsPanel.setBackground(Color.WHITE);

		buttonPanel.setLayout(fl);
		buttonPanel.setBackground(Color.WHITE); 

		
		
		//-------------Bottom Panel Attributes--------------//
		
		accIdLbl.setText("Account ID:");
        accIdLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		accIdLbl.setPreferredSize(new Dimension(120, 30));
		
		accIdField.setText(null);
        accIdField.setFont(new java.awt.Font("Dialog", 1, 18));
		accIdField.setPreferredSize(new Dimension(150,30));
		
		accIdPanel.add(accIdLbl);
		accIdPanel.add(accIdField);
		
		accTypeLbl.setText("Account Type:");
        accTypeLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		accTypeLbl.setPreferredSize(new Dimension(150,30));

		accTypeField.setText(null);
        accTypeField.setFont(new java.awt.Font("Dialog", 1, 18));
		accTypeField.setPreferredSize(new Dimension(150,30));
		
		accTypePanel.add(accTypeLbl);
		accTypePanel.add(accTypeField);
		
		balanceLbl.setText("Account Balance:");
		balanceLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		balanceLbl.setPreferredSize(new Dimension(180,30));

		balanceField.setText(null);
		balanceField.setFont(new java.awt.Font("Dialog", 1, 18));
		balanceField.setPreferredSize(new Dimension(150,30));
		
		greaterThanB.setText(">");
		greaterThanB.setFont(new java.awt.Font("Dialog", 1, 18));
		greaterThanB.setMnemonic(KeyEvent.VK_C); 
		greaterThanB.setSelected(false);
		greaterThanB.setHorizontalTextPosition(SwingConstants.LEFT);
		greaterThanB.setFocusPainted(false);
		greaterThanB.setBackground(Color.WHITE);
		
		lessThanB.setText("<");
		lessThanB.setFont(new java.awt.Font("Dialog", 1, 18));
		lessThanB.setMnemonic(KeyEvent.VK_C); 
		lessThanB.setSelected(false);
		lessThanB.setHorizontalTextPosition(SwingConstants.LEFT);
		lessThanB.setFocusPainted(false);
		lessThanB.setBackground(Color.WHITE);
		
		equalityBPanel.add(greaterThanB, BorderLayout.NORTH);
		equalityBPanel.add(lessThanB, BorderLayout.SOUTH);
		balancePanel.add(balanceLbl);
		balancePanel.add(balanceField);
		balancePanel.add(equalityBPanel);

		dateCreatedLbl.setText("Creation Date:");
		dateCreatedLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		dateCreatedLbl.setPreferredSize(new Dimension(150,30));

		dateCreatedField.setText(null);
		dateCreatedField.setFont(new java.awt.Font("Dialog", 1, 18));
		dateCreatedField.setPreferredSize(new Dimension(150,30));
		
		dateCreatedPanel.add(dateCreatedLbl);
		dateCreatedPanel.add(dateCreatedField);
		
		sortDescendingB.setText("Sort Descending");
		sortDescendingB.setFont(new java.awt.Font("Dialog", 1, 18));
	    sortDescendingB.setMnemonic(KeyEvent.VK_C); 
	    sortDescendingB.setSelected(false);
	    sortDescendingB.setHorizontalTextPosition(SwingConstants.LEFT);
	    sortDescendingB.setFocusPainted(false);
	    sortDescendingB.setBackground(Color.WHITE);
	    
	    sortButtonsPanel.add(sortDescendingB); 
		
		clearB.setText("Clear All");
		clearB.setFont(new java.awt.Font("Dialog", 1, 18));
		clearB.setPreferredSize(new Dimension(120,30));
		
		submitB.setText("Submit");
        submitB.setFont(new java.awt.Font("Dialog", 1, 18));
		submitB.setPreferredSize(new Dimension(120,30));
		
		buttonPanel.add(clearB);
		buttonPanel.add(submitB);
	
		
	    
	    //--------End of Bottom Panel Attributes ----------//
	    
      
        bottomPanel.add(accIdPanel);
        bottomPanel.add(accTypePanel);
        bottomPanel.add(balancePanel);
        bottomPanel.add(dateCreatedPanel);
        bottomPanel.add(sortButtonsPanel);
        bottomPanel.add(buttonPanel); 

	    this.add(scrollPane, BorderLayout.CENTER);
	    this.add(bottomPanel, BorderLayout.SOUTH);
	    
	    //-------Button Action Listeners----------//
	    
	    
		greaterThanB.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  if(greaterThanB.isSelected() == true) {
					  lessThanB.setSelected(false);
				  }
			  } 
		});
		
		lessThanB.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  if(lessThanB.isSelected() == true) {
					  greaterThanB.setSelected(false);
				  }
			  } 
		});
		
		clearB.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  clearAllFields();
			  } 
		});
	
		submitB.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  
				  //Displays an error if the fields are blank.
				  if(isFieldsEmpty() == true) {
					  errorPopUpBox("Please Enter a value in one of the search fields","Error");
				  }else {
					  
					  getAccountID();
					  getAccountTypes();
					  accountBalanceFields();			  
					  accountTable.refresh();

				  }	  
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
		
		if(accIdField.getText().equals("") && accTypeField.getText().equals("") && balanceField.getText().equals("")
				&& dateCreatedField.getText().equals("")) {
			return true; 
		}
		
		return false; 
	}
	
	/**
	 * @author aaronstahley 04/23/2018
	 * Clears all text fields
	 */
	public void clearAllFields() {
		accIdField.setText("");
		accTypeField.setText("");
		balanceField.setText("");
		dateCreatedField.setText("");
		lessThanB.setSelected(false);
		greaterThanB.setSelected(false);
	}
	
	/**
	 * @author aaronstahley 04/23/2018
	 * Determines which query to choose for balance based
	 * on less than or greater than. if no button is
	 * selected it will default to equal to. 
	 */
	public void accountBalanceFields() {
		
		if(balanceField.getText().equals("")) {
			
		}else if(lessThanB.isSelected() == true) {
			  
			  AccountsManager.getAcountsLess(Integer.parseInt(balanceField.getText()));
			  
		  }else if(greaterThanB.isSelected() == true) {
			  
			  AccountsManager.getAcountsGreater(Integer.parseInt(balanceField.getText()));
		  }else{				  
			  
			  AccountsManager.getAcountsBalance(Integer.parseInt(balanceField.getText()));
		  }
	}
	
	/**
	 * @author aaronstahley 04/23/2018
	 * returns all account ID's matching the one entered in the text field
	 * should always only return 1 result since ID's are unique.
	 */
	public void getAccountID() {
		if(accIdField.getText().equals("")) {
			
		}else {
			
				AccountsManager.getAcountsID(Integer.parseInt(accIdField.getText()));
				
		}
	}
	
	public void getAccountTypes() {
		if(accTypeField.getText().equals("")) {
			
		}else {
			AccountsManager.getAcountsWithType(accTypeField.getText());
		}
	}
	
	
	public static void errorPopUpBox(String infoMessage, String titleBar)
	{
		JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " +
				titleBar, JOptionPane.ERROR_MESSAGE);
	}
	
	  /**
     * @author aaronstahley 3/27/2018
     * Checks to see if a string contains either a positive 
     * or negative number no letters allowed. 
     * @param string what you are checking
     * @return true or false
     */
    public boolean hasOnlyNumbers(String string)
    {
    	//List of acceptable characters.
        Pattern pattern = Pattern.compile("([+.-]{0,1})?[\\d.]*");
        
        Matcher matcher = pattern.matcher(string);
        
        //checks if string matches acceptable characters.
        boolean isMatch = matcher.matches();
        
        return isMatch;
    }
	




}

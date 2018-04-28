package main.java.project.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Color;
import java.awt.ComponentOrientation;

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
	private JPanel fNamePanel = new JPanel();
	private JPanel lNamePanel = new JPanel(); 
	private JPanel dateCreatedPanel = new JPanel(); 
	private JPanel sortButtonsPanel = new JPanel(); 
	private JPanel buttonPanel = new JPanel();
	private JPanel equalityBPanel = new JPanel(); 
	private JPanel beforeAfterPanel = new JPanel(); 
	private JPanel topNavbarPanel = new JPanel(); 
	
	private JLabel accIdLbl = new JLabel(); 
	private JLabel accTypeLbl = new JLabel();
	private JLabel balanceLbl = new JLabel();
	private JLabel fNameLbl = new JLabel(); 
	private JLabel lNameLbl = new JLabel(); 
	private JLabel dateCreatedLbl = new JLabel();

	private JTextField accIdField = new JTextField();
	private JTextField accTypeField = new JTextField(); 
	private JTextField balanceField = new JTextField();
	private JTextField fNameField = new JTextField(); 
	private JTextField lNameField = new JTextField(); 
	private JTextField dateCreatedField = new JTextField();
	
	private JCheckBox sortBalanceB = new JCheckBox();
	private JCheckBox lessThanB = new JCheckBox();
	private JCheckBox greaterThanB = new JCheckBox();
	private JCheckBox beforeDateB = new JCheckBox();
	private JCheckBox afterDateB = new JCheckBox(); 
	
	private JButton addButton = new JButton();
	
	private JScrollPane scrollPane = new JScrollPane();
	
	private JButton clearB = new JButton(); 
	private JButton submitB = new JButton();
	
	private static AccountTable accountTable = new AccountTable(); 
	
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
		
		
		bottomPanel.setPreferredSize(new Dimension(100,210));
		bottomPanel.setLayout(fl);
		bottomPanel.setBackground(Color.WHITE);
		bottomPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		topNavbarPanel.setPreferredSize(new Dimension(100,35));
		topNavbarPanel.setLayout(new BorderLayout());
		topNavbarPanel.setBackground(Color.WHITE); 
		topNavbarPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));

	
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
		
		fNamePanel.setLayout(new FlowLayout());
		fNamePanel.setBackground(Color.WHITE);
		
		lNamePanel.setLayout(new FlowLayout());
		lNamePanel.setBackground(Color.WHITE);
		
		beforeAfterPanel.setLayout(new BorderLayout());
		beforeAfterPanel.setPreferredSize(new Dimension(50,55));
		beforeAfterPanel.setBackground(Color.WHITE);

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
		
		fNameLbl.setText("First Name:");
		fNameLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		fNameLbl.setPreferredSize(new Dimension(120,30));

		fNameField.setText(null);
		fNameField.setFont(new java.awt.Font("Dialog", 1, 18));
		fNameField.setPreferredSize(new Dimension(150,30));
		
		fNamePanel.add(fNameLbl);
		fNamePanel.add(fNameField);
		
		lNameLbl.setText("Last Name:");
		lNameLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		lNameLbl.setPreferredSize(new Dimension(120,30));

		lNameField.setText(null);
		lNameField.setFont(new java.awt.Font("Dialog", 1, 18));
		lNameField.setPreferredSize(new Dimension(150,30));
		
		lNamePanel.add(lNameLbl);
		lNamePanel.add(lNameField);

		dateCreatedLbl.setText("Creation Date:");
		dateCreatedLbl.setFont(new java.awt.Font("Dialog", 1, 20));
		dateCreatedLbl.setPreferredSize(new Dimension(150,30));

		dateCreatedField.setText(null);
		dateCreatedField.setFont(new java.awt.Font("Dialog", 1, 18));
		dateCreatedField.setPreferredSize(new Dimension(150,30));
		
		beforeDateB.setText("<");
		beforeDateB.setFont(new java.awt.Font("Dialog", 1, 18));
		beforeDateB.setMnemonic(KeyEvent.VK_C); 
		beforeDateB.setSelected(false);
		beforeDateB.setHorizontalTextPosition(SwingConstants.LEFT);
		beforeDateB.setFocusPainted(false);
		beforeDateB.setBackground(Color.WHITE);
		
		afterDateB.setText(">");
		afterDateB.setFont(new java.awt.Font("Dialog", 1, 18));
		afterDateB.setMnemonic(KeyEvent.VK_C); 
		afterDateB.setSelected(false);
		afterDateB.setHorizontalTextPosition(SwingConstants.LEFT);
		afterDateB.setFocusPainted(false);
		afterDateB.setBackground(Color.WHITE);
		
		beforeAfterPanel.add(beforeDateB, BorderLayout.NORTH);
		beforeAfterPanel.add(afterDateB, BorderLayout.SOUTH); 
		
		dateCreatedPanel.add(dateCreatedLbl);
		dateCreatedPanel.add(dateCreatedField);
		dateCreatedPanel.add(beforeAfterPanel); 

		
		sortBalanceB.setText("Sort Balance");
		sortBalanceB.setFont(new java.awt.Font("Dialog", 1, 18));
	    sortBalanceB.setMnemonic(KeyEvent.VK_C); 
	    sortBalanceB.setSelected(false);
	    sortBalanceB.setHorizontalTextPosition(SwingConstants.LEFT);
	    sortBalanceB.setFocusPainted(false);
	    sortBalanceB.setBackground(Color.WHITE);
	    
	    sortButtonsPanel.add(sortBalanceB); 
		
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
	    
      
        bottomPanel.add(accIdPanel);
        bottomPanel.add(accTypePanel);
        bottomPanel.add(balancePanel);
        bottomPanel.add(fNamePanel);
        bottomPanel.add(lNamePanel);
        bottomPanel.add(dateCreatedPanel);
        bottomPanel.add(sortButtonsPanel);
        bottomPanel.add(buttonPanel); 

        this.add(topNavbarPanel, BorderLayout.NORTH);
	    this.add(scrollPane, BorderLayout.CENTER);
	    this.add(bottomPanel, BorderLayout.SOUTH);
	    
	    //-------Button Action Listeners----------//
	    
	    this.addButton.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  
				  AddAccountDlg addP = new AddAccountDlg(); 
				  			
			  } 
		});
	    
	    
	    this.sortBalanceB.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  
				  if(sortBalanceB.isSelected() == true) {
					  AccountsManager.getDescBalance();
					  accountTable.refresh();
				  }else {
					  AccountsManager.populateFromSQL();
					  accountTable.refresh();

				  }
				
			  } 
		});
	    
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
		
		afterDateB.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  if(afterDateB.isSelected() == true) {
					  beforeDateB.setSelected(false);
				  }
			  } 
		});
		
		beforeDateB.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  if(beforeDateB.isSelected() == true) {
					  afterDateB.setSelected(false);
				  }
			  } 
		});
		
		
		clearB.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  
				  new Thread(new Runnable(){
				        @Override
				        public void run(){
				        	getAccountID();
							  clearAllFields();
				        }
				    }).start();
			  } 
		});
	
		submitB.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  
				  //Displays an error if the fields are blank.
				  if(isFieldsEmpty() == true) {
					  errorPopUpBox("Please Enter a value in one of the search fields","Error");
				  }else {
					  
					    new Thread(new Runnable(){
					        @Override
					        public void run(){
					        		getAccountID();
								getAccountTypes();
								accountBalanceFields();
								getAccountFirstName();
								getAccountLastName();
								getAccountDates();
								accountTable.refresh();
					        }
					    }).start();
					
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
				&& dateCreatedField.getText().equals("") && fNameField.getText().equals("") && lNameField.getText().equals("")) {
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
		fNameField.setText("");
		lNameField.setText("");
		dateCreatedField.setText("");
		lessThanB.setSelected(false);
		greaterThanB.setSelected(false);
		
		sortBalanceB.setSelected(false);
		this.lessThanB.setSelected(false);
		this.greaterThanB.setSelected(false);
		this.afterDateB.setSelected(false);
		this.beforeDateB.setSelected(false);
		
		AccountsManager.populateFromSQL();
		accountTable.refresh();

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
	
	/**
	 * @author aaronstahley 04/23/2018
	 * gets account types matching (checking, savings etc..)
	 */
	public void getAccountTypes() {
		if(accTypeField.getText().equals("")) {
			
		}else {
			AccountsManager.getAcountsWithType(accTypeField.getText());
		}
	}
	
	/**
	 * @author aaronstahley 04/23/2018
	 * gets account types matching first name
	 */
	public void getAccountFirstName() {
		if(fNameField.getText().equals("")) {
			
		}else {
			AccountsManager.getAcountsWithfName(fNameField.getText());
		}
	}
	
	/**
	 * @author aaronstahley 04/23/2018
	 * gets account types matching last name
	 */
	public void getAccountLastName() {
		if(lNameField.getText().equals("")) {
			
		}else {
			AccountsManager.getAcountsWithlName(lNameField.getText());
		}
	}
	
	
	/**
	 * gets accounts created on date in text field. 
	 */
	public void getAccountDates() {
		
		String testDate = dateCreatedField.getText();
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	
		if(dateCreatedField.getText().equals("")) {
			
		}else if(afterDateB.isSelected() == true){
		
			try {
				Date date = formatter.parse(testDate);
				AccountsManager.getAccountDateAfter(date);
			} catch (ParseException e) {
				errorPopUpBox("Date must be in format yyyy-mm-dd","Formating Error");
				e.printStackTrace();
			}
				   
		}else if(beforeDateB.isSelected() == true) {
			
			try {
				Date date = formatter.parse(testDate);
				AccountsManager.getAccountDateBefore(date);
			} catch (ParseException e) {
				errorPopUpBox("Date must be in format yyyy-mm-dd","Formating Error");
				e.printStackTrace();
			}
			
		}else {
			
			try {
				Date date = formatter.parse(testDate);
				AccountsManager.getAccountCreatedOn(date);
			} catch (ParseException e) {
				errorPopUpBox("Date must be in format yyyy-mm-dd","Formating Error");
				e.printStackTrace();
			}
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
    
    public static void refreshTabel() {
    		accountTable.refresh();
    }
    
 
    



}

package main.java.project.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
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
	
	private JLabel accIdLbl = new JLabel(); 
	private JLabel accTypeLbl = new JLabel();
	private JLabel balanceLbl = new JLabel();
	private JLabel dateCreatedLbl = new JLabel();

	private JTextField accIdField = new JTextField();
	private JTextField accTypeField = new JTextField(); 
	private JTextField balanceField = new JTextField();
	private JTextField dateCreatedField = new JTextField();
	
	private JCheckBox sortDescendingB = new JCheckBox();
	private JCheckBox sortAccendingB = new JCheckBox();
	
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
		fl.setVgap(15); // Gap of components vertical
		
		
		bottomPanel.setPreferredSize(new Dimension(100,125));
		bottomPanel.setLayout(fl);
		bottomPanel.setBackground(Color.WHITE);
		bottomPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		
		
		accIdPanel.setLayout(new FlowLayout());
		accIdPanel.setBackground(Color.WHITE);
		
		accTypePanel.setLayout(new FlowLayout()); 
		accTypePanel.setBackground(Color.WHITE);

		balancePanel.setLayout(new FlowLayout());
		balancePanel.setBackground(Color.WHITE);
		
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
		
		balancePanel.add(balanceLbl);
		balancePanel.add(balanceField);
		
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
	    
	
		submitB.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  
				  //Displays an error if the fields are blank.
				  if(isFieldsEmpty() == true) {
					  errorPopUpBox("Please Enter a value in one of the search fields","Error");
				  }else {
					  
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
	
	public static void errorPopUpBox(String infoMessage, String titleBar)
	{
		JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " +
				titleBar, JOptionPane.ERROR_MESSAGE);
	}



}

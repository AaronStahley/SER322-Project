package main.java.project.view;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import main.java.project.managers.AccountsManager;

public class AddAccountDlg{
	
	
	public AddAccountDlg() {
		
		JLabel accTypeLbl = new JLabel("Account Type");
		JLabel accBalanceLbl = new JLabel("Balance");
		JLabel accHolderfNameLbl = new JLabel("Account Holder First Name");
		JLabel accHolderlNameLbl = new JLabel("Account Holder Last Name");
		JLabel accInterestLbl = new JLabel("Interest Rate");
		
		JTextField accTypeField = new JTextField(); 
		JTextField accBalanceField = new JTextField(); 
		JTextField accHolderfNameField = new JTextField(); 
		JTextField accHolderlNameField = new JTextField(); 
		JTextField accInterestField = new JTextField(); 


		
		
		Object[] fields = {
				
				accTypeLbl, 
				accTypeField,
				accBalanceLbl,
				accBalanceField,
				accHolderfNameLbl, 
				accHolderfNameField,
				accHolderlNameLbl,
				accHolderlNameField,
				accInterestLbl,
				accInterestField
		};
		
		
		
	     int input = JOptionPane.showConfirmDialog(null, fields, "Add Account", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
	     
	     if(input == JOptionPane.OK_OPTION)
	     {
	       // AccountsManager.addAccount(accTypeField.getText(), Float.parseFloat(accBalanceField.getText()),
	        		//accHolderfNameField.getText(), accHolderlNameField.getText(), Float.parseFloat(accInterestField.getText()) );
	     }
	}
	
	
	

}

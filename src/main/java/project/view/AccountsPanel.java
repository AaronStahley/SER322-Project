package main.java.project.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import main.java.project.managers.AccountsManager;
import main.java.project.tables.AccountTable;

public class AccountsPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel bottomPanel = new JPanel();
	
	private JLabel ballanceLabel = new JLabel(); 
	
	private JTextField ballanceTB = new JTextField();
	
	private JCheckBox sortDecendingB = new JCheckBox();
	private JCheckBox sortAccendingB = new JCheckBox();
	
	private JScrollPane scrollPane = new JScrollPane();
	
	private JButton submitB = new JButton();
	
	private AccountTable accountTable = new AccountTable(); 

	
	public AccountsPanel() {
		
		this.setPreferredSize(new Dimension(1000,1000));
		this.setBackground(Color.WHITE);		
		this.setLayout(new BorderLayout());
		
        scrollPane.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 0, Color.BLACK));
		
        
		accountTable.setBackground(Color.WHITE);
		accountTable.setMaximumSize(new Dimension(32767, 32767));
		accountTable.setRowHeight(24);

		
		bottomPanel.setPreferredSize(new Dimension(100,100));
		bottomPanel.setLayout(new FlowLayout());
		bottomPanel.setBackground(Color.WHITE);
		
		
		submitB.setText("Submit");
		submitB.setPreferredSize(new Dimension(100,25));
		

		sortDecendingB.setText("Sort Decending");
	    sortDecendingB.setMnemonic(KeyEvent.VK_C); 
	    sortDecendingB.setSelected(true);
	    
        scrollPane.getViewport().add(accountTable, null);
        
        bottomPanel.add(submitB);

	    this.add(scrollPane, BorderLayout.CENTER);

	    this.add(bottomPanel, BorderLayout.SOUTH);
	    
	    //-------Button Action Listeners----------//
	    
		submitB.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) {
				  
				  AccountsManager.getAcountsGreater(2000);
				  accountTable.refresh();
				  
			  } 
			} );
		
		//------END of Action Listeners-----------//

		
	}
	


}

package main.java.project.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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

	
	public AccountsPanel() {
		
		this.setPreferredSize(new Dimension(1000,1000));
		this.setBackground(Color.GRAY);		
		this.setLayout(new BorderLayout());
		
		bottomPanel.setPreferredSize(new Dimension(100,100));
		bottomPanel.setLayout(new BorderLayout());
		bottomPanel.setBackground(Color.white);
	

		sortDecendingB.setText("Sort Decending");
	    sortDecendingB.setMnemonic(KeyEvent.VK_C); 
	    sortDecendingB.setSelected(true);

	    this.add(bottomPanel, BorderLayout.SOUTH);
	    
		
	}


}

package main.java.project.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HeaderPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;

	private JLabel bankNameLabel = new JLabel();
	
	public HeaderPanel() {
		
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(1000, 80));
		this.setBackground(new Color(151, 217, 247));

		bankNameLabel.setIcon(new ImageIcon(NavBarPanel.class.getResource("/logo.png")));
		bankNameLabel.setFont(new java.awt.Font("Dialog", 1, 40));
		bankNameLabel.setPreferredSize(new Dimension(1000,80));
		
		
		this.add(bankNameLabel, BorderLayout.WEST);
		
	}

}

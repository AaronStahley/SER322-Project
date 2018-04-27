package main.java.project.tables;

import java.awt.Color;
import java.awt.Component;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;

import main.java.project.managers.Atm;
import main.java.project.managers.AtmManager;
import main.java.project.managers.Employee;
import main.java.project.managers.EmployeesManager;
import main.java.project.server.SqlConnection;
import main.java.project.tables.EmployeeTable.EmployeeTableModel;

public class AtmTable extends JTable {

	private static final long serialVersionUID = 1L;
	public static final int ATM = 100;
	public static final int ATM_ID = 101;
	
	SqlConnection con = new SqlConnection(); 
		
	Vector atms = new Vector(); 
	
	public AtmTable() {
		 super();
	        setModel(new AtmTableModel());
	        this.setSelectionBackground(new Color(151, 217, 247));

	        if(con.isConnected() == true) {    	
	             AtmManager.populateFromSQL();
	        }else {
	        	errorPopUpBox("No Database Conection established","Error");
	        }
	        
	        initTable();
	        this.setShowGrid(true);
	        this.getTableHeader().setBackground(Color.WHITE);
	        this.getTableHeader().setFont(new java.awt.Font("Dialog", 1, 20));
	        TableCellRenderer rendererFromHeader = super.getTableHeader().getDefaultRenderer();
	        JLabel headerLabel = (JLabel) rendererFromHeader;
	        headerLabel.setHorizontalAlignment(JLabel.LEFT);
	    }
	    
	    public void initTable() {
	    	
	    	//Vector of accounts
	    	atms = (Vector) AtmManager.getAtms();
	    
	    	
	        clearSelection();
	        updateUI();
	    }
	    
	    public void refresh() {
	        initTable();
	    }
	    
	    public TableCellRenderer getCellRenderer(int row, int column) {
	        return new javax.swing.table.DefaultTableCellRenderer() {
	            
	            public Component getTableCellRendererComponent(JTable table, Object value,
	                boolean isSelected, boolean hasFocus, int row, int column) {
	            	
	                //Component comp;
	                JLabel comp = (JLabel) super.getTableCellRendererComponent(table, value, 
	                		isSelected, hasFocus, row, column);
	                
	                comp.setHorizontalAlignment(LEFT);
	                Atm atm = (Atm)getModel().getValueAt(row, ATM );
	                comp.setForeground(java.awt.Color.BLACK);
	                comp.setFont(new java.awt.Font("Dialog", 1, 18));
	                return comp;
	            }
	        };

	    }

	    class AtmTableModel extends AbstractTableModel {
	        String[] columnNames = {
	        		
	                " Atm ID",
	                " Branch Name",
	               	" Balance",
	               	" Max Cash",
	               	" Address",
	               	
	        };
	        
	        AtmTableModel() {
	            super();
	        }

	        public int getColumnCount() {
	            return 5;
	        }

	        public int getRowCount() {
	            int row = 0;
	            try {
	               row = atms.size();
	            }
	            catch(NullPointerException e) {
	                row = 1;
	            }
	            return row;
	        }

	     
	        public Object getValueAt(int row, int col) {
	            Atm atm = (Atm)atms.get(row);
	            if(col == 0) {
	                return atm.getAtmID();
	            } else if(col == 1) {
	            	return atm.getBranchID();
	            }else if(col == 2) {
	                return atm.getBalance();
	            }else if(col == 3) {
	            		return atm.getMaxCash();
	            }else if(col == 4) {
	            		return atm.getStNum() + " " +  atm.getStName() + " " + atm.getCity() + ", " + 
	            				atm.getState() + " " + atm.getZip();
	            }else {
	                return atm;
	            
	            }
	        }
	        
	        public String getColumnName(int col) {
	        	
	            return columnNames[col];
	        }

	    }
	    
	    public static void errorPopUpBox(String infoMessage, String titleBar)
		{
			JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " +
					titleBar, JOptionPane.ERROR_MESSAGE);
		}

}

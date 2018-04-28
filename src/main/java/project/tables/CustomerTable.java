package main.java.project.tables;

import java.awt.Color;
import java.awt.Component;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;

import main.java.project.managers.Customer;
import main.java.project.managers.CustomersManager;
import main.java.project.server.SqlConnection;

public class CustomerTable extends JTable{
	
	private static final long serialVersionUID = 1L;
	public static final int CUSTOMER = 100;
	public static final int CUSTOMER_ID = 101;
	
	SqlConnection con = new SqlConnection(); 
	
    Vector customers = new Vector(); 
    
    public CustomerTable() {
    		 super();
         setModel(new CustomerTableModel());
         this.setSelectionBackground(new Color(151, 217, 247));

         if(con.isConnected() == true) {    	
              CustomersManager.populateFromSQL();
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
	    	customers = (Vector) CustomersManager.getCustomers();
	    
	    	
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
	                Customer customer = (Customer)getModel().getValueAt(row, CUSTOMER );
	                comp.setForeground(java.awt.Color.BLACK);
	                comp.setFont(new java.awt.Font("Dialog", 1, 18));
	                return comp;
	            }
	        };
	
	    }
	
	    class CustomerTableModel extends AbstractTableModel {
	        String[] columnNames = {
	        			
	                " SSN",
	                " Acc ID",
	               	" First Name",
	               	" Last Name",
	               	" Date Joined",
	               	" Birth Date",
	               	" Address",
	               	" Email"
	               	
	        };
	        
	        CustomerTableModel() {
	            super();
	        }
	
	        public int getColumnCount() {
	            return 8;
	        }
	
	        public int getRowCount() {
	            int row = 0;
	            try {
	               row = customers.size();
	            }
	            catch(NullPointerException e) {
	                row = 1;
	            }
	            return row;
	        }
	
	     
	        public Object getValueAt(int row, int col) {
	            Customer customer = (Customer)customers.get(row);
	            if(col == 0) {
	                return customer.getSSN();
	            } else if(col == 1) {
	            	return customer.getAccID();
	            }else if(col == 2) {
	                return customer.getfName();
	            }else if(col == 3) {
	            		return customer.getlName();
	            }else if(col == 4) {
	           		return customer.getDateJoined();
	            }else if(col == 5) {
	            		return customer.getDob();
	            }else if(col == 6) {
	            		return customer.getStNum() + " " + customer.getStName() + " " + customer.getCity() + 
	            				", " + customer.getStates() + " " + customer.getZip();
	            }else if(col == 7) {
	            		return customer.getEmail(); 
	            }else {
	                return customer;        
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

package main.java.project.tables;

import java.awt.Color;
import java.awt.Component;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;

import main.java.project.managers.Account;
import main.java.project.managers.AccountsManager;

public class AccountTable extends JTable {

	private static final long serialVersionUID = 1L;
	public static final int ACCOUNT = 100;
	public static final int ACCOUNT_ID = 101;
	
    Vector accounts = new Vector(); 
    
   
    public AccountTable() {
        super();
        setModel(new AccountTableModel());
        AccountsManager.populateFromSQL();;
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
    	accounts = (Vector) AccountsManager.getAccounts();
    
    	
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
                Account account = (Account)getModel().getValueAt(row, ACCOUNT );
                comp.setForeground(java.awt.Color.BLACK);
                comp.setFont(new java.awt.Font("Dialog", 1, 18));
                return comp;
            }
        };

    }

    class AccountTableModel extends AbstractTableModel {
        String[] columnNames = {
        		
                " Account ID",
                " Account Type",
               	" Balance",
               	" Date Opened"
        };
        
        AccountTableModel() {
            super();
        }

        public int getColumnCount() {
            return 4;
        }

        public int getRowCount() {
            int row = 0;
            try {
               row = accounts.size();
            }
            catch(NullPointerException e) {
                row = 1;
            }
            return row;
        }

     
        public Object getValueAt(int row, int col) {
            Account account = (Account)accounts.get(row);
            if(col == 0) {
                return account.getAccID();
            } else if(col == 1) {
            	return account.getAccType();
            }else if(col == 2) {
                return account.getBalance();

            }else if(col == 3) {
            	return account.getAccType();
            }
            	else {
                return account;
            
            }
        }
        
        public String getColumnName(int col) {
        	
            return columnNames[col];
        }

    }

}

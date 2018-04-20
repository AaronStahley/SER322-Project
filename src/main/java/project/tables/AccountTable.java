package main.java.project.tables;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Date;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class AccountTable extends JTable {

	public static final int DRIVER = 100;
	public static final int DRIVER_ID = 101;
	
    Vector accounts = new Vector();
    
    public AccountTable() {
        super();
        setModel(new AccountTableModel());
        initTable();
        this.setShowGrid(false);
        this.getTableHeader().setBackground(Color.WHITE);
        this.getTableHeader().setFont(new java.awt.Font("Dialog", 1, 15));
        TableCellRenderer rendererFromHeader = super.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.LEFT);
    }
    
    public void initTable() {
    	
    		//Vector of accounts
    		//accounts = accounts.getAccounts; 
    	
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
                //Driver dv = (Driver)getModel().getValueAt(row, DRIVER);
                comp.setForeground(java.awt.Color.BLACK);
                comp.setFont(new java.awt.Font("Dialog", 1, 18));
                return comp;
            }
        };

    }

    class AccountTableModel extends AbstractTableModel {
        String[] columnNames = {
        		
                " Account ID",
               	" Ballance",
        };
        
        AccountTableModel() {
            super();
        }

        public int getColumnCount() {
            return 2;
        }

        public int getRowCount() {
            int row = 0;
            try {
               // row = accounts.size
            }
            catch(NullPointerException e) {
                row = 1;
            }
            return row;
        }

        /*
        public Object getValueAt(int row, int col) {
           // Driver driver = (Driver)drivers.get(row);
            if(col == 0) {
               // return accounts.getID();
            } else if(col == 1) {
               // return accounts.getBallance();
            }else {
              //  return accounts;
            	return null;
            }
        }*/
        
        
        public String getColumnName(int col) {
            return columnNames[col];
        }

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			return null;
		}
    }

}

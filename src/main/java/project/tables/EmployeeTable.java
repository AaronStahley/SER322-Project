package main.java.project.tables;

import java.awt.Color;
import java.awt.Component;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;

import main.java.project.managers.Employee;
import main.java.project.managers.EmployeesManager;
import main.java.project.server.SqlConnection;

public class EmployeeTable extends JTable{
	
	private static final long serialVersionUID = 1L;
	public static final int EMPLOYEE = 100;
	public static final int EMPLOYEE_ID = 101;
	
	SqlConnection con = new SqlConnection(); 
	
    Vector employees = new Vector(); 
    
   
    public EmployeeTable() {
        super();
        setModel(new EmployeeTableModel());
        
        if(con.isConnected() == true) {    	
             EmployeesManager.populateFromSQL();
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
    	employees = (Vector) EmployeesManager.getEmployees();
    
    	
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
                Employee employee = (Employee)getModel().getValueAt(row, EMPLOYEE );
                comp.setForeground(java.awt.Color.BLACK);
                comp.setFont(new java.awt.Font("Dialog", 1, 18));
                return comp;
            }
        };

    }

    class EmployeeTableModel extends AbstractTableModel {
        String[] columnNames = {
        		
                " ID",
                " SSN",
               	" First Name",
               	" Last Name",
               	" Street Number",
               	" Street Name",
               	" City",
               	" State",
               	" Zip Code"
        };
        
        EmployeeTableModel() {
            super();
        }

        public int getColumnCount() {
            return 9;
        }

        public int getRowCount() {
            int row = 0;
            try {
               row = employees.size();
            }
            catch(NullPointerException e) {
                row = 1;
            }
            return row;
        }

     
        public Object getValueAt(int row, int col) {
            Employee employee = (Employee)employees.get(row);
            if(col == 0) {
                return employee.getEmpID();
            } else if(col == 1) {
            	return employee.getSSN();
            }else if(col == 2) {
                return employee.getfName();
            }else if(col == 3) {
            	return employee.getlName();
            }else if(col == 4) {
            	return employee.getStNum();
            }else if(col == 5) {
            	return employee.getStName();
            }else if(col == 6) {
            	return employee.getCity();
            }else if(col == 7) {
            	return employee.getStates();
            }else if(col == 8) {
            	return employee.getZip();
            }else {
                return employee;
            
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

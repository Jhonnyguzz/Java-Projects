package tables;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumnModel;

public class TableNoEditable extends AbstractTableModel 
{
	String[] columnNames = {"First Name", 
            "Last Name",
            "Sport",
            "# of Years",
            "Vegetarian"};
	
	Object[][] data = {
		    {"Kathy", "Smith",
		     "Snowboarding", new Integer(5), new Boolean(false)},
		    {"John", "Doe",
		     "Rowing", new Integer(3), new Boolean(true)},
		    {"Sue", "Black",
		     "Knitting", new Integer(2), new Boolean(false)},
		    {"Jane", "White",
		     "Speed reading", new Integer(20), new Boolean(true)},
		    {"Joe", "Brown",
		     "Pool", new Integer(10), new Boolean(false)}
		};
	
	
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
	@Override
	public int getRowCount() {
		return data.length;
	}
	@Override
	 public Object getValueAt(int row, int col) {
        return data[row][col];
    }
	
	@Override
	 public String getColumnName(int col) {
	        return columnNames[col];
	    }
	
	 public Class getColumnClass(int c) 
	 {
	        return getValueAt(0, c).getClass();
	 }	
	 
	 public boolean isCellEditable(int row, int col) {
	        //Note that the data/cell address is constant,
	        //no matter where the cell appears onscreen.
	       /* if (col < 2) {
	            return false;
	        } else {
	            return true;
	        }*/
		 return false;
	 }
}

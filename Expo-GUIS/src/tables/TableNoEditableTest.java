package tables;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

//http://mundojava.blogspot.com/2006/12/jdk-16-ordenando-por-columnas-un.html

public class TableNoEditableTest 
{
	public TableNoEditableTest() 
	{
		JFrame frame = new JFrame();
		
		JTable table = new JTable(new TableNoEditable());
		table.setAutoCreateRowSorter(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		frame.getContentPane().add(scrollPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,150);
		frame.setVisible(true);		
	}
	
	public static void main(String[] args) 
	{
		TableNoEditableTest algo = new TableNoEditableTest();
	}
	
}

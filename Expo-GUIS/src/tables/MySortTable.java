package tables;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import java.awt.*;

public class MySortTable
{
	private String[] columns = {"Carrera", "Nombre", "Edad", "Sexo"};
    
	private Object[][] rows = {       
    {"Electronica", "Raul Martinez", "19" , "Masculino"},
    {"Sistemas", "Maye Montes", "17" , "Femenino"},
    {"Industrial", "blbalba laba", "23" , "Masculino"},
    {"Electronica", "David Arevalo", "19" , "Masculino"},
    {"Sistemas", "Algo mas Algo", "18" , "Femenino"},
    {"Civil", "Maria Perez", "23" , "Femenino"},
    {"Electronica", "Nicolas Square", "20" , "Masculino"},};
	
	
	private JTextField textField;
	private TableRowSorter<TableModel> sorter;
	private JTable myTable;
	private JScrollPane pane;
	private JLabel label;
	private JButton button;
	
	public MySortTable() 
	{		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Sort in a Table");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TableModel model = new DefaultTableModel(rows, columns)
		{
			public Class getColumnClass(int column)
			{
				Class returnValue;
				
				if((column>=0)&&(column<getColumnCount()))
				{
					returnValue= getValueAt(0,column).getClass();
				}
				else
				{
					returnValue = Object.class;
				}
				return returnValue;
			}
		};
		
		myTable = new JTable(model);
		sorter = new TableRowSorter<TableModel>(model);
		myTable.setRowSorter(sorter);
		
		pane= new JScrollPane(myTable);
		pane.setBounds(0, 0, 483, 130);
		frame.getContentPane().add(pane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel(new BorderLayout());
		label = new JLabel("Filter");
		panel.add(label, BorderLayout.WEST);
		
		textField = new JTextField();
		textField.setBounds(114, 186, 229, 62);
		textField.setColumns(10);
		frame.getContentPane().add(textField);
		
		button = new JButton("Filter");
		button.setBounds(195, 274, 109, 39);
		button.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String text = textField.getText();
				if(text.length() == 0)
				{
					sorter.setRowFilter(null);
				}
				else
				{
					sorter.setRowFilter(RowFilter.regexFilter(text));
				}
			}
		});
			
		frame.getContentPane().add(button);
		
		frame.setSize(500,400);
		frame.setVisible(true);	
	}
	
	public static void main(String[] args)
	{
		MySortTable testMySort = new MySortTable();
	}
}

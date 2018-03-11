package control;

import gui.RemovePerson;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import db.DataBase;

public class ControlRemovePerson implements ActionListener
{
	RemovePerson removeperson = new RemovePerson();
	
	public ControlRemovePerson(RemovePerson removeperson)
	{
		this.removeperson=removeperson;
		
		this.removeperson.getBtnDelete().addActionListener(this);	
	}
	public void printTable()
	{
		//Ejecute para refrescar la tabla
		String columnas[] = new String[]{"Nombre","Username"};
		Object filas[][] = new Object[][] {}; //Filas con nombres de las canciones
		DefaultTableModel modelTable = new DefaultTableModel(filas,columnas)
		{
			private static final long serialVersionUID = 1L; //id de serialización
			boolean[] columnEditables = new boolean[] {false};
			@Override
            public boolean isCellEditable(int row, int column) 
			{
				return columnEditables[column];
			}			
		};
		this.removeperson.getTable().setModel(modelTable);
		this.removeperson.getTable().getColumnModel().getColumn(0).setResizable(false);
		this.removeperson.getTable().getColumnModel().getColumn(0).setPreferredWidth(227);

		Object rowData[] = new Object[2];
		
		for(int i=0;i<DataBase.getPerson().size();i++)
		{
			rowData[0]=null;
			rowData[1]=null;
			rowData[0]=DataBase.getPerson().get(i).getFirstName();
			rowData[1]=DataBase.getPerson().get(i).getUsername();
			modelTable.addRow(rowData);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object pushButton = e.getSource();
		
		if(pushButton==removeperson.getBtnDelete())
		{
			char[] aux=this.removeperson.getPasswordField().getPassword();
			boolean correct=Arrays.equals(DataBase.getPerson().get(this.removeperson.getTable().getSelectedRow()).getPassword(), aux);
			
			if(correct==true)
			{
				DataBase.removePerson(DataBase.getPerson().get(this.removeperson.getTable().getSelectedRow()));
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
			}
			removeperson.setVisible(false);
		}
	}

}

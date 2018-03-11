package control;

import gui.AddPerson;
import gui.Choose;
import gui.PersonDiary;
import gui.Principal;
import gui.RemovePerson;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.table.DefaultTableModel;

import db.DataBase;

public class PrincipalController implements ActionListener
{
	private Principal principalw = new Principal();
	
	public PrincipalController(Principal principalw) 
	{
		this.principalw = principalw;
		
		this.principalw.getMntmExit().addActionListener(this);
		this.principalw.getMntmAddPerson().addActionListener(this);
		this.principalw.getBtnSingIn().addActionListener(this);
		this.principalw.getMntmDeletePerson().addActionListener(this);
		this.principalw.getMntmOpen().addActionListener(this);
		this.principalw.getMntmSave().addActionListener(this);
	
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
		this.principalw.getTable().setModel(modelTable);
		this.principalw.getTable().getColumnModel().getColumn(0).setResizable(false);
		this.principalw.getTable().getColumnModel().getColumn(0).setPreferredWidth(227);

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
		
		if(pushButton==principalw.getMntmExit())
		{
			System.exit(0);
		}
		if(pushButton==principalw.getMntmAddPerson())
		{
			AddPerson addperson = new AddPerson();
			ControlAddPerson cap = new ControlAddPerson(addperson);
			addperson.setVisible(true);	
			principalw.getLabel2().setText(String.valueOf(DataBase.getPerson().size()+1));
			this.printTable();
		}
		if(pushButton==principalw.getMntmDeletePerson())
		{
			RemovePerson removeperson = new RemovePerson();
			ControlRemovePerson crp = new ControlRemovePerson(removeperson);
			crp.printTable();
			removeperson.setVisible(true);
			principalw.getLabel2().setText(String.valueOf(DataBase.getPerson().size()-1));
			this.printTable();
		}
		if(pushButton==principalw.getBtnSingIn())
		{
			for(int j=0;j<DataBase.getPerson().size();j++)
			{
				if(DataBase.getPerson().get(j).getUsername().equals(this.principalw.getTextField().getText()))
				{
					char[] pass=DataBase.getPerson().get(j).getPassword();
					char[] aux=this.principalw.getPasswordField().getPassword();
					boolean correctPass=Arrays.equals(pass, aux);
					if(correctPass==true)
					{
						DataBase.setK(j);
						PersonDiary persondiary = new PersonDiary();
						ControlPersonDiary cpd = new ControlPersonDiary(persondiary);
					    cpd.printTable1();
						persondiary.getLblUsername().setText(DataBase.getPerson().get(j).getUsername());
						persondiary.getLabel().setText(String.valueOf(DataBase.getPerson().get(j).getDiaries().size()));
						persondiary.setVisible(true);
						break;
					}
				}
			}	
		}
		if(pushButton==principalw.getMntmOpen())
		{
			Choose.getOpenList();
			this.printTable();
		}
		if(pushButton==principalw.getMntmSave())
		{
			Choose.getSaveDataBase(DataBase.getInstance());
		}
	}
}

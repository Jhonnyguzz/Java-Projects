package control;

import gui.AddDiary;
import gui.AddEvent;
import gui.PersonDiary;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import db.DataBase;

public class ControlPersonDiary implements ActionListener, MouseListener
{
	private PersonDiary persondiary = new PersonDiary();
	
	public ControlPersonDiary(PersonDiary persondiary)
	{
		this.persondiary=persondiary;
		this.persondiary.getBtnAddDiary().addActionListener(this);
		this.persondiary.getBtnAddEvent().addActionListener(this);
		this.persondiary.getBtnDel().addActionListener(this);
		this.persondiary.getBtnDel_1().addActionListener(this);
		
		this.persondiary.getTable().addMouseListener(this);
		this.persondiary.getTable_1().addMouseListener(this);
	}
	public void printTable1()
	{
		//Ejecute para refrescar la tabla
		String columnas[] = new String[]{"Agendas","Descripción"};
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
		this.persondiary.getTable().setModel(modelTable);
		this.persondiary.getTable().getColumnModel().getColumn(0).setResizable(false);
		this.persondiary.getTable().getColumnModel().getColumn(0).setPreferredWidth(227);

		Object rowData[] = new Object[2];
		
		for(int i=0;i<DataBase.getPerson().get(DataBase.getK()).getDiaries().size();i++)
		{
			rowData[0]=null;
			rowData[1]=null;
			rowData[0]=DataBase.getPerson().get(DataBase.getK()).getDiaries().get(i).getName();
			rowData[1]=DataBase.getPerson().get(DataBase.getK()).getDiaries().get(i).getDescription();
			modelTable.addRow(rowData);
		}
	}
	public void printTable2(int index)
	{
		//Ejecute para refrescar la tabla
		String columnas[] = new String[]{"Eventos"};
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
		this.persondiary.getTable_1().setModel(modelTable);
		this.persondiary.getTable_1().getColumnModel().getColumn(0).setResizable(false);
		this.persondiary.getTable_1().getColumnModel().getColumn(0).setPreferredWidth(227);

		Object rowData[] = new Object[1];
		
		for(int i=0;i<DataBase.getPerson().get(DataBase.getK()).getDiaries().get(index).getEvents().size();i++)
		{
			rowData[0]=null;
			rowData[0]=DataBase.getPerson().get(DataBase.getK()).getDiaries().get(index).getEvents().get(i).getDate();
			modelTable.addRow(rowData);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//DataBase.setL(this.persondiary.getTable().getSelectedRow());
		
		Object pushButton=e.getSource();
		if(pushButton==persondiary.getBtnAddDiary())
		{
			AddDiary adddiary = new AddDiary();
			ControlAddDiary cad = new ControlAddDiary(adddiary);
			adddiary.setVisible(true);
			persondiary.getLabel().setText(String.valueOf(DataBase.getPerson().get(DataBase.getK()).getDiaries().size()+1));
			this.printTable1();
		}
		if(pushButton==persondiary.getBtnAddEvent())
		{
			if(this.persondiary.getTable().getSelectedRow()==-1)
			{
				JOptionPane.showMessageDialog(persondiary, "Seleccione una agenda en la tabla para agregar evento");
			}
			else
			{
			    AddEvent addevent = new AddEvent();
			    ControlAddEvent cae = new ControlAddEvent(addevent);
			    addevent.setVisible(true);
			    DataBase.setL(this.persondiary.getTable().getSelectedRow());
			    this.printTable2(DataBase.getL());
			}
		}
		if(pushButton==persondiary.getBtnDel())
		{
			DataBase.removeAgendaFromPerson(DataBase.getPerson().get(DataBase.getK()), DataBase.getPerson().get(DataBase.getK()).getDiaries().get(this.persondiary.getTable().getSelectedRow()));
			persondiary.getLabel().setText(String.valueOf(DataBase.getPerson().get(DataBase.getK()).getDiaries().size()));
			this.printTable1();
		}
		if(pushButton==persondiary.getBtnDel_1())
		{
			DataBase.removeEventFromAgenda(DataBase.getPerson().get(DataBase.getK()), DataBase.getPerson().get(DataBase.getK()).getDiaries().get(this.persondiary.getTable().getSelectedRow()),DataBase.getPerson().get(DataBase.getK()).getDiaries().get(this.persondiary.getTable().getSelectedRow()).getEvents().get(this.persondiary.getTable_1().getSelectedRow()));
			this.printTable2(DataBase.getL());
		}
	}
	@Override
	public void mouseClicked(MouseEvent e)
	{
		Object push = e.getSource();
		
		if(push==persondiary.getTable())
		{
			this.printTable2(this.persondiary.getTable().getSelectedRow());
		}
		if(push==persondiary.getTable_1())
		{
		
			int file = this.persondiary.getTable_1().getSelectedRow();
		
			//primer bloque
			String aux1=DataBase.getPerson().get(DataBase.getK()).getDiaries().get(DataBase.getL()).getEvents().get(file).getParty().getGuess();
			String aux2=DataBase.getPerson().get(DataBase.getK()).getDiaries().get(DataBase.getL()).getEvents().get(file).getParty().getDress();
		
			String aux3=DataBase.getPerson().get(DataBase.getK()).getDiaries().get(DataBase.getL()).getEvents().get(file).getPlace().getAdress();
			String aux4=DataBase.getPerson().get(DataBase.getK()).getDiaries().get(DataBase.getL()).getEvents().get(file).getPlace().getNamePlace();
			String aux5=DataBase.getPerson().get(DataBase.getK()).getDiaries().get(DataBase.getL()).getEvents().get(file).getPlace().getX();
			String aux6=DataBase.getPerson().get(DataBase.getK()).getDiaries().get(DataBase.getL()).getEvents().get(file).getPlace().getY();
			String aux7=DataBase.getPerson().get(DataBase.getK()).getDiaries().get(DataBase.getL()).getEvents().get(file).getPlace().getRoute();
		
			//segundo bloque
			String aux8=DataBase.getPerson().get(DataBase.getK()).getDiaries().get(DataBase.getL()).getEvents().get(file).getParty().getBudget();

			//tercer bloque
			String aux9=DataBase.getPerson().get(DataBase.getK()).getDiaries().get(DataBase.getL()).getEvents().get(file).getReminder().getDescription();
		
		
			this.persondiary.getTextArea().setText("Invitados: "+aux1+"\n"+"vestido: "+aux2+"\n"+"Presuspuesto: "+aux8+"\n"+"Dirección: "+aux3+"\n"+"Nombre del lugar: "+aux4+"\n"+"Coordenadas" +
				"(x,y): "+aux5+","+aux6+"\n\n"+"Rutas: "+aux7+"\n"+"Recordatorio: "+aux9);
		}
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	@Override
	public void mousePressed(MouseEvent arg0) {}
	@Override
	public void mouseReleased(MouseEvent arg0){}
}

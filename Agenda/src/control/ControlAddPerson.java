package control;

import db.DataBase;
import entities.Person;
import gui.AddPerson;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class ControlAddPerson implements ActionListener
{
	private AddPerson addperson = new AddPerson();
	
	public ControlAddPerson(AddPerson addperson) 
	{
		this.addperson = addperson;
		this.addperson.getBtnAdd().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object pushButton = e.getSource();
		
		if(pushButton==addperson.getBtnAdd())
		{	
			int op=0;
			
			String dateBirth=(this.addperson.getTxtDd().getText())+"/"+(this.addperson.getTxtMm().getText())+"/"+(this.addperson.getTxtYyyy().getText());
			String firstName=this.addperson.getTextField().getText();
			String secondName=this.addperson.getTextField_1().getText();
			String firstLastName=this.addperson.getTextField_2().getText();
			String secondLastName=this.addperson.getTextField_3().getText();
			String email=this.addperson.getTextField_4().getText();
			int id=Integer.parseInt(this.addperson.getTextField_5().getText());
			String username=this.addperson.getTextField_6().getText();
			char[] password=this.addperson.getPasswordField().getPassword();
			
			for(int i=0;i<DataBase.getPerson().size();i++)
			{
				if((DataBase.getPerson().get(i).getUsername()).equals(username))
				{
					JOptionPane.showMessageDialog(null, "Ese username ya está registrado, intentelo de nuevo con uno diferente");
					op=1;
					break;
				}
				if((DataBase.getPerson().get(i).getEmail()).equals(email))
				{
					JOptionPane.showMessageDialog(null, "Ese email ya está registrado, intentelo de nuevo con uno diferente");
					op=1;
					break;	
				}
				if((DataBase.getPerson().get(i).getId())==id)
				{
					JOptionPane.showMessageDialog(null, "Ese id ya está registrado, no se puede registrar dos veces");
					op=1;
					break;	
				}
			}
			if(op==0)
			{
				Person person = new Person(dateBirth, firstName, secondName, firstLastName, secondLastName, email, id, username, password);
			    DataBase.addPerson(person);
			}
			this.addperson.setVisible(false);
		}
	}
}
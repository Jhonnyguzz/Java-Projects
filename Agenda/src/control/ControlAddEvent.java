package control;

import gui.AddEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import db.DataBase;
import entities.EventDiary;
import entities.Party;
import entities.Place;
import entities.Reminder;

public class ControlAddEvent implements ActionListener
{
	private AddEvent addevent = new AddEvent();
	
	public ControlAddEvent(AddEvent addevent)
	{
		this.addevent=addevent;
		
		this.addevent.getBtnAdd().addActionListener(this);
		this.addevent.getComboBox().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object pushButton = e.getSource();
		int activepane=0;
		if(pushButton==addevent.getComboBox())
		{
            int temp = addevent.getComboBox().getSelectedIndex();
            
            switch(temp)
            {
            	case 0:
            		addevent.getPanelReunion().setVisible(true);
            		addevent.getPanelPlace1().setVisible(true);
            		addevent.getPanelParty().setVisible(false);
            		addevent.getPanelPlace2().setVisible(false);
            		addevent.getPanelReminder().setVisible(false);
            		activepane=0;
            		break;
            	case 1:
            		addevent.getPanelReunion().setVisible(true);
            		addevent.getPanelPlace1().setVisible(true);
            		addevent.getPanelParty().setVisible(false);
            		addevent.getPanelPlace2().setVisible(false);
            		addevent.getPanelReminder().setVisible(false);
            		activepane=1;
            		break;
            	case 2:
            		addevent.getPanelReunion().setVisible(false);
            		addevent.getPanelPlace1().setVisible(false);
            		addevent.getPanelParty().setVisible(true);
            		addevent.getPanelPlace2().setVisible(true);
            		addevent.getPanelReminder().setVisible(false);
            		activepane=2;
            		break;
            	case 3:
            		addevent.getPanelReunion().setVisible(false);
            		addevent.getPanelPlace1().setVisible(false);
            		addevent.getPanelParty().setVisible(false);
            		addevent.getPanelPlace2().setVisible(false);
            		addevent.getPanelReminder().setVisible(true);
            		activepane=3;
                	break;
            }
		}
		if(pushButton==addevent.getBtnAdd())
		{
			Party party = null;
			Reminder reminder = null;
			Place place = null;
			String date = addevent.getTxtDd().getText()+"/"+addevent.getTxtMm().getText()+"/"+addevent.getTxtYyyy().getText();
			
			if(activepane==0 || activepane==1)
			{
				String guess = addevent.getTextField().getText();
				String dress = addevent.getTextField_1().getText();
				String adress = addevent.getTextField_2().getText();
				String name = addevent.getTextField_3().getText();
				String x=addevent.getTextField_4().getText();
				String y=addevent.getTextField_5().getText();
				String description = addevent.getTextArea().getText();
				
				place = new Place(adress, name, x, y, description);
				party = new Party(guess, dress);

				addevent.setVisible(false);
			}
			if(activepane==2)
			{
				String guess = addevent.getTextField().getText();
				String dress = addevent.getTextField_1().getText();
				String budget = addevent.getTextField_6().getText();
				String adress = addevent.getTextField_2().getText();
				String name = addevent.getTextField_3().getText();
				String x = addevent.getTextField_4().getText();
				String y = addevent.getTextField_5().getText();
				String description = addevent.getTextArea().getText();
				
				place = new Place(adress, name, x, y, description);
				party = new Party(guess, dress, budget);
				
				addevent.setVisible(false);
			}
			if(activepane==3)
			{
				String remember = addevent.getTextArea_1().getText();
				
				reminder = new Reminder(remember);
				
				addevent.setVisible(false);
			}
			
			DataBase.getPerson().get(DataBase.getK()).getDiaries().get(DataBase.getL()).getEvents().add(new EventDiary(date, place, reminder, party));
		}	
	}
}

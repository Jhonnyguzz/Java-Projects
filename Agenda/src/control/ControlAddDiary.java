package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import db.DataBase;

import entities.Diary;

import gui.AddDiary;

public class ControlAddDiary implements ActionListener
{
	private AddDiary adddiary = new AddDiary();
	
	public ControlAddDiary(AddDiary adddiary)
	{
		this.adddiary=adddiary;
		
		this.adddiary.getBtnAdd().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object pushButton=e.getSource();
		if(pushButton==adddiary.getBtnAdd())
		{
			String name = adddiary.getTextField().getText();
			String description = adddiary.getTextArea().getText();
			
			Diary diary = new Diary(name, description);
			DataBase.getPerson().get(DataBase.getK()).getDiaries().add(diary);
			adddiary.setVisible(false);
		}
	}
}

package entities;

import java.io.Serializable;

public class Reminder extends EventDiary implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String description;
	
	public Reminder(){}

	public Reminder(String description) 
	{
		this.setDescription(description);
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	public String getDescription() 
	{
		return description;
	}
}

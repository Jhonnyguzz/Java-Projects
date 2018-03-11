package entities;

import java.io.Serializable;
import java.util.ArrayList;

public class Diary implements Serializable
{
	private static final long serialVersionUID = 1L;
	private ArrayList<EventDiary> events = new ArrayList<EventDiary>();
	private String name;
	private String description;

	public Diary(){}

	public Diary(String name, String description) 
	{
		this.name = name;
		this.description = description;
	}
	public Diary(ArrayList<EventDiary> events, String name, String description) 
	{
		this.events = events;
		this.name = name;
		this.description = description;
	}

	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	public void setEvents(ArrayList<EventDiary> events) 
	{
		this.events = events;
	}
	public ArrayList<EventDiary> getEvents() 
	{
		return events;
	}
}

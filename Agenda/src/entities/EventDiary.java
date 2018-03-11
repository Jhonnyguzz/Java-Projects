package entities;

import java.io.Serializable;

public class EventDiary implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String date;
	private Place place; 
	private Reminder reminder;
	private Party party;

	public EventDiary(){}
	
	public EventDiary(String date) 
	{
		this.setDate(date);
	}
	public EventDiary(String date, Place place, Reminder reminder, Party party) 
	{
		this.date = date;
		this.place = place;
		this.reminder = reminder;
		this.party = party;
	}
	public void setDate(String date) 
	{
		this.date = date;
	}
	public String getDate() 
	{
		return date;
	}
	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public Reminder getReminder() {
		return reminder;
	}

	public void setReminder(Reminder reminder) {
		this.reminder = reminder;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}
}

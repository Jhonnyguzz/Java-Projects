package entities;

import java.io.Serializable;

public class Airline implements Serializable
{
	private String airline;
	public Airline()
	{
		super();
		this.airline="";
	}
	public Airline(String airline)
	{
		super();
		this.airline=airline;
	}
	public String getAirline() 
	{
		return this.airline;
	}
	public void setAirline(String airline) 
	{
		this.airline=airline;
	}
	@Override
	public String toString() 
	{
		return this.getAirline();
	}
}
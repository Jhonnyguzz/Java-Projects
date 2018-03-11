package entities;

import java.io.Serializable;

public class Reunion extends EventDiary implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String guess;
	private String dress;
	
	public Reunion(){}

	public Reunion(String guess, String dress) 
	{
		this.guess = guess;
		this.dress = dress;
	}
	public String getGuess() 
	{
		return guess;
	}
	public void setGuess(String guess) 
	{
		this.guess = guess;
	}
	public String getDress() 
	{
		return dress;
	}
	public void setDress(String dress) 
	{
		this.dress = dress;
	}
}
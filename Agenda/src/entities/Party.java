package entities;

import java.io.Serializable;

public class Party extends Reunion implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String budget;

	public Party(){}
	
	public Party(String budget) 
	{
		this.setBudget(budget);
	}
	public Party(String guess, String dress) 
	{
		super(guess, dress);
	}
	public Party(String guess, String dress, String budget) 
	{
		super(guess, dress);
		this.budget=budget;
	}
	public void setBudget(String budget) 
	{
		this.budget = budget;
	}
	public String getBudget() 
	{
		return budget;
	}
}

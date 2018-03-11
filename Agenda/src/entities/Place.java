package entities;

import java.io.Serializable;

public class Place implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String adress;
	private String namePlace;
	private String x;
	private String y;
	private String route;
	
	public Place(){}

	public Place(String adress, String namePlace,
			String x, String y, String route) 
	{
		this.adress = adress;
		this.namePlace = namePlace;
		this.x = x;
		this.y = y;
		this.route = route;
	}
	public String getAdress() 
	{
		return adress;
	}
	public void setAdress(String adress) 
	{
		this.adress = adress;
	}
	public String getNamePlace() 
	{
		return namePlace;
	}
	public void setNamePlace(String namePlace) 
	{
		this.namePlace = namePlace;
	}
	public String getX() 
	{
		return x;
	}
	public void setX(String x) 
	{
		this.x = x;
	}
	public String getY() 
	{
		return y;
	}
	public void setY(String y) 
	{
		this.y = y;
	}
	public String getRoute() 
	{
		return route;
	}
	public void setRoute(String route) 
	{
		this.route = route;
	}
}
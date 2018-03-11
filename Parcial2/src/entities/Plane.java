package entities;

public class Plane extends Object
{
	private String id;
	private int capacity;
	private String characterist;
	private int yearFabrication;
	private double price;
	private Airline airline;
	
	public Plane()
	{
		this.id="";
		this.capacity=0;
		this.characterist="";
		this.yearFabrication=0000;
		this.price=0.00;
	}
	
	public Plane(String id, int capacity, String characterist, int yearFabrication,
			double price, Airline airline)
	{
		this.id=id;
		this.capacity=capacity;
		this.characterist=characterist;
		this.yearFabrication=yearFabrication;
		this.price=price;
		this.airline=airline;
	}
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id=id;
	}
	public int getCapacity() 
	{
		return capacity;
	}
	public void setCapacity(int capacity) 
	{
		this.capacity=capacity;
	}
	public String getCharacterist() 
	{
		return characterist;
	}
	public void setCharacterist(String characterist) 
	{
		this.characterist=characterist;
	}
	public int getYearFabrication() 
	{
		return yearFabrication;
	}
	public void setYearFabrication(int yearFabrication) 
	{
		this.yearFabrication = yearFabrication;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price=price;
	}
	public Airline getAirline() 
	{
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline=airline;
	}
	@Override
	public String toString() 
	{
		return "Plane [id=" + id + ", capacity=" + capacity + ", characterist=" + characterist + 
				", year fabrication=" + yearFabrication + ", price=" + price + " Airline=" + airline +  "]";
	}
}
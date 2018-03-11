import entities.Plane;
import entities.Airline;

public class RunQuestion2 
{
	public static void main(String[] args) 
	{
		Airline c = new Airline("Avianca");
		Plane a = new Plane("205",200,"big",1995,250560,c);
		Plane b = new Plane("798",500,"medium",2012,549560,c);		
		System.out.println(a);
		System.out.println(b);
	}
}

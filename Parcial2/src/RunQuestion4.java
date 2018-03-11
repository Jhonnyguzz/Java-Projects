import java.util.ArrayList;
import java.util.Collections;

import entities.Airline;
import entities.Mycomparetor;
import entities.Plane;
import entities.Random;
import entities.Mycomparator;
import entities.Comparebycapacity;

public class RunQuestion4 
{
	public static void main(String[] args) 
	{
		Random c = new Random();
		ArrayList<Plane> a = new ArrayList<Plane>();
		
		for(int i=0;i<100;i++)
		{
			String id=c.getRandomId();
			int capacity=c.getRandomNumber(100, 500);
			String characterist=c.getRandomCharacterist();
			int year=c.getRandomNumber(1900, 2012);
			double price=c.getRandomPrice(100000, 500000);
			Airline ob = new Airline(c.airline());
			Plane b = new Plane(id,capacity,characterist,year,price,ob);
			a.add(b);
		}
		
		for(Plane x : a)
		{
			System.out.println(x);
		}
		
		Mycomparator cmp = new Mycomparator();
		Collections.sort(a, cmp); //llamar a compare
		System.out.println("\nOrdenamiento 1 (por Id): \n");
        
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		Mycomparetor temp = new Mycomparetor();
		Collections.sort(a, temp); //llamar a compare
		System.out.println("\nOrdenamiento 2 (por Precio): \n");

		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		Comparebycapacity t = new Comparebycapacity();
		Collections.sort(a, t); //llamar a compare
		System.out.println("\nOrdenamiento 3 (por Capacidad): \n");

		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}
}

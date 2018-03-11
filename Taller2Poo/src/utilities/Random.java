package utilities;

import java.util.ArrayList;

import entities.Airline;
import entities.Plane;

public class Random extends Plane
{
	public int getRandomNumber(int min, int max)
	{
		return min + (int)(Math.random() * (max - min + 1 ));
	}
	public String getRandomId()
	{
		String ans = "";	
		ans += (char)(('A')+getRandomNumber(0, 25));
		ans += (char)(('A')+getRandomNumber(0, 25));
		ans += (char)(('A')+getRandomNumber(0, 25));
		ans += "-";
		ans += (char)(('0')+getRandomNumber(0, 9));
		ans += (char)(('0')+getRandomNumber(0, 9));
		ans += (char)(('0')+getRandomNumber(0, 9));
		return ans;
	}
	public String getRandomCharacterist()
	{
		String str="";
		int tmp;
		tmp=getRandomNumber(1,3);	
		if(tmp==1)
		{
			str="small ";
		}
		if(tmp==2)
		{
			str="medium";
		}
		if(tmp==3)
		{
			str="big   ";
		}
		return str;
	}
	public String airline()
	{
		String str="";
		int tmp;
		tmp=getRandomNumber(1,3);
		
		if(tmp==1)
		{
			str="Avianca";
		}
		if(tmp==2)
		{
			str="LAN";
		}		
		if(tmp==3)
		{
			str="AeroRepublica";
		}		
		return str;
	}
	public double getRandomPrice(double min, double max)
	{
		return min + (double)(Math.random() * (max - min + 1 ));
	}
	public ArrayList<Plane> instanceRandom()
	{
		ArrayList<Plane> file = new ArrayList<Plane>();
		for (int i = 0; i < 200; i++)
		{		
			String id=getRandomId();
			int capacity=getRandomNumber(100, 500);
			String characterist=getRandomCharacterist();
			int year=getRandomNumber(1900, 2012);
			double price=getRandomPrice(100000, 500000);	
			String airline=airline();
			
			Airline d = new Airline(airline);
			Plane c = new Plane(id,capacity,characterist,year,price,d);
			
			file.add(c);
		}
		return file;
	}	
}
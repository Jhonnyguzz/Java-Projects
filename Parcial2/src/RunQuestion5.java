import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

import utilities.Lecture;
import entities.Airline;
import entities.Comparebycapacity;
import entities.Plane;

public class RunQuestion5
{
	public static void main(String[] args) 
	{
		Lecture read = new Lecture();
		//Aqui la variable local que retorna el metodo read.readFile es pasada a la variable local ArrayList<String> s
		ArrayList<String> s = new ArrayList<String> (read.readFile("planes.txt"));

		ArrayList<Plane> planes = new ArrayList <Plane>();
		
		for(int i=0;i<s.size();i++)
		{
		    StringTokenizer separate = new StringTokenizer(s.get(i),"|");
		    String id = separate.nextToken();
		    int capacity = Integer.parseInt(separate.nextToken());
		    String characterist = separate.nextToken();
		    int yearFabrication = Integer.parseInt(separate.nextToken());
		    double price = Double.parseDouble(separate.nextToken());
		    String air = separate.nextToken();
		    Airline p = new Airline(air);
		    Plane cplane = new Plane(id,capacity,characterist,yearFabrication,price,p);
		    planes.add(cplane);
		}
		
		int promedium=0;
		
		for(int i=0;i<planes.size();i++)
		{
			promedium=promedium+planes.get(i).getCapacity();
		}
		
		promedium=promedium/planes.size();
		System.out.println("Capacidad promedio: "+promedium+" pasajeros");
        
        HashSet<String> airlines = new HashSet<String>();
        for(int i=0;i<planes.size();i++)
        {
        	for(int j=i+1;j<planes.size();j++)
        	{
                if(planes.get(i).getAirline().getAirline().equals(planes.get(j).getAirline().getAirline()));
                {
                    airlines.add(planes.get(i).getAirline().getAirline());
                } 
            }
        }
        
        System.out.println("Aerolineas con mas de 1 avion: "+airlines);
        System.out.println("Aviones con capacidad menor al promedio: ");
        
        Comparebycapacity tmp = new Comparebycapacity();
        Collections.sort(planes,tmp);
        
        for(int i=0;i<planes.size();i++)
        {
            if(planes.get(i).getCapacity()<promedium)
            {
                System.out.println(planes.get(i));
            }
        }
	}
}

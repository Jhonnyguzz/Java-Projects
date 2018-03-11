package entities;

import java.util.Comparator;
import entities.Plane;

public class Comparebycapacity implements Comparator<Plane>
{		
    @Override
	public int compare(Plane arg0, Plane arg1)
	{		
		return String.valueOf(arg0.getCapacity()).compareTo(String.valueOf(arg1.getCapacity())); 
	}
}
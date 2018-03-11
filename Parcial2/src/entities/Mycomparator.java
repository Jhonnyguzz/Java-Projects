package entities;

import java.util.Comparator;
import entities.Plane;

public class Mycomparator implements Comparator<Plane>
{		
    @Override
	public int compare(Plane arg0, Plane arg1)
	{		
		return arg0.getId().compareToIgnoreCase(arg1.getId()); 
	}
}

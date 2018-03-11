package entities;

import java.util.Comparator;
import entities.Plane;

public class Mycomparetor implements Comparator<Plane>
{
	@Override
	public int compare(Plane arg0, Plane arg1) // llamar el metodo compare y no toCompare
	{				
		return String.valueOf(arg0.getPrice()).compareTo(String.valueOf(arg1.getPrice()));
		//para tipos de datos diferentes de String usar String.valueOf o sino da error misteriosamente
	}		
}

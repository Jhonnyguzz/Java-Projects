import java.util.ArrayList;

import utilities.Random;
import utilities.Serializacion;
import entities.Plane;

public class SerializePlane 
{
	public static void main(String[] args) 
	{
		Random b = new Random();
		ArrayList<Plane> a = new ArrayList<Plane>(b.instanceRandom());
		ArrayList<Plane> z = new ArrayList<Plane>();
		
		Serializacion.Serializar("objects.ser", a);
		System.out.println(a);

		z=Serializacion.Desserializar("objects.ser");	
		System.out.println(z);
	}
}

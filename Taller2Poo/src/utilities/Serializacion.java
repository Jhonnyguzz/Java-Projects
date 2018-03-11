package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import entities.Plane;

public class Serializacion implements Serializable
{	
	public static void Serializar(String fileName,ArrayList<Plane> ob)
	{
		try
		{
		    FileOutputStream output = new FileOutputStream(fileName);
		    ObjectOutputStream oboutput = new ObjectOutputStream(output); 
		    oboutput.writeObject(ob);
		    oboutput.close();
		    output.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}	
	}
	public static ArrayList<Plane> Desserializar(String fileName)
	{
		ArrayList<Plane> obret=null; //declarar variables fuera de los try o no reconocerá que retornar
		try
		{	
		    FileInputStream input = new FileInputStream(fileName);
		    ObjectInputStream obinput = new ObjectInputStream(input); 
		    
		    obret = (ArrayList<Plane>) obinput.readObject(); //Casteo a Object o a la clase específica de la que se quiere deserializar
		    
		    obinput.close();
		    input.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			return null;
		}
		catch(IOException c)
		{
			c.printStackTrace();
			return null;
		} 
		catch (ClassNotFoundException d) 
		{
			d.printStackTrace();
			return null;
		}
		return obret;	
	}
}
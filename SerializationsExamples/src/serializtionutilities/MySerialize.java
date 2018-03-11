package serializtionutilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import entities.Person;

public class MySerialize
{
	public static Person deserializePerson(String fileName)
	{
		Person p = null;
		try
		{
			FileInputStream fileIn =
					new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			p = (Person) in.readObject();// Hacer Casteo al objeto para desserializar
			in.close();
			fileIn.close();
		}catch(IOException i)
		{
			i.printStackTrace();
			return null;
		}
		catch(ClassNotFoundException c)
		{
			System.out.println("Person class not found");
			c.printStackTrace();
			return null;
		}
		return p;
	}
	public static void serialize(String fileName, Person p)
	{		
		try
		{
			FileOutputStream fileOut =
					new FileOutputStream(fileName);
			ObjectOutputStream out =
					new ObjectOutputStream(fileOut);
			out.writeObject(p);
			out.close();
			fileOut.close();
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
	}
	public static Object deserialize(String fileName)
	{
		Object p = null;
		try
		{
			FileInputStream fileIn =
					new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			p = (Object) in.readObject();
			in.close();
			fileIn.close();
		}catch(IOException i)
		{
			i.printStackTrace();
			return null;
		}
		catch(ClassNotFoundException c)
		{
			System.out.println("Person class not found");
			c.printStackTrace();
			return null;
		}
		return p;
	}
	public static void serialize(String fileName, Object o)
	{		
		try
		{
			FileOutputStream fileOut =
					new FileOutputStream(fileName);
			ObjectOutputStream out =
					new ObjectOutputStream(fileOut);
			out.writeObject(o);
			out.close();
			fileOut.close();
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
	}	
}

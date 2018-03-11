package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import db.DataBase;

public class Serialize implements Serializable
{
	private static final long serialVersionUID = 1L;

	public static void Serializar(String fileName, DataBase db)
	{
		try 
		{
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(db);			
			oos.close();
			fos.close();
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static DataBase readDataFromString(String fileName)
	{
		DataBase db=null;
		
		try 
		{
			FileInputStream fos = new FileInputStream(fileName);
			ObjectInputStream oos = new ObjectInputStream(fos);
			db = (DataBase) oos.readObject();			
			oos.close();
			fos.close();
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return db;
	}
	public static DataBase readDataFromFile(File file)
	{
		DataBase db=null;
		String fileName=file.toString();
		try 
		{
			FileInputStream fos = new FileInputStream(fileName);
			ObjectInputStream oos = new ObjectInputStream(fos);
			db = (DataBase) oos.readObject();			
			oos.close();
			fos.close();
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return db;
	}
}

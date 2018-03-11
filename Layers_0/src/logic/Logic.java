package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.Model;
import model.Person;


import view.ConsoleView;

public class Logic
{
	private Model theModel;
	public Logic(Model theModel)
	{		
		this.theModel = theModel;
	}
	public boolean addPerson(Person p)
	{
		if( p == null )
			return false;
		return theModel.addPerson(p);
	}
	public int getAdultCount()
	{
		int ans = 0;
		for (Person p : theModel.getPeople() ) 
		{
			if( p.getAge() >= 18 )
				++ans;
		}
		return ans;
	}
	public boolean serialize( String fileName )
	{
		try
		{
			FileOutputStream fileOut =
					new FileOutputStream(fileName);
			ObjectOutputStream out =
					new ObjectOutputStream(fileOut);
			out.writeObject(this.theModel);
			out.close();
			fileOut.close();			
		}
		catch(IOException i)
		{
			i.printStackTrace();
			return false;
		}
		return true;
	}
	public boolean deserialize(String fileName)
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
		}
		catch(IOException i)
		{
			i.printStackTrace();
			return false;
		}
		catch(ClassNotFoundException c)
		{
			System.out.println("Person class not found");
			c.printStackTrace();
			return false;
		}
		this.theModel = (Model) p;
		return true;
	}
	public String getStringPeopleRepresentation() {
		StringBuilder sb = new StringBuilder();
		for (Person p : theModel.getPeople() ) 
		{
			sb.append(p.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}

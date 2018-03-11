package model;

import java.io.Serializable;
import java.util.TreeSet;

public class Model implements Serializable
{
	private TreeSet<Person> people = new TreeSet<Person>();

	public boolean addPerson( Person p )
	{
		try
		{
			this.people.add( p );
		}
		catch( Exception e )
		{
			e.printStackTrace();
			System.out.println("Error en el Modelo");
			return false;
		}
		return true;
	}
	public void removePerson( Person p )
	{
		this.people.remove( p );
	}
	public String getPeopleStringRepresentation()
	{
		StringBuilder sb = new StringBuilder();
		for (Person p: this.people)
		{
			sb.append(p.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
	public int getPeopleCount()
	{
		return this.people.size();
	}
	public TreeSet<Person> getPeople() {

		return this.people;
	}
}

package db;

import java.io.Serializable;
import java.util.ArrayList;

import entities.Diary;
import entities.EventDiary;
import entities.Person;

public class DataBase implements Serializable
{
	private static final long serialVersionUID = 1L;
	private static DataBase database=null;
	private static ArrayList<Person> people = new ArrayList<Person>();
	private static int k;
	private static int l;
	
	private DataBase(){}
	
//	public DataBase(ArrayList<Person> people) 
//	{
//		this.people = people;
//	}
	public static DataBase getInstance()
	{
		if(database==null)
		{
			database=new DataBase();
		}
		return database;
	}
	public static ArrayList<Person> getPerson() 
	{
		return people;
	}
	public static void setPerson(ArrayList<Person> people) 
	{
		DataBase.people = people;
	}
	public static int getK() {
		return k;
	}

	public static void setK(int k) {
		DataBase.k = k;
	}

	public static int getL() {
		return l;
	}

	public static void setL(int l) {
		DataBase.l = l;
	}

	public static int findPerson(Person person)
	{		
		int index=0;
		for(int i=0;i<people.size();i++)
	    {
		    if(people.get(i)==person)
		    {
			    index=i;
			    break;
		    }
	    }	
		return index;
	}
	public static int findDiary(int indexPerson, Diary a)
	{
		int index=0;
		for(int i=0;i<people.get(indexPerson).getDiaries().size();i++)
		{
			if(people.get(indexPerson).getDiaries().get(i)==a)
			{
				index=i; 
			}
		}
		return index;
	}
	public static int findEventDiary(int indexPerson, int indexDiary, EventDiary e)
	{
		int index=0;
		for(int i=0;i<people.get(indexPerson).getDiaries().get(indexDiary).getEvents().size();i++)
		{
			if(people.get(indexPerson).getDiaries().get(indexDiary).getEvents().get(i)==e)
			{
				index=i; 
			}
		}
		return index;
	}
	public static boolean addPerson(Person person)
	{
		people.add(person);
		return true;
	}
	public static boolean removePerson(Person person)
	{
		people.remove(person);
		return true;
	}
	public static boolean addAgendaToPerson(Person person, Diary a)
	{
		people.get(DataBase.findPerson(person)).getDiaries().add(a);
		return true;
	}
	public static boolean removeAgendaFromPerson(Person person, Diary a)
	{
		people.get(DataBase.findPerson(person)).getDiaries().remove(a);
		return true;
	}
	public static boolean addEventToAgenda(Person person, Diary a, EventDiary e)
	{
		int i=DataBase.findPerson(person);
		int b=DataBase.findDiary(i, a);
		people.get(i).getDiaries().get(b).getEvents().add(e);
        return true;
	}
	public static boolean removeEventFromAgenda(Person person, Diary a, EventDiary e)
	{
		int i=DataBase.findPerson(person);
		int b=DataBase.findDiary(i, a);
		people.get(i).getDiaries().get(b).getEvents().remove(e);
		return true;
	}
}
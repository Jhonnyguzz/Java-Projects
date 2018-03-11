package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import entities.Person;

public class Random 
{
	private ArrayList<Person> person = new ArrayList<Person>();
	private ArrayList<String> names = new ArrayList<String>(Random.readText("nameBoys.txt"));
	private ArrayList<String> lastNames = new ArrayList<String>(Random.readText("lastName.txt"));
	
	public Random(){}
	
	public ArrayList<String> getNames() 
	{
		return names;
	}
	public void setNames(ArrayList<String> names) 
	{
		this.names = names;
	}
	public ArrayList<String> getLastNames()
    {
		return lastNames;
	}
	public void setLastNames(ArrayList<String> lastNames) 
	{
		this.lastNames = lastNames;
	}
	public ArrayList<Person> getPerson() 
	{
		return person;
	}
	public void setPerson(ArrayList<Person> person) 
	{
		this.person = person;
	}
	public static int getRandomInteger(int min , int max)
	{
		return min + (int)(Math.random() * (max - min + 1));
	}
	public static String date()
	{
		String monthOfYear="";
		int day=0;
		int month=Random.getRandomInteger(1, 12);
		if(month==1){monthOfYear="Enero";day=Random.getRandomInteger(1, 31);}
		if(month==2){monthOfYear="Febrero";day=Random.getRandomInteger(1, 28);}
		if(month==3){monthOfYear="Marzo";day=Random.getRandomInteger(1, 31);}
		if(month==4){monthOfYear="Abril";day=Random.getRandomInteger(1, 30);}
		if(month==5){monthOfYear="Mayo";day=Random.getRandomInteger(1, 31);}
		if(month==6){monthOfYear="Junio";day=Random.getRandomInteger(1, 30);}
		if(month==7){monthOfYear="Julio";day=Random.getRandomInteger(1, 31);}
		if(month==8){monthOfYear="Agosto";day=Random.getRandomInteger(1, 31);}
		if(month==9){monthOfYear="Septiembre";day=Random.getRandomInteger(1, 30);}
		if(month==10){monthOfYear="Octubre";day=Random.getRandomInteger(1, 31);}
		if(month==11){monthOfYear="Noviembre";day=Random.getRandomInteger(1, 30);}
		if(month==12){monthOfYear="Diciembre";day=Random.getRandomInteger(1, 31);}
		
		String date=String.valueOf(day)+" de "+monthOfYear+" de "+String.valueOf(2013);
		return date;	
	}
	public static ArrayList<String> readText(String fileName)
	{
		ArrayList<String> textFile = new ArrayList<String>();
		File file = new File(fileName);
		FileReader fr = null; //Inicializar siempre a null o que el catch retorne null
		try 
		{
			fr = new FileReader(file);
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		
		try
		{
			String aux="";
			
		    while(true)
		    {
			    aux=br.readLine();
			
			    if(!(aux==null))
			    {
				    textFile.add(aux);
			    }
			    else
			    {
				    break;
			    }
		    }
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	    try
	    {    
	        br.close();
	        fr.close();
	    }
	    catch(IOException e)
	    {
	    	// TODO Auto-generated catch block
	    	e.printStackTrace();
	    }
		return textFile;
	}
	public ArrayList<Person> randomPerson()
	{
		for(int i=0;i<10;i++)
		{
			String firstName=names.get(Random.getRandomInteger(0, names.size()-1));
			String secondName=names.get(Random.getRandomInteger(0, names.size()-1));
			String firstLastName=lastNames.get(Random.getRandomInteger(0, names.size()-1));
			String secondLastName=lastNames.get(Random.getRandomInteger(0, names.size()-1));
			int id=Random.getRandomInteger(100000, 999999);
			Person personRandom = new Person(firstName, secondName, firstLastName, secondLastName, id);
			this.person.add(personRandom);
		}
		return person;
	}
}
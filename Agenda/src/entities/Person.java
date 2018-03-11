package entities;

import java.io.Serializable;
import java.util.ArrayList;

public class Person implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String dateBirth;
	private String firstName;
	private String secondName;
	private String firstLastName;
	private String secondLastName;
	private String email;
	private int id;
	private String username;
	private char[] password;
	private ArrayList<Diary> diaries = new ArrayList<Diary>();
	
	public Person(){}
	
	public Person(String firstName, String secondName, String firstLastName, String secondLastName, int id)
	{
		this.firstName=firstName;
		this.secondName=secondName;
		this.firstLastName=firstLastName;
		this.secondLastName=secondLastName;
		this.id=id;
	}
	public Person(String dateBirth, String firstName, String secondName,
			String firstLastName, String secondLastName,
			String email, int id, String username, char[] password) 
	{
		this.dateBirth = dateBirth;
		this.firstName = firstName;
		this.secondName = secondName;
		this.firstLastName = firstLastName;
		this.secondLastName = secondLastName;
		this.email = email;
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public Person(String dateBirth, String firstName, String secondName,
			String firstLastName, String secondLastName,
			String email, int id, String username, char[] password, ArrayList<Diary> diaries) 
	{
		this.dateBirth = dateBirth;
		this.firstName = firstName;
		this.secondName = secondName;
		this.firstLastName = firstLastName;
		this.secondLastName = secondLastName;
		this.email = email;
		this.id = id;
		this.username = username;
		this.password = password;
		this.diaries = diaries;
	}
	public String getDateBirth() 
	{
		return dateBirth;
	}
	public void setDateBirth(String dateBirth) 
	{
		this.dateBirth = dateBirth;
	}
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getSecondName() 
	{
		return secondName;
	}
	public void setSecondName(String secondName) 
	{
		this.secondName = secondName;
	}
	public String getFirstLastName() 
	{
		return firstLastName;
	}
	public void setFirstLastName(String firstLastName) 
	{
		this.firstLastName = firstLastName;
	}
	public String getSecondLastName() 
	{
		return secondLastName;
	}
	public void setSecondLastName(String secondLastName) 
	{
		this.secondLastName = secondLastName;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public char[] getPassword() 
	{
		return password;
	}
	public void setPassword(char[] password) 
	{
		this.password = password;
	}
	public ArrayList<Diary> getDiaries() 
	{
		return diaries;
	}
	public void setDiaries(ArrayList<Diary> diaries) 
	{
		this.diaries = diaries;
	}
	@Override
	public String toString() 
	{
		return "Person [firstName=" + firstName + ", secondName=" + secondName
				+ ", firstLastName=" + firstLastName + ", secondLastName="
				+ secondLastName + ", id=" + id + "]";
	}
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (email == null) 
		{
			if (other.email != null)
				return false;
		} 
		else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (username == null) 
		{
			if (other.username != null)
				return false;
		} 
		else if (!username.equals(other.username))
			return false;
		return true;
	}
}

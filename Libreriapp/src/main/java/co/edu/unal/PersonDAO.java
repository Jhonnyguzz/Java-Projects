package co.edu.unal;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.ArrayList;
import java.util.List;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.Query;

public class PersonDAO implements IPersonDAO {
	
	public void save(Person p)
	{
		ofy().save().entity(p).now();
	}
	
	public Person load(String email)
	{
		Key<Person> k = Key.create(Person.class, email);
		return ofy().load().key(k).now();
	}
	
	public void remove(Person p)
	{
		ofy().delete().entity(p).now();
	}
	
	public void remove(String email)
	{
		Key<Person> k = Key.create(Person.class, email);
		ofy().delete().key(k).now();
	}
	
	public List<Person> getAll()
	{
		Query<Person> q = ofy().load().type( Person.class );
		return new ArrayList<Person>( q.list() );
	} 
}

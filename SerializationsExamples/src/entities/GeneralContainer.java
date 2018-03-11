package entities;

import java.io.Serializable;
import java.util.HashSet;

public class GeneralContainer implements Serializable
{
	protected HashSet<Object> database = new HashSet<Object>();
	public void add( Object p )
	{
		this.database.add( p );
	}
	public boolean isIn( Object p )
	{
		return this.database.contains( p );
	}
	public void delete( Object p )
	{
		this.database.remove( p );
	}
	public int getCount( Object p )
	{
		return this.database.size();		
	}
	public String toString()
	{
		StringBuilder sb = new StringBuilder();		
		for (Object p : this.database)
			sb.append(p);
		return sb.toString();
	}	
}

package util;

import model.Person;

public class StringUtilities
{
	public static Person getPersonFromString( String str )
	{
		int age = -1;
		boolean sex = true;
		String a[] = str.split("[,]");
		try
		{			
			if( a.length != 4 )
				return null;
			age = Integer.parseInt( a[2] );
			sex = a[3].toLowerCase().charAt(0) == 'f';	
			
		}
		catch( Exception e )
		{
			e.printStackTrace();
			System.err.println("Error in util.StringUtilities.getPersonFromString");
			return null;
		}					
		return new Person(a[0],a[1],age,sex);
	}
}

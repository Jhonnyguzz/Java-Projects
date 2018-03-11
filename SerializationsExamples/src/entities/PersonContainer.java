package entities;

import java.util.HashSet;

public class PersonContainer extends GeneralContainer
{
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Las personas son: ");
		for (Object p : super.database)
			sb.append((Person)p);
		return sb.toString();
	}	
}

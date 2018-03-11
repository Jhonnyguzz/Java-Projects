import java.util.Comparator;


public class ByName implements Comparator<Mamal>
{
	@Override
	public int compare(Mamal a, Mamal b)
	{		
		return a.getSpecies().compareToIgnoreCase( b.getSpecies() );
	}

}

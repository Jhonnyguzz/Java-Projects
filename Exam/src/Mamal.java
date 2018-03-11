
public class Mamal extends Animal implements Comparable<Mamal>
{
	private int gestationTime;

	public Mamal(String species, long id, int gestationTime) {
		super(species, id);
		this.gestationTime = gestationTime;		
	}

	public int getGestationTime() {
		return gestationTime;
	}

	public void setGestationTime(int gestationTime) {
		this.gestationTime = gestationTime;
	}

	@Override
	public String toString() {
		return this.getSpecies();
	}

	@Override
	public int compareTo(Mamal other)
	{
		if( this.getId() < other.getId() )
			return 1;
		if( this.getId() > other.getId() )
			return -1;
		return 0;
	}

	@Override
	public int hashCode() {
		return (int)super.getId();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mamal other = (Mamal) obj;
		return super.getId() == other.getId();
	}
	
}

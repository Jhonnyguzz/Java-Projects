public class Animal extends Object
{
	private String species;
	private long id;
	public Animal()
	{
		this.species = "null";
		this.id = 0;
	}
	public Animal(String species, long id) {
		super();
		this.species = species;
		this.id = id;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean eat()
	{
		System.out.println("Animal Comiendo");
		return true;
	}
	@Override
	public String toString() {
		return "Animal [species=" + species + ", id=" + id + "]";
	}
	
}

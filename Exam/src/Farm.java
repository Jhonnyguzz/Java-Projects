import java.util.ArrayList;


public class Farm
{
	private ArrayList<Animal> animals;
	private ArrayList<Worker> workers;

	public Farm(ArrayList<Animal> animals) {
		super();
		this.animals = animals;
	}

	@Override
	public String toString() {
		return "Farm [animals=" + animals + "]";
	}
	
}

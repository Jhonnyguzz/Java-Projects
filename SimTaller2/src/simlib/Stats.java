package simlib;

public class Stats 
{
	double prom;
	double sum;
	double count;
	
	public Stats() {}
	
	public Stats(double prom, double count) {
		super();
		this.prom = prom;
		this.count = count;
	}
	public double getProm() {
		return prom;
	}
	public void setProm(double prom) {
		this.prom = prom;
	}
	public double getCount() {
		return count;
	}
	public void setCount(double count) {
		this.count += count;
	}
	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum += sum;
	}

	public double average()
	{
		return sum/count;
	}
	

}

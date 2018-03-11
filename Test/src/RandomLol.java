import java.util.ArrayList;
import java.util.Random;

public class RandomLol 
{
	static Random x;
	static ArrayList<Integer> tmp = new ArrayList<>();
	
	public static void random()
	{
		x = new Random(); 
		int j=0,cont = 0;
		
		while(true)
		{
			j = x.nextInt(5);
			if(!tmp.contains(j))
			{
				tmp.add(j);
				cont++;
			}
			if(cont==5)
				break;
		}
				
	}
	
	
	public static void main(String[] args) 
	{
		random();
		System.out.println("Giovanni "+ tmp.get(0));
		System.out.println("Omar "+ tmp.get(1));
		System.out.println("Danilo "+ tmp.get(2));
		System.out.println("Julian "+ tmp.get(3));
		System.out.println("Jhonatan "+ tmp.get(4));
	}
	
//	0.Top
//	1.Jungler
//	2.Mid
//	3.Adc
//	4.Support

}

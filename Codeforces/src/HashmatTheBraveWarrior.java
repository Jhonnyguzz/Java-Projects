import java.util.Scanner;

/**
 * http://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=996
 * @author Jhonatan
 *
 */
public class HashmatTheBraveWarrior 
{
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		long w1,w2,d=0;
		while(input.hasNextLong()) // EOF (end of file)
		{
			w1=input.nextLong();
			w2=input.nextLong();
		    if(w2>w1)
		    {
			    d=w2-w1;
		    }
		    else
		    {
		        d=w1-w2;
		    }
		    System.out.println(d);
		}
	}
}

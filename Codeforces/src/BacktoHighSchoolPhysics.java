import java.util.Scanner;

/**
 * http://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1012
 * @author Jhonatan
 *
 */
public class BacktoHighSchoolPhysics 
{
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int v,t,r;
		v=input.nextInt();
		t=input.nextInt();
		
		r=(v*t)*2;
		System.out.println(r);
	}
}

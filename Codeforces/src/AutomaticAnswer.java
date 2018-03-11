import java.util.Scanner;
/**
 * http://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=2542
 * @author Jhonatan
 *
 */
public class AutomaticAnswer 
{
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n;
		
		n=input.nextInt();
	
		int cases[] = new int[n];
		int result[] = new int[n];
		int aux=0,aux2=0;
		
		for(int i=0;i<cases.length;i++)
		{
			cases[i]=input.nextInt();
		}
		
		for(int i=0;i<cases.length;i++)
		{
			aux=0;
			aux2=0;
			aux=cases[i]*567;
			aux=aux/9;
			aux=aux+7492;
			aux=aux*235;
			aux=aux/47;
			aux=aux-498;
			aux=aux/10;
			aux=aux%10;
			if(aux<0)
			{
				aux=0+aux;
				aux2=aux*(-2);
				aux=aux2+aux;
			}
			result[i]=aux;
		}
		
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}
}

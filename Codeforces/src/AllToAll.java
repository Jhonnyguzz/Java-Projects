import java.util.Scanner;

/**
 * 
 * http://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1281
 * @author Jhonatan
 *
 */
public class AllToAll 
{
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int tam=0;
		String s1,s2,s3="";
		
		s1=input.next();
		s2=input.next();
		
		char aux1[] = s1.toCharArray();
		char aux2[] = s2.toCharArray();
		char aux3[] = s2.toCharArray();
		
		for(int i=0;i<aux1.length;i++)
		{
			for(int j=tam;j<aux3.length;j++)
			{
				if(aux2[j]!=aux1[i])
				{
					s3="";
					aux2[j]=' ';
					s3 = new String(aux2); 
				}
				else
				{
					tam=j+1;
					break;
				}
			}
		}
		s3=s3.replaceAll(" ", "");
		s3=s3.trim();
		aux2=s3.toCharArray();
		
		
		if(s1.length()<s3.length())
		{
			for(int i=aux1.length;i<aux2.length;i++)
			{
				s3="";
				aux2[i]=' ';
				s3 = new String(aux2); 
			}
		}
		
		s3=s3.replaceAll(" ", "");
		s3=s3.trim();
		
		if(s3.equals(s1))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}

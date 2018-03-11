import java.util.Scanner;
public class Codeforces 
{
	public static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args)
	{
		int stone,acum=0;
	    stone=teclado.nextInt();
	    String ss;
	    ss=teclado.next();//usar .next , aveces suceden cosas raras con .nextLine
	    char color[] = ss.toCharArray();
	    for(int j=0;j<stone;j++)
	    {
	    	try 
	    	{
	    		//dado un arreglo de tamaño 5, en algun momento compara la posición 5 con la posición 6
	    		//como la posición 6 no existe, se genera una excepción por eso, poner el try/catch
	    		//el catch e.printStackTrace(); que imprime el error generado si la excepcion es verdadera
	    		//para eliminar esta excepción poner stone-1 en el ciclo
	    		//for, para que al estar j un numero antes del tamaño del arreglo, no compare la última posición
	    		//con una posición que no existe en el arreglo, sin embargo acá se dejó así para propósitos
	    		//pedagógicos de try/catch. Nota: en C++ no se ha visto que genere error, sin embargo por buenas
	    		//costumbres de programación poner stone-1
	    		if(color[j]==color[j+1])
	    		{
	    			acum=acum+1;                                       
	    		}
	    	}
	    	catch(ArrayIndexOutOfBoundsException e)
	    	{
	    		e.printStackTrace();
	    	}	    	
	    }
	    System.out.println(acum);
	}
}
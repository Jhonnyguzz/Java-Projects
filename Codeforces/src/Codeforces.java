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
	    		//dado un arreglo de tama�o 5, en algun momento compara la posici�n 5 con la posici�n 6
	    		//como la posici�n 6 no existe, se genera una excepci�n por eso, poner el try/catch
	    		//el catch e.printStackTrace(); que imprime el error generado si la excepcion es verdadera
	    		//para eliminar esta excepci�n poner stone-1 en el ciclo
	    		//for, para que al estar j un numero antes del tama�o del arreglo, no compare la �ltima posici�n
	    		//con una posici�n que no existe en el arreglo, sin embargo ac� se dej� as� para prop�sitos
	    		//pedag�gicos de try/catch. Nota: en C++ no se ha visto que genere error, sin embargo por buenas
	    		//costumbres de programaci�n poner stone-1
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
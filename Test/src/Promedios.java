import java.util.Scanner;

public class Promedios
{	
	public static Scanner teclado = new Scanner (System.in);
	
	public static final int tam=10;
	
	public static int primos(int a[])
	{
		int aux,acum=0,b=0,temp;
		
		for(int i=0;i<tam;i++)
		{
			temp=a[i];
			b=0;
			
			for(int cont=2;cont<a[i];cont++)
			{	
				aux = a[i] % cont;
				
				if(aux==0)
				{
					cont=temp;
					b=1;
				}
			}	
			
			if(b==0)
			{
			    acum=acum+1;
			}
		}
		
		for(int i=0;i<tam;i++)
		{
			if(a[i]==1)
			{
				acum=acum-1;
			}
		}
		
		return acum;
	}
	
	public static void main(String[]args)
	{
		
	    int [] estatura = new int [tam];
	    int sumatoria=0;
	    int promedio=0;
		
		System.out.println("Ingrese las estaturas de los 10 estudiantes: ");
		
		for(int i=0;i<tam;i++)
		{
			System.out.println(i+1+":");
			estatura[i]=teclado.nextInt();
		}
		
		for(int i=1;i<tam;i=i+2)
		{
			sumatoria=sumatoria+estatura[i];
		}
		
		for(int i=0;i<tam;i=i+2)
		{
			promedio=promedio+estatura[i];
		}		
		
		promedio=promedio/6;

		System.out.println("La sumatoria de las estaturas de las posiciones impares es: "+sumatoria);
		System.out.println("El promedio de las estaturas de las posiciones pares es: "+promedio);
		System.out.println("El total de los números primos que se digitaron es de: "+primos(estatura));
		
	}
}
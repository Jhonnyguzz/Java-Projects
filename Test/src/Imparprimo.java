import java.util.Scanner;

public class Imparprimo
{	
	public static Scanner teclado=new Scanner(System.in);
	public static double impares(int a[])
	{
		int tam=10,cont=0;
		double acum=0;
		for (int i=0;i<tam;i++)
		{
			if(a[i]%2==1)
			{
				acum=acum+a[i];
				cont=cont+1;
			}
		}
		acum=acum/cont;
		return acum;
	}
	public static int primos(int a[])
	{
		int aux,tam=10,acum=0,b=0,temp;
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
			    acum=acum+a[i];
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
	public static void main (String[] args)
	{
		int tam=10;
		int []a = new int [tam];
		double valor1;
		int valor2;
		System.out.println("Ingrese Valores:");
		for (int i=0;i<tam;i++)
		{
			a[i]=teclado.nextInt();	
		}
		valor1=impares(a);
		valor2=primos(a);
		System.out.println("el promedio de los numeros impares es: "+valor1);
		System.out.println("la sumatoria de los numeros primos es: "+valor2);
	}
}
import java.util.Scanner;

public class Sucesion
{
	public static Scanner teclado = new Scanner (System.in);
	public static void main(String[]args)
	{
		double n;
		System.out.println("Ingrese n: ");
		n=teclado.nextInt();
		double suma=0.0;
		for(double i=1;i<=n;i++) 
		{
			suma=suma+(1/i);
		} 
		System.out.println("la respuesta a la sucesión es: ");
		System.out.println(suma);		
	}
}
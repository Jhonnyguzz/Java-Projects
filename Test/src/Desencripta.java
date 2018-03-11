import java.util.Scanner;

public class Desencripta
{
	public static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) 
	{
		char Codigo[] = new char[18] ;
		char Descifra[] = new char[18];
		
		System.out.println("Ingrese el texto encriptado: ");
		Codigo = teclado.nextLine().toCharArray();
		
		int [] Encripta = new int[18];
		
		System.out.println("Ingrese el orden lógico: ");
		
		for(int i=0;i<Encripta.length;i++)
		{
			Encripta[i]=teclado.nextInt();
		}
		
		for(int i=0;i<Codigo.length;i++)
		{
		    Descifra[Encripta[i]]=Codigo[i];
		}
		
		System.out.println("Su texto Descifrado es: ");
		System.out.println(Descifra);
	}
}
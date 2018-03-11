import java.util.Scanner;
/*
 * Esta clase factoriza el n�mero N en producto de 
 * dos n�meros primos p y q por fuerza bruta, recibe como entrada un
 * primer entero que define los primos dentro de un rango de 3 a tam
 * y un segundo entero que es el n, por fuerza bruta divide el n entre toda
 * la lista de primos, cuando al hacer esta divisi�n encuentra un entero p, el i que 
 * se encuentra dividiendo a n es q y n/i es p
 */
public class NEqualsPQ
{
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int aux = 0, tam, b = 0;
		double n;
		double p = 0;

		tam = sc.nextInt();
		n = sc.nextInt();

		for (double i = 3; i < tam; i++) 
		{
			for (int cont = 2; cont < i; cont++) 
			{
				aux = (int) (i % cont);
				
				if (aux == 0) 
				{
					b = 1;
					break;
				}
			}
			if (b == 0) 
			{
				p = n / i;

				if (p % 1 == 0) 
				{
					System.out.println(i);
					System.out.println(p);
				}
			}
			b = 0;
		}

	}
}
import java.util.Scanner;

public class Main 
{
	public static Scanner input = new Scanner(System.in); 
	
	public static void main(String[] args) 
	{
//		char tablero[][] = new char [8][8]; //[filas][columnas]
//
//		
//		for(int i=0;i<tablero.length;i++)
//		{
//			for(int j=0;j<tablero.length;j++)
//			{
//				tablero[i][j]='O';
//			}
//		}
//		
//		for(int i=0;i<tablero.length;i++)
//		{
//			for(int j=0;j<tablero.length;j++)
//			{
//				System.out.print(tablero[i][j]+"\t");				
//			}
//			System.out.println("\n");
//		}
		
		int n=0;
		
		Ladron juego = new Ladron();
		
		juego.startLadron();
		juego.startPolicia();
		juego.findLadron();
		juego.findPolicia();
		
		juego.print();
		
		n=input.nextInt();
		
		while(n==1)
		{
			juego.moveLadron();
			juego.movePolicia();
			
			
			//método temporal
			juego.temporal();
			
			juego.print();
			
			if(juego.catchYou())
			{
				System.out.println("El policia ha atrapado al ladrón ... Fin del juego");
				break;
			}
			if(juego.shoot())
			{
				System.out.println("El policia ha matado al ladrón ... Fin del juego");
				break;
			}
			else
			{
				System.out.println("... nada ha pasado");
			}
			n=input.nextInt();
		}	
	}
}

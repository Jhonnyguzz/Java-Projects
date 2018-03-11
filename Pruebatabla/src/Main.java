import java.util.Scanner;

public class Main 
{
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{	
		Tabla table = new Tabla();
		model xd = new model(table);
		table.setVisible(true);
		xd.llenarTabla();
		int n=0;
		while(true)
		{
		    System.out.println("1. Agregar persona");
		    System.out.println("2. Borrar persona");
			n=input.nextInt();
			switch(n)
			{
			    case 1:
			    	String nombre;
			    	int edad,id;
			    	nombre=input.next();
			    	edad=input.nextInt();
			    	id=input.nextInt();
			    	xd.agregar(nombre, edad, id);
			    	xd.llenarTabla();
			    	break;
			}
		}
	}
}

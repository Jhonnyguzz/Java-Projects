package view;

import java.util.Scanner;
import util.StringUtilities;
import logic.Logic;
import model.Person;

public class ConsoleView
{
	private Scanner scanner = new Scanner(System.in);
	private Logic logic;
	private boolean endProgram = false;
	public ConsoleView(Logic logic) {
		super();
		this.logic = logic;
	}

	public void runView()
	{
		while( !endProgram )
		{
			runMenu();
		}
	}

	private void runMenu()
	{
		System.out.println("Menu:");
		System.out.println("1 Para ingresar persona");
		System.out.println("2 Para Consultar persona por id");
		System.out.println("3 Para Eliminar persona por id");
		System.out.println("4 Listar Personas");
		System.out.println("5 Consultar Cantidad de Mayores de Edad");
		System.out.println("6 Guardar Cambios en Disco (serializado)");
		System.out.println("7 Leer Modelo de disco (serializado)");
		System.out.println("8 Guardar Cambios en Disco (texto)");
		System.out.println("9 Leer Modelo de disco (texto)");
		System.out.println("10 Mostrar Hombres");
		System.out.println("11 Mostrar MUjeres");
		System.out.println("12 Listar personas ordenadas por nombre");
		System.out.println("13 Listar personas ordenadas por nombre");
		System.out.println("14 Listar personas ordenadas por nombre");		
		
		System.out.println(" otro valor para salir ");
		String option = scanner.nextLine();
		int value = -1;
		try
		{
			value = Integer.parseInt( option );
		}
		catch( Exception e )
		{
			System.out.println("Valor invalido, saliendo del programa");
			return;
		}
		String str;
		switch( value )
		{
			case 1:
				System.out.println("Ingrese datos de una persona separados por comas: nombre,id,age,sexo:");
				str = scanner.nextLine();
				Person p = StringUtilities.getPersonFromString(str);
				if( p == null || !logic.addPerson(p) )
					System.err.println("Error al ingresar datos, debe respetar el formato dado.");
				else					
					System.out.println("Persona agregada: "+p);	
				break;
			case 2:				
				
				break;
			case 3:				
				
				break;				
			case 4:				
				System.out.println(logic.getStringPeopleRepresentation());
				break;
			case 5:				
				System.out.println("Cantidad de Personas mayores de edad: "+logic.getAdultCount());
				break;
			case 6:				
				if( logic.serialize("persistence.data") )
					System.out.println("Archivo serializado: \"persistence.data\"");
				else
					System.out.println("Error, no se pudo serializar");						
				break;			
			case 7:			
				 
				if( logic.deserialize("persistence.data") )
				{
					System.out.println("Archivo deserializado: \"persistence.data\"");
					System.out.println("Los registros recuperados son:");
					System.out.println(logic.getStringPeopleRepresentation());
				}
				else
					System.out.println("Error, no se pudo deserializar");						
				break;			
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				break;
			case 12:
				break;				
			case 13:
				break;
			case 14:
				break;				
			default:
				endProgram = true;
				break;
		}
		System.out.print("Enter para continuar...");
		scanner.nextLine();
	}
}

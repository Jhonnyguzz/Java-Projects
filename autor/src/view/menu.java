package view;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class menu {

	public menu() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws Exception {
		menu_inicio();	
	}
	
	private static void menu_inicio() throws Exception {
		System.out.println("Seleccionar una opción para comenzar:");
		System.out.println("1. Consultar Dato");
		System.out.println("2. Insertar Datos");
		System.out.println("3. Borrar Datos");
		System.out.println("4. Actualizar Datos");
		numero=readInt();
		salida_menu(numero);
	}
	private static void salida_menu(int opcion_select) throws Exception {
		
		switch (opcion_select) {
		case 1:
			//mostrar consulta;
			ConexiónBD();
			menuConsultas();
			conexion.close();	
			break;
		case 2:
			//insetar datos
			ConexiónBD();
			menuIngresar();
			conexion.close();	
			break;
		case 3:
			//borrar datos
				ConexiónBD();
				int numero_autor_id;
				System.out.println("Escriba el numero de la fila que quiere borrar:");
				numero_autor_id=readInt();
				
				Statement st = conexion.createStatement();
				st.executeUpdate("DELETE FROM autor WHERE autor_id="+numero_autor_id);
				st.close();
				System.out.println("  ");
			
				conexion.close();
				menu_inicio();
			break;
		case 4:
			//actualizar datos
				ConexiónBD();
				menuActualizar();
				
			break;
		default:
			System.out.println("Seleccionar un numero dentro de las opciones del menú");
			menu_inicio();
			break;
		}	
	}
 	
	private static void menuConsultas() throws Exception{
	
 		System.out.println("Seleccionar el tipo de consulta:");
 		System.out.println("1. Consultar por autor_id");
 		System.out.println("2. Consultar por nombre");
 		System.out.println("3. Consultar por apellido");
 		System.out.println("4. Consultar por edad");
 		System.out.println("5. Consultar toda la tabla");
	
 		numeroConsulta=readInt();
 		salida_menu_consultas(numeroConsulta);
 	}
	private static void salida_menu_consultas(int opcion_select_consulta) throws Exception{
		switch (opcion_select_consulta){
		case 1://mostrar consulta por autor_id
			int numero_autor_id;
			System.out.println("Escriba el numero de la fila que quiere encontrar");
			numero_autor_id=readInt();
			
			Statement s = conexion.createStatement(); 
			ResultSet rs = s.executeQuery ("select * from autor WHERE autor_id="+numero_autor_id);
			
			if(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			rs.close();
			conexion.close();
			System.out.println("  ");
			menu_inicio();
			break;
		case 2://mostrar consulta por nombre
			String nombre_autor;
			System.out.println("Escriba el nombre que quiere encontrar");
			nombre_autor=readString();
			
			Statement s0 = conexion.createStatement(); 
			ResultSet rs0 = s0.executeQuery ("select * from autor WHERE nombre LIKE '%"+nombre_autor+"%'");
			
			while(rs0.next()){
				System.out.println(rs0.getInt(1)+" "+rs0.getString(2)+" "+rs0.getString(3)+" "+rs0.getInt(4));
			}
			rs0.close();
			System.out.println("  ");
			conexion.close();
			menu_inicio();
			break;
		case 3://mostrar consulta por apellido
			String apellido_autor;
			System.out.println("Escriba el apellido que quiere encontrar");
			apellido_autor=readString();
			
			Statement s2 = conexion.createStatement(); 
			ResultSet rs2 = s2.executeQuery ("select * from autor WHERE apellido LIKE '%"+apellido_autor+"%'");
			
			while(rs2.next()){
				System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+rs2.getString(3)+" "+rs2.getInt(4));
			}
			rs2.close();
			conexion.close();
			System.out.println("  ");
			menu_inicio();
			break;
		case 4://mostrar consulta por edad
			int numero_edad;
			System.out.println("Escriba la edad que quiere encontrar");
			numero_edad=readInt();
			
			Statement s4 = conexion.createStatement(); 
			ResultSet rs4 = s4.executeQuery ("select * from autor WHERE edad="+numero_edad);
			
			while(rs4.next()){
				System.out.println(rs4.getInt(1)+" "+rs4.getString(2)+" "+rs4.getString(3)+" "+rs4.getInt(4));
			}
			rs4.close();
			conexion.close();
			System.out.println("  ");
			menu_inicio();
			break;
		case 5://mostral la consulta de toda la tabla
			Statement s5 = conexion.createStatement(); 
			ResultSet rs5 = s5.executeQuery ("select * from autor");
			
			while(rs5.next()){
				System.out.println(rs5.getInt(1)+" "+rs5.getString(2)+" "+rs5.getString(3)+" "+rs5.getInt(4));
			}
			rs5.close();
			conexion.close();
			System.out.println("  ");
			menu_inicio();
			break;
		default:
			System.out.println("Seleccionar un numero dentro de las opciones del menú de consulta");
			menuConsultas();
			break;
		}
	}
	
	private static void menuIngresar() throws Exception{
		System.out.println("Seleccionar el tipo de insercion:");
 		System.out.println("1. En medio de la tabla");
 		System.out.println("2. Al final de la tabla");
 		numeroInsertar=readInt();
 		salida_menu_insertar(numeroInsertar);
	}
	private static void salida_menu_insertar(int opcion_select_insertar) throws Exception {
		switch (opcion_select_insertar) {
		case 1:
			System.out.println("Insertar el autor_id que falta");
			int autor_id=readInt();
			
			System.out.println("Insertar nombre");
			String nombre=readString();
			
			System.out.println("Insertar apellido");
			String apellido=readString();
			
			System.out.println("Insertar edad");
			int edad=readInt();
			
			ConexiónBD();
			Statement sti = conexion.createStatement();
			sti.executeUpdate("INSERT INTO autor (autor_id,nombre, apellido, edad)"
			+ " VALUES ('"+autor_id+"','"+nombre+"','"+apellido+"','"+edad+"') ");
			System.out.println("  ");
			conexion.close();
			menu_inicio();
			break;
		case 2:
						
			System.out.println("Insertar nombre");
			String nombre1=readString();
			
			System.out.println("Insertar apellido");
			String apellido1=readString();
			
			System.out.println("Insertar edad");
			int edad1=readInt();
			
			ConexiónBD();
			Statement sti1 = conexion.createStatement();
			sti1.executeUpdate("INSERT INTO autor (nombre, apellido, edad)"
			+ " VALUES ('"+nombre1+"','"+apellido1+"','"+edad1+"') ");
			System.out.println("  ");
			conexion.close();
			menu_inicio();
			break;
		default:
			System.out.println("Seleccionar un numero dentro de las opciones del menú de consulta");
			menuIngresar();
			break;
		}
		
		
	}

	
	
   private static void menuActualizar() throws Exception{
		
 		System.out.println("Seleccionar la columna del dato quiere Actualizar:");
 		System.out.println("1. Actualizar columna nombre");
 		System.out.println("2. Actualizar columna apellido");
 		System.out.println("3. Actualizar columna edad");
	
 		numeroActualizar=readInt();
 		salida_menu_Actualizar(numeroActualizar);
 	}
	private static void salida_menu_Actualizar(int opcion_select_Actualizar) throws Exception{
		switch (opcion_select_Actualizar){
		case 1://Actualizar columan nombre
			int numero_autor_id_nombre;
			System.out.println("Escriba el numero de la fila que quiere actualizar");
			numero_autor_id_nombre=readInt();
			
			String nombre_autor;
			System.out.println("Escriba el nombre que quiere insertar");
			nombre_autor=readString();
			
			Statement su = conexion.createStatement();
			su.executeUpdate("UPDATE autor SET nombre='"+ nombre_autor+"' WHERE autor_id="+numero_autor_id_nombre);
			su.close();
			conexion.close();
			System.out.println("  ");
			menu_inicio();
			break;
		case 2: // Actualizar columna apellido
			int numero_autor_id_apellido;
			System.out.println("Escriba el numero de la fila que quiere actualizar");
			numero_autor_id_apellido=readInt();
			
			String apellido_autor;
			System.out.println("Escriba el apellido que quiere insertar");
			apellido_autor=readString();
			
			Statement su1 = conexion.createStatement();
			su1.executeUpdate("UPDATE autor SET apellido='"+ apellido_autor+"' WHERE autor_id="+numero_autor_id_apellido);
			su1.close();
			conexion.close();
			System.out.println("  ");
			menu_inicio();
			break;
		case 3://Actualizar columna edad
			int numero_autor_id_edad;
			System.out.println("Escriba el numero de la fila que quiere actualizar");
			numero_autor_id_edad=readInt();
			
			int edad_autor;
			System.out.println("Escriba la edad que quiere insertar");
			edad_autor=readInt();
			
			Statement su2 = conexion.createStatement();
			su2.executeUpdate("UPDATE autor SET edad='"+ edad_autor+"' WHERE autor_id="+numero_autor_id_edad);
			su2.close();
			conexion.close();
			System.out.println("  ");
			menu_inicio();
			break;
		default:
			System.out.println("Seleccionar un numero dentro de las opciones del menú de Actualizar");
			menuActualizar();
			break;
		}
	}

	public static void ConexiónBD() {

		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 conexion = DriverManager.getConnection("jdbc:mysql://localhost/taller_3", "root", "Jadr04280");
			   
		} 
		catch (Exception e) {
			System.out.println("La bases de datos no carga");
		}
	}

	private static int readInt() throws Exception {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
		}
	
	private static String readString() throws Exception {
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		return br.readLine();
	}
	
	private static Connection conexion;
	private static int numeroActualizar;
	private static int numeroInsertar;
	private static int numeroConsulta;
	private static int numero;
}

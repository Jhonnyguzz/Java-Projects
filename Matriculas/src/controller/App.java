package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import view.Estudiante;
import view.MainFrame;

public class App {

	private App(){
		frame.setVisible(true);
	    frame.setSize(500,500);
	    frame.cerrar();
	  }
		 
	   	private synchronized static void createInstance() {
	        if (INSTANCE == null) { 
	            INSTANCE = new App();
	        }
	    }
	 
	    public static App getInstance() {
	        createInstance();
	        return INSTANCE;
	    }
	    
	    
	    public void consultar(){
	   // 	Consultar.mostraProds();
	    }
	    
	    public static void main(String args[]){
			App.getInstance();
		}

	    
	/** atributos de la clase **/
	  
	
	private Estudiante estu = new Estudiante();
	private MainFrame frame = new MainFrame();
	private static App INSTANCE = null;
	
	public void Llamar_Estudiante() {
		
		estu.setVisible(true);
		estu.setSize(500, 500);
		estu.cerrar();
		frame.setVisible(false);	
	} 

	public void ConexiónBD() {

		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 conexion = DriverManager.getConnection("jdbc:mysql://localhost/taller_3", "root", "Jadr04280");
			   
		} 
		catch (Exception e) {
			System.out.println("La bases de datos no carga");
		}
	}
	
	public void cerrar_ConexiónBD() throws SQLException{
	
		conexion.close();
	}
	
	private static Connection conexion;
	
}

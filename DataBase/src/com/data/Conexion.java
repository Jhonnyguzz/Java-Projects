package com.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion 
{
	private String servidor="jdbc:mysql://localhost/proyecto";
	private String user;
	private String password;
	private String driver="com.mysql.jdbc.Driver";
	private static Connection conexion;
		
	public Conexion(String user, String password)
	{
		this.user=user;
		this.password=password;
	}
	
	public void setUser(String user)
	{
		this.user=user;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
    public boolean makeConexion()
    {
    	boolean aux=false;
    	
        try
        {
            Class.forName(driver);
            conexion= DriverManager.getConnection(servidor,user,password);
            aux=true;
            System.out.println("Conexi�n realizada con �xito...");
        }
        catch(Exception e)
        {
        	System.out.println("Error al hacer la conexi�n");  	
        }
        return aux;
    }
    
    public static Connection getConexion()
    {
    	return conexion;
    }
    
    public void closeConexion()
    {
    	try 
    	{
			conexion.close();
			System.out.println("Conexi�n cerrada con �xito...");
		} 
    	catch (SQLException e) 
		{
    		System.out.println("No se ha podido cerrar la conexi�n");
			e.printStackTrace();
		}
    }
}

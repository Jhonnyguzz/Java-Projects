import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Store {

  private String login = "root";
  private String password = "123456";
  private String url = "jdbc:mysql://localhost/testsp";
  private Connection conn = null;
  
  public Store(){
      try{         
         Class.forName("com.mysql.jdbc.Driver");         
         conn = DriverManager.getConnection(url,login,password);         
      }catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }
    }

   public String procedure(String nombre, int anio_nacimiento)
   {
       String resultado=null;
       try {            
    	   
            CallableStatement proc = conn.prepareCall(" CALL registrar_jugador(?,?,?) ");
          
            proc.setString("nombre", nombre);
            proc.setInt("anio_nac", anio_nacimiento);
            
            proc.registerOutParameter("resultado", Types.VARCHAR);
            proc.execute();
            
            resultado = proc.getString("resultado");
        } 
       catch (Exception e) {                  
            System.out.println(e);
       }
       return resultado;
   }


}
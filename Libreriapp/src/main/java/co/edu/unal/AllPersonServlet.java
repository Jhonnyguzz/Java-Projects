package co.edu.unal;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AllPersonServlet extends HttpServlet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
      
    //response.setContentType("text/plain");
    //response.getWriter().print("Hello App Engine!\r\n");
    
    PersonDAO dao = new PersonDAO(); 

    PrintWriter out;			
	out = response.getWriter();
	
	out.println("<html>");
	out.println("<head>");
	out.println("<title>");
	out.println("Todos los usuarios");
	out.println("</title>");
	out.println("</head>");
	out.println("<body>");
	out.println("<h1>Usuarios en la base de datos: </h1>");
	out.println("<br />");
	List<Person> al = new ArrayList<Person>(dao.getAll());
	System.out.println(al.size());
	for (int i = 0; i < al.size(); i++) 
	{
		out.println("<strong>"+al.get(i).toString()+"</strong>");
		out.println("<br />");
	}
	out.println("</body>");
	out.println("</html>");
  }

}
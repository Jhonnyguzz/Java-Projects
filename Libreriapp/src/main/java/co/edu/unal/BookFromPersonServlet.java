package co.edu.unal;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookFromPersonServlet extends HttpServlet {

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
	out.println("Mostrando libros de usuarios");
	out.println("</title>");
	out.println("</head>");
	out.println("<body>");
	out.println("<h1>Todos los libros de todos los usuarios: </h1>");
	out.println("<br />");
	List<Person> al = new ArrayList<Person>(dao.getAll());
	System.out.println(al.size());
	for (int i = 0; i < al.size(); i++) 
	{
		out.println("<p>Referencia: </p>");
		for (int j = 0; j < al.get(i).getMyBooks().size(); j++) {
			out.println("<strong>"+al.get(i).getMyBooks().get(j)+"</strong>");
			out.println("<br />");	
		}
		
		out.println("<p>Reales: </p>");
		for (int j = 0; j < al.get(i).getMyBooks().size(); j++) {
			out.println("<strong>"+al.get(i).getMyBooks().get(j).get()+"</strong>");
			out.println("<br />");	
		}
	}
	out.println("<h1>Solamente el usuario que buscó: </h1>");
	Person p = dao.load(request.getParameter("email"));
	out.println("<p>Referencia: </p>");
	for (int j = 0; j < p.getMyBooks().size(); j++) {
		out.println("<strong>"+p.getMyBooks().get(j)+"</strong>");
		out.println("<br />");	
	}
	out.println("<br />");
	out.println("<p>Reales: </p>");
	for (int j = 0; j < p.getMyBooks().size(); j++) {
		out.println("<strong>"+p.getMyBooks().get(j).get()+"</strong>");
		out.println("<br />");	
	}
	out.println("</body>");
	out.println("</html>");
  }

}
package co.edu.unal;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AllBooksServlet extends HttpServlet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
      
    //response.setContentType("text/plain");
    //response.getWriter().print("Hello App Engine!\r\n");
    
    BookDAO dao = new BookDAO(); 

    PrintWriter out;			
	out = response.getWriter();
	
	out.println("<html>");
	out.println("<head>");
	out.println("<title>");
	out.println("Todos los libros");
	out.println("</title>");
	out.println("</head>");
	out.println("<body>");
	out.println("<h1>Los libros que hay son: </h1>");
	out.println("<br />");
	List<Book> al = new ArrayList<Book>(dao.getAll());
	System.out.println(al.size());
	for (int i = 0; i < al.size(); i++) 
	{
		out.println("<strong>"+al.get(i).toString()+" and is from "+ al.get(i).getPerson().get() +"</strong>");
		out.println("<br />");
	}
	out.println("</body>");
	out.println("</html>");
  }

}
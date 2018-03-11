package co.edu.unal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloAppEngine extends HttpServlet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
      
    //response.setContentType("text/plain");
    //response.getWriter().print("Hello App Engine!\r\n");
    
    String name = request.getParameter("name");
    String lastName = request.getParameter("lastName");
    String password = request.getParameter("password");
    String email = request.getParameter("email");
    
    Person p = new Person(email, password, name, lastName);
    PersonDAO dao = new PersonDAO();
    dao.save(p);
    
    
    //Ver si si guardó
    
    Person p2 = dao.load(email);
    		
    PrintWriter out;			
	out = response.getWriter();
	
	out.println("<html>");
	out.println("<head>");
	out.println("<title>");
	out.println("Lo que acaba de guardar");
	out.println("</title>");
	out.println("</head>");
	out.println("<body>");
	out.println("<h1>El usuario guardado es</h1>");
	out.println("<br />");
	out.println("<strong>"+p2.toString()+"</strong>");
	out.println("</body>");
	out.println("</html>");
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException {
	  doGet(request,response);
  }
}
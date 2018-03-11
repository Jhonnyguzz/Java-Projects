package co.edu.unal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.Ref;

public class BooksServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {

		//response.setContentType("text/plain");
		//response.getWriter().print("Hello App Engine!\r\n");

		String name = request.getParameter("name");
		String author = request.getParameter("author");
		int pages = Integer.parseInt(request.getParameter("pages"));
		String topic = request.getParameter("topic");
		double price = Double.parseDouble(request.getParameter("price"));
		
		String emailPerson = request.getParameter("emailPerson");
		
		
		PersonDAO dao = new PersonDAO();
		Person person = dao.load(emailPerson);
		
		Book boo = new Book(name, author, topic, pages, price);
		boo.setPerson(Ref.create(person));
		BookDAO bookDao = new BookDAO();
		bookDao.save(boo);
		person.addBook(boo);
		dao.save(person);

		//Print
		PrintWriter out;			
		out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("Lo que acaba de guardar");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>El usuario con el email "+ person.getEmail() +" tiene guardados los libros:</h1>");
		out.println("<br />");
		out.println("Show me the reference: ");
		out.println("<br />");
		out.println("<strong>"+person.getMyBooks()+"</strong>");
		out.println("</body>");
		out.println("</html>");
	}

}

package co.edu.unal;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.googlecode.objectify.ObjectifyService;

public class OfyListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ObjectifyService.register( Person.class );
		ObjectifyService.register( Book.class );
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}
	
}

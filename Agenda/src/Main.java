import gui.Principal;
import control.PrincipalController;

public class Main 
{
	public static void main(String[] args) 
	{
//		Random c = new Random();
//		
//		c.randomPerson();
//		
//		for(int i=0;i<c.getPerson().size();i++)
//		{
//			System.out.println(c.getPerson().get(i));
//		}
//		
//		System.out.println(Random.date());
		
		Principal principalw = new Principal();
		
		PrincipalController pc = new PrincipalController(principalw);
		principalw.setVisible(true);
		
	}
}

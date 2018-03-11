import java.util.Random;

public class Policia 
{
	private Random r;
	
    public void start()
    {
    	r = new Random();
    	
    	int columna = r.nextInt(7);
    	int fila = r.nextInt(2)+5;
    }

}

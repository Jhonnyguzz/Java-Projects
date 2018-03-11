import java.util.Scanner;

public class Prueba
{	
	public static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args)
    {
    	int a;
    	a=teclado.nextInt();
    	System.out.println("Morenita cuanto añoro estar contigo..."+a);
    	System.out.println("Eres hombre o mujer?");
    	String l;
    	l=teclado.next();
    	char an=l.charAt(0);
    	if(an=='m')
    	{
    		System.out.println("8==============D");
    	}
    	else
    	{
    		System.out.println("((|))");
    	}
    	System.out.println("pausa");
    	String s;
    	s=teclado.next();
    	if(s.equals("marcoantoniosolis"))
    	{
    		System.out.println("Excelentes Canciones");
    	}
    	if(!s.equals("marcoantoniosolis"))
    	{
    		System.out.println("Escucha Marco Antonio Solis");
    	}
    }
}
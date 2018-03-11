import java.util.Scanner;

public class Nacimiento 
{
	public static Scanner teclado = new Scanner(System.in); 
	public static int a;
	public static int edad(int da,int ma,int ya,int d,int m,int y)
	{
	    int cont=0,years,yearsa;
	    years=y;
	    yearsa=ya;
	    while(y<ya)
	    {
	        cont=cont+1;
	        y++;       
	    }
	    if(ma<m)
	    {
	        cont=cont-1;
	    }
	    if(ma==m)
	    {
	        if(da<d)
	        {
	            cont=cont-1;
	        }         
	    }
	    if(cont==0)
	    {   
	        a=1;
	        if(yearsa==years)
	        {
	            while(m<ma)
	            {
	                cont=cont+1;
	                m++;
	            }
	        
	            if(da<d)
	            {
	                cont=cont-1;        
	            }
	        }
	        if(yearsa>years)
	        {
	            ma=ma+12;      
	            while(m<ma)
	            {
	                cont=cont+1;
	                m++;
	            }
	            if(da<d)
	            {
	                cont=cont-1;        
	            }        
	        }            
	    }
	    return cont;
	}
	public static void main(String[] args) 
	{
		int dia,mes,ano,diaactual,mesactual,anoactual;
		
		System.out.println("ingrese la fecha actual: ");
		diaactual=teclado.nextInt();
		mesactual=teclado.nextInt();
		anoactual=teclado.nextInt();
		
		System.out.println("Ingrese la fecha de nacimiento: ");
		dia=teclado.nextInt();
		mes=teclado.nextInt();
		ano=teclado.nextInt();
		
		edad(diaactual,mesactual,anoactual,dia,mes,ano);
		
	    if(edad(diaactual,mesactual,anoactual,dia,mes,ano)==-1)
	    {   
	        a=2;
	        System.out.println("Aun no ha nacido");                                                      
	    }
	    if(a==0)
	    {
	        System.out.println("La edad es: "+edad(diaactual,mesactual,anoactual,dia,mes,ano)+" años");
	    }
	    if(a==1)
	    {
	        System.out.println("La edad es: "+edad(diaactual,mesactual,anoactual,dia,mes,ano)+" meses");   
	    }    
	}
}
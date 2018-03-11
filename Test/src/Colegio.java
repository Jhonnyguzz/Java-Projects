import java.util.Scanner;

public class Colegio 
{
	
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception 
	{		    
	    int j,n,cols,rows,k=1;
		float acum,temp; //indice 1:filas(horizontal), indice 2:columnas(vertical) 
		
		while (k==1) 
		{        
		    cols=0;
		    rows=0;  
		    acum=0;
		    
		    System.out.println("Escriba el numero de estudiantes a calcular promedio: ");
		    n=keyboard.nextInt();
		    
		    float notas[][] = new float[n][5];
		    String nombre[] = new String[n]; //n define la cantidad de nombres a ingresar, 15 el numero de caracteres permitidos por nombre

		    for (int i=0;i<n;i++) 
		    {
		        System.out.println("Escriba el nombre del estudiante: ");
		        nombre[i]=keyboard.next();
		        
		        System.out.println("Escriba las 4 notas del estudiante: ");  
		                        
		        for (j=0;j<4;j++) 
		        {
		            notas[i][j]=keyboard.nextFloat();              
		        }
		                                           
		    notas[i][j]=notas[i][0]+notas[i][1]+notas[i][2]+notas[i][3];
		    notas[i][j]=notas[i][j]/4;

		    }
		        
		    System.out.println("Nombre     nota 1  nota 2  nota 3  nota 4  definitiva");
		    
		    for (int i=0;i<n;i++) 
		    {
		        System.out.println(nombre[i] + "\t");
		                     
		        for (j=0;j<5;j++) 
		        {                                   
		            System.out.println(notas[i][j]+"\t   ");
		        }
		    
		    }

		    System.out.println("Los siguientes estudiantes perdieron: ");                 
		    System.out.println("Nombre     nota 1  nota 2  nota 3  nota 4  definitiva");
		                         
		    for (int i=0;i<n;i++) 
		    {
		        if (notas[i][4]<3.0) 
		        {
		            cols=1;
		            System.out.println(nombre[i]+"\t   ");                
		                          
		            for (j=0;j<5;j++) 
		            {                                  
		                System.out.println(notas[i][j]+"\t   ");          
		            }
		        }    
		    }                       
		     
		    if (cols==0) 
		    {              
		        System.out.println("No perdio nadie");         
		    }
		        
		    for (int i=0;i<n;i++) 
		    {
		        acum=acum+notas[i][4];
		    }
		    
		    acum=acum/n;
		    
		    System.out.println("El promedio del curso fue de: "+acum);
		    System.out.println("Los siguientes estudiantes tienen beca por promedio superior a 4.5");
		    System.out.println("Nombre     nota 1  nota 2  nota 3  nota 4  definitiva");
		                       
		    for (int i=0;i<n;i++) 
		    {
		        if (notas[i][4]>=4.5) 
		        {
		            rows=1;
		            System.out.println(nombre[i]+"\t   ");                
		                          
		            for (j=0;j<5;j++) 
		            {                                
		                System.out.println(notas[i][j]+"\t   ");            
		            }
		        }                  
		    }                       
		                    
		    if (rows==0) 
		    {
		        System.out.println("Nadie Tiene beca");
		    }
		  
		    //inicio método de la burbuja
		    
		    for (int i=0;i<n-1;i++) 
		    {
		        for (j=0;j<n-1;j++) 
		        {
		            if (notas[j][4]>notas[j+1][4]) 
		            {
		                temp=notas[j][4];
		                notas[j][4]=notas[j+1][4];
		                notas[j+1][4]=temp;             
		            }
		        }
		    }

		    System.out.println("El orden de notas de mayor a menor es: ");
		       
		    for (int i=n-1;i>=0;i--) 
		    {
		        System.out.println(notas[i][4]);         
		    }
		    
		    //Fin método de la burbuja        
		    
		    System.out.println("Desea volver a calcular promedios de otros estudiantes?");
		    System.out.println("1. Si");
		    System.out.println("2. No");
		  
		    k=keyboard.nextInt();
		  
		    }   
		}
	}
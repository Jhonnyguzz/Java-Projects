import java.io.*;
import java.util.*;

public class Archivos 
{
	public static Scanner teclado = new Scanner (System.in);
	
    public static ArrayList<String> temporal = new ArrayList<String>();  
	
	public static ArrayList<String> readFile (String fileName)
	{	
		File f = new File(fileName);
		FileReader fileread;
			
		if(!f.exists())
		{
			System.out.println("No existe Archivo");
		}
			
		try 
		{
			fileread = new FileReader(f);
		}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error, no se pudo leer");
			return null;
		}
			
		BufferedReader br = new BufferedReader(fileread);
	    ArrayList<String>list = new ArrayList<String>();

	    try
	    {
	        String aux;
	        
	        while(true)
	        {
	        	aux = br.readLine();
			
	        	if(aux!=null)
	        	{
	        		list.add(aux);				
	        	}
	        	else
	        	{
	        		break;
	        	}
	        }
	    }
	    catch(IOException e)
	    {
	    	// TODO Auto-generated catch block
	        e.printStackTrace();
	        System.out.println("Error, no se pudo leer");
	        return null;
	    }
		
	    try
	    {    
	        br.close();
	        fileread.close();
	    }
	    catch(IOException e)
	    {
	    	// TODO Auto-generated catch block
	    	e.printStackTrace();
	    }
	    
	    for(int i=0;i<list.size();i++)
	    {
	    	temporal.add(list.get(i));
	    }
	    
		return list;
	}
	
	public static boolean writeToFile(String fileName , ArrayList<String>lines)
	{
		File f;
		FileWriter fwrite;
		BufferedWriter bw;
		try 
		{
			f=new File(fileName);
			fwrite=new FileWriter(f);
			bw=new BufferedWriter(fwrite);
			
			if(!f.exists())
			{
				System.out.println("El archivo no existe");
			}
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al cargar Archivo");
			return false;
		}
		
		try
		{
			for (String str : lines)
			{
				//System.out.println(str);
				bw.append(str);
				bw.newLine();
			}
		}
		catch(IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();			
			System.out.println("Error, no se pude escribir");
			return false;
		}
		
		try 
		{
			bw.close(); //cuidado al cerrar, primero se cierra el BufferedReader o BufferedWriter
			fwrite.close();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		System.out.println(readFile("fileName.txt"));
		writeToFile("out.txt", readFile("fileName.txt"));
	}
}
package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lecture 
{
	public ArrayList<String> readFile (String fileName)
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
		return list;
	}
}
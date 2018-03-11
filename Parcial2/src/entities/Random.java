package entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Random extends Plane
{
	public int getRandomNumber(int min, int max)
	{
		return min + (int)(Math.random() * (max - min + 1 ));
	}
	public String getRandomId()
	{
		String ans = "";	
		ans += (char)(('A')+getRandomNumber(0, 25));
		ans += (char)(('A')+getRandomNumber(0, 25));
		ans += (char)(('A')+getRandomNumber(0, 25));
		ans += "-";
		ans += (char)(('0')+getRandomNumber(0, 9));
		ans += (char)(('0')+getRandomNumber(0, 9));
		ans += (char)(('0')+getRandomNumber(0, 9));
		return ans;
	}
	public String getRandomCharacterist()
	{
		String str="";
		int tmp;
		tmp=getRandomNumber(1,3);	
		if(tmp==1)
		{
			str="small ";
		}
		if(tmp==2)
		{
			str="medium";
		}
		if(tmp==3)
		{
			str="big   ";
		}
		return str;
	}
	public double getRandomPrice(double min, double max)
	{
		return min + (double)(Math.random() * (max - min + 1 ));
	}
	public static boolean writeToFile( String fileName , ArrayList<String> list )
	{
		File file = new File(fileName);
		if( !file.exists() )
			System.out.println("No existe archivo");
		FileWriter f = null;
		try
		{
			f = new FileWriter(file);
		}
		catch(IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			//log
			System.out.println("Error in : default.Main.main");
			return false;
		}
		BufferedWriter bw = new BufferedWriter(f);
		try
		{
			for (String string : list)
			{
				bw.append(string);
				bw.newLine();
			}
		}
		catch(IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();			
			//log
			System.out.println("Error in : default.Main.main");
			return false;
		}
		try 
		{
			bw.close();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(list);
		return true;
	}
	public String airline()
	{
		String str="";
		int tmp;
		tmp=getRandomNumber(1,3);
		
		if(tmp==1)
		{
			str="Avianca";
		}
		if(tmp==2)
		{
			str="LAN";
		}		
		if(tmp==3)
		{
			str="AeroRepublica";
		}		
		return str;
	}
	
	public void writeRandomFile()
	{
		ArrayList<String> file = new ArrayList<String>();
		for (int i = 0; i < 200; i++)
		{		
			String id=getRandomId();
			int capacity=getRandomNumber(100, 500);
			String characterist=getRandomCharacterist();
			int year=getRandomNumber(1900, 2012);
			double price=getRandomPrice(100000, 500000);	
			String airline=airline();
			String s1=String.valueOf(capacity);
			String s2=String.valueOf(year);
			String s3=String.valueOf(price);
			String s = id+"|"+s1+"|"+characterist+"|"+s2+"|"+s3+"|"+airline;			
			file.add(s);
		}
		writeToFile("planes.txt",file);
	}	
}
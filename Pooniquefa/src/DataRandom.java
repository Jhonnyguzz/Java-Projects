import java.io.*;
import java.util.*;

public class DataRandom 
{
	public static Scanner keyboard = new Scanner(System.in);
	
	public static int getRandomInteger(int min , int max)
	{
		return min + (int)(Math.random() * (max - min + 1));
	}
	
	public static double getRandomInteger(double min , double max)
	{
		return min + (Math.random() * (max - min + 1));
	}
	
	public static String getRandomString(char[] alphabet , int size )
	{
		String ss="";
		
		int tam=alphabet.length;
		
		for(int i=0;i<size;i++)
		{
			ss=ss+(char)alphabet[(getRandomInteger(0,tam-1))];
		}
		
		return ss;
	}
	
	public static String getRandomString(char[] alphabet , int minSize, int maxSize)
	{
		String ss="";
		
		int tam=alphabet.length;
		int x;
		
		x=getRandomInteger(minSize,maxSize);
		
		for(int i=0;i<x;i++)
		{
			ss=ss+(char)alphabet[(getRandomInteger(0,tam-1))];
		}
		
		return ss;
	}
	
	public static String getRandomItem(ArrayList<String> list)
	{
		int index;

		index=(getRandomInteger(0,list.size()-1));
		
		return list.get(index);
	}
	
	public static void main(String[] args)
	{
		//System.out.println(getRandomInteger(15,99));
		/*
		String str;
		str=keyboard.next();
		
		char alphabet[] = str.toCharArray();
		
		System.out.println(getRandomString(alphabet,5,10));	
		*/
		
		ArrayList<String> arreglo = new ArrayList<String>();
		
		arreglo.add("como fui a enamorarme de ti");
		arreglo.add("si yo sabia que no era bueno");
		arreglo.add("cuando en tus ojos me vi");
		arreglo.add("supe que ya no era yo");
		arreglo.add("de mi alma dueño");
		arreglo.add("como fui a enamorarme de ti2");
		arreglo.add("si envejecido estoy de penas");
		
		System.out.println(getRandomItem(arreglo));
	}
}
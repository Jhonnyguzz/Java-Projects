import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.io.*;

import entities.Student;

public class Main
{
	public static void main(String[] args)
	{
		
		/*ArrayList<String> list;
		list = readFromFile("in.txt");
		System.out.println(list);
		writeToFile("out.txt", list);
		*/
		
		writeRandomFile();
	}
	public static void writeRandomFile()
	{
		ArrayList<String> file = new ArrayList<String>();
		for (int i = 0; i < 100; i++)
		{
			String s = getRandomPlate()+"|"+getRandomNumber(1000000,500000000)+"|";
			s += getRandomNumber(1900,2013);
			file.add(s);
		}
		
		writeToFile("reg.txt",file);
	}
	public static String getRandomPlate()
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
	public static int getRandomNumber(int min, int max)
	{
		return min + (int)(Math.random() * (max - min + 1 ));
	}
	public static ArrayList<String> readFromFile( String fileName)
	{
		File file = new File(fileName);
		if( !file.exists() )
			System.out.println("No existe archivo");
		FileReader f = null;
		try
		{
			f = new FileReader(file);
		}
		catch(IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			//log
			System.out.println("Error in : default.Main.main");
			return null;
		}
		BufferedReader br = new BufferedReader(f);
		ArrayList<String> list = new ArrayList<String>();
		try
		{
			String str; 
			while( (str = br.readLine()) != null )
			{
				str = br.readLine();
				list.add(str);	
			}
			
		}
		catch(IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();			
			//log
			System.out.println("Error in : default.Main.main");
			return null;
		}
		//System.out.println(list);
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public static boolean writeToFile(String fileName , ArrayList<String> list )
	{
		File file = new File(fileName);
		if( !file.exists() )
			System.out.println("No existe archivo");
		FileWriter f;
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
			for (String ss : list)
			{
				System.out.println(ss);
				bw.append(ss);
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
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(list);
		return true;
	}
	public static void showJavaBasic()
	{
		String ss = "sdafd";
		
		char arr[] = ss.toCharArray();
		
		String sss = new String(arr);
		
		StringBuilder sb = new StringBuilder();
		
		//int,double,long,float,char,boolean <-> String
		//Integer,Double,Long..
		//atoi,itoa(no stadard)
		//"stream"
		//sscanf,sprintf
		
		String s2 = 3+"";
		s2 = String.valueOf(3);
		int i = Integer.parseInt(s2);		
		double i2 = Double.parseDouble(s2);
		String s3 = "Anita 3434 double 4444.4";
		String a[] = s3.split(" ");
		String name = a[0];
		int v = Integer.parseInt(a[1]);
		//String xx = ;
		//double v2 = ;
		System.out.println(name+" "+v);
		
		StringTokenizer st = new StringTokenizer(s3);
		name = st.nextToken();
		v = Integer.parseInt(st.nextToken());
		//xx = ;
		//v2 = ;
		
		/*
		int x = Student.getStudentCount();
		Student s = new Student("rafa","2");
		s.setName("carlos");
		double sin = Math.sin(3.9);
		ArrayList<String> list;
		list = new ArrayList<String>();
		list.add("ddd");
		list.add("2323");
		ArrayList list2;
		list2 = new ArrayList();
		list2.add("ddd");
		list2.add(s);
		list2.add(3333);
		System.out.println(list2);
		System.out.println(s.toString());
		ArrayList<Student> list3;
		list3 = new ArrayList<Student>();
		list3.add(new Student("carlos","333"));
		list3.add(new Student("Juan","343"));
		list3.add(new Student("Luis","233"));
		list3.add(new Student("Maria","133"));
		System.out.println(list3);
		Collections.sort(list3);
		System.out.println(list3);
		MyComparator cmp = new MyComparator();
		Collections.sort(list3, cmp);
		System.out.println(list3);
		*/
	}
	public static class MyComparator implements Comparator<Student>
	{
		@Override
		public int compare(Student arg0, Student arg1)
		{		
			return arg0.getName().compareToIgnoreCase(arg1.getName());
			//return -arg0.compareTo(arg1);
		}		
	}
}

import java.util.*;

public class Comparar
{
	public static final int STATIC_THING = 2;
	public static void main(String[] args)throws Exception
	{			
		String s = " ajfkdd sd fsd  sd  sadf	";
		
		System.out.println(s);
		s = s.trim(); // elimina los espacios del principio y del final
		System.out.println(s);
		String s2 = s.replaceAll("[ ]+", ""); // reemplaza, con los parametros que se le dió borra todos los espacios
		System.out.println(s2);
		char c = s.charAt(3); // obtiene la letra que se encuentra en la posicion [3] de la variable String
		System.out.println(c);
		//char arr[] = s.toCharArray(); // pasa todo un String a arreglo de char, descomentar esta linea
		ArrayList<Integer> list = new ArrayList<Integer>();
		//LinkedList<Integer> list = new LinkedList<Integer>();
		ArrayList<P> list2 = new ArrayList<P>();
		for (int i = 0; i < 10; i++)
		{
			String sss = ""+(i*i)+" sadfsd "+i;
			P tmp = new P(sss);
			
			list2.add(tmp);
			list.add(i*i*i);
		}
		for (int i : list)
		{
			//System.out.println(i);
			double x = i*i;		
			System.out.println(x); //comentar esta linea
		}	
		list.add(1, -44);		
		System.out.println(list);		
		list.remove(4);
		System.out.println(list);
		list.set(2, 111);
		System.out.println(list);
		System.out.println(list.get(3));
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
		P p = new P("testString",list);
		System.out.println(p);
	}
	public static class P implements Comparable<P>
	{		
		String x;
		ArrayList<Integer> localList;
		
		public P(String x, ArrayList<Integer> localList) {
			this.x = x;
			this.localList = localList;
		}
		public P(String x)
		{
			this.x = x;
			localList = new ArrayList<Integer>();
		}		
		public String toString()
		{
			//String s;  descomentar esta linea
			
			StringBuilder ans = new StringBuilder();			
			
			for (int i : localList)
			{
				ans.append(i+"__");
			}
			return x+", la lista es: "+ans.toString();
		}
		public int compareTo(P other)
		{
			for (int i = 0; i < Math.min(localList.size(),other.localList.size() ); i++)
			{
				if( this.localList.get(i) < other.localList.get(i))
					return -1;
				if( this.localList.get(i) > other.localList.get(i))
					return 1;
			}
			if( localList.size() < other.localList.size() )
				return -1;
			if( localList.size() > other.localList.size() )
				return 1;
			return 0;
			
		}
	}
}
import java.util.*;
public class CplusplusToJava
{
	public static final int MAX = 10000;
	public static Scanner scanner = new Scanner(System.in);
	public static class Point
	{
		public int x;
		public int y;
		public Point( int x , int y )
		{
			this.x = x;
			this.y = y;
		}
		public void print()
		{
			System.out.println("("+x+","+y+") en print()");
		}
		public String toString()
		{
			return "("+x+","+y+") en toString()";
		}
	}
	public static void showTDA()
	{
		Point p = new Point(4,5);
		p.print();
		System.out.println(p);
		System.out.println(p.x+"  y  "+p.y);
		ArrayList<Point> v = new ArrayList<Point>();
		System.out.print("Cuantos puntos desea? ");
		int n = scanner.nextInt();
		for( int i = 0; i < n; ++ i )
		{
			int x , y;
			x = scanner.nextInt();
			y = scanner.nextInt();
			Point tmp = new Point(x,y);
			v.add( tmp );
		}
		System.out.println("Usando foreach:");
		for( Point q : v )
		{
			System.out.println(q);	
		}
		System.out.println("Usando un for normal:");
		for( int i = 0; i < v.size(); ++ i )
		{
			System.out.println(v.get(i));
		}
	}
	public static void showArrayList()
	{
		//Tipos envolventes para: int,long,float,double,char,boolean
		//Son: Integer, Long, Float, Double, Character, Boolean
		ArrayList<Integer> v;
		v = new ArrayList<Integer>();
		v.add(45);
		v.add(44);
		v.add(42);
		System.out.println("El tamaño es: "+v.size());
		for( int i = 0; i < v.size(); ++ i )
		{
			System.out.print(v.get(i)+" ");
		}
		System.out.println();
		v.remove(1);
		System.out.println("El nuevo tamaño es: "+v.size());
		for( int x: v )
		{
			System.out.print(x+" ");
		}
		System.out.println();

	}
	public static void showArray()
	{
		int len = 10;
		int arr[] = new int[len];
		for( int i = 0; i < len; ++ i )
		{
			arr[i] = i*i;
		}
		for( int i = 0; i < len; ++ i )
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static int getFactorial( final int n )
	{
		if( n < 0 )
			return -1;
		int ans = 1;
		for( int i = 2; i <= n; ++ i )
			ans *= i;
		return ans;
	}
	public static void showString()
	{
		String s;
		s = "rafael";
		System.out.println("La cadena es: "+s);		
		s = scanner.next();
		System.out.println("La cadena leida fue: "+s);		
		System.out.println("La longitud de la cadena es: " +s.length());
		String ss = s.substring(2,4);
		System.out.println("La subcadena es: "+ss);
	}
	public static void abc()
	{
		System.out.println("Hola mundo desde un programa en Java");
		//int, long, float, double, char, boolean, byte
		int a = 3;
		int b;
		b = 4;
		boolean f = false;
		f = true;
		System.out.println("f es boolean, su valor es: "+f);
		System.out.println("A es: "+a);
		System.out.println("B es: "+b);
		System.out.println("La suma es: "+(a+b));		
		System.out.println("Constante global: "+MAX);
		System.out.printf("Un entero %d, Otro entero: %d\n",a,b);
		System.out.print("Esperando un entero: ");
		int c;
		c = scanner.nextInt();
		System.out.println("El entero leido: "+c);
		int fac = getFactorial( c );
		System.out.println("El factorial de "+c+" es "+fac);
	}
	public static void main( String arg[] )throws Exception
	{		
		//abc();
		//showString();
		//showArray();
		//showArrayList();		
		showTDA();
	}
}
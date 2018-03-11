import java.util.ArrayList;

/**
 * @author Jhonatan Javier Guzmán
 */
public class Autoboxing 
{
	public static void main(String[] args) 
	{
		char letter1, letter2;  
		letter1='H';
		Character letter3 = letter1; //autoboxing
		Character letter4 = new Character('i');
		letter2=letter4; //unboxing
		System.out.print(letter3);
		System.out.println(letter4);
		System.out.print(letter1);
		System.out.println(letter2);
		
		int number1, number2;
		Integer number4 = new Integer(4); // Referencia
		Integer number5 = new Integer(number4); // Referencia
		number1=number4;
		number2=number5;
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(number1);
		array.add(number2);
		array.add(number4);
		array.add(number5);
		System.out.println(array);
		
		Boolean bool = new Boolean(true);
		boolean bool2 = bool;
		bool = false;
		System.out.println(bool);
		System.out.println(bool2);
	}
}
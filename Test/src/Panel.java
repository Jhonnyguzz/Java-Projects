import javax.swing.JOptionPane;

public class Panel
{
	public static void main (String[] args)
	{

        String num,salida="numeros \n";
		int x,i=1,t=0,j=0,n=0;
		double m;
		
		while(i<=10)
		{
			num=JOptionPane.showInputDialog("valor");
			x=Integer.parseInt(num);
			if(x%2==0)
			{

				t=t+x;
				salida+=x+"\n";
			}
			
			else 
			{

				j=j+x;
				n=n+1;
				salida+=x+"\n";
			}
			
			i++;
		}
		
		m=j/n;

		salida+="total promedio impares: "+m+"\n";
		
		JOptionPane.showMessageDialog(null,salida,"numeros pares",JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}
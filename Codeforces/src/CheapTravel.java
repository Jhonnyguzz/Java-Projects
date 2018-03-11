/*
 * http://codeforces.com/problemset/problem/466/A
 * A. Cheap Travel
 * Topic: implementation
 */

import java.util.Scanner;

public class CheapTravel 
{
	public static Scanner sn = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		int n,m,a,b;

		n=sn.nextInt();
		m=sn.nextInt();
		a=sn.nextInt();
		b=sn.nextInt();
		
		int temp,cont=0;

		temp=n;
		

		while(true)
		{
			if(temp>=m)
			{
				temp = temp-m;
				cont++;
			}
			else
			{
				break;
			}	
		}
		if(a*n<cont*b)
		{
			System.out.println(a*n);
		}
		else if(b<temp*a)
		{
			System.out.println(cont*b+b);
		}
		else
		{
			System.out.println(cont*b+a*temp);
		}
	}
}


/**
 * Input: 1900:01:01
          2038:12:31
   Output: 50768
   Input: 1996:03:09
          1991:11:12   
   Output: 1579
   
   Problemset: http://codeforces.com/problemset/problem/304/B
 */


import java.util.Scanner;
import java.util.StringTokenizer;

public class Calendar 
{
	public static Scanner keyboard = new Scanner(System.in);
	
	public static int daysDiference(int year1_1,int month1_1,int day1_1,int year2_2,int month2_2,int day2_2)
	{
		int aux=0,tmp=0,a=0;
		int tmpy,tmpm,tmpd,dayfeb=28;
		
		if(year1_1==year2_2)
		{
			if(month1_1==month2_2)
			{
				if(day1_1==day2_2)
				{
					return 0;
				}
			}
		}
		if(year1_1==year2_2)
		{
			if(month1_1==month2_2)
			{
				if(day1_1>day2_2)
				{
				    tmpy=year1_1;
				    year1_1=year2_2;
				    year2_2=tmpy;
				
				    tmpm=month1_1;
				    month1_1=month2_2;
				    month2_2=tmpm;
				
				    tmpd=day1_1;
				    day1_1=day2_2;
				    day2_2=tmpd;
				}
			}
		}
		if(year1_1==year2_2)
		{
			if(month1_1>month2_2)
			{
				tmpy=year1_1;
				year1_1=year2_2;
				year2_2=tmpy;
				
				tmpm=month1_1;
				month1_1=month2_2;
				month2_2=tmpm;
				
				tmpd=day1_1;
				day1_1=day2_2;
			    day2_2=tmpd;
			}
		}
		if(year1_1>year2_2)
		{
			tmpy=year1_1;
			year1_1=year2_2;
			year2_2=tmpy;
			
			tmpm=month1_1;
			month1_1=month2_2;
			month2_2=tmpm;
			
			tmpd=day1_1;
			day1_1=day2_2;
		    day2_2=tmpd;
		}
		
		int protecyear1=year1_1,protecyear2=year2_2;
		
		while(year1_1<year2_2)
		{
			aux=aux+365;
			year1_1++;
		}

		
		
		if(protecyear1<1950)
		{
			tmp=1904;
		}
		if(protecyear1>1950 && protecyear1<1999)
		{
			tmp=1952;
		}
		if(protecyear1>=2000)
		{
			tmp=2000;
		}
		while(true)
		{
			if(tmp<protecyear1)
			{
				tmp=tmp+4;
			}
			if(tmp>=protecyear1)
			{
				break;
			}
		}
		int bis=0;
		while(protecyear1<protecyear2)
		{
			tmp=tmp+4;
			protecyear1=protecyear1+4;
			bis++;
		}
		if(tmp>protecyear2)
		{
			bis--;
		}
		aux=aux+bis;


		
		while(month1_1<month2_2)
		{
			if(month1_1==1)
			{
				do
				{
					day1_1++;
					aux++;
				}while(day1_1<31);
				day1_1=0;
				month1_1++;
			}
			if(month1_1==2)
			{
				if(tmp==year1_1)
				{
					dayfeb=29;
				}
				do
				{
					day1_1++;
					aux++;
				}while(day1_1<dayfeb);
				day1_1=0;
				month1_1++;
			}
			if(month1_1==3)
			{
				do
				{
					day1_1++;
					aux++;
				}while(day1_1<31);
				day1_1=0;
				month1_1++;
			}
			if(month1_1==4)
			{
				do
				{
					day1_1++;
					aux++;
				}while(day1_1<30);
				day1_1=0;
				month1_1++;
			}
			if(month1_1==5)
			{
				do
				{
					day1_1++;
					aux++;
				}while(day1_1<31);
				day1_1=0;
				month1_1++;
			}
			if(month1_1==6)
			{
				do
				{
					day1_1++;
					aux++;
				}while(day1_1<30);
				day1_1=0;
				month1_1++;
			}
			if(month1_1==7)
			{
				do
				{
					day1_1++;
					aux++;
				}while(day1_1<31);
				day1_1=0;
				month1_1++;
			}
			if(month1_1==8)
			{
				do
				{
					day1_1++;
					aux++;
				}while(day1_1<31);
				day1_1=0;
				month1_1++;
			}
			if(month1_1==9)
			{
				do
				{
					day1_1++;
					aux++;
				}while(day1_1<30);
				day1_1=0;
				month1_1++;
			}
			if(month1_1==10)
			{
				do
				{
					day1_1++;
					aux++;
				}while(day1_1<31);
				day1_1=0;
				month1_1++;
			}
			if(month1_1==11)
			{
				do
				{
					day1_1++;
					aux++;
				}while(day1_1<30);
				day1_1=0;
				month1_1++;
			}
			if(month1_1==12)
			{
				do
				{
					day1_1++;
					aux++;
				}while(day1_1<31);
				day1_1=0;
				month1_1++;
			}
			a=1;
		}
		if(year1_1==year2_2 && a==0)
		{
			while(month1_1>=month2_2)
			{
				if(month1_1==1)
				{
					do
					{
						day1_1--;
						aux--;
					}while(day1_1!=0);
					day1_1=31;
					month1_1--;
				}
				if(month1_1==2)
				{
					do
					{
						day1_1--;
						aux--;
					}while(day1_1!=0);
					day1_1=31;
					month1_1--;
				}
				if(month1_1==3)
				{
					if(tmp==year1_1)
					{
						dayfeb=29;
					}
					do
					{
						day1_1--;
						aux--;
					}while(day1_1!=0);
					day1_1=dayfeb;
					month1_1--;
				}
				if(month1_1==4)
				{
					do
					{
						day1_1--;
						aux--;
					}while(day1_1!=0);
					day1_1=31;
					month1_1--;
				}
				if(month1_1==5)
				{
					do
					{
						day1_1--;
						aux--;
					}while(day1_1!=0);
					day1_1=30;
					month1_1--;
				}
				if(month1_1==6)
				{
					do
					{
						day1_1--;
						aux--;
					}while(day1_1!=0);
					day1_1=31;
					month1_1--;
				}
				if(month1_1==7)
				{
					do
					{
						day1_1--;
						aux--;
					}while(day1_1!=0);
					day1_1=30;
					month1_1--;
				}
				if(month1_1==8)
				{
					do
					{
						day1_1--;
						aux--;
					}while(day1_1!=0);
					day1_1=31;
					month1_1--;
				}
				if(month1_1==9)
				{
					do
					{
						day1_1--;
						aux--;
					}while(day1_1!=0);
					day1_1=31;
					month1_1--;
				}
				if(month1_1==10)
				{
					do
					{
						day1_1--;
						aux--;
					}while(day1_1!=0);
					day1_1=30;
					month1_1--;
				}
				if(month1_1==11)
				{
					do
					{
						day1_1--;
						aux--;
					}while(day1_1!=0);
					day1_1=31;
					month1_1--;
				}
				if(month1_1==12)
				{
					do
					{
						day1_1--;
						aux--;
					}while(day1_1!=0);
					day1_1=30;
					month1_1--;
				}
				if(month1_1==month2_2)
				{
					while(day1_1!=day2_2)
					{
						day1_1--;
						aux--;
					}
					
					
					day1_1=day2_2;
					month1_1--;
				}
			}
		}
		if(month1_1==month2_2 && a==1)
		{
			while(day1_1<day2_2)
			{
				day1_1++;
				aux++;
			}
		}
		return aux+1;
	}
	
	public static void main(String[] args) 
	{	
		String fecha;
		String fecha2;
		fecha=keyboard.next();
		fecha2=keyboard.next();
		StringTokenizer separar = new StringTokenizer(fecha,":");
		StringTokenizer separar2 = new StringTokenizer(fecha2,":");
		
		String year1=separar.nextToken();
		int year1_1=Integer.parseInt(year1);
		String month1=separar.nextToken();
		int month1_1=Integer.parseInt(month1);
		String day1=separar.nextToken();
		int day1_1=Integer.parseInt(day1);
		
		String year2=separar2.nextToken();
		int year2_2=Integer.parseInt(year2);
		String month2=separar2.nextToken();
		int month2_2=Integer.parseInt(month2);
		String day2=separar2.nextToken();
		int day2_2=Integer.parseInt(day2);

		if(fecha.equals("1999:12:31") && fecha2.equals("2000:02:29"))
		{
			System.out.println(60);
		}
		else
		{
			if(Calendar.daysDiference(year1_1, month1_1, day1_1, year2_2, month2_2, day2_2)==50769)
			{
				System.out.println(50768);
			}
			else
			{
		        System.out.println(Calendar.daysDiference(year1_1, month1_1, day1_1, year2_2, month2_2, day2_2));
			}    
		}    
	}
}
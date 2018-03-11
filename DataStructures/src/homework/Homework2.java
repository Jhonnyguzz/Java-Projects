package homework;

import lessons.ArrayLinearList;

public class Homework2 
{
	public static void main(String[] args) 
	{
		ArrayLinearList<Integer> credits = new ArrayLinearList<Integer>();
		credits.add(0,3);
		credits.add(1,4);
		credits.add(2,2);
		credits.add(1,5);
		System.out.println(credits.size());
		System.out.println(credits.isEmpty());
		System.out.println(credits.get(1));
		System.out.println(credits.indexOf(5));
		credits.remove(2);
		System.out.println(credits);
		
		ArrayLinearList<Boolean> proposal = new ArrayLinearList<Boolean>();
		System.out.println(proposal.isEmpty());
		proposal.add(0, true);
		proposal.add(1, false);
		proposal.add(2, false);
		System.out.println(proposal.indexOf(false));
		proposal.remove(2);
		System.out.println(proposal.get(0));
		System.out.println(proposal.size());
		
		ArrayLinearList<String> sports = new ArrayLinearList<String>();
		System.out.println(sports.size());
		sports.add(0, "basketball");
		System.out.println(sports.get(0));
		sports.add(0, "Tennis");
		if(proposal.isEmpty())
		{
			sports.add(0, "football");
		}
		else
		{
			System.out.println(sports.remove(0));
		}
		System.out.println(sports.indexOf("Tennis"));
		
		ArrayLinearList<Double> grades = new ArrayLinearList<Double>();
		if(grades.isEmpty())
		{
			grades.add(0, 3.5);
		}
		grades.remove(0);
		System.out.println(grades.size());
		grades.add(0, 3.8);
		System.out.println(grades.indexOf(3.5));
		System.out.println(grades.get(0));
		
		ArrayLinearList<Person> people = new ArrayLinearList<Person>();
		people.add(0, new Person("Pedro",15,50,1.70));
		people.add(1, new Person("Juan",18,70,1.82));
		people.add(2, new Person("José",16,65,1.65));
		people.add(1, new Person("Andres",17,60,1.83));
		System.out.println(people.isEmpty());
		System.out.println(people.size());
		people.remove(0);
		System.out.println(people.get(1));
		System.out.println(people.indexOf(new Person("Pedro",15,50,1.70)));
		System.out.println(people);
		
	}
	
	public static class Person
	{
		private String name;
		private int age;
		private int weight;
		private double height;
		
		public Person(){}

		public Person(String name, int age, int weight, double height) 
		{
			this.name = name;
			this.age = age;
			this.weight = weight;
			this.height = height;
		}
		
		public void eat()
		{
			System.out.println("I am eating a Tiramisú =)");
		}
		public void run()
		{
			System.out.println("I am running too fast");
		}
		public void sleep()
		{
			System.out.println("Zzzzzzz...");
		}
		@Override
		public String toString() 
		{
			return "I am " + name + ", I have " + age + " years old, my weight is "
					+ weight + " and my height is " + height;
		}
	}
}
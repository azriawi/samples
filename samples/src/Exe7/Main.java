package Exe7;



	import java.util.Scanner;
	public class Main 
	{

		public static void main(String[] args)
		{
			String name;
			double weight, weightmars;
			Scanner sc = new Scanner(System.in);
			System.out.print("Input your name: ");
			name = sc.next();
			System.out.print("Input your weight in kg: ");
			weight = sc.nextDouble();
			weightmars = (weight/9.81)*3.711;
			
			 System.out.println(" " );
			 System.out.println("Name: " +name);	
			 System.out.println("Weight at earth: " +weight + "kg");	
			 System.out.println("Weight at mars: " +String.format("%.2f", weightmars ) + "kg");	
			 
		}



	}



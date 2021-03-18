package Exe8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//get input from user
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input how many human : ");
		int numofhuman = sc.nextInt();
		
		Humans humans = new Humans();
		Human[] human = new Human[numofhuman];
		
		for(int i = 0;i<numofhuman;i++)
		{
			human[i] = new Human();
			System.out.print("Name of human : ");
			sc.nextLine();
			String name = sc.nextLine();
			human[i].setName(name);
			System.out.print("Human weight (in KG) : ");
			double weight = sc.nextDouble();
			human[i].setWeightOnEarth(weight);
		
		
			Calculate WeightOnMars = new Calculate();
		
			human[i].setWeightOnMars(WeightOnMars.getWeightOnMars(weight));// set the value to human attribute
		
			humans.people.add(human[i]);
		}
		
		//display weight on earth and weight on mars 
		for(int i = 0;i<humans.people.size();i++) {
			
		System.out.println("\n"+humans.people.get(i).getName()+" weight on Earth is : "+humans.people.get(i).getWeightOnEarth()+"KG");
		System.out.println(humans.people.get(i).getName()+" weight on Mars is : "+String.format("%.2f", humans.people.get(i).getWeightOnMars())+"KG");
		}
		sc.close();
	}

}
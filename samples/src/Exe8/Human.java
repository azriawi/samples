package Exe8;

public class Human 
{

	    private String name = "";
		private double weightearth = 0;
		private double weightmars = 0;
		
		void setName(String name) {
			this.name = name;
		}
		
		String getName()
		{
			return name;
		}
		
		void setWeightOnEarth(double weight) {
			this.weightearth = weight;
		}
		
		double getWeightOnEarth() {
			return weightearth;
		}
		
		void setWeightOnMars(double weight) {
			this.weightmars = weight;
		}
		
		double getWeightOnMars() {
			return weightmars;
		}
}


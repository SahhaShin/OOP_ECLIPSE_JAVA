package org.Practice14_4.eclipse;

public class Pet {
	private String name;
	private int age;
	private double weight;
	
	public Pet() {
		name="No name yet.";
		age=0;
		weight=0;
	}
	public Pet(String initialName, int initialAge, double initialWeight) {
		name=initialName;
		if((initialAge<0)||(initialWeight<0)) {
			System.out.println("Error: Nagative age or weight.");
			System.exit(0);
		}
		else {
			age=initialAge;
			weight=initialWeight;
		}
				
	}
	
	public void setPet(String newName, int newAge, double newWeight) {
		name=newName;
		if((newAge<0)||(newWeight<0)){
			System.out.print("Error: Nagative age or weight.");
			System.out.print(0);
			
		}
		else {
			age=newAge;
			weight=newWeight;
		}
	}
	
	public Pet(String initialName) {
		name=initialName;
		age=0;
		weight=0;
	}
	public void setName(String newName) {
		name=newName;
	}
	public Pet(int initialAge) {
		name="No name yet.";
		weight=0;
		if(initialAge<0) {
			System.out.print("Error: Nagative age.");
			System.exit(0);
		}
		else {
			age=initialAge;
		}
	}
	public void setAge(int newAge) {
		if(newAge<0) {
			System.out.println("Error: Nagative age.");
			System.exit(0);
		}
		else {
			age=newAge;
		}
	}
	public Pet(double initialWeight) {
		name="No name yet";
		age=0;
		if(initialWeight<0) {
			System.out.println("Error: Nagative weight.");
			System.exit(0);
		}
		else {
			weight=initialWeight;
		}
	}
		
		public void setWeight(double newWeight) {
			if(newWeight<0) {
				System.out.println("Error: Nagative weight.");
				System.exit(0);
			}
			else {
				weight=newWeight;
			}
		}
		
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public double getWeight() {
			return weight;
		}
		public void weiteOutput() {
			System.out.println("Name: "+name);
			System.out.println("Age: "+age+" years");
			System.out.println("Weight: "+weight+" pounds");
		}
	

}

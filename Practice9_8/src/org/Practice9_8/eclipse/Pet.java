package org.Practice9_8.eclipse;

public class Pet {
	
	private String name;
	private int age;
	private double weight;
	
	public Pet() {
		name="No name yet.";
		age=0;
		weight=0;
	}
	
	public Pet(String name) {
		this.name=name;
		age=0;
		weight=0;
	}
	
	public Pet(int age) {
		this.name="No name yet";
		weight=0;
		if(age<0) {
			System.out.println("invalid age\n");
			System.exit(0);
		}
		else
			this.age=age;
	}
	
	public Pet(double weight) {
		name="No name yet";
		age=0;
		if(weight<0) {
			System.out.println("invalid weight\n");
			System.exit(0);
		}
		else {
			this.weight=weight;
		}
	}

	public Pet(String name,int age, double weight) {
		this.name=name;
		if(age<0||weight<0) {
			System.out.println("invalid\n");
			System.exit(0);
		}
		else {
			this.age=age;
			this.weight=weight;
		}
		
		
	}
	
	//setter method
	public void setPet(String newName, int newAge, double newWeight) {
		name=newName;
		if(age<0||weight<0) {
			System.out.println("invalid\n");
			System.exit(0);
		}
		else {
			this.age=newAge;
			this.weight=newWeight;
		}
		
	}
	
	public void setName(String newName) {
		name=newName;
	}
	public void setAge(int newAge) {
		if(newAge<0) {
			System.out.println("invalid age\n");
			System.exit(0);
		}
		else
			this.age=newAge;
		
	}
	
	public void setWeight(double newWeight) {
		if(newWeight<0) {
			System.out.println("invalid weight\n");
			System.exit(0);
		}
		else {
			this.weight=newWeight;
		}
		
	}
	
	
	//getter method
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
	
	public void writeOutput() {
		System.out.println("Name: "+getName());
		System.out.println("Age: "+getAge()+" years");
		System.out.println("Weight: "+getWeight()+" pounds");
		
	}
	
}

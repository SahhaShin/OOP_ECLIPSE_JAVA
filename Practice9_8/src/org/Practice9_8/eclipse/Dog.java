package org.Practice9_8.eclipse;

public class Dog extends Pet {
	private String breed;
	private boolean boosterShot;
	
	public Dog() {
		super();
		breed="nothing";
		boosterShot=false;//예방주사?
		
	}
	
	public Dog(String name,int age,double weight, String breed, boolean boosterShot){
		super(name,age,weight);
		setBreed(breed);
		setBoosterShot(boosterShot);
	}
	
	public Dog(String name,int age,double weight) {
		super(name,age,weight);
		breed="nothing";
	}
	
	public Dog(String breed, boolean boosterShot) {
		super();
		setBreed(breed);
		setBoosterShot(boosterShot);
	}
	//setter method
	public void setBreed(String breed) {
		this.breed=breed;
	}
	public void setBoosterShot(boolean boosterShot) {
		this.boosterShot=boosterShot;
	}
	
	//getter method
	public String getBreed() {
		return breed;
	}
	
	public boolean getBoosterShot() {
		return boosterShot;
	}

	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Breed: "+getBreed());
		System.out.println("BoosterShot: "+getBoosterShot());
		if(getBoosterShot()) {
			System.out.println("BoosterShot is True");
		}
		else {
			System.out.println("BoosterShot is False");
			
		}
	}
	
	//name & breed
	
	public String toString() {
		return "> name: "+getName()+" / breed: "+getBreed();
	}
}

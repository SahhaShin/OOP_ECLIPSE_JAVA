package org.Quiz2.eclipse;

public class Person {
	private String name; 
	public Person() {
		name="No Name Yet";
	}
	
	public Person(String initialName) {
		name=initialName;
	}
	public void setName(String newName) {
		name=newName;
	}
	public String getName() {
		return name;
	}
	
	public void WriteOutput() {
		System.out.println("\n----------------Person information---------------------\n");
		System.out.println("Name: "+name);
		System.out.println("------------------------------------------------------\n");
	}
	
	public boolean hasSameName(Person otherPerson) {
		return this.name.equalsIgnoreCase(otherPerson.name);
	}

}

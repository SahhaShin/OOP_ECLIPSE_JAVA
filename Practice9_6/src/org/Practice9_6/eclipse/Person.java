package org.Practice9_6.eclipse;

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
	
	public void writeOutput() {
		System.out.println("Name: "+name);
	}
	
	public boolean hasSameName(Person otherPerson) {
		return this.name.equalsIgnoreCase(otherPerson.name);//대소문자 상관없이
	}

}

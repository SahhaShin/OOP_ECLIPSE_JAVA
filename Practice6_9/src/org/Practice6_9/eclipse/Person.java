package org.Practice6_9.eclipse;
import java.util.Scanner;
public class Person {
	
	private String name;
	private int age;
	
	public Person(){
		this.name="No name yet";
		this.age=0;
	}
	
	public Person(String set_name, int set_age){
		this.name=set_name;
		this.age=set_age;
	}
	
	
	public static Person createAdult() {
		return new Person("An adult",21);
	}
	

	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	public void setName(String first, String last) {
		name=first+""+last;
	}
	public void setName(String newName) {
		name=newName;
	}
	
	public void setAge(int newAge) {
		if(newAge>=0)age=newAge;
		else {
			System.out.println("ERROR: Age is "+"negative.");
			System.exit(0);
		}
	}
	
	public static Person createToddler() {
		return new Person("A toddler",2);
	}
	
	public static Person createPreschooler() {
		return new Person("A preschooler",5);
	}
	
	public static Person createAdolescent() {
		return new Person("An adolescent",9);
	}
	
	public static Person createTeenager() {
		return new Person("A teenager",15);
	}
	
	public void setNameandAge(String newName, int newAge) {
		setName(newName);
		setAge(newAge);
	}
	
	
	



}

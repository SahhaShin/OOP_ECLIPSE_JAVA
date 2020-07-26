package org.Practice9_6.eclipse;

public class TruckPlay {

	public static void main(String[] args) {
		
		System.out.println("create person1...");
		Person person1=new Person();
		System.out.println("\ninformation person1...");
		person1.writeOutput();
		
		System.out.println("\nsetName person1...");
		person1.setName("SHIN SANHA");
		System.out.println("\ninformation person1...");
		person1.writeOutput();
		System.out.println("\n\n");
		
		System.out.println("create person2...");
		Person person2=new Person("SHIN MINHA");
		System.out.println("\ninformation person2...");
		person2.writeOutput();
		System.out.println("\n\n");
		
		System.out.println("create person3...");
		Person person3=new Person("SHIN SUSAN");
		System.out.println("\ninformation person3...");
		person3.writeOutput();
		System.out.println("--------------------------------\n\n");
		
		
		System.out.println("create truck1...");
		Truck truck1=new Truck(person1,"SAMGONG",50,100.0,200.0);
		System.out.println("\ninformation truck1...");
		truck1.writeOutput();
		System.out.println("\n\n");
		
		System.out.println("\ncreate truck2...");
		Truck truck2=new Truck(person2,"SAMGONG",50,100.0,200.0);
		System.out.println("\ninformation truck2...");
		truck2.writeOutput();
		System.out.println("\n\n");
		
		System.out.println("\ncreate truck3...");
		Truck truck3=new Truck(person3,"GIA",30,50.0,100.0);
		System.out.println("\ninformation truck3...");
		truck3.writeOutput();
		System.out.println("--------------------------------\n\n");

		
		System.out.println("truck1 and truck2, Are they same? "+truck1.equals(truck2));
		System.out.println("\ntruck2 owner is person2, MINHA->person1, SANHA...");
		truck2.setOwner(person1);
		System.out.println("truck1 and truck2, Are they same? "+truck1.equals(truck2));
		
		System.out.println("\ntruck1 and truck3, Are they same? "+truck1.equals(truck3));
		
		System.out.println("\ntruck1 owner is person1, SANHA->person3, SUSAN...");
		truck1.setOwner(person3);
		System.out.println("truck3 manufacturer is GIA->SAMGONG... ");
		truck3.setManufacturersName("SAMGONG");
		System.out.println("truck3 Load Capacity 50.0 -> 100.0... ");
		truck3.setLoadCapacity(100.0);
		System.out.println("truck3 towing Capacity 100.0 -> 200.0... ");
		truck3.setTowingCapacity(200.0);
		System.out.println("truck3 NumberOfCylinders 30.0 -> 50.0... ");
		truck3.setNumberOfCylinders(50);
		System.out.println("\ntruck1 and truck3, Are they same? "+truck1.equals(truck3));
		
		
		
		
		
		
		System.out.println("\ntruck2 and truck3, Are they same? "+truck2.equals(truck3));
		System.out.println("--------------------------------\n\n");
		
	}

}

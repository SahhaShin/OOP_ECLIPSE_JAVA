package org.Practice9_10.eclipse;

public class PolymorphismDemo {
	public static void main(String[] args) {
		Person[] people=new Person[6];
		
		System.out.println("create Student1...\n");
		people[0]=new Student("Cotty, Manny",20201);
		
		System.out.println("create Undergraduate1...\n");
		people[1]=new Undergraduate("Kick, Anita",20202,2);
		
		System.out.println("create (nothing)Faculty1...\n");
		people[2]=new Faculty();
		System.out.println("create Faculty2...\n");
		people[3]=new Faculty(4,"MINHA","Software","Professor of Software");
		
		System.out.println("create Staff1...\n");
		people[4]=new Staff(5,"SUSAN","Software",10);
		System.out.println("create Staff2...\n");
		people[5]=new Staff(6,"SAMSUB","Software",5);
		
		System.out.println("\n----------------------------\n");
		System.out.println("one Student, one Undergraduate, two Faculty, two Staff\n");
		for(Person p: people) {
			p.writeOutput();
			System.out.println();
		}
		
		System.out.println("\n----------------------------\n");
		
		
	}

}

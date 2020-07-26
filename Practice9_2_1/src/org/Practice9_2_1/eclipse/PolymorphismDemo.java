package org.Practice9_2_1.eclipse;

public class PolymorphismDemo {

	public static void main(String[] args) {
		Person[] people=new Person[4];
		people[0]=new Undergraduate("Cotty, Manny",4910,1);
		people[1]=new Undergraduate("Kick, Anita",9931,2);
		people[2]=new Student("DeBanque, Robin",8812);
		people[3]=new Undergraduate("Bugg, June",9901,4);
		
		for(Person p: people) {
			p.writeOutput();
			System.out.println();
		}
	}

}

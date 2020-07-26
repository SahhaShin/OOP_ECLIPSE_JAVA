package org.Practice6_9.eclipse;

public class PersonTest {

	public static void main(String[] args) {
		System.out.println("System start...\n");
		
		System.out.println("person1 create...\n");
		Person person1=new Person();
		System.out.println("person2 create...\n");
		Person person2=new Person();
		System.out.println("person3 create...\n");
		Person person3=new Person();
		System.out.println("person4 create...\n");
		Person person4=new Person();
		System.out.println("person5 create...\n");
		Person person5=new Person();
		System.out.println("person6 create...\n");
		Person person6=new Person();
		
		System.out.println("person1 setName(first, last)...\n");
		person1.setName("Sanha","Shin");

		System.out.println("person1 setAge...\n");
		person1.setAge(23);
		
		
		
		
		

		System.out.println("--------------");
		
		System.out.println("person1 information\n");
		System.out.println("Name> "+person1.getName());
		System.out.println("Age> "+person1.getAge());
		System.out.println("--------------\n");
		
		
		person2=Person.createToddler();
		System.out.println("--------------");
		System.out.println("Setting Toddler...\n");
		System.out.println("person2 information\n");
		System.out.println("Name> "+person2.getName());
		System.out.println("Age> "+person2.getAge());
		System.out.println("--------------\n");
		
		person3=Person.createPreschooler();
		System.out.println("--------------");
		System.out.println("Setting Preschooler...\n");
		System.out.println("person3 information\n");
		System.out.println("Name> "+person3.getName());
		System.out.println("Age> "+person3.getAge());
		System.out.println("--------------\n");
		
		person4=Person.createAdolescent();
		System.out.println("--------------");
		System.out.println("Setting Preschooler...\n");
		System.out.println("person4 information\n");
		System.out.println("Name> "+person4.getName());
		System.out.println("Age> "+person4.getAge());
		System.out.println("--------------\n");
		
		person5=Person.createTeenager();
		System.out.println("--------------");
		System.out.println("Setting Teenager...\n");
		System.out.println("person5 information\n");
		System.out.println("Name> "+person5.getName());
		System.out.println("Age> "+person5.getAge());
		System.out.println("--------------\n");
		
		System.out.println("--------------");
		System.out.println("Before Setting...\n");
		System.out.println("person6 information\n");
		System.out.println("Name> "+person6.getName());
		System.out.println("Age> "+person6.getAge());
		System.out.println("--------------\n");

		System.out.println("person6 setName(name)...\n");
		person6.setName("MinhaShin");

		System.out.println("person6 setAge...\n");
		person6.setAge(21);
		
		System.out.println("--------------");
		System.out.println("After Setting...\n");
		System.out.println("person6 information\n");
		System.out.println("Name> "+person6.getName());
		System.out.println("Age> "+person6.getAge());
		System.out.println("--------------\n");

	}

}

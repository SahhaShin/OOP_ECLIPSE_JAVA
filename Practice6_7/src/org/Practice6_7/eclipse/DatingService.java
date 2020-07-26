package org.Practice6_7.eclipse;

public class DatingService {

	public static void main(String[] args) {
		
		Characteristic person1 = new Characteristic("shy");
		Characteristic person2 = new Characteristic("shy");
		
		
		person1.setRating(4);
		System.out.println("person2 setRating...");
		person2.setRating();
		
		System.out.println("-----------------------");
        System.out.println("person1 information\n");
        System.out.println("person1 description> "+person1.getDescription());
        System.out.println("person1 rating> "+person1.getRating());
        System.out.println("-----------------------\n");
        
        System.out.println("-----------------------");
        System.out.println("person2 information\n");
        System.out.println("person2 description> "+person2.getDescription());
        System.out.println("person2 rating> "+person2.getRating());
        System.out.println("-----------------------\n\n");
        
        System.out.println("person1 & person2 compatatibility> "+person1.getCompatibility(person2));
        
	}

}

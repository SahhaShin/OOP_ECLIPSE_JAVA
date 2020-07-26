package org.Quiz2.eclipse;
import java.util.Arrays;

public class TestPlay {

	public static void main(String[] args) {
		System.out.println("create Truck 6...\n");
		Truck[] truck = new Truck[6];
		truck[0] =new Truck("SANHA COM", 100,50, 80);
		truck[1] =new Truck("SANHA COM", 100,50, 80);
		truck[2] =new Truck("MINHA COM", 100,50, 80);
		truck[3] =new Truck("MINHA COM", 100,50, 80);
		truck[4] =new Truck("SUSAN COM", 100,60, 80);
		truck[5] =new Truck("SUSAN COM", 100,60, 90);
		Person per1=new Person();
		per1.setName("SANHA");
		truck[0].setOwner(per1);
		truck[1].setOwner(per1);
		
		Person per2=new Person();
		per2.setName("MINHA");
		truck[2].setOwner(per2);
		truck[3].setOwner(per2);
		
		Person per3=new Person();
		per3.setName("SUSAN");
		truck[4].setOwner(per3);
		truck[5].setOwner(per3);
		
		System.out.println("--------------------------------\n\n");
		System.out.println("check they are equal...\n");
		
		System.out.println("[0] equals [1]? "+truck[0].equals(truck[1]));
		System.out.println("[2] equals [3]? "+truck[2].equals(truck[3]));
		System.out.println("[4] equals [5]? "+truck[4].equals(truck[5]));
		System.out.println("\n");
		System.out.println("[0] equals [2]? "+truck[0].equals(truck[2]));
		System.out.println("[2] equals [4]? "+truck[2].equals(truck[4]));
		System.out.println("[0] equals [4]? "+truck[0].equals(truck[4]));
		
		
		System.out.println("--------------------------------\n\n");
		System.out.println("sort to load_cap\n");
		Arrays.sort(truck);
		
        for (Truck t : truck) {
            System.out.println(t);
        }


		
		

	}

}

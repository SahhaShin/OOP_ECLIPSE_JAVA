package org.Practice9_8.eclipse;

public class DogPlay {

	public static void main(String[] args) {
		System.out.println("System1 start: test all method!!!\n\n");
		
		Dog[] dog=new Dog[5];
		System.out.println("create Dog1...");
		dog[0]=new Dog();
		System.out.println("----------------------------");
		System.out.println("information Dog1\n");
		dog[0].writeOutput();
		System.out.println("----------------------------\n\n");
		
		System.out.println("create Dog2...");
		dog[1]=new Dog("POPO",1,10, "MARTIZE", true);
		System.out.println("----------------------------");
		System.out.println("information Dog2\n");
		dog[1].writeOutput();
		System.out.println("----------------------------\n\n");
		
		System.out.println("create Dog3...");
		dog[2]=new Dog("PPIPPI",3,8);
		System.out.println("----------------------------");
		System.out.println("information Dog3\n");
		dog[2].writeOutput();
		System.out.println("----------------------------\n\n");
		
		System.out.println("create Dog4...");
		dog[3]=new Dog("CHIWHAWHA",false);
		System.out.println("----------------------------");
		System.out.println("information Dog4\n");
		dog[3].writeOutput();
		System.out.println("----------------------------\n\n");
		
		System.out.println("create Dog5...");
		dog[4]=new Dog("ARI",1,7, "MARTIZE", false);
		System.out.println("----------------------------");
		System.out.println("information Dog5\n");
		dog[4].writeOutput();
		System.out.println("----------------------------\n\n");
		
		
		System.out.println("Dog1 set name\n");
		dog[0].setName("SHUSHU");
		
		
		System.out.println("Dog1 set age : correct \n");
		dog[0].setAge(5);
		
		System.out.println("Dog1 set weight : correct \n");
		dog[0].setWeight(5);
		
		System.out.println("Dog1 set Breed\n");
		dog[0].setBreed("SABSAL");
		
		
		System.out.println("Dog1 set BoosterShot\n");
		dog[0].setBoosterShot(true);
		
		
		System.out.println("Dog4 set name\n");
		dog[3].setName("SHASHA");
		
		
		System.out.println("Dog4 set age : correct \n");
		dog[3].setAge(5);
		
		System.out.println("Dog4 set weight : correct \n");
		dog[3].setWeight(5);
		
		System.out.println("----------------------------");
		System.out.println("information Dog1\n");
		dog[0].writeOutput();
		System.out.println("----------------------------\n\n");
		System.out.println("----------------------------");
		System.out.println("information Dog4\n");
		dog[3].writeOutput();
		System.out.println("----------------------------\n\n");
		
		
		System.out.println("System2 start: display age>2 and have not had their booster shots!!!\n\n");
		
		for(int i=0;i<dog.length;i++) {
			if(dog[i].getAge()>2&&!dog[i].getBoosterShot()) {
				System.out.println(dog[i].toString());
			}
		}
		
		
	}

}

package org.Practice2_13.eclipse;
import java.util.Scanner;
public class BMR {

	public static void main(String[] args) {
		
		int gender=100;
		
		while(gender!=0) {
			System.out.print("Please Enter 0-terminate 1-Woman 2-Man: ");
			Scanner keyboard=new Scanner(System.in);
			gender=keyboard.nextInt();
			if(gender==0) {
				System.out.print("Program End...");
				System.exit(0);	
			}
			else if(gender==1) {
				double weight;
				double height;
				int age;
				double bmr_woman;
				int chocobar=0;
				System.out.print("\nWelcome Woman Process!\n");
				System.out.println("--------------------------------------\n");
				System.out.print("\nPlease Enter your weight(pounds): ");
				weight=keyboard.nextDouble();
				System.out.print("\nPlease Enter your height(inches): ");
				height=keyboard.nextDouble();
				System.out.print("\nPlease Enter your age(years): ");
				age=keyboard.nextInt();
			
				bmr_woman=655+(4.3*weight)+(4.7*height)-(age*4.7);
				chocobar=(int)(bmr_woman/230);
			
				System.out.print("\nthe number of chocolate bars that should be consumed to maintain one¡¯s weight for Woman");
				System.out.println("> "+chocobar);
				System.out.println("--------------------------------------\n");
			}
		
		
			else if(gender==2) {
				double weight;
				double height;
				int age;
				double bmr_man;
				int chocobar=0;
				System.out.print("\nWelcome man Process!\n");
				System.out.println("--------------------------------------\n");
				System.out.print("\nPlease Enter your weight(pounds): ");
				weight=keyboard.nextDouble();
				System.out.print("\nPlease Enter your height(inches): ");
				height=keyboard.nextDouble();
				System.out.print("\nPlease Enter your age(years): ");
				age=keyboard.nextInt();
			
				bmr_man=66+(6.3*weight)+(12.9*height)-(age*6.8);
				chocobar=(int)(bmr_man/230);
			
				System.out.print("\nthe number of chocolate bars that should be consumed to maintain one¡¯s weight for man");
				System.out.println("> "+chocobar);
				System.out.println("--------------------------------------\n");
			}
		
			else {
				System.out.print("Error!!!");
				continue;
			}
		}
	}

}

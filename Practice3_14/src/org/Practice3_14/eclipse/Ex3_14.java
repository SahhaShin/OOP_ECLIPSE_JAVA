package org.Practice3_14.eclipse;
import java.util.Scanner;
public class Ex3_14 {

	public static void main(String[] args) {
		double height = 0, bounce = 1;
		int time=0;
		boolean start = true;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please Enter the velocity (ex. 100 feet per second): ");
		int velocity = keyboard.nextInt();
		System.out.println("\n*****START*****");

		do{
			System.out.println("");			
			System.out.println("Time: " + time + " Height: " + height);
			height += velocity;
			velocity -= 32;
			time++;

			if(height <= 0){
				
				System.out.println("\n*****"+(int) bounce +"Bounce"+"*****\n");

				height *= -0.5;
				velocity *= -0.5;
				bounce++;
			}
			
			if(bounce == 6){
				System.out.println("\n*****END*****");
				break;
			}

		}while(start);

	}

}

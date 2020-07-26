package org.Practice3_13.eclipse;
import java.util.Scanner;
public class Ex3_13 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int z = 0;

		System.out.print("Please Enter a integer (1 to 50): ");
		
		int triangle = keyboard.nextInt();
		
		while((triangle>=1&&triangle<=50)==false) {
			System.out.print("\nPlease Re-Enter a integer (1 to 50): ");
			triangle = keyboard.nextInt();
		}
		//1~10까지 삼각형 반을 제작
		for(int x = 1; x <= triangle; x++){

			for(int y = 1; y <= x; y++){
				System.out.print("*");
				z = y;
			}
			System.out.print("\n");
		}
		
		
		//나머지를 제작
		for(;z >= 1; z--){
			for(int y = z - 1; y >= 1; y--){
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}

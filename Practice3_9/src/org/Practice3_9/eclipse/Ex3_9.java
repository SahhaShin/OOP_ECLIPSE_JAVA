package org.Practice3_9.eclipse;
import java.util.Scanner;
public class Ex3_9 {

	public static void main(String[] args) {
		boolean start = true;
		
		int score = 0;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("if you move the first letter to end of the word,\nand then spell the result backwords,\nyou will get the original word!");
		System.out.println("\n***end : quit***");


		while(start){
			System.out.print("\nPlease Enter any word: ");
			String word = keyboard.nextLine();
			String lowWord = word.toLowerCase();

			if(lowWord.equalsIgnoreCase("quit")){
					break;
			}
			else{
					int wordLength = lowWord.length();

					String first_letter = lowWord.substring(0, 1);
					String remain_letter = lowWord.substring(1, wordLength);
					String newWord = remain_letter + first_letter;
					String reverse = new StringBuffer(newWord).reverse().toString();
					
					//result process
					System.out.println("\n***result process***");
					System.out.println(lowWord+" -> "+newWord+" -> "+reverse);
					
					

					if(lowWord.equals(reverse)){
						System.out.println("\n+1 Point");
						score++;
						System.out.println("Total Score: " + score);
						System.out.println("********************\n");
					}
					else{
						System.out.println("\nNo Point");
						System.out.println("Total Score: " + score);
						System.out.println("********************\n");
					}
			}
		}
		System.out.println("Final Score: " + score);

	}

}

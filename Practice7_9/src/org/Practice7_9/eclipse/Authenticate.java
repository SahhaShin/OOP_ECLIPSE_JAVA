package org.Practice7_9.eclipse;
import java.util.Scanner;
public class Authenticate {

	public static void main(String[] args) {
		
		
		

		 int[] actual_password = {1, 2, 3, 4, 5};

		 int[] random_nums = new int[10];

		 int[] entered_digits = new int[actual_password.length];

		 
		 //1~3까지
		 for (int i=0; i < 10; i++)

		 {

			 random_nums[i] = (int) (Math.random() * 3) + 1;

		 }

		 // Output the challenge

		 System.out.println("Secret, your actual password is 12345");

		 System.out.println("correctly matches the PIN number.");

		 System.out.println();

		 System.out.println("PIN: 0 1 2 3 4 5 6 7 8 9");

		 System.out.print("NUM: ");

		 for (int i=0; i<10; i++)

		 {

			 System.out.print(random_nums[i] + " ");

		 }

		 System.out.println();

		 System.out.println();

		

		 Scanner keyboard = new Scanner(System.in);

		 System.out.print("Enter number ex(12345): ");


		 int index=0;
		 
		 int input_num = keyboard.nextInt();
		 
		 for (int i=0; i<actual_password.length; i++)

		 {
			 int remainder=input_num%10;
			 entered_digits[actual_password.length-i-1] = remainder;
			 input_num=input_num/10;

		 }
		 
		 
		 System.out.print("\n");
		 
		 //자릿수가 맞지 않는 점도 추가
		 if (isValid(actual_password, entered_digits, random_nums)&&input_num==0)

		 {

			 System.out.println("\nCorrect!!!");

		 }

		 else

		 {

			 System.out.println("\ninvalid password!!!");

		 }

		 }

		

		 public static boolean isValid(int[] actual, int[] entered, int[] randnums)

		 {

			 int index=0;
			 boolean Valid=true;
			 while(Valid&&(index<actual.length)) {
				 int Code=actual[index];
				 if(entered[index]!=randnums[Code]) {
					 Valid=false;
				 }
				 index++;
			 }

			 return Valid;


	}

}

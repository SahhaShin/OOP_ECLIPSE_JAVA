package org.Practice13_1.eclipse;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class Textfile1 {

	public static void main(String[] args) {
		int min=100;
		int max=0;
		int sum=0;
		double avg=0.0;
		System.out.print("Please Enter a file Name: ");
		Scanner keyboard=new Scanner(System.in);
		String fileName=keyboard.next();
		
		PrintWriter inputStream=null;
		
		try {
			inputStream=new PrintWriter(fileName);
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file"+fileName);
			System.exit(0);
		}
		
		for(int count=1; count<=10;count++) {
			int number=(int)(Math.random()*100);
			inputStream.println(number);
		}
		inputStream.close();
		
		//다시 열기
		Scanner outputStream=null;
		try {
			outputStream=new Scanner(new File(fileName));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file"+fileName);
			System.exit(0);
		}
		
		 
		while(outputStream.hasNextInt()) {
			int line = outputStream.nextInt();
			sum+=line;
			if(line>max) {
				max=line;
			}
			if(line<min) {
				min=line;
			}
			
		}
		avg=sum/10.0;
		System.out.println("-----------result---------------");
		System.out.println("min = "+min);
		System.out.println("max = "+max);
		System.out.println("sum = "+sum);
		System.out.println("avg = "+avg);
		outputStream.close();
		

	}

}

package org.Practice13_2_1.eclipse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Binarycal {

	public static void main(String[] args) {
		double min=1.0;
		double max=0.0;
		double sum=0.0;
		double avg=0.0;
		String fileName="numbers.dat";
		
		try {
			ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(fileName));
			
			for(int count=1; count<=10;count++) {
				double number=(Math.random());
				outputStream.writeDouble(number);
			}
			
			outputStream.close();
			
			
			//다시열어서 계산
			ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(fileName));
			
			
			
			int c=0;
			
			while(c!=10) {
				double line = inputStream.readDouble();
				sum+=line;
				if(line>max) {
					max=line;
				}
				if(line<min) {
					min=line;
				}
				c++;
			}
			avg=sum/10.0;
			System.out.println("-----------result---------------");
			System.out.println("min = "+min);
			System.out.println("max = "+max);
			System.out.println("sum = "+sum);
			System.out.println("avg = "+avg);
			inputStream.close();
			
			
			
		}
		catch(FileNotFoundException e) {
			System.out.println("Problem opening the file "+fileName);
		}
		catch(IOException e) {
			System.out.println("Problem with output to file "+fileName);
		}

	}

}

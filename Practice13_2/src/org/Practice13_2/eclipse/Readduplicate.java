package org.Practice13_2.eclipse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Readduplicate {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		String fileName;
		String endFile;
		int[] number= new int[10];
		int[] notduple=new int[10];
		int[] checkduple=new int[100];
		System.out.println("*Please your file input integer 0~99*\n");
		System.out.print("Please Enter a read your file name: ");
		fileName=keyboard.next();
		
		Scanner inputStream=null;
		
		try {
			int i=0;
			inputStream=new Scanner(new File(fileName));
			while(inputStream.hasNextInt()) {
				number[i]=inputStream.nextInt();
				System.out.println(number[i]);
				i++;
			}
			
			inputStream.close();
			
			//list�ʱ�ȭ
			for(int init=0;init<100;init++) {
				checkduple[init]=0;
			}
			
			//duplicate ����
			
			int index=0;
			for(int k=0;k<number.length;k++) {
				//duplicate�� �ϳ��� ������ ��� list�� �ȳ���(-1ó�� ���߿� ���ٶ��)
				if(checkduple[number[k]]>0) {
					notduple[index]=-1;
				}
				else {
					notduple[index]=number[k];
				}
				checkduple[number[k]]++;
				index++;
		
			}
			
			//��� ����� ����
			System.out.print("Please Enter a result file name: ");
			endFile=keyboard.next();
			
			
			PrintWriter outputStream=null;
			
			try {
				outputStream=new PrintWriter(endFile);
			}
			catch(FileNotFoundException e) {
				System.out.println("Error opening the file"+endFile);
				System.exit(0);
			}
			
			for(int k=0;k<notduple.length;k++) {
				if(notduple[k]!=-1)
					outputStream.println(notduple[k]);
			}
			outputStream.close();
			
			
			
			
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file"+fileName);
			System.exit(0);
		}

	}

}

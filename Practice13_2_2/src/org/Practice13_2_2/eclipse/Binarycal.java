package org.Practice13_2_2.eclipse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Binarycal {

	public static void main(String[] args) {
		String fileName="number.txt";
		String bifileName="binumbers.dat";
		int[] listnum=new int[10];
		int minus=0;
		Scanner inputTXTStream=null;
		//txt���� ����
		try {
			inputTXTStream=new Scanner(new File(fileName));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file"+fileName);
			System.exit(0);
		}
		//���̳ʸ� ���� ����
		try {
			int count=0;
			ObjectOutputStream outputBIStream=new ObjectOutputStream(new FileOutputStream(bifileName));
			
			//txt 10�� ���� ����Ʈ�� �о����
			while(inputTXTStream.hasNextInt()) {
				int line = inputTXTStream.nextInt();
				
				listnum[count]=line;
				count++;
				
				
			}
			
			inputTXTStream.close();
			
			
			//���̳ʸ� ���Ͽ� ���� ù ���� �״�� ������ ���� ��
			for(int i=0;i<10;i++) {
				if(i==0)
					outputBIStream.writeInt(listnum[i]);
				else {
					minus=listnum[i]-listnum[i-1];
					byte mi=(byte)minus;//1����Ʈ�� Ÿ��ĳ����
					outputBIStream.write(mi);
				}
			}
			outputBIStream.close();
			
			
			//�ٽÿ�� ���
			ObjectInputStream inputBIStream=new ObjectInputStream(new FileInputStream(bifileName));
			int total=0;
			int c=0;
			int line=0;
			System.out.println("-----------------result---------------------");
			while(c!=10) {
				if(c==0) {
					line = inputBIStream.readInt();
					total=total+line;
				}
					
				else {
					line = inputBIStream.read();
					total=total+line;
					
					
				}
				System.out.println(total);
				
				c++;
			}
	
			
			
		}
		catch(FileNotFoundException e) {
			System.out.println("Problem opening the file "+fileName);
		}
		catch(IOException e) {
			System.out.println("Problem with output to file "+fileName);
		}
		 
		


	}

}

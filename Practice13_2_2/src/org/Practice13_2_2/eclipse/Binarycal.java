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
		//txt파일 열기
		try {
			inputTXTStream=new Scanner(new File(fileName));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file"+fileName);
			System.exit(0);
		}
		//바이너리 파일 열기
		try {
			int count=0;
			ObjectOutputStream outputBIStream=new ObjectOutputStream(new FileOutputStream(bifileName));
			
			//txt 10개 숫자 리스트에 읽어오기
			while(inputTXTStream.hasNextInt()) {
				int line = inputTXTStream.nextInt();
				
				listnum[count]=line;
				count++;
				
				
			}
			
			inputTXTStream.close();
			
			
			//바이너리 파일에 쓰기 첫 값은 그대로 나머지 값은 차
			for(int i=0;i<10;i++) {
				if(i==0)
					outputBIStream.writeInt(listnum[i]);
				else {
					minus=listnum[i]-listnum[i-1];
					byte mi=(byte)minus;//1바이트로 타입캐스팅
					outputBIStream.write(mi);
				}
			}
			outputBIStream.close();
			
			
			//다시열어서 출력
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

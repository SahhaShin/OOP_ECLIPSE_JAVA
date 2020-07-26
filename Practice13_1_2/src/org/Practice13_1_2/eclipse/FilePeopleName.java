package org.Practice13_1_2.eclipse;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class FilePeopleName {

	
	public static void main(String[] args) {
		int line=0;
		int count_2=0;
		String fileName="peopleName.txt";//내 컴퓨터 경로
		String newfileName="newPeopleName.txt";
		
		String[] name=null;
		Scanner readFile=null;
		PrintWriter writeFile=null;
		
		try {
			
			readFile=new Scanner(new File(fileName));
			
		}
		catch(FileNotFoundException e){
			System.out.println("Error opening the read file "+fileName);
			System.exit(0);
		}
		try {
			
			writeFile=new PrintWriter(new FileOutputStream(newfileName,true));
		}
		catch(FileNotFoundException e){
			System.out.println("Error opening the write file "+newfileName);
			System.exit(0);
		}
		
		
		
		while(readFile.hasNextLine()) {
			name=(readFile.nextLine()).split(" ");
			
			for(int i=0; i<name.length;i++) {
				
				
				if((count_2+1)%2==0) {
					writeFile.println(name[i]);
					count_2++;
					
				}
				else {
					writeFile.print(name[i]+" ");
					count_2++;
				}
				
			}
			
		}
		
		
		readFile.close();
		
		writeFile.close();

	}

}

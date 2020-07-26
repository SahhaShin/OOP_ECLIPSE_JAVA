package org.Practice13_12.eclipse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVfIle {

	public static void main(String[] args) {
		
		String fileName="haberman.data";
		
		try {
			Scanner inputStream=new Scanner(new File(fileName));
			int survive;//1은 생존 2는 사망
			int plus=0;//양의 축
			int more5=0;
			int less5=0;
			int more5_count=0;
			int less5_count=0;
			
			while(inputStream.hasNextLine()) {
				String line=inputStream.nextLine();
				
				String[] fields=line.split(",");//csv형이기 때문이다. 4개의 필드(나이, 수술연도, 검출된 양의 축 노드, 생존여부1)
				
				plus=Integer.parseInt(fields[2]);//5년이상 생존한 양의 축 노드의 평균개수
				survive=Integer.parseInt(fields[3]);//5년 이내에 사망한 환자의 양성 축 노드의 평균개수
				
				
				//5년이상 생존환자
				if(survive==1) {
					more5+=plus;
					more5_count+=1;
				}
				
				//5년 이내 사망환자
				else if(survive==2) {
					less5+=plus;
					less5_count+=1;
				}
			}
			
			double more5avg=(double)(more5/more5_count);
			double less5avg=(double)(less5/less5_count);
			System.out.println("survived 5 years or longer avg: "+more5avg);
	        System.out.println("survived less 5 years avg : "+less5avg);
			
			
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file"+fileName);
			System.exit(0);
		}

	}

}

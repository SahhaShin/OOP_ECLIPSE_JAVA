package org.Practice13_7.eclipse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Abbreviations {

	public static void main(String[] args) {
		
		String endFile;
		System.out.print("Please Enter a message : ");
		Scanner keyboard=new Scanner(System.in);
		String message=keyboard.nextLine();//원본 메세지
		
		StringBuffer origin=new StringBuffer(message);
		
		
		
		
		
		int first_message;
		
		//축약파일열어 메세지와 비교
		String fileName="abbreviations.txt";
		Scanner inputStream=null;
		try {
			inputStream=new Scanner(new File(fileName));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file"+fileName);
			System.exit(0);
		}

		String[] message_split=message.split(" ");
		while(inputStream.hasNext()) {
			String line = inputStream.next();
			
			for(int i=0;i<message_split.length;i++) {
				String comp=(message_split[i].toLowerCase());//소문자변경
				
				int len=comp.length();
				char isComma=comp.charAt(len-1);
				boolean addcomma=false;
				
				if(isComma==',') {
					addcomma=true;
					
				}
				
				String[] comp2=comp.split(",");
				
				if(comp2[0].compareTo(line)==0) {
					
					message_split[i]="<"+comp2[0]+">";
					if(addcomma==true) {
						message_split[i]+=",";
					}
				}
				
			}
			
		}
		String result="";
		for(int i=0;i<message_split.length;i++) {
			result+=message_split[i]+" ";
			
		}
		
		/*
		//축약어와 같은 단어 찾아 <> 넣기
		
		while(inputStream.hasNext()) {
			String line = inputStream.next();			
			
			//만약 메세지 안에 축약어가 들어갔다면 <> 추가
			if((message).contains(line)) {
				first_message=message.indexOf(line);
				origin.insert(first_message,"<");
				origin.insert(first_message+line.length()+1,">");
			}
		}
		*/
	

		
		//결과를 넣을 파일이름 받기
		System.out.print("Please Enter a result file name: ");
		endFile=keyboard.next();
		
		
		PrintWriter outputStream=null;
		
		try {
			outputStream=new PrintWriter(endFile);
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file "+endFile);
			System.exit(0);
		}
		
		
		outputStream.println(result);
		
		
		inputStream.close();
		outputStream.close();

	}

}

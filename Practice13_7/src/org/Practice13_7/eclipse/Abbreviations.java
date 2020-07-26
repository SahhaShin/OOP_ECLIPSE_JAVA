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
		String message=keyboard.nextLine();//���� �޼���
		
		StringBuffer origin=new StringBuffer(message);
		
		
		
		
		
		int first_message;
		
		//������Ͽ��� �޼����� ��
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
				String comp=(message_split[i].toLowerCase());//�ҹ��ں���
				
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
		//����� ���� �ܾ� ã�� <> �ֱ�
		
		while(inputStream.hasNext()) {
			String line = inputStream.next();			
			
			//���� �޼��� �ȿ� ��� ���ٸ� <> �߰�
			if((message).contains(line)) {
				first_message=message.indexOf(line);
				origin.insert(first_message,"<");
				origin.insert(first_message+line.length()+1,">");
			}
		}
		*/
	

		
		//����� ���� �����̸� �ޱ�
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

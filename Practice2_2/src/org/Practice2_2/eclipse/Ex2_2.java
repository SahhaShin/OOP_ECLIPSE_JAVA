package org.Practice2_2.eclipse;

import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
			System.out.print("Please enter line of text: ");
			String text;
			Scanner keyboard=new Scanner(System.in);
			text=keyboard.nextLine();
			
			char subtext=text.charAt(0);
			int count=0;
			while(subtext!=' ') {
				count++;
				subtext=text.charAt(count);
			}
			//end는 count
			
			char firstText;
			firstText=text.charAt(count+1);
			
			//첫 문자가 소문자일 경우 대문자로 변환하기
			if (firstText >= 'a' && firstText <= 'z') {
				System.out.println((char) (firstText + ('A' - 'a'))+text.substring(count+2)+' '+text.substring(0,count));
			}
			else {
				System.out.println(firstText+text.substring(count+2)+' '+text.substring(0,count));
			}

	}

}

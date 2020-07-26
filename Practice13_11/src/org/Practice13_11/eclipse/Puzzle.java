package org.Practice13_11.eclipse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Puzzle {

	public static void main(String[] args) throws Exception {
		int len=0;
		
		String word="";
		
		String fileName="words.txt";
		
		Scanner inputStream = new Scanner(new File(fileName));
		
		while(inputStream.hasNextLine()) {
			word=inputStream.nextLine();
			
			len=word.length();
			
			//dous니까 4개이상되는 단어 대상
			if(len>=4) {
				if(word.charAt(len-4)=='d'&&word.charAt(len-3)=='o'&&word.charAt(len-2)=='u'&&word.charAt(len-1)=='s') {
					System.out.println(word);
				}
			}

		}
	}

}

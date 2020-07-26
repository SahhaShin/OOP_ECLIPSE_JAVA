package org.Practice12_1_2.eclipse;

public class DisplayWordPlay {

	public static void main(String[] args) {
		
		System.out.println("create word1...\n");
		DisplayAsWords word1=new DisplayAsWords();
		
		System.out.print("DisplayWord 100 > ");
		word1.displayWord(100);
		System.out.println("\n-------------------------------\n");
		System.out.println("create word2...\n");
		DisplayAsWords word2=new DisplayAsWords();
		System.out.print("DisplayWord 202 > ");
		word2.displayWord(202);

	}

}

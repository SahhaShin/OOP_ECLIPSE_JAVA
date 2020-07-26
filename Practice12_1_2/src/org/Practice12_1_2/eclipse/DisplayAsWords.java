package org.Practice12_1_2.eclipse;

public class DisplayAsWords {
	
	
	public static void displayWord(int number) {
	
		while(number>=10) {
			number=number%10;
		}
		System.out.println(" "+getWordFromDigit(number));
	}
	
	public static String getWordFromDigit(int digit) {
		String[] word=new String[] {
				"zero","one","two","three","four","five","six","seven","eight","nine"
		};
		
		return word[digit];
	}
	

}

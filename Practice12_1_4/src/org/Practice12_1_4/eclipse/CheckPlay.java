package org.Practice12_1_4.eclipse;

public class CheckPlay {

	public static void main(String[] args) {
		boolean result;
		System.out.println("create test1...\n");
		CheckPalindrome test1=new CheckPalindrome();
		
		result=test1.checkPalindrome("Straw? No, too stupid a fad, I put soot on warts.");
		System.out.println("---------------------result Palindrome?------------------------------");
		System.out.println("Straw? No, too stupid a fad, I put soot on warts.");
		System.out.println(">is Palindrome? "+result);
		
		
		System.out.println("\ncreate test2...");
		CheckPalindrome test2=new CheckPalindrome();
		result=test2.checkPalindrome("banana");
		System.out.println("---------------------result Palindrome?------------------------------");
		System.out.println("banana");
		System.out.println(">is Palindrome? "+result);

	}

}

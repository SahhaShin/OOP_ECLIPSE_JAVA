package org.Practice10_1_4.eclipse;

public class ShufflePlay {

	public static void main(String[] args) {
		System.out.println("create SubstitutionCipher...\n");
		SubstitutionCipher shuffle1=new SubstitutionCipher(3);
		
		System.out.println("*information*");
		System.out.println("private shift : 3");
		System.out.println("original sentence: abcdefghi\n\n");
		
		System.out.println("Encode Sentence: "+shuffle1.encode("abcdefghi"));
		
		
		System.out.println("---------------------------");
		
		
		ShuffleCipher shuffle2=new ShuffleCipher(1);
		System.out.println("*information*");
		System.out.println("private n: 1");
		System.out.println("original sentence: abcdefghi\n\n");
		System.out.println("Encode Sentence: "+shuffle2.encode("abcdefghi"));
		

	}

}

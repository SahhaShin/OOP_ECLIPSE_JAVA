package org.Practice12_1_3.eclipse;

public class CountDigitPlay {

	public static void main(String[] args) {
		System.out.println("create digit1...\n");
		CountDigit digit1=new CountDigit();

		System.out.println("Count Digit 010-3705-4036> "+digit1.countDigits("010-3705-4036"));
		System.out.println("\n-------------------------------------------------------------\n");
		System.out.println("create digit2...\n");
		CountDigit digit2=new CountDigit();
		System.out.println("Count Digit 031-435-5235> "+digit2.countDigits("031-435-5235"));

	}

}

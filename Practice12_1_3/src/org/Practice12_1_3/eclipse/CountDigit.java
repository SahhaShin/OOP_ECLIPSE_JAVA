package org.Practice12_1_3.eclipse;

public class CountDigit {
	
	int num;
	int i=0;
	
	public int countDigits(String s) {
		char a=s.charAt(i);

		if(s.length()-1==i) {
			if(('0'<=a&&a<='9')) {
				num++;
			}
			return num;
		}
		
		else if(('0'<=a&&a<='9')) {
			num++;
			
		}
		i++;
		return countDigits(s);
	}
	
}

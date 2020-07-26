package org.Practice10_1_4.eclipse;

public class SubstitutionCipher implements MessageEncoder {
	
	private int shift;
	public SubstitutionCipher(int shift) {
		this.shift=shift;
	}
	
	public String encode(String plainText) {
		String complete_sentence="";
		char complete_word;
		for(int i=0;i<plainText.length();i++) {
			char one=plainText.charAt(i);
			if(one>='a' && one<='z') {
				complete_word=(char)('a'+(one-'a'+shift)%26);
				complete_sentence+=complete_word;
				
			}
			else if(one>='A'&&one<='Z') {
				complete_word=(char)('A'+(one-'A'+shift)%26);
				complete_sentence+=complete_word;
			}
		}
		
		return complete_sentence;
	}
}

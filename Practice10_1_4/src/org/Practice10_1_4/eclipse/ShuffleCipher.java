package org.Practice10_1_4.eclipse;

public class ShuffleCipher implements MessageEncoder{
	
	private int n;
	public ShuffleCipher(int n) {
		this.n=n;
	}

	public String encode(String plainText) {
		String shuffle_sentence1="";
		String shuffle_sentence2="";
		String copy_sentence=plainText;
		String complete="";
		int middle;
		for(int i=0;i<n;i++) {
			
			if(copy_sentence.length()%2==0)
				middle=copy_sentence.length()/2;
			else
				middle=(copy_sentence.length()+1)/2;
			
			shuffle_sentence1=copy_sentence.substring(0,middle);
			shuffle_sentence2=copy_sentence.substring(middle);
			
			for(int j=0, k=0;j<shuffle_sentence1.length();i++,j++) {
				complete+=shuffle_sentence1.charAt(i);
				if(j<shuffle_sentence2.length())
					complete+=shuffle_sentence2.charAt(i);
			}
			
		}
		return complete;
		
	}
	
}

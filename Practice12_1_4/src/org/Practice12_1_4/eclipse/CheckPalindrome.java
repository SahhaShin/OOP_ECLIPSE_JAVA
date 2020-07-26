package org.Practice12_1_4.eclipse;

public class CheckPalindrome {
	
	boolean result=true;
	int front_index=0;
	char front;
	char back;
	
	public String rmv_thing(String s) {
		String match="[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";
		s=s.replaceAll(match, "");
		//스페이스바 제거
		s=s.replaceAll(" ", "");
		s=s.toLowerCase();
		
		
		return s;
	}
	
	public boolean checkPalindrome(String s) {
		//특수문자 제거 후 소문자 변경
		if(front_index==0) {
			s=rmv_thing(s);
		}
		
		front=s.charAt(0);
		back=s.charAt(s.length()-1);
		
		if(s.length()<=1) {
			return result;
		}
		else if(front!=back) {

			result=false;
			
			return result;
		}
		
		front_index++;
		s=s.substring(1, s.length()-1);
		
		return checkPalindrome(s);
	}

}

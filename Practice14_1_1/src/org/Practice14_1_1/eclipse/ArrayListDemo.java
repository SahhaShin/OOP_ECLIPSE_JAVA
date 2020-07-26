package org.Practice14_1_1.eclipse;

import java.util.ArrayList;


public class ArrayListDemo {
	
	public static ArrayList<String> change(String[]a){
		
		ArrayList<String> al=new ArrayList<String>();
		for(String some: a) {
			al.add(some);
		}
		return al;
		
		
	}
	
	
	public static void removeFromArrayList(ArrayList<String>alist, String[] s) {
	
		for(int i=0; i<s.length;i++) {
			if(alist.contains(s[i])) {
				alist.remove(s[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		
		String[] aList=new String[]{"one","two","three"};
		ArrayList<String>al=change(aList);
		
		String[] rem=new String[] {"one","three"};
		
		removeFromArrayList(al,rem);
		
		for(String result: al) {
			System.out.println(result);
		}
		
		
		
		
		
		

	}

	

}

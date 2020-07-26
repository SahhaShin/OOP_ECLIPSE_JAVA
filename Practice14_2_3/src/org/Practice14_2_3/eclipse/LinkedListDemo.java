package org.Practice14_2_3.eclipse;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static LinkedList<String> change(String[] a){
		LinkedList<String>list=new LinkedList<String>();
		for(String some: a) {
			list.add(some);
			
		}
		return list;
	}
	
	public static void removeFromLinkedList(LinkedList<String>list, String[] s) {
		for(int i=0;i<s.length;i++) {
			if(list.contains(s[i])) {
				list.remove(s[i]);
			}
		}
		
		
		
		
	}

	public static void main(String[] args) {
		String[] one=new String[] {"one","one","two","three"};
		
		LinkedList<String> arr=new LinkedList<String>() ;
		
		arr=change(one);
		
		String[] two=new String[] {"one"};
		removeFromLinkedList(arr,two);
		
		for(String some: arr) {
			System.out.println(some);
		}
		
		
		


	}

}

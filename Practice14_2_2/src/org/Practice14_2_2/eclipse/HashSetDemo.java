package org.Practice14_2_2.eclipse;


import java.util.HashSet;

public class HashSetDemo {
	
	public static HashSet<String> change(String[] a){
		HashSet<String> hash1=new HashSet<String>();
		for(String some:a) {
			hash1.add(some);
		}
		return hash1;
	}

	public static void removeFromHashSet(HashSet<String>list, String[] s) {
		for(int i=0; i<s.length;i++) {
			if(list.contains(s[i])) {
				list.remove(s[i]);
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		String[] arr=new String[] {"one","one","two"};
		
		HashSet<String> hs=new HashSet<String>();
		
		String[] arr2=new String[] {"one"};
		hs=change(arr);
		removeFromHashSet(hs,arr2);
		
		for(String some: hs) {
			System.out.println(some);
		}
		
		


	}

}

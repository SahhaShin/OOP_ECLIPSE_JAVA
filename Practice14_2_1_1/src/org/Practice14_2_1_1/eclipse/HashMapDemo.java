package org.Practice14_2_1_1.eclipse;

import java.util.HashMap;

public class HashMapDemo {
	public static void printMap(HashMap<String, Integer> map) {
		System.out.println("Map contains:");
		for(String mountainName : map.keySet()) {
			Integer height=map.get(mountainName);
			System.out.println(mountainName+" -> "+height.intValue()+" feet.");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		HashMap<String, Integer>mountains=new HashMap<String, Integer>();
		mountains.put("Everest",29029);
		mountains.put("K2",28251);
		mountains.put("Kangchenjunga",28169);
		mountains.put("Denali",20335);
		printMap(mountains);
		
		System.out.println("Denali in the map: "+mountains.containsKey("Denali"));
		System.out.println();
		System.out.println("Changing height of Denali.");
		mountains.put("Denali",20320);
		printMap(mountains);
		
		System.out.println("Removing Kangchenjunga.");
		mountains.remove("Kangchenjunga");
		printMap(mountains);

	}

}

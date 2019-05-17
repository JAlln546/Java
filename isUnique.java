package ch10;

import java.util.*;

// to create a method that will determine if there are duplicate last names.

public class isUnique {

	public static void main(String[] args) {
		// create the map
		Map<String, String> names = new TreeMap<>();
		
		names.put("Marty", "Stepp");
		names.put("Stuart", "Reges");
		names.put("Jessica", "Miller");
		names.put("Amanda", "Camp");
		names.put("Hal", "Perkins");
		
		System.out.println(isUnique(names));
		
		// create the second map
		Map<String, String> names2 = new TreeMap<>();
		
		names2.put("Kendrick", "Perkins");
		names2.put("Stuart", "Reges");
		names2.put("Jessica", "Miller");
		names2.put("Bruce", "Reges");
		names2.put("Hal", "Perkins");
		
		System.out.println(isUnique(names2));
		
		

	}
	//check the values for duplicates
	public static boolean isUnique(Map<String, String> map) {
		// create the key:value map
		Set<String> last = new HashSet<String>();
		for (String name : map.values()) {
			if(last.contains(name))	{
				return false;
			} else {
				last.add(name);
			}
			System.out.println(last);
		}
		
		return true;
		
	}
	
	
	
	/*
	// create the key:value map
			Collection<String> last = names.values();
			for (String name : last) {
				System.out.println("Last Name: " + name);
			}
			*/

}

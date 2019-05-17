package ch10;

import java.io.*;
import java.util.*;


//Write a method called countUnique that accepts a list of integers as a parameter
//and returns the number of unique integer values in the list.
//Use a set as auxiliary storage to help you solve this problem.

public class countUnique {
	// THIS PROGRAM WILL FIND THE UNIQUE NUMBERS IN A SET
	

	
	public static void main(String[] args) throws FileNotFoundException {
	List<Integer> list = new LinkedList<Integer>();
	
	list.add(3);
	list.add(7);
	list.add(3);
	list.add(-1);
	list.add(2);
	list.add(3);
	list.add(7);
	list.add(2);
	list.add(15);
	list.add(15);
	
	
	// create empty list
	List<Integer> emptyList = new LinkedList<Integer>();	
	int uniqueNum = countUnique(list);
	System.out.println("Number of unique integer values is " + uniqueNum);
	int emptyResult = countUnique(emptyList);
	System.out.println("Number of unique integer values is " + emptyResult);

	
	}
	
	public static int countUnique(List<Integer> list) {
			Set<Integer> uniqueList = new HashSet<Integer>();
			
			for(Integer i : list) {
				uniqueList.add(i);
				System.out.println(uniqueList);
				
			} return uniqueList.size();
			
	
			
}
}

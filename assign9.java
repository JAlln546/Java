import java.util.ArrayList;

// Write a method called isSorted that returns true if the list is sorted
// and returns false if the list is not sorted.
// An empty list is considered to be sorted.

public class Assign9 {
	
	public static boolean isSorted(int[] list) {

		for (int i = 0; i < list.length - 1; i++) {
	        if (list[i] > list[i + 1]) {
	        	System.out.println("Your list is NOT sorted!");
	            return false; // It is proven that the array is not sorted.
	        }
	    }
		System.out.println("Your list is sorted!");
		
	    return true; // If this part has been reached, the array must be sorted.
		
	}
	

	public static void main(String[] args) {
		
		// Instantiate the List
		int[] list = {3, 6, 1, 9, 3, 2, 11};
		int[] list2 = {3, 6, 8, 11, 16, 33, 94};
		
		
		System.out.println(isSorted(list));
		System.out.println();
		System.out.println(isSorted(list2));
		

	}
	

}

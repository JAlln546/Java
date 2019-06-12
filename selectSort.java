import java.util.*;

public class selectSort {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declare integer list
		int[] list = {2, 43, 110, 23, 78, 332, 25};
		System.out.println("Array Before Sort: " + Arrays.toString(list));
		System.out.println();
		selectionSort(list);
		System.out.println("Array After Sort: " + Arrays.toString(list));
		

	}
	public static void selectionSort(int[] a) {
		for(int i = a.length - 1; i >= 0; i--) {
			int largest = i;
			for(int j = 0; j < i; j++) {
				if(a[j] > a[largest]) {
					largest = j;
				}
			}
			swap(a, i, largest);
		}
	}
	public static void swap(int[] a, int i, int largest) {
		// TODO Auto-generated method stub		
		int swappy = a[i];
		a[i] = a[largest];
		a[largest] = swappy;		
	} 

}

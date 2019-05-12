import java.util.ArrayList;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {	
		System.out.println("Using a loop, prompt the user to enter a number.");
		System.out.println("Add number to end of array.");
		System.out.println("Stop asking for numbers when the user enters \"-99\"");
		runtTheLoop();	
		
	}

	private static void runtTheLoop() {		
		
		// create new scanner and variable to store the data
		Scanner console = new Scanner(System.in);
		int number = console.nextInt();
		
		//initialize the ArrayList outside of loop to be called within loop
		ArrayList<Integer> list = new ArrayList<>();
		while (number != -99) {
			list.add(number);
			System.out.println("Keep adding numbers!");
			number = console.nextInt();
		}
		// Display the list
		System.out.print("[");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.print("]");
		
		console.close();					
		
	}

}

package ch10;

public class writeNums {

	public static void main(String[] args) {
		writeNums(5);
		System.out.println();
		writeNums(12);
		System.out.println();
		writeNums(1);
    System.out.println();
		writeNums(0);
		System.out.println();
		writeNums(-3);

	}
	private static void writeNums(int n) {		
		
			if(n == 1) {
				System.out.print(n);				
			} else if (n > 1) {
				writeNums(n - 1);
				System.out.print(", " + n);
			} else {
				throw new IllegalArgumentException("There is an error! Must be greater than 0.");				
			}
		
	}	

}

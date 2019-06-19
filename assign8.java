
public class Assign8 {
	private int[] elementData;
	private int size;

	// constructor
	public void ArrayIntList() {
		elementData = new int[100];
		size = 0;
	}

	// method adds element into array
	public void add(int value) {
		elementData[size] = value;
		size++;
	}

	// dispaly elements
	public void print() {
		if (size == 0) {
			System.out.println("[]");
		} else {
			System.out.print("[" + elementData[0]);
			for (int i = 1; i < size; i++) {
				System.out.print(", " + elementData[i]);
			}
			System.out.println("]");

		}
	}

	// replaces first parameter with second parameter
	public void replaceAll(int value, int replace) {
		{
			// loop repeats for entire array
			for (int i = 0; i < size; i++) {
				if (elementData[i] == value) {
					elementData[i] = replace;
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrayIntList list = new ArrayIntList();
	
		list.add(5);
		list.add(19);
		list.add(0);
		list.add(2);
		list.add(4);
		list.add(0);
		list.add(13);
		list.add(85);
		list.add(-8);
		list.add(0);
		list.add(23);

		System.out.println("List Before Replace: ");
		list.print();
		System.out.println();

		list.replaceAll(0, 1);
		System.out.println("List After Replace: ");
		list.print();
		System.out.println("Product will not be equal to 0 now.");

	}
}

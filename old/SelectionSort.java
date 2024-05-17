class SelectionSort {
	public static void main(String[] args) {
		System.out.println("----- Selection sort practice -----");
		System.out.println(""); // line
		
		int arr[] = {3, 2, 7, 6, 4, 8, 5, 9};
		
		System.out.print("Array: ");
		for(int i : arr) System.out.print(i+" ");
		
		System.out.println(""); // line
		
		selectionSort(arr);
		
		System.out.print("Sorted array: ");
		for(int i : arr) System.out.print(i+" ");
		
		System.out.println(""); // line
	}
	
	private static void selectionSort(int[] arr) {
		int menor, aux;
		for(int i = 0; i < arr.length; i++) {
			menor = i;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] < arr[menor]) menor = j;
			}
			aux = arr[menor];
			arr[menor] = arr[j];
			arr[j] = aux;
		}
	}
}

/*
RUNNING COMMANDS AND OUTPUT:
	C:\Users\igorb\Documents\Github\Javinha>javac QuickSort.java

	C:\Users\igorb\Documents\Github\Javinha>java QuickSort
	----- Quick sort practice -----

	Array: 3 2 7 6 4 8 5 9
	Sorted array: 2 3 4 5 6 7 8 9

	C:\Users\igorb\Documents\Github\Javinha>
*/
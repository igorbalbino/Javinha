class QuickSort {
	public static void main(String[] args) {
		/*
		ao invés de ordernar o array inteiro, seleciona um elemento mais ao meio (pivô) e coloca os maiores que o pivo a direita e os menores a esquerda.
		Link: https://youtu.be/BW2qE_7HNG8?si=jSesfPHBPgX8PDAW
		*/
		System.out.println("----- Quick sort practice -----");
		System.out.println(""); // line
		
		int arr[] = {3, 2, 7, 6, 4, 8, 5, 9};
		
		System.out.print("Array: ");
		for(int i : arr) System.out.print(i+" ");
		
		System.out.println(""); // line
		
		quickSort(arr, 0, arr.length-1);
		
		System.out.print("Sorted array: ");
		for(int i : arr) System.out.print(i+" ");
		
		System.out.println(""); // line
	}
	
	private static void quickSort(int[] arr, int esq, int dir) {
		if(esq < dir) {
			int p = particao(arr, esq, dir);
			quickSort(arr, esq, p);
			quickSort(arr, p+1, dir);
		}
	}
	
	private static int particao(int[] arr, int esq, int dir) {
		int meio = (esq+dir)/2;
		int pivot = arr[meio];
		int i = esq-1;
		int j = dir+1;
		
		while(true) {
			do {i++;}
			while(arr[i] < pivot);
			
			do {j--;}
			while(arr[j] > pivot);
			
			if(i >= j) {
				return j;
			}
			
			int aux = arr[i];
			arr[i] = arr[j];
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
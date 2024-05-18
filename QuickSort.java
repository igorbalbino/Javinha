class QuickSort {
	public static void main(String[] args) {
		int [] arr = {5, 2, 7, 4, 9, 8, 6};
		
		System.out.println("arr values: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//passamos, por referentcia, o array, primeira posição e a última posição do array
		quickSort(arr, 0, arr.length-1);
		
		System.out.println("sorted values: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Hello World!");
	}
	
	private static void quickSort(int[] arr, int low, int high) {
		//valida valores
		if(low < high) {
			// encontra o índice do pivô após o particionamento
            int pi = partition(arr, low, high);
			
			// Ordena recursivamente as sublistas
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
		}
	}
	
	private static int partition(int[] arr, int low, int high) {
		// escolhe o último elemento como pivô
        int pivot = arr[high];

        // indice do elemento menor que o pivô
        int i = (low - 1);
		
		for(int j=low; j < high; j++) {
			//valida elemento atual menor q o pivo
			if(arr[j] <= pivot) {
				i++;
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		//troca o pivot com o elemnto i+1
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		//retorna idx do pivo
		return i + 1;
	}
}
class SortsTraning {
	public static void main(String [] args) {
		int [] arr = new int[30];
		
		for(int i=0; i<arr.length; i++) arr[i] = (int) Math.floor(Math.random()*arr.length+i);
		
		System.out.println("arr valurs: ");
		for(int i=0; i<arr.length; i++) System.out.println(arr[i]);
		
		//quickSort(arr, 0, arr.length-1);
		
		//heap
		/*int tam = arr.length;
		for(int i=tam/2-1; i>=0; i--) heapSort(arr, tam, i);
		
		for(int i=tam-1; i>0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapSort(arr, i, 0);
		}*/
		
		mergeSort(arr, 0, arr.length-1);
		
		System.out.println("sorted valurs: ");
		for(int i=0; i<arr.length; i++) System.out.println(arr[i]);
		
		System.out.println();
		System.out.println("Hello World!");
	}
	
	private static void quickSort(int [] arr, int ini, int end) {
		if(ini<end) {
			int pivo = partition(arr, ini, end);
			
			quickSort(arr, ini, pivo);
			quickSort(arr, pivo+1, end);
		}
	}
	
	private static int partition(int [] arr, int ini, int end) {
		int mid = (ini+end)/2;
		int pivo = arr[mid];
		int i = ini-1;
		int j = end+1;
		
		while(true) {
			do{i++;}while(arr[i]<pivo);
			do{j--;}while(arr[j]>pivo);
			
			if(i>=j) return j;
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	
	private static void heapSort(int []arr, int tam, int pos) {
		int raiz = pos;
		int esq = 2*pos+1;
		int dir = 2*pos+2;
		
		if(esq<tam && arr[esq] > arr[raiz]) raiz = esq;
		if(dir<tam && arr[dir] > arr[raiz]) raiz = dir;
		
		if(raiz != pos) {
			int temp = arr[pos];
			arr[pos] = arr[raiz];
			arr[raiz] = temp;
			
			heapSort(arr, tam, raiz);
		}
	}
	
	private static void mergeSort(int [] arr, int ini, int end) {
		if(ini<end) {
			int mid = (ini+end)/2;
			
			mergeSort(arr, ini, mid);
			mergeSort(arr, mid+1, end);
			
			merge(arr, ini, mid, end);
		}
	}
	
	private static void merge(int [] arr, int ini, int mid, int end) {
		int leftSize = mid-ini+1;
		int rightSize = end-mid;
		int []left = new int[leftSize];
		int [] right = new int[rightSize];
		
		for(int i=0; i<leftSize; i++) left[i] = arr[ini+i];
		for(int i=0; i<rightSize; i++) right[i] = arr[mid+1+i];
		
		int i = 0;
		int j = 0;
		int k = ini;
		
		while(i<leftSize && j<rightSize) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i < leftSize) {
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while(j < rightSize) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
}
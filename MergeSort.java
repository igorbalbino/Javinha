class MergeSort {
	public static void main(String[] args) {
		int[] arr = {1,14,8,7,6,78,65,74,61,73,68,5,76};
		int[] aux = new int[arr.length];
		
		System.out.println("arr valures: ");
		for(int i=0; i< arr.length; i++) System.out.println(arr[i]);
		
		mergeSort(arr, aux, 0, arr.length-1);
		
		System.out.println("sorted valures: ");
		for(int i=0; i< arr.length; i++) System.out.println(arr[i]);
	}
	
	private static void mergeSort(int[] arr, int[] aux, int ini, int end) {
		if(ini < end) {
			int mid = (int) (ini+end)/2;
			
			mergeSort(arr, aux, ini, mid);
			mergeSort(arr, aux, mid+1, end);
			intercalar(arr, aux, ini, mid, end);
		}
	}
	
	private static void intercalar(int[] arr, int[] aux, int ini, int mid, int end) {
		for(int k=0; k<=end; k++) aux[k] = arr[k];
		
		int i = ini;
		int j = mid+1;
		
		for(int k=ini; k<=end; k++) {
			if(i > mid) arr[k] = aux[j++];
			else if(j> end) arr[k] = aux[i++];
			else if(aux[i] < aux[j]) arr[k] = aux[i++];
			else arr[k] = aux[j++];
		}
	}
}
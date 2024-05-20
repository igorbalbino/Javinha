/*
you were dsignated to create a system to sort a list of suspects and find the position of the infiltrated. the sorting and the search must be fast, so the suspect can not escape. 
find it and name its position for the elimination team.
*/

class OrderAndElimination {
	public static void main(String [] args) {
		int [] suspects = {9,2,1,29,0,12,4,3,5,45,39,7,6,8,73};
		
		System.out.println("suspects: ");
		for(int i=0; i<suspects.length; i++) System.out.println(suspects[i]);
		
		quickSort(suspects, 0, suspects.length-1);
		
		System.out.println("sorted suspects: ");
		for(int i=0; i<suspects.length; i++) System.out.println(suspects[i]);
		
		int pos = binarySearch(suspects, 39, 0, suspects.length-1);
		
		System.out.println("suspect position: "+pos+" | suspect: "+suspects[pos]);
	}
	
	private static void quickSort(int[] arr, int ini, int end) {
		if(ini < end) {
			int pivo = partition(arr, ini, end);
			
			quickSort(arr, ini, pivo);
			quickSort(arr, pivo+1, end);
		}
	}
	
	private static int partition(int[] arr, int ini, int end) {
		int mid = (int)(ini+end)/2;
		int pivo = arr[mid];
		int i = ini-1;
		int j = end+1;
		
		while(true) {
			do{i++;}while(arr[i]<pivo); // tive q olhar o pivo
			do{j--;}while(arr[j]>pivo); // tive q olhar o pivo
			
			if(i>=j) return j;
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	
	private static int binarySearch(int[] arr, int target, int ini, int end) {
		if(ini <= end) {
			int mid = (int)(ini+end)/2;
			
			if(target == arr[mid]) return mid;
			if(target < arr[mid]) return binarySearch(arr, target, ini, mid);
			if(target > arr[mid]) return binarySearch(arr, target, mid+1, end);
		}
		return -1;
	}
}
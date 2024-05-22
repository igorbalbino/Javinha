class CrescenteEAchar {
	public static void main(String []args) {
		int []arr = {8,7,6,5,9,0,87,67,86,54,3,2,32,4,56,78,97,63,1,12,42,32,29,36};
		
		System.out.println("arr values: ");
		for(int i=0; i<arr.length; i++) System.out.println(arr[i]);
		
		quickSort(arr, 0, arr.length-1);
		
		System.out.println("sorted values: ");
		for(int i=0; i<arr.length; i++) System.out.println(arr[i]);
		
		int find = 36;
		
		System.out.println();
		System.out.println("Trying to find: "+find+"...");
		System.out.println();
		
		int pos = binarySearch(arr, find, 0, arr.length-1);
		
		System.out.println("Position: "+pos+" | Value: "+find);
		
		//System.out.println();
		//System.out.println("Hello World!");
	}
	
	private static void quickSort(int []arr, int ini, int end) {
		if(ini < end) {
			int pivo = partition(arr, ini, end);
			
			quickSort(arr, ini, pivo);
			quickSort(arr, pivo+1, end);
		}
	}
	
	private static int partition(int []arr, int ini, int end) {
		int mid = (ini+end)/2;
		int pivo = arr[mid];
		int i = ini-1;
		int j = end+1;
		
		while(true){
			do{i++;}while(arr[i]<pivo);
			do{j--;}while(arr[j]>pivo);
			
			if(i>=j) return j;
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	
	private static int binarySearch(int []arr, int target, int ini, int end) {
		if(ini <= end) {
			int mid = (ini+end)/2;
			
			if(arr[mid] == target) return mid;
			if(arr[mid] > target) return binarySearch(arr, target, ini, mid);
			if(arr[mid] < target) return binarySearch(arr, target, mid+1, end);
		}
		return -1;
	}
}
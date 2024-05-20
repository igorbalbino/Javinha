class MergeSort {
	public static void main(String [] args) {
		int []arr = {1,3,8,4,5,6,7,38,9,61,53,84,73,18,2,75,64};
		
		System.out.println("arr values: ");
		for(int i=0; i< arr.length; i++) System.out.println(arr[i]);
		
		mergeSort(arr, 0, arr.length-1);
		
		System.out.println("sorted values: ");
		for(int i=0; i< arr.length; i++) System.out.println(arr[i]);
	}
	
	private static void mergeSort(int []arr, int ini, int end) {
		if(ini < end) {
			int mid = ini+(end-ini)/2;
			
			mergeSort(arr, ini, mid);
			mergeSort(arr, mid+1, end);
			
			merge(arr, ini, mid, end);
		}
	}
	
	private static void merge(int []arr, int ini, int mid, int end) {
		int lSize = mid-ini+1;
		int rSize = end-mid;
		int []left = new int[lSize];
		int []right = new int[rSize];
		
		for(int i=0; i<lSize; i++) {
			left[i] = arr[ini+i];
		}
		
		for(int j=0; j<rSize; j++) {
			right[j] = arr[mid+1+j];
		}
		
		int i = 0;
		int j = 0;
		int k = ini;
		
		while(i < lSize && j < rSize) {
			if(left[i] <= right[j]){
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i < lSize) {
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while(j < rSize) {
			arr[k] = right[j];
			j++;
			k++;
		}
		
		
	}
}
/*
https://youtu.be/BW2qE_7HNG8?si=M5GmWBqhNO2JxGzl
*/
class QuickSort {
	public static void main(String[] args) {
		int[] arr = {9,1,5,4,6,8,11,45,22,37,32,42,88,91,2,7};
		
		System.out.println("arr values: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		quickSort(arr, 0, arr.length-1);
		
		System.out.println("sorted values: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	private static void quickSort(int[] arr, int menor, int maior) {
		if(menor < maior) {
			int pivo = partition(arr, menor, maior);
			
			quickSort(arr, menor, pivo);
			quickSort(arr, pivo+1, maior);
		}
	}
	
	private static int partition(int[] arr, int menor, int maior) {
		int mid = (menor+maior) / 2;
		int pivo = arr[mid];
		int i = menor-1;
		int j = maior+1;

		while(true) {
			do{i++;}while(arr[i]<pivo);
			do{j--;}while(arr[j]>pivo);
			
			if(i>=j) return j;
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
class BinarySearch {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("arr values: ");
		for(int i=0; i < arr.length; i++) System.out.println(arr[i]);
		
		int position = binarySearch(arr, 6, 0, arr.length-1);
		
		System.out.println("location: "+position);
	}
	
	private static int binarySearch(int[] arr, int target, int ini, int end) {
		if(ini<=end) {
			int mid = (int) (ini+end)/2;
			
			if(arr[mid] == target) return mid;
			if(arr[mid] > target) return binarySearch(arr, target, ini, mid-1);
			if(arr[mid] < target) return binarySearch(arr, target, mid+1, end);
		}
		return -1;
	}
}
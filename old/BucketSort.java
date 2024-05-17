class BucketSort {
	public static void main(String[] args) {
		System.out.println("----- Bucket sort practice -----");
		System.out.println(""); // line
		
		//int arr[] = {3, 2, 7, 6, 4, 8, 5, 9};
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) arr[i] = (int) (Math.random() * arr.length);
		
		System.out.print("Array: ");
		for(int i : arr) System.out.print(i+" ");
		
		System.out.println(""); // line
		
		//
	}
}
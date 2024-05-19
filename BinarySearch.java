/*
https://youtu.be/hKI93hOfeIk?si=zr4sbs59dH319Rb5
https://youtu.be/MFhxShGxHWc?si=5dTXJ8Qwz0sbOQvG
*/
class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {0, 1,2,3,4,5,6,7,8,9};
	
		int idx = binarySearch(arr, 6, 0, arr.length-1);
		
		System.out.println(idx);
	}
	
	private static int binarySearch(int[] arr, int target, int init, int end) {
		/*recebemos os 4 params para fazer de forma recursiva, senão seria necessario um while*/
		/*se init maior ou igual end, significa q n achamos em lugar nenhum, pois o meio também é retornado se compativel*/
		if(init <= end) {
			// meio do array
			int mid = init + ((end - init) / 2);
			
			// se o meio é igual ao target, damos o meio
			if(arr[mid] == target) return mid;

			/*se o valor do meio do array for maior q target, passamos apenas o inicio do array ate menos q que o meio, pois o nosso target esta nesse range, pq é menor que o valor do meio*/
			if(arr[mid] > target) return binarySearch(arr, target, init, mid-1);
			
			// o contrario de cima
			if(arr[mid] < target) return binarySearch(arr, target, mid+1, end);
		}
		return -1;
	}
}
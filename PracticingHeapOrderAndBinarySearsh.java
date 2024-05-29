class PracticingHeapOrderAndBinarySearsh {
	public static void main(String [] args) {
		int [] arr = new int[20];
		
		for(int i=0; i<arr.length; i++) arr[i] = (int) Math.floor(Math.random()*i);
		
		System.out.println("arr values");
		for(int i=0; i<arr.length; i++) System.out.println(arr[i]);
		
		int tam = arr.length;
		for(int i=tam/2-1; i>=0; i--) heapSort(arr, tam, i);
		
		for(int i=tam-1; i>0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapSort(arr, i, 0);
		}
		
		System.out.println("sorted values");
		for(int i=0; i<arr.length; i++) System.out.println(arr[i]);
		
		int pos = binarySearch(arr, 8, 0, arr.length-1);
		
		System.out.println("position: "+pos);
		
		System.out.println("Hello World!");
	}
	
	private static void heapSort(int [] arr, int tam, int pos) {
		int raiz = pos;
		int esq = 2*pos+1;
		int dir = 2*pos+2;
		
		if(esq<tam && arr[esq]>arr[raiz]) raiz = esq;
		if(dir<tam && arr[dir]>arr[raiz]) raiz = dir;
		
		if(raiz != pos) {
			int temp = arr[pos];
			arr[pos] = arr[raiz];
			arr[raiz] = temp;
			
			heapSort(arr, tam, raiz);
		}
	}
	
	private static int binarySearch(int [] arr, int target, int ini, int end) {
		if(ini<=end) {
			int mid = (int) (ini+end)/2;
			
			if(arr[mid] == target) return mid;
			if(arr[mid] > target) return binarySearch(arr, target, ini, mid-1);
			if(arr[mid] < target) return binarySearch(arr, target, mid+1, end);
		}
		return -1;
	}
}
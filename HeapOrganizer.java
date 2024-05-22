class HeapOrganizer {
	public static void main(String [] args) {
		int []arr = new int[30];
		
		for(int i=0; i<arr.length; i++) arr[i] = (int) Math.floor(Math.random()*i+1);
		
		System.out.println("arr values: ");
		for(int i=0; i<arr.length; i++) System.out.println(arr[i]);
		
		int tam = arr.length;
		for(int i=tam/2-1; i>=0; i--){
			heapSort(arr, tam, i);
		}
		
		System.out.println("semi-sorted values: ");
		for(int l=0; l<arr.length; l++) System.out.println(arr[l]);
		
		for(int i=tam-1; i>0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapSort(arr, i, 0);
		}
		
		System.out.println("sorted values: ");
		for(int i=0; i<arr.length; i++) System.out.println(arr[i]);
		
		System.out.println();
		System.out.println("Hello World!");
	}
	
	private static void heapSort(int [] arr, int tam, int pos) {
		int raiz = pos;
		int esquerda = 2*pos+1;
		int direita = 2*pos+2;
		
		if(esquerda<tam && arr[esquerda] > arr[raiz]) raiz = esquerda;
		if(direita<tam && arr[direita] > arr[raiz]) raiz = direita;
		
		if(raiz != pos) {
			int temp = arr[pos];
			arr[pos] = arr[raiz];
			arr[raiz] = temp;
			
			heapSort(arr, tam, raiz);
		}
	}
}
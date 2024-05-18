/*
	O Bubble Sort é um algoritmo de ordenamento simples e intuitivo, mas nem sempre o mais eficiente. Ele funciona como uma série de "passadas" pela lista, comparando elementos adjacentes e trocando suas posições se estiverem fora de ordem
*/
class BubbleSort {
	public static void main(String [] args) {
		
		int [] arr = {5, 2, 7, 4, 9, 8, 6};
		
		System.out.println("arr values: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		arr = bubbleSort(arr);
		
		System.out.println("sorted values: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Hello World!");
	}
	
	private static int[] bubbleSort(int []arr) {
		//primeiro loop para checar todos os elementos
		for(int j=0;j<arr.length-1;j++) {
			//segundo loop para fazer a troca
			for(int i=0; i<arr.length-1; i++) {
				//verifica se precisa trocar
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		return arr;
	}
}
class BubbleSort {
	public static void main(String[] args) {
		System.out.println("----- Bubble sorting practice -----");
		System.out.println(""); // line
		
		int v[] = {3, 2, 7, 6, 4, 8, 5, 9};
		
		System.out.print("Vector: ");
		for(int i : v) System.out.print(i+" ");
		
		System.out.println(""); // line
		
		int[] vec = bubbleSort(v);
		System.out.print("Bubble sorted array: ");
		for(int i : vec) System.out.print(i+" ");
		
		System.out.println(""); // line
	}
	
	private static int[] bubbleSort(int[] vector) {
		System.out.println("Sorting...");
		System.out.println(""); // line
		
		int aux;
		
		/*
		// o for i não é necessário. ou poderia ter apenas ele. 
		for(int i=0; i < vector.length; i++) {
			for(int j=0; j < (vector.length-1); j++) {
				if(vector[j] > vector[j+1]) {
					aux = vector[j+1];
					vector[j+1] = vector[j];
					vector[j] = aux;
				}
			}
		}
		*/
		
		for(int j=0; j < (vector.length-1); j++) {
			if(vector[j] > vector[j+1]) {
				aux = vector[j+1];
				vector[j+1] = vector[j];
				vector[j] = aux;
			}
		}
		
		return vector;
	}
}

/*
RUNNING COMMANDS AND OUTPUT:
	C:\Users\igorb\Documents\Github\Javinha>javac Sorting.java

	C:\Users\igorb\Documents\Github\Javinha>java Sorting
	----- Sorting practice -----

	Vector: 3 2 7 6 4 8 5 9
	Sorting...

	Bubble sorted array: 2 3 6 4 7 5 8 9

	C:\Users\igorb\Documents\Github\Javinha>
*/
/*
para representar os nodos da arvore bnaria, precisamos de 2 pequenas equações que são: 'esquerda': 2*i+1 e 'direita': 2*i+2.
assim, com um vetor: [2,1,8,9,6,5,1] fazemos, para o nodo à esquerda:
'2*0+1 = 1' e '2*0+2 = 2' essas são as posições q representam os nodos filhos da raiz (0).
arvore:
	2
1		8

sendo assim, consideramos que, se fizermos os calculos com metade dos elementos da lista, vamos ter pego todos os elementos em algum nodo da arvore.

*/
class HeapSort {
	public static void main(String[] args) {
		int[] arr = new int[30];
		
		for(int i=0; i<arr.length; i++) arr[i] = (int) Math.floor(Math.random()*arr.length);
		
		System.out.println("arr values: ");
		for(int j=0; j<arr.length; j++) System.out.println(arr[j]);
		
		int tam = arr.length;
		
		//pega apenas metade da lista para calcular os nodos da lista inteira
		for(int k = tam/2-1; k>=0; k--) {
			heapSort(arr, tam, k);
		}
		
		System.out.println("semi-sorted values: ");
		for(int l=0; l<arr.length; l++) System.out.println(arr[l]);
		
		//aqui, pegamos os maiores valores da lista e colocamos no final. para isso o for, que começa com tamanho-1 e para cara m maior q 0, diminui 1 em m
		for(int m=tam-1; m>0; m--) {
			int temp = arr[0]; //pois é o elemento raiz
			arr[0] = arr[m]; // coloca o ultimo valor na raiz
			arr[m] = temp;

			//chama o heapSort para reordenar os valores da frente
			heapSort(arr, m, 0);
		}
		
		System.out.println("sorted values: ");
		for(int n=0; n<arr.length; n++) System.out.println(arr[n]);
		
		System.out.println();
		System.out.println("Hello World!");
	}
	
	private static void heapSort(int []arr, int tam, int pos) {
		//elemento raiz
		int raiz = pos;
		//elemento a esquerda
		int esquerda = 2*pos+1;
		//elemento a direita
		int direita = 2*pos+2;

		//validamos se o indice ainda esta dentro do tamannho da lista e se os valores adjacentes sao maiores do que o da raiz. se algum valor é maior que a raiz, trocamos a raiz com esse valor
		if(esquerda<tam && arr[esquerda] > arr[raiz]) raiz = esquerda;
		if(direita<tam && arr[direita] > arr[raiz]) raiz = direita;

		//se a raiz, que iniciou sendo a posicao que passamos por parametro, for diferente da posicao do parametro, é pq houve troca, ai chamamos o heapSort novamente para corrigir os nodos da frente também
		if(raiz != pos) {
			int temp = arr[pos];
			arr[pos] = arr[raiz];
			arr[raiz] = temp;
			
			heapSort(arr, tam, raiz);
		}
	}
}
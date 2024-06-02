class DFSTree {
	Node root;
	
	public static void main(String [] args) {
		DFSTree tree = new DFSTree();
		
		tree.root = tree.add(tree.root, 9);
		tree.root = tree.add(tree.root, 4);
		tree.root = tree.add(tree.root, 2);
		tree.root = tree.add(tree.root, 3);
		tree.root = tree.add(tree.root, 6);
		tree.root = tree.add(tree.root, 7);
		tree.root = tree.add(tree.root, 5);
		tree.root = tree.add(tree.root, 8);
		tree.root = tree.add(tree.root, 1);
		
		tree.printTree(tree.root);
		
		System.out.println("");
		
		int longestway = tree.longestWay(tree.root);
		
		System.out.println("Caminho mais longo: "+longestway);
	}
	
	public Node add(Node focusNode, int key) {
		if(focusNode == null) return new Node(key);
		
		if(key < focusNode.key) focusNode.left = add(focusNode.left, key);
		else focusNode.right = add(focusNode.right, key);
		
		return focusNode;
	}
	
	public void printTree(Node focusNode) {
		if(focusNode != null) {
			printTree(focusNode.left);
			System.out.println(focusNode);
			printTree(focusNode.right);
		}
	}
	
	public int longestWay(Node focusNode) {
		if(focusNode == null) return 0;
		
		int alturaEsquerda = longestWay(focusNode.left);
		int alturaDireita = longestWay(focusNode.right);
		
		int actualWay = alturaEsquerda+alturaDireita+1; // +1 para o nó atual
		
		return Math.max(actualWay, Math.max(alturaEsquerda, alturaDireita));
	}
	
	/*
	O método encontrarCaminhoMaisLongoRecursivo percorre a árvore recursivamente.
	Em cada nó, ele calcula a altura da subárvore esquerda e direita usando chamadas recursivas.
	A variável caminhoAtual calcula a soma das alturas das subárvores esquerda e direita mais 1 (para o nó atual).
	O método retorna o maior valor entre caminhoAtual, alturaEsquerda e alturaDireita, garantindo que o caminho mais longo seja sempre considerado.
	*/
	
	private class Node {
		int key;
		Node left;
		Node right;
		
		public Node(int key) {
			this.key = key;
		}
		
		public String toString() {
			return "Key: "+this.key;
		}
	}
}
class ElTree {
	Node root;
	
	public static void main(String [] args) {
		ElTree tree = new ElTree();
		
		tree.root = tree.add(tree.root, 9);
		tree.root = tree.add(tree.root, 2);
		tree.root = tree.add(tree.root, 4);
		tree.root = tree.add(tree.root, 3);
		tree.root = tree.add(tree.root, 1);
		tree.root = tree.add(tree.root, 6);
		tree.root = tree.add(tree.root, 8);
		tree.root = tree.add(tree.root, 0);
		tree.root = tree.add(tree.root, 7);
		tree.root = tree.add(tree.root, 11);
		tree.root = tree.add(tree.root, 12);
		tree.root = tree.add(tree.root, 15);
		
		tree.printTransversalTree(tree.root);
		
		int longest = tree.longestWay(tree.root);
		
		System.out.println("longest: "+longest);
	}
	
	public Node add(Node focusNode, int key) {
		if(focusNode == null) return new Node(key);
		
		if(key < focusNode.key) focusNode.left = add(focusNode.left, key);
		else focusNode.right = add(focusNode.right, key);
		
		return focusNode;
	}
	
	public void printTransversalTree(Node focusNode) {
		if(focusNode != null) {
			printTransversalTree(focusNode.left);
			System.out.println(focusNode);
			printTransversalTree(focusNode.right);
			
		}
	}
	
	public int longestWay(Node focusNode) {
		if(focusNode == null) return 0;
		
		int esquerdo = longestWay(focusNode.left);
		int direito = longestWay(focusNode.right);
		
		int atual = esquerdo+direito+1;
		
		return Math.max(atual, Math.max(esquerdo, direito));
	}
	
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
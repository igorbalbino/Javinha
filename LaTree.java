class LaTree {
	Node raiz;
	
	public static void main(String [] args) {
		LaTree tree = new LaTree();
		
		tree.add(8, "Nazarum");
		tree.add(2, "Einjiri");
		tree.add(4, "Heiidai");
		tree.add(9, "Azrudain");
		tree.add(7, "Dalaszir");
		tree.add(5, "Tzamirut");
		tree.add(3, "Alastor");
		
		tree.recursivePrint(tree.raiz);
	}
	
	public void add(int key, String name) {
		raiz = addRecursive(raiz, key, name);
	}
	
	private Node addRecursive(Node focusNode, int key, String name) {
		if(focusNode == null) return new Node(key, name);
		
		if(key < focusNode.key)focusNode.left = addRecursive(focusNode.left, key, name);
		else focusNode.right = addRecursive(focusNode.right, key, name);
		
		return focusNode;
	}
	
	public void recursivePrint(Node focusNode) {
		if(focusNode != null) {
			recursivePrint(focusNode.left);
			System.out.println(focusNode);
			recursivePrint(focusNode.right);
		}
	}
	
	private class Node {
		int key;
		String name;
		Node left;
		Node right;
		
		public Node(int key, String name) {
			this.key = key;
			this.name = name;
		}
		
		public String toString() {
			return "Key: "+this.key+" | Name: "+this.name;
		} 
	}
}
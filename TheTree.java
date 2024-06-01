class TheTree {
	Node root;
	
	public static void main(String [] args) {
		
		TheTree tree = new TheTree();
		
		tree.root = tree.add(tree.root, 7, "name1");
		tree.root = tree.add(tree.root, 2, "name2");
		tree.root = tree.add(tree.root, 4, "name3");
		tree.root = tree.add(tree.root, 9, "name4");
		tree.root = tree.add(tree.root, 1, "name5");
		
		tree.printTree(tree.root);
	}
	
	public Node add(Node focusNode, int key, String name) {
		if(focusNode == null) return new Node(key, name);
		
		if(key < focusNode.key) focusNode.left = add(focusNode.left, key, name);
		else focusNode.right = add(focusNode.right, key, name);
		
		return focusNode;
	}
	
	public void printTree(Node focusNode) {
		if(focusNode != null) {
			printTree(focusNode.left);
			System.out.println(focusNode);
			printTree(focusNode.right);
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
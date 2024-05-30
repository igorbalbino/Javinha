class BinaryTree {
	Node root;
	
	public static void main(String [] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.add(5);
		tree.add(9);
		tree.add(11);
		tree.add(4);
		tree.add(2);
		tree.add(6);
		
		tree.inOrderTraversalNode(tree.root);
		
		
		System.out.println("Hello World!");
	}
	
	public void add(int data) {
		Node nNode = new Node(data);
		
		if(root == null) root = nNode;
		else {
			// node em foco
			Node focusNode = root;
			
			//possivel node futuro
			Node parent;
			
			while(true) {
				parent = focusNode;
				
				if(data < parent.getData()) {
					focusNode = focusNode.left;
					if(focusNode == null) {
						parent.left = nNode;
						return;
					}
				} else {
					focusNode = focusNode.right;
					if(focusNode == null) {
						parent.right = nNode;
						return;
					}
				}
			}
		}
	}
	
	public void inOrderTraversalNode(Node focusNode) {
		if(focusNode != null) {
			inOrderTraversalNode(focusNode.left);
			
			System.out.println(focusNode);
			
			inOrderTraversalNode(focusNode.right);
		}
	}
	
	private class Node {
		
		private int data;
		public Node left;
		public Node right;
		
		public Node(int data) {
			this.data = data;
		}
		
		public int getData() {
			return this.data;
		}
		
		public String toString() {
			return "Node value: "+this.data;
		}
	}
}
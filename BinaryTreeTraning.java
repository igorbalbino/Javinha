class BinaryTreeTraning {
	Node root;
	
	public static void main(String [] args) {
		BinaryTreeTraning tree = new BinaryTreeTraning();
		
		tree.add(5);
		tree.add(2);
		tree.add(1);
		tree.add(3);
		tree.add(9);
		tree.add(4);
		tree.add(8);
		tree.add(7);
		tree.add(6);
		
		tree.inOrderTransversalNode(tree.root);
	}
	
	private void add(int v) {
		Node newNode = new Node(v);
		
		if(root == null) root = newNode;
		else {
			Node focusNode = root;
			Node parent;
			
			while(true) {
				parent = focusNode;
				if(v < parent.v) {
					focusNode = focusNode.left;
					if(focusNode == null) {
						parent.left = newNode;
						return;
					}
				} else {
					focusNode = focusNode.right;
					if(focusNode == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
	
	public void inOrderTransversalNode(Node focusNode) {
		if(focusNode != null) {
			inOrderTransversalNode(focusNode.left);
		
			System.out.println(focusNode);
			
			inOrderTransversalNode(focusNode.right);
		}
	}
	
	private class Node {
		int v;
		Node left;
		Node right;
		
		public Node(int v) {
			this.v = v;
		}
		
		public String toString() {
			return "valor: "+this.v;
		}
	}
}
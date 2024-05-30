class TreeTraning {
	Node root;
	
	public static void main(String [] args) {
		TreeTraning tree = new TreeTraning();
		int [] arr = new int[20];
		
		for(int i=0; i<arr.length; i++) arr[i] = (int) Math.floor(Math.random()*i+i);
		
		for(int i=0; i<arr.length; i++) tree.add(arr[i]);
		
		tree.inOrderTraversalNode(tree.root);
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		
		if(root == null) root = newNode;
		else {
			Node focusNode = root;
			Node parent;
			
			while(true) {
				parent = focusNode;
				
				if(data < parent.data){
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
	
	public void inOrderTraversalNode(Node focusNode) {
		if(focusNode != null) {
			inOrderTraversalNode(focusNode.left);
			
			System.out.println(focusNode);
			
			inOrderTraversalNode(focusNode.right);
		}
	}
	
	private class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
		}
		
		public String toString() {
			return "Node value: "+data;
		}
	}
}
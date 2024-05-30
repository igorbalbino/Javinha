class BinaryTreePractice {
	Node root;
	
	public static void main(String [] args) {
		int [] arr = new int[20];
		String [] names = new String[20];
		BinaryTreePractice tree = new BinaryTreePractice();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int) Math.floor(Math.random()*i+i);
			names[i] = (i*2+i)+" Tunar - "+i;
		}
		
 		for(int i=0; i<arr.length; i++) tree.add(arr[i], names[i]);
		
		tree.inOrderTransversalNode(tree.root);
		
		System.out.println("Hello World!");
	}
	
	public void add(int key, String name) {
		Node newNode = new Node(key, name);
		
		if(root == null) root = newNode;
		else {
			Node focusNode = root;
			Node parent;
			
			while(true) {
				parent = focusNode;
				if(key < parent.key) {
					focusNode = focusNode.left;
					if(focusNode == null){
						parent.left = newNode;
						return;
					}
				} else {
					focusNode = focusNode.right;
					if(focusNode == null){
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
		int key;
		String name;
		Node left;
		Node right;
		
		public Node(int key, String name) {
			this.key = key;
			this.name = name;
		}
		
		public String toString(){return "Key: "+this.key+" | Name: "+this.name+".";}
	}
}
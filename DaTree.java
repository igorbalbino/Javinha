class DaTree {
	Node root;
	
	public static void main(String [] arga) {
		int [] arr = new int[20];
		
		for(int i=0; i<arr.length; i++) arr[i] = (int) Math.floor(Math.random()*i+i);
		
		DaTree tree = new DaTree();
		
		for(int i=0; i<arr.length; i++) tree.add(arr[i], i+" Nazgul ! "+(i+i*i));
		
		tree.transversalPrint(tree.root);
		
		System.out.println("Hello World!");
	}
	
	private void add(int key, String name) {
		Node newNode = new Node(key, name);
		
		if(root == null) root = newNode;
		else {
			Node focusNode = root;
			Node parent;
			
			while(true) {
				parent = focusNode;
				if(key< parent.key){
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
	
	private void transversalPrint(Node focusNode) {
		if(focusNode != null) {
			transversalPrint(focusNode.left);
			System.out.println(focusNode);
			transversalPrint(focusNode.right);
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
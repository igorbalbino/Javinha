class LeTree {
	Node raiz;
	
	public static void main(String [] args) {
		LeTree tree = new LeTree();
		
		tree.raiz = tree.add(tree.raiz, 9, "Nazarum", "development", "developer");
		tree.raiz = tree.add(tree.raiz, 2, "Azutalum", "development", "project manager");
		tree.raiz = tree.add(tree.raiz, 4, "Eiijisai", "quality", "tester");
		tree.raiz = tree.add(tree.raiz, 3, "Helijdraim", "comercial", "seller");
		tree.raiz = tree.add(tree.raiz, 7, "Ôruem", "marketing", "designer");
		
		tree.printNode(tree.raiz);
	}
	
	public Node add(Node focusNode, int key, String name, String departament, String role) {
		if(focusNode == null) return new Node(key, name, departament, role);
		
		if(key < focusNode.key) focusNode.left = add(focusNode.left, key, name, departament, role);
		else focusNode.right = add(focusNode.right, key, name, departament, role);
		
		return focusNode;
	}
	
	public void printNode(Node focusNode) {
		if(focusNode != null) {
			printNode(focusNode.left);
			System.out.println(focusNode);
			printNode(focusNode.right);
		}
	}
	
	private class Node {
		int key;
		String name, departament, role;
		Node left;
		Node right;
			
		public Node (int key, String name, String departament, String role) {
			this.key = key;
			this.name = name;
			this.departament = departament;
			this.role = role;
		}
		
		public String toString() {
			return "Key: "+this.key+" | Name: "+this.name+" | Departament: "+this.departament+" | Role: "+this.role;
		}
	}
}
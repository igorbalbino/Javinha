class HashTable {
	private HashNode [] hashNodes; //declara a lista dos nodes
	private int nodes; // capacidade de armazemanemto da hashTable
	private int size; // registros salvos na hashTable
	
	public static void main(String [] args) {
		HashTable hashTable = new HashTable(10);
		
		System.out.println(hashTable.addNode(0, "teste"));
		System.out.println(hashTable.addNode(5, "teste2"));
		System.out.println(hashTable.addNode(105, "teste3"));
		System.out.println(hashTable.addNode(205, "teste4"));
		
		System.out.println(hashTable.getNode(5));
		
		System.out.println("Hello World!");
	}
	
	public HashTable(int capacity) {
		this.nodes = capacity; // atribui quantidade de nodes
		hashNodes = new HashNode[capacity]; // cria hashNode com a capacidade informada
	}
	
	public int addNode(int key, String value) {
		key = hashKey(key);
		
		if(hashNodes[key] == null) hashNodes[key] = new HashNode(key, value);
		else if(!hashNodes[key].hasNext()) hashNodes[key].addNext(key, value);
		
		return key;
	}
	
	public String getNode(int key) {
		key = hashKey(key);
		return hashNodes[key].getNode();
	}
	
	private int hashKey(int k){
		return (int) Math.floor(k%10);
	}
	
	class HashNode {
		private int key;
		private String value;
		private HashNode next;
		
		public HashNode(int key, String value) {
			this.key = key;
			this.value = value;
		}
		
		public boolean hasNext(){
			return this.next != null;
		}
		
		public int addNext(int key, String value) {
			this.next = new HashNode(key, value);
			return key;
		}
		
		public String getNode() {
			String n = "";
			
			if(hasNext()) n = this.next.getNode();
			
			return "Key: "+this.key+" | Value: "+this.value+" | "+n;
		}
	}
}
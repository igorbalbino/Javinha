import java.util.List;
import java.util.ArrayList;

class Pilha {
	public static void main(String [] args) {
		List<String> q = new ArrayList<>();
		
		q.add("asas");
		q.add("zxzx");
		
		q.removeLast();
		
		q.add("qwqw");
		q.add("wewe");
		q.add("dfdf");
		
		q.removeLast();
		
		System.out.println(q);
	}
	
	private static void addQueue(List<String> q) {
		
	}
}
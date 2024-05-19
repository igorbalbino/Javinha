import java.util.List;
import java.util.ArrayList;

class Fila {
	public static void main(String [] args) {
		List<String> q = new ArrayList<>();
		
		q.add("asas");
		q.add("zxzx");
		
		q.removeFirst();
		
		q.add("qwqw");
		q.add("wewe");
		q.add("dfdf");
		
		q.removeFirst();
		
		System.out.println(q);
	}
	
	private static void addQueue(List<String> q) {
		
	}
}
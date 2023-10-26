import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
	
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.add(12);
		linkedList.add(45);
		linkedList.add(74);
		linkedList.add(31);
		
		linkedList.add(1,25);
		linkedList.set(0, 15);
		
		
		System.out.println(linkedList);
		
		
	}

}

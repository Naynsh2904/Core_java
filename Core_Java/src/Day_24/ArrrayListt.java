package Day_24;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrrayListt {

	public static void main(String[] args) {
		System.out.println("Array List");
		System.out.println();
		ArrayList<String> n = new ArrayList<>();
		
		n.add("Nayan");
		n.add("Shivankar");
		n.set(1, "NayaN");
		n.set(1, "ShivankaR");
		System.out.println(n);
		
		n.remove(1);
		System.out.println(n);
		
		n.clear();
		
		System.out.println(n);
		System.out.println();
		

		System.out.println("Linked List");
		System.out.println();
		
		LinkedList<String> m = new LinkedList<>();
		m.add("Nayan");
		m.add("Shivakar");
		m.add("Nayan");
		m.add("Shivakar");
		m.add("Nayan");
		m.add("Shivakar");
		
		m.set(1, "Shivankar");
		System.out.println(m);
		
		m.addFirst("NEw");;
		System.out.println(m);
		
		m.removeFirst();
		System.out.println(m);
		
		m.removeLast();
		System.out.println(m);
		
		m.clear();
		
		System.out.println(m);
		
		ArrayDeque<String> D =  new ArrayDeque<>();
	}

}

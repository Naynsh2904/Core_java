package Day_24;

import java.util.Vector;

public class Homework {

	public static void main(String[] args) {
		Vector<String> s = new Vector<>();
		
// 		Add Element 
		s.add("dog");
		s.add("Cat");
		s.add("Fish");
		System.out.println("Vector: " + s);
		
		s.add(1, "Turtle");
        System.out.println("At index 1: " + s);
        
//		Element at a specific index
        String sAtIndex2 = s.get(2);
        System.out.println("PetAnimal at index 2: " + sAtIndex2);
        
// 		Replace an element at a specific index
        s.set(0, "Food");
        System.out.println("After replacing 'dog' with 'food': " + s);
        
// 		Remove an element by index
        s.remove(3);
        System.out.println("After removing the element at index 3: " + s);
        
// 		Remove an element by value
        s.remove("Turtle");
        System.out.println("After removing 'Turtle': " + s);

// 		Check if a specific element exists
        boolean hasCharlie = s.contains("Charlie");
        System.out.println("Does the Vector contain 'Charlie'? " + hasCharlie);

// 		Get the size of the Vector
        int size = s.size();
        System.out.println("Size of the Vector: " + size);

// 		Iterate through the Vector using a for loop
        System.out.println("Iterating through the Vector:");
        for (String student : s) {
            System.out.println(s);
        }
	}

}

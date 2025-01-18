package Day_24;

import java.util.ArrayList;
import java.util.LinkedList;

public class Classwork {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
//		 1. Write a Java program to create a new ArrayList, add some colours (string) and print out the collection.
		    colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        System.out.println(colors);
	        
	        colors.clear();
	        System.out.println(colors);
	        
//	     2. Write a Java program to insert an element into the array list at the third position.
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add(2,"Purple");
	        System.out.println(colors);
	        
	        colors.clear();
	        System.out.println(colors);
	        
//	     3. Write a Java program to remove the third element from an ArrayList
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        System.out.println(colors);
	        colors.remove(1);
	        System.out.println(colors);
	        
	        colors.clear();
	        System.out.println(colors);
	        
//	      4. Write a Java program to append the specified element to the end of a LinkedList
	    	LinkedList<String> color = new LinkedList<>();
	        color.add("Red");
	        color.add("Blue");
	        color.add("Green");
	        System.out.println(color);
	        color.add("pink");
	        System.out.println(color);
	        
	        color.clear();
	        System.out.println(color);
//	      5. Write a Java program to insert the specified element at the specified position in the LinkedList.
	        color.add("Red");
	        color.add("Blue");
	        color.add("Green");
	        System.out.println("Original" + color);

	        color.add(1, "Levender");
	        System.out.println("Updated" + color);
	        
	        color.clear();
	        System.out.println(color);
//	      6. Write a Java program to replace the specified element in the LinkedList with another element.
	        color.add("Red");
	        color.add("Blue");
	        color.add("Green");
	        System.out.println("Original" + color);
	        
	        color.addFirst("Purple");
	        
	        color.addLast("Yellow");
	        
	        System.out.println("Updated" + color);
	        
	}

}

package Day_16;

import java.util.Scanner;

public class ClassWork {
	public void demo (int a, int b) {
		System.out.println(a+b);
	}
	public void demo (int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void demo (int a, int b, int d, int e) {
		System.out.println(a+b+d+e);
	}
	public static void main(String[] args) {
//		1. Write a Java program to find length of a string.
		String name = "Namaste World!!!";
		System.out.println(name.length());
		System.out.println();
		
//		2. Write a Java program to concatenate two strings
		String name2 = "@@@@@@@@@";
		System.out.println(name +" "+ name2);
		System.out.println();
		
//		3. Write a Java program to convert lowercase string to uppercase.
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println();
		
//		4. WAP to split string into 2 tokens where string is “HELLO$WORLD"
		String split = "HELLO$WORLD";
		String [] tokens = split.split("\\$");
		
		System.out.println("First Token: " + tokens[0]);
		System.out.println("Second Token: " + tokens[1]);
		System.out.println();
		
//		5. Write a Java program to find occurrence of a word in a given string.
		System.out.println(name.indexOf("a"));
		System.out.println();
		
//		1. Create a class 'Degree' having a method 'getDegree' that prints "I got a degree". It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a method with the same name that prints "I am an Undergraduate" and "I am a Postgraduate" respectively. Call the method by creating an object of each of the two classes.
		Degree d = new Degree();
		Undergraduate u = new Undergraduate();
		Postgraduate p = new Postgraduate();
		d.getDegree();
		u.graduation();
		p.graduation();
		System.out.println();
		
//		2. Write a program to demonstrate the concept of method overloading by taking your own example.
		ClassWork cls = new ClassWork();
		cls.demo(10, 20);
		cls.demo(10, 0, 74);
		cls.demo(456, 0, 0, 0);
		System.out.println();
		
//		3. Write a program in Java to take data of an employee as an input and print the data using Getters and Setters.
		Empolyee emp = new Empolyee();
		emp.setAge(22);
		emp.setName("Nayan");
		System.out.println("name is " + emp.getName());
		System.out.println("Age is "+emp.getAge());
		System.out.println();
		
//		4. Write a Java program to check whether a number is divisible by 5 and 11 or not
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter number ");
		int num = scnr.nextInt();
		if (num % 5 == 0 && num % 11 ==0) {
			System.out.println(num + " number is divisible by 5 and 11");
		} else {
			System.out.println("number is not divisible by 5 and 11");
		}
		
//		5. Create a class named pizza that have the variables to store the size of pizza, number of cheese toppings, number of pepperoni toppings and number of ham toppings. Pizza cost id determined by: Small: 299/- Medium: 499/- Large: 699/- Cheese Toppings: 10/- Pepperoni Toppings: 10/- Ham Toppings: 10/- Write a public method ‘getDescription()’ that will return the exact total cost of the Pizza.
		
	}
}

class Degree {
	void getDegree() {
		System.out.println("I got a degree");
	}
}

class Undergraduate {
	void graduation () {
		System.out.println("I am an UnderGraduate");
	}
}

class Postgraduate {
	void graduation () {
		System.out.println("I am an PostGraduate");
	}
}

class Empolyee {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}






















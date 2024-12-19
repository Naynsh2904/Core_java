package Day_07;

import java.util.Scanner;

public class Classwork_Function {
	
	public static String Name() {
		return "Nayan";
	}
	
	public static int avg (int a, int b, int c) {
		return (a+b+c)/3;
	}
	
	public static float areaOfCircle (int r) {
		float pi = 3.14f;
		return pi*r*r;
	}
	
	public static int triangle (int a, int b, int c) {
		return (a+b+c);
	}
	
	public static void posNeg () {
		System.out.print("Enter number for checking Positive or Negative: ");
		Scanner scnr = new Scanner(System.in);
		int num = scnr.nextInt();
		if(num >0) {
			System.out.println("number is positive");
		}else {
			System.out.println("Number is negative");
		}
	}
	
	public static void squareCube( int num) {
		System.out.println("Square of "+ num + " is " + num*num);
		System.out.println("Cube of "+ num + " is " + num*num*num);
	}
	
	public static int Greater (int num1, int num2) {
		if(num1> num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	public static int react (int l, int w) {
		return (2*(l+w));
	}
	
	public static void main(String[] args) {
//		1. Write a program to print your name using function.
		System.out.println("My name is " + Name());
		System.out.println();
//		2. Write a program to print the average marks of three subjects of a student.
		System.out.println("Average is "+ avg(88,76,65));
		System.out.println();
//		3. Write a program to calculate area of circle using function.
		System.out.println("area of circle is "+ areaOfCircle(2));
		System.out.println();
//		4. Write a program to calculate perimeter of a triangle using function..
		System.out.println("area of circle is "+ triangle(2,6,4));
		System.out.println();
//		5. Write a program to check whether the number is positive or negative using function
		posNeg();
		System.out.println();
//		6. Write a program to print the square and cube of a number using function.
		squareCube(5);
		System.out.println();
//		7. Write a program to check the greater number among two numbers using function.
		System.out.println("Greater number is "+Greater(10,54));
		System.out.println();
//		8. Write a program to find the perimeter of rectangle using function.
		System.out.println("the perimeter of rectangle is "+ react(10,20));
		
	}
}

package Day_02;

import java.util.Scanner;

public class Homework_Scanner {
	public static void main(String[] args) {
	    Scanner scnr = new Scanner(System.in);

	    // To print "Hello World"
	    System.out.println("Hello World!!");
	    System.out.println();

	    // Simple Arithmetic Program using Scanner class
	    System.out.println("Simple Arithmetic Program using Scanner class");
	    System.out.print("Enter number one: ");
	    int num1 = scnr.nextInt();
	    System.out.print("Enter number two: ");
	    int num2 = scnr.nextInt();
	    int sum = num1 + num2;
	    System.out.println("Addition of One and Two is: " + sum);

	    // Area of Circle using Scanner class
	    System.out.println("Area of Circle using Scanner class");
	    float pi = 3.14f;
	    System.out.print("enter radius of circle: ");
	    float radius = scnr.nextFloat();
	    float areaOfCircle = pi * radius * radius;
	    System.out.println("area of circle is :" + areaOfCircle);

	    // Area of Triangle using Scanner class
	    System.out.println("Area of Triangle using Scanner class");
	    System.out.print("enter height for triangle: ");
	    float height = scnr.nextFloat();
	    System.out.print("enter base for triangle: ");
	    float base = scnr.nextFloat();
	    float half = 0.5f;
	    float areaOfTriangle = half * height * base;
	    System.out.println("area of Triangle is :" + areaOfTriangle);

	    // Area of Rectangle using Scanner class
	    System.out.println("Area of Rectangle using Scanner class");
	    System.out.print("enter height for rectangle: ");
	    float rectangleHeight = scnr.nextFloat();
	    System.out.print("enter width for rectangle: ");
	    float width = scnr.nextFloat();
	    float areaOfRectangle = rectangleHeight * width;
	    System.out.println("area of rectangle is: " + areaOfRectangle);

	    // Circumference of Circle using Scanner class
	    System.out.println("Circumference of Circle using Scanner class");
	    System.out.print("enter radius for circumference of circle: ");
	    float radius_circum = scnr.nextFloat();
	    float circumferenceofcircle = 2 * pi * radius_circum;
	    System.out.println("radius for circumference of circle is: " + circumferenceofcircle);
	  }
}

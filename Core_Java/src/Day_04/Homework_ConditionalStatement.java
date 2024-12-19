package Day_04;

import java.util.Scanner;

public class Homework_ConditionalStatement {
	public static void main(String[] args) {
//		Write a program to take the basic salary of employee, add bonus % according to their basic salary and display the gross salary.
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter your basic salary: ");
		int basic = scnr.nextInt();
		
		double gross;
		
	    if (basic > 100000) {
            gross = basic + (basic * 0.50);
        } else if (basic > 85000) {
            gross = basic + (basic * 0.40);
        } else if (basic > 70000) {
            gross = basic + (basic * 0.30);
        } else if (basic > 50000) {
            gross = basic + (basic * 0.20);
        } else if (basic > 40000) {
            gross = basic + (basic * 0.15);
        } else if (basic > 30000) {
            gross = basic + (basic * 0.10);
        } else {
            gross = basic;
        }

        System.out.println("Your Gross Salary is: " + gross);
        
//      Menu Driven program for Area of Circle, Area of Triangle, Circumference of Circle and Perimeter of Triangle. (Using switch case)
        System.out.println("Enter A number for Area of Circle(1), Area of Triangle(2), Circumference of Circle(3) and Perimeter of Triangle(4). ");
        int check = scnr.nextInt();
        float pi = 3.14f;
        
        switch (check) {
        case 1 :
        	System.out.print("Enter radius of circle: ");
        	float rad = scnr.nextFloat();
        	System.out.println("Area of circle is "+ (pi * rad * rad));
        	break;
        	
        case 2 :
        	System.out.print("Enter radius of circle: ");
        	float radi = scnr.nextFloat();
        	System.out.println("Circumference of circle is "+ (pi * radi * 2));
        	break;
        	
        case 3 :
        	System.out.print("Enter Base of Triangle: ");
        	float base = scnr.nextFloat();
        	System.out.print("Enter height of Triangle: ");
        	float Height = scnr.nextFloat();
        	System.out.println("Circumference of circle is "+ (0.5 * base * Height));
        	break;
        	
        case 4 :
        	System.out.print("Enter lenght of 1st side of Triangle: ");
        	float a = scnr.nextFloat();
        	System.out.print("Enter lenght of 2nd side of Triangle: ");
        	float b = scnr.nextFloat();
        	System.out.print("Enter lenght of 3rd side of Triangle: ");
        	float c = scnr.nextFloat();
        	System.out.println("Perimeter of a Triangle is "+ (a + b+ c));
        	break;
        
        default :
        	System.out.println("Enter valid Number according to a Area of Circle(1), Area of Triangle(2), Circumference of Circle(3) and Perimeter of Triangle(4)");
        }
        
//        Write a program to check largest among four integer numbers
        System.out.print("Enter num1 for check largest among four integer numbers: ");
        int num1 = scnr.nextInt();
        System.out.print("Enter num2 for check largest among four integer numbers: ");
        int num2 = scnr.nextInt();
        System.out.print("Enter num3 for check largest among four integer numbers: ");
        int num3 = scnr.nextInt();
        System.out.print("Enter num4 for check largest among four integer numbers: ");
        int num4 = scnr.nextInt();
        
        if ((num1 > num2) && (num1 > num3) && (num1 > num4)) {
        	System.out.println(num1 +"is greater then " + num2 + ", " + num3 + ", "+ num4);
        	
        } else if ((num2 > num1) && (num2 > num3) && (num2 > num4)) {
        	System.out.println(num2 +"is greater then " + num1 + ", " + num3 + ", "+ num4);
        	
        } else if ((num3 > num1) && (num3 > num2) && (num3 > num4)) {
        	System.out.println(num3 +"is greater then " + num2 + ", " + num1 + ", "+ num4);
        	
        }else if ((num4 > num1) && (num4 > num2) && (num4 > num3)) {
        	System.out.println(num4 +"is greater then " + num2 + ", " + num3 + ", "+ num1);
        	
        }else {
        	System.out.println("All Numbers are same");
        	
        }
	}
}

package Day_04;

import java.util.Scanner;

public class Classwork_Conditional_Statement {
	public static void main(String[] args) {
//		1) Write a program to display the grades of students based on their percentage using elseif.
		Scanner scnr = new Scanner(System.in);
        System.out.print("Enter Your Marks: ");
        int marks = scnr.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("A+");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B+");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("B");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("C");
        } else if (marks >= 0 && marks < 50) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid Marks");
        }
        
//        2) Write a program to check largest among three integer numbers
        System.out.print("Enter no 1 for check largest among three integer numbers: ");
        int num1 = scnr.nextInt();
        System.out.print("Enter no 2 for check largest among three integer numbers: ");
        int num2 = scnr.nextInt();
        System.out.print("Enter no 3 for check largest among three integer numbers: ");
        int num3 = scnr.nextInt();
        
        if(num1> num2) {
        	if(num1> num3) {
        		System.out.println(num1 +" is greater then "+num2 +" and "+ num3 );
        	}else {
        		System.out.println(num3 +" is greater then "+num2 +" and "+ num1 );
        	}
        }else if (num2 > num3) {
        	System.out.println(num2 +" is greater then "+num1 +" and "+ num3 );
        }else if(num1 < num3 && num2 < num3) {
    		System.out.println(num3 +" is greater then "+num2 +" and "+ num1 );
    	} else {
    		System.out.println("all number is same");
    	}
        
//        3 )Menu Driven program on Arithmetic Operators (Using switch case)
        System.out.print("enter no 1: ");
        int ar1 = scnr.nextInt();
        System.out.print("enter no 2: ");
        int ar2 = scnr.nextInt();
        System.out.print("enter No for the given condition addition for(1), substraction for(2), multiplication for(3), division for (4), reminder for(5) ");
        int symbol = scnr.nextInt();
        
        switch (symbol) {
        case 1 :
        	System.out.println(ar1 + "+" + ar2+ "=" + (ar1 + ar2));
        	break;
        case 2 :
        	System.out.println(ar1 + "-" + ar2+ "=" + (ar1 - ar2));
        	break;	
        case 3 :
        	System.out.println(ar1 + "*" + ar2+ "=" + (ar1 * ar2));
        	break;
        case 4 :
        	System.out.println(ar1 + "/" + ar2+ "=" + (ar1 / ar2));
        	break;
        case 5 :
        	System.out.println(ar1 + "%" + ar2+ "=" + (ar1 % ar2));
        	break;	
        }
        
        
	}
}

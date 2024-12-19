package Day_03;
import java.util.*;

public class HomeWork_Operaters {
	public static void main(String[] args) {
//		Program to demonstrate Arithmetic Operators !
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = scnr.nextInt();
		
		System.out.print("Enter second number: ");
		int b = scnr.nextInt();
		
		System.out.println("addition of two number is " + (a+b));
		System.out.println("substraction of two number is " + (a-b));
		System.out.println("multiplication of two number is " + (a*b));
		System.out.println("division of two number is " + (a/b));
		System.out.println("modulo of two number is " + (a%b));
		
//		Write a program to check largest among two integer numbers !
		System.out.println("enter two numbers for checking largest among two integer numbers ");
		int num1 = scnr.nextInt();
		int num2 = scnr.nextInt();
		
		if(num1 > num2) {
			System.out.println("largest number is "+ num1);
		}else if (num1< num2){
			System.out.println("largest number is "+ num2);
		} else {
			System.out.println("both number are equal");
		}
		
//		Write a program to check whether the number is positive or negative !
		System.out.print("enter number for check whether the number is positive or negative :");
		int check = scnr.nextInt();
		
		if(check > 0) {
			System.out.println(check +" is positive");
		} else {
			System.out.println(check +" is negative");
		}
	}
}

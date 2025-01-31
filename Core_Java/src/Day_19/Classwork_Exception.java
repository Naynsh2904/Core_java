package Day_19;

import java.util.Scanner;

class MyException extends Exception {
 public MyException(String message) {
     super(message);
 }
}

public class Classwork_Exception {
	public static void main(String[] args) throws MyException {
		Scanner scnr = new Scanner(System.in);
		
//		1. Create a custom exception for student admission where, a student won't be able to take admission if he is less than 3 years old.
		
		int age = scnr.nextInt();
		
		try {
			if (age < 3) {
				throw new MyException("Age is more then 3 is required");
			} else {
				System.out.println("Admission Completed!!!");
			}
		} catch ( Exception e) {
			System.out.println(e.getMessage());
		}
		
//		2. Create a custom exception for a company where, an employee can't apply for job if his experience is less than a year.
		System.out.print("Enter number of experience in year: ");
		int exp = scnr.nextInt();	
		
		try {
			if (exp <1 ) {
				throw new MyException("you can't apply for job if his experience is less than a year");
			} else {
				System.out.println("you can apply!!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
//		3. Create a custom exception for a divide by zero exception.
		
		try {
			int result = 10/0;
			throw new MyException("Divide by zero exception");
		} catch ( Exception e ) {
			System.out.println(e.getMessage());
		}
		
//		4. Create a program to demonstrate throws statement. Take your own example.
		if (10 % 2 == 0 ) {
			throw new MyException("using throw and thows");
		}
	}
}


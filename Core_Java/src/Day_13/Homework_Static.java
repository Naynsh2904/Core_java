package Day_13;

import java.util.Scanner;

public class Homework_Static {
	public static void grosssalary(){	
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the salary :  ");
		float salary = sobj.nextInt();
		
		float bonas = salary * (float)0.4;
		
		float grosssalary = salary + bonas;
		
		System.out.println("gross salary : "+grosssalary);
	}
	
	
	
	static class TotalArea{
		static int L;
		static int W;
		public static void hj(){
			Scanner sobj = new Scanner(System.in);
			System.out.print("Enter the Length : ");
			L=sobj.nextInt();
			
			System.out.print("Enter the Width : ");
			W=sobj.nextInt();
			
			System.out.println("Total area :"+ (L*W));
		}
	}
	
	
	
	static class Name{
		static String str;
		static int age;
		public static void hj(){
			Scanner sobj = new Scanner(System.in);
			System.out.print("Enter the Name: ");
			str=sobj.nextLine();
			
			System.out.print("Enter the age : ");
			age=sobj.nextInt();
			System.err.println("Name : "+str + " age : "+age);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
//		1. Write a program to find the gross salary of an employee by adding 40% to the basic salary. Use static method. (Take input from user)
		Homework_Static.grosssalary();
//		2. Write a program to calculate the total area of square by using static variables and static block. (Take input from user).
		TotalArea.hj();
//		3. Write a program to take name and age from the user and print them using the method of static class.
		Name.hj();
	}
}

package Day_13;

import java.util.Scanner;

public class ClassWork_Static {
//	3. Write a program to create a static class and inner class in the same class and access the methods of both. (Take your own example)

	public void ui(){
		System.out.println("inside Program3 method");
	}
	static class KK{
		public static void Display(){
			System.out.println("inside kk mehod");
		}
	}
	
// 	4. Write a program to print the average marks of student by using the method of the inner class. (Take input from user)
	static class Chal
	{
		public static void Display()
		
		{
			Scanner sobj = new Scanner(System.in);
			System.out.print("Enter the total Mark :");
			int Marks = sobj.nextInt();
			System.out.print("Enter no of subject : ");
			int number =sobj.nextInt();
			
			int avg = Marks / number;
			System.out.println("average : "+avg);
		}
	}
	
//	5. Write a program to find perimeter of rectangle using static class. (Take input from user)
static class YOY
{
	
	 public static void Display()
	 {
		 Scanner sobj = new Scanner(System.in);
		 System.out.print("Enter the Length : ");
		 int L =sobj.nextInt();
		 
		 System.out.print("Enter the Width  : ");
		 int W =sobj.nextInt();
		 int p=((L+W)*2);
		 
		 System.out.println("Perimeter : "+ p);
	 }
}
	public static void main(String[] args) {
		
//		1. Write a program to create two static variables num1 and num2 and print its addition, substraction, multiplication and division by using static block.
		Demo.Display();
		System.out.println();
//		2. Write a program to show how static methods and non-static methods can be called. (Take your own example)
		RR dobj = new RR();
		dobj.Display();
		RR.Hello();
		System.out.println();
//		3. Write a program to create a static class and inner class in the same class and access the methods of both. (Take your own example)
		ClassWork_Static op = new ClassWork_Static();
		op.ui();
		KK.Display();
		System.out.println();
//		4. Write a program to print the average marks of student by using the method of the inner class. (Take input from user)
		ClassWork_Static cobj = new ClassWork_Static();
		ClassWork_Static.Chal  jkl = new ClassWork_Static.Chal();
		jkl.Display();
		System.out.println();
//		5. Write a program to find perimeter of rectangle using static class. (Take input from user)
		ClassWork_Static pbo = new ClassWork_Static();
		YOY.Display();
		
	}
}

//	1. Write a program to create two static variables num1 and num2 and print its addition, substraction, multiplication and division by using static block.
class Demo{
	static int no1;
	static int no2;
	static {
		no1=10;
		no2=20;
	}
	public static void Display(){
		System.out.println("addition of two number : "+(no1+no2));
		System.out.println("subtraction of two number : "+(no1-no2));
		System.out.println("multipliaction of two number : "+(no1*no2));
		System.out.println("divsion of two number : "+(no1/no2));
	}
}

//	2. Write a program to show how static methods and non-static methods can be called. (Take your own example)
class RR {
	int number;
	static int no1;
	
	public void Display(){
		System.out.println("inside Display method");
	}
	
	public static void Hello(){
		System.out.println("inside static Hello method");
	}
}
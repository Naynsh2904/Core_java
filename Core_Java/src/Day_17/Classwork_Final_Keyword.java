package Day_17;

public class Classwork_Final_Keyword {
	public static void main(String[] args) {
//		1. Write a program to demonstrate the use of a final variable. (Take your own example)
		final int a = 50;
		System.out.println(a);
		
//		2. Write a program to demonstrate the difference between shallow copy and deep copy object cloning. (Take your own example)
		
//		3. Write a program to demonstrate final method.
		Demo d = new Demo();
		d.displey();
		
//		4. Write a program to demonstrate final class.
		Demo2 s = new Demo2();
		s.displey();
	}
}

class Demo {
	final void displey () {
		System.out.println("Demo Method");
	}
}

final class Demo2 {
	 void displey () {
		System.out.println("Demo class");
	}
}